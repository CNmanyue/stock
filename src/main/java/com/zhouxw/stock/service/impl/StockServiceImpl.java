package com.zhouxw.stock.service.impl;

import java.util.HashMap;
import java.util.Map;








import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zhouxw.stock.service.IStockService;
import com.zhouxw.utils.request.BaiduApiClient;
import com.zhouxw.utils.request.JuheApiClient;

/**
 * @author Mocuishle
 * 股票查询
 */
@Service(value="stockService")
@Scope(value="singleton")
public class StockServiceImpl implements IStockService{

	private static Logger logger = Logger.getLogger(StockServiceImpl.class);
	
	private static String HTTPURL = "http://apis.baidu.com/apistore/stockservice/stock";
	
	private static String SZALL_URL = "http://web.juhe.cn:8080/finance/stock/szall";
	private static String APPKEY = "d0a46d58359a5f6b92777c7064d81aac";
	@Override
	public String getStockInfo(String httpArg) {
		httpArg = "stockid=sz002230&list=1";
		return BaiduApiClient.request(HTTPURL, httpArg);
	}

	@Override
	public JSONObject querySzAllStock(int page, int type) {
		String result =null;
        Map<String, Object> params = new HashMap<String, Object>();//请求参数
            params.put("key",APPKEY);//APP Key
            params.put("page",page);//第几页(每页20条数据),默认第1页
            params.put("type", type);
            
            result =JuheApiClient.net(SZALL_URL, params, "GET");
            JSONObject object = JSONObject.parseObject(result);
            if(object.getIntValue("error_code")==0){
                return object;
            }else{
            	logger.error(object.get("error_code")+":"+object.get("reason"));
                return object;
            }
	}

}
