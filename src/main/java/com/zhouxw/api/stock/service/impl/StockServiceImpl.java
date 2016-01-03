package com.zhouxw.api.stock.service.impl;

import java.util.HashMap;
import java.util.Map;




import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zhouxw.api.stock.service.IStockService;
import com.zhouxw.api.utils.BaiduApiClient;
import com.zhouxw.api.utils.JuheApiClient;

/**
 * @author Mocuishle
 * 股票查询
 */
@Service(value="stockService")
@Scope(value="singleton")
public class StockServiceImpl implements IStockService{

	private String httpUrl = "http://apis.baidu.com/apistore/stockservice/stock";
	private static String SZALL_URL = "http://web.juhe.cn:8080/finance/stock/szall";
	private static String APPKEY = "d0a46d58359a5f6b92777c7064d81aac";
	@Override
	public String getStockInfo(String httpArg) {
		httpArg = "stockid=sz002230&list=1";
		return BaiduApiClient.request(httpUrl, httpArg);
	}

	@Override
	public String querySzAllStock(int page, int type) {
		String result =null;
        Map<String, Object> params = new HashMap<String, Object>();//请求参数
            params.put("key",APPKEY);//APP Key
            params.put("page",page);//第几页(每页20条数据),默认第1页
            params.put("type", type);
            
            result =JuheApiClient.net(SZALL_URL, params, "GET");
            JSONObject object = JSONObject.parseObject(result);
            if(object.getIntValue("error_code")==0){
                System.out.println(object.get("result"));
                return result;
            }else{
                result = object.get("error_code")+":"+object.get("reason");
            	System.out.println(result);
                return result;
            }
	}
	public String getHttpUrl() {
		return httpUrl;
	}

	public void setHttpUrl(String httpUrl) {
		this.httpUrl = httpUrl;
	}


}
