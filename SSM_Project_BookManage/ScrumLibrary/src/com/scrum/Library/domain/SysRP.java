package com.scrum.Library.domain;

import java.io.Serializable;

//角色和权限
@SuppressWarnings("serial")
public class SysRP implements Serializable{
	private String roleName;
	private String perName;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	

}
