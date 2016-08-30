package com.timeabout.yzq.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.timeabout.yzq.bean.UserTab;

public class UserLoginDAOImpl extends HibernateDaoSupport {

	public void doCreateUser(UserTab user) {
		this.getHibernateTemplate().save(user);
	}

	public List<UserTab> findAllUsers() {
		String hql = "from UserTab u order by u.id asc";
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
	public UserTab findUserByName(String name) {
		UserTab user = null;
		String hql = "from UserTab where UName=?";
		List<UserTab> list = this.getHibernateTemplate().find(hql,name);
		 if(list!=null && list.size()>0){//���ҵ���list��Ϊ����ô��˵�����ݿ��а��������
		 user = list.get(0);
		 }
		return user;
	}

}
