package cn.my.mvnweb.dao;

import java.util.List;

import cn.my.mvnweb.entity.FlActivity;
import cn.my.mvnweb.entity.FlUser;

public interface IFlActivityDao {

	/**
	 * 根据用户查询该好友的动态
	 * @param user
	 * @return
	 */
	public List<FlActivity> getList(FlUser user);
	
	/**
	 * 添加一条记录
	 * @param activity
	 * @return
	 */
	public Integer save(FlActivity activity);
}
