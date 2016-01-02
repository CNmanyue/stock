package cn.my.mvnweb.dao;

import cn.my.mvnweb.entity.FlUser;


/**
 * @author Mocuishle
 * 用户dao接口
 */
public interface IFlUserDao {

	public FlUser getById(String userId);
	
}
