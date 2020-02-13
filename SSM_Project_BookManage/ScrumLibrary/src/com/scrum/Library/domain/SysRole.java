package com.scrum.Library.domain;

import java.io.Serializable;

//角色
@SuppressWarnings("serial")
public class SysRole implements Serializable{
	private String roleName;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	

}
