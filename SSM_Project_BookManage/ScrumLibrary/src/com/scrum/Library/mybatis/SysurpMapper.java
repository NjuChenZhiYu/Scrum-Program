package com.scrum.Library.mybatis;

import java.util.List;

import com.scrum.Library.domain.SysPermission;
import com.scrum.Library.domain.SysRole;

public interface SysurpMapper {
	public List<SysRole> getRole(String rdID);
	public List<SysPermission>getPermission(String roleName);

}
