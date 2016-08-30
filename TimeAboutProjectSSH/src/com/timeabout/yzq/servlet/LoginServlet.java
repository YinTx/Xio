package com.timeabout.yzq.servlet;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedHashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.util.JSONBuilder;
import net.sf.json.util.JSONStringer;

import org.apache.log4j.net.SocketServer;

import com.google.gson.Gson;
import com.timeabout.yzq.bean.UserTab;
import com.timeabout.yzq.configure.EncodeConfig;
import com.timeabout.yzq.service.UserServiceImpl;

public class LoginServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// String responseText = JackJsonUtils.toJson(listObject);
		// ResponseUtils.renderJson(response, responseText);
//		UserServiceImpl userService = null;
//		UserTab user=new UserTab();
//		
//		user=userService.UserLogin(user);
//		String jsonUser;
//		String jsonResult = null;
//		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
//		Gson gson = new Gson();
//		if (user != null) {
//			map.put("state","1");
//			map.put("userName", user.getUsername());
//		}else{
//			map.put("state","0");
//			map.put("userName",null);
//		}
//		jsonUser=gson.toJson(map);
//		jsonUser=EncodeConfig.getBase64(jsonUser);//对User信息进行加密
//		map.clear();
//		map.put("Result",jsonUser);
//		jsonResult=gson.toJson(map);
		
		System.out.println("we");
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
