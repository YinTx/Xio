package com.timeabout.yzq.service;

import java.util.List;

import com.timeabout.yzq.bean.UserTab;
import com.timeabout.yzq.dao.UserLoginDAOImpl;

public class UserServiceImpl  {
	private UserLoginDAOImpl dao;

	public void setDao(UserLoginDAOImpl dao) {
		this.dao = dao;
	}

	public void doCreateUser(UserTab user) {
		this.dao.doCreateUser(user);
	}

	public List<UserTab> findAllUsers() {
		return this.dao.findAllUsers();
	}

	public void delete(UserTab user) {
		this.dao.removeUser(user);
	}

	public void update(UserTab user) {
		this.dao.updateUser(user);
	}

	public UserTab findUserById(int id) {
		return this.dao.findUserById(id);
	}

	public boolean UserLogin(UserTab user) {
		user=dao.findUserByNameAndPass(user.getUName(),user.getUPwd());
		if(user!=null){
			System.out.println(user.getUName());
		}else{
			System.out.println("UserΪ��");
		}
		return false;
	}

}
