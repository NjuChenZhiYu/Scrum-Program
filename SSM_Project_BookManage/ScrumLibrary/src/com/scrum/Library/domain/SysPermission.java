package com.scrum.Library.domain;

import java.io.Serializable;

//权限
@SuppressWarnings("serial")
public class SysPermission implements Serializable{
	private String perName;

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}
	

}
