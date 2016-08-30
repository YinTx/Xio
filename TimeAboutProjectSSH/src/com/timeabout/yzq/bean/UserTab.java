package com.timeabout.yzq.bean;

/**
 * UserTab entity. @author MyEclipse Persistence Tools
 */

public class UserTab implements java.io.Serializable {

	// Fields

	private Integer UId;
	private String UName;
	private String UPwd;

	// Constructors

	/** default constructor */
	public UserTab() {
	}

	/** full constructor */
	public UserTab(String UName, String UPwd) {
		this.UName = UName;
		this.UPwd = UPwd;
	}

	// Property accessors

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public String getUPwd() {
		return this.UPwd;
	}

	public void setUPwd(String UPwd) {
		this.UPwd = UPwd;
	}

}