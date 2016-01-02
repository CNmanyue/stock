package cn.my.mvnweb.api.service;

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
}
