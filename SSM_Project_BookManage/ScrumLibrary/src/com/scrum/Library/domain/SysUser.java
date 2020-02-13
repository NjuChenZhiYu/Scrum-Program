package com.scrum.Library.domain;

import java.io.Serializable;
import java.util.Date;

//系统用户信息相当于shiro的subject
@SuppressWarnings("serial")
public class SysUser implements Serializable {
	private String username;
	private String password;
	private String identity;
	private Date date;

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	

}
