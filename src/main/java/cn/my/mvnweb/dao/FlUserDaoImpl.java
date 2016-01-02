package cn.my.mvnweb.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.my.mvnweb.entity.FlUser;

public class FlUserDaoImpl extends HibernateDaoSupport implements IFlUserDao {

	@Override
	public FlUser getById(String userId) {
		return (FlUser)getHibernateTemplate().get(FlUser.class, userId);
	}

}
