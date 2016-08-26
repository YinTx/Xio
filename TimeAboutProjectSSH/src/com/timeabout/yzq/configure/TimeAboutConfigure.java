package com.timeabout.yzq.configure;

public class TimeAboutConfigure {
	private String serverAddress="q815030560.xicp.net:13280";
	private String dataBase="jdbc:mysql://"+serverAddress+"/abouttime";
	public String getServerAddress() {
		return serverAddress;
	}
	public String getDataBase() {
		return dataBase;
	}
}
