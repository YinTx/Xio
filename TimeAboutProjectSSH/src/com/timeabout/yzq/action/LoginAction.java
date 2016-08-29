package com.timeabout.yzq.action;

import com.opensymphony.xwork2.ActionSupport;
import com.timeabout.yzq.bean.UserTab;
import com.timeabout.yzq.service.UserServiceImpl;

public class LoginAction extends ActionSupport{
	private UserServiceImpl userService;

	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}  
	public String UserLogin(){
		UserTab user=new UserTab();
		user.setUsername("xiao");
		user.setPassword("1234562");
		userService.UserLogin(user);
		return "scccc";
	}
}
