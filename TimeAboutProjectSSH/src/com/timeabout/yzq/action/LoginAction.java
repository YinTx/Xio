package com.timeabout.yzq.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.timeabout.yzq.bean.UserTab;
import com.timeabout.yzq.service.UserServiceImpl;



public class LoginAction extends ActionSupport {
	private UserServiceImpl userService;

	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}

	public String UserLogin() {
		UserTab user = new UserTab();
		ActionContext context=ActionContext.getContext();
		Map parameterMap=context.getParameters();
		HttpServletRequest request =(HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);
		
		String[] userNameArr=(String[]) parameterMap.get("username");
		String[] userPassArr=(String[]) parameterMap.get("userpass");
		user.setUsername(userNameArr[0]);
		user.setPassword(userPassArr[0]);
		userService.UserLogin(user);
		return "scccc";
	}
}
