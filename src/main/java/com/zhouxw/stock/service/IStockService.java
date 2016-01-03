package com.zhouxw.stock.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author Mocuishle
 * 
 */
public interface IStockService {

	/**
	 * 股票查询API，提供json格式的最近一个交易日的股票信息，包括买卖价格，买卖份额，当天的大盘信息以及K线图
	 * @param httpUrl 
	 * @param httpArg
	 * @return
	 */
	public String getStockInfo(String httpArg);
	
	
	/**
	 * 查询深圳股票数据
	 * @param page 	第几页,默认第1页
	 * @param type	每页返回条数,1(20条默认),2(40条),3(60条),4(80条)
	 * @return
	 */
	public JSONObject querySzAllStock(int page,int type);
}
