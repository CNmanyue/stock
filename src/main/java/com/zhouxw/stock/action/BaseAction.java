package com.zhouxw.stock.action;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = -4501319046160691284L;
	private static Logger logger = Logger.getLogger(BaseAction.class);

	private Integer page;
	private Integer rows;
	private String sort;
	private String order;
	/**
	 * 将对象转换成JSON字符串，并响应回前台
	 * 
	 * @param object
	 * @throws IOException
	 */
	public void writeJson(Object object) {
		try {
			String json = JSON.toJSONStringWithDateFormat(object, "yyyy-MM-dd HH:mm:ss");
			logger.info("Response:" + json);
			ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
			ServletActionContext.getResponse().getWriter().write(json);
			ServletActionContext.getResponse().getWriter().flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @return 每页数据量
	 */
	public int getType(){
		if(rows==null){
			return 1;
		}
		if(rows==40){
			return 2;
		}else if(rows==60){
			return 3;
		}else if(rows==80){
			return 4;
		}else{
			return 1;
		}
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
