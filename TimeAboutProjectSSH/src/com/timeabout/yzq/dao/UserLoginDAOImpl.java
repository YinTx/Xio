package com.timeabout.yzq.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.timeabout.yzq.bean.UserTab;

public class UserLoginDAOImpl extends HibernateDaoSupport 
		 {

	public void doCreateUser(UserTab user) {
		this.getHibernateTemplate().save(user);
	}

	public List<UserTab> findAllUsers() {
		String hql = "from User u order by u.id asc";
		List<UserTab> list = this.getHibernateTemplate().find(hql);
		return list;
	}

	public void removeUser(UserTab user) {
		this.getHibernateTemplate().delete(user);
	}

	public void updateUser(UserTab user) {
		this.getHibernateTemplate().update(user);
	}

	public UserTab findUserById(int id) {
		UserTab user = null;
		user = (UserTab) this.getHibernateTemplate().get(UserTab.class, id);
		return user;
	}

	public UserTab findUserByNameAndPass(String name, String password) {
		UserTab user = null;
		String hql = "from UserTab where UName="+name+"and UPwd="+password;
		List<UserTab> list=this.getHibernateTemplate().find(hql);
		 if(list!=null && list.size()>0){//若找到的list不为空那么则说明数据库中包含这个人
	            user = list.get(0);
	        }
		 return user;
	}

}
