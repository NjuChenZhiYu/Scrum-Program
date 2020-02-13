package com.scrum.Library.domain;

import java.io.Serializable;

//用户和角色
@SuppressWarnings("serial")
public class SysUR implements Serializable{
	private int id;
	private String userName;
	private String roleName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	

}
