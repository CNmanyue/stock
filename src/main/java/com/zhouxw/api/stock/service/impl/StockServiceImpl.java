package com.zhouxw.api.stock.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.zhouxw.api.stock.service.IStockService;
import com.zhouxw.api.utils.ApiClient;

/**
 * @author Mocuishle
 * 股票查询
 */
public class StockServiceImpl implements IStockService{

	@Autowired
	private String httpUrl = "http://apis.baidu.com/apistore/stockservice/stock";
	
	@Override
	public String getStockInfo(String httpArg) {
		httpArg = "stockid=sz002230&list=1";
		return ApiClient.request(httpUrl, httpArg);
	}

	public String getHttpUrl() {
		return httpUrl;
	}

	public void setHttpUrl(String httpUrl) {
		this.httpUrl = httpUrl;
	}

}
