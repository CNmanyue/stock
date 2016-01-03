package com.zhouxw.api.stock.action;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.zhouxw.api.stock.service.IStockService;

/**
 * @author Mocuishle
 * 股票控制器
 */
@Namespace("/")
// @Controller(value="stockAction")
@Scope("prototype")
// @Results({@Result(name="success",location=""),@Result()})
public class StockAction extends BaseAction {

	private static final long serialVersionUID = 1514222101232915537L;
	private static Logger logger = Logger.getLogger(StockAction.class);
	
	// 页码
	private int page;
	// 每页返回条数,1(20条默认),2(40条),3(60条),4(80条)
	private int pageSize;
	// 股票编号，上海股市以sh开头，深圳股市以sz开头如：sh601009（type为0或者1时gid不是必须）
	private String gid;
	
	@Autowired
	private IStockService stockService;
	
	@Action(value="szallStock")
	public void szallStock(){
		String response = stockService.querySzAllStock(page,pageSize);
		super.writeJson(response);
		logger.info(">>>over.");
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		StockAction.logger = logger;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public IStockService getStockService() {
		return stockService;
	}

	public void setStockService(IStockService stockService) {
		this.stockService = stockService;
	}
	
}
