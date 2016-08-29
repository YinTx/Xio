package com.timeabout.yzq.bean;

/**
 * UserTab entity. @author MyEclipse Persistence Tools
 */

public class UserTab implements java.io.Serializable {

	// Fields

	private Integer UId;
	private String username;
	private String password;

	// Constructors

	/** default constructor */
	public UserTab() {
	}

	/** full constructor */
	public UserTab(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Property accessors

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}