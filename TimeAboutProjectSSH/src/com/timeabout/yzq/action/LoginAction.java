package com.timeabout.yzq.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.timeabout.yzq.bean.UserTab;
import com.timeabout.yzq.service.UserServiceImpl;
import com.timeabout.yzq.util.Utiles;

public class LoginAction extends ActionSupport {
	private UserServiceImpl userService;

	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}

	public String UserLogin() {
		UserTab user = new UserTab();
		Gson gson = new Gson();
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		ActionContext context = ActionContext.getContext();
		Map parameterMap = context.getParameters();
		HttpServletRequest request = (HttpServletRequest) context
				.get(ServletActionContext.HTTP_REQUEST);
		HttpServletResponse response = (HttpServletResponse) context
				.get(ServletActionContext.HTTP_RESPONSE);

		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");

		String[] userNameArr = (String[]) parameterMap.get("username");
		user.setUName(userNameArr[0]);
		user = userService.UserLogin(user);
//		Utiles.checkUserNameAndPass(user.getUName(),user.getUPwd(), MD5Code)		
		
		if (user != null) {
			map.put("state", "1");
			map.put("userName", user.getUName());
		} else {
			map.put("state", "0");
			map.put("userName", null);
		}
		String jsonStr = gson.toJson(map);
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.write(jsonStr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
		return null;
	}
}
