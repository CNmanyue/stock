package cn.my.mvnweb.dao;

import cn.my.mvnweb.entity.FlComment;

public interface IFlComment {

	public Integer save(FlComment comment);
	
	public FlComment getById(Integer id);
}
