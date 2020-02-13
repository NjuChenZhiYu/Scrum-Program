package com.scrum.Library.mybatis;

import java.util.List;

import com.scrum.Library.domain.Reader;
import com.scrum.Library.domain.SysUR;
import com.scrum.Library.domain.SysUser;
import com.scrum.Library.parameter.Parameter;

//用户登陆的接口
public interface UserLoginMapper {

//	查找密码
	public String findpwdByName(String name);

//	更新密码
	public int updatepwdByName(SysUser sysUser);

//	读者表插入一条信息，则在系统用户表中也要插入一条信息
	public int insertSysUser(Reader reader);

//	读者表更新，系统表也要更新
	public int updateSysUser(Reader reader);

//	读者表删除，系统表也要删除
	public int deleteSysUser(String id);

//	查询自己的而用户信息
	public Reader selectSysUser(String id);

//	更新密码
	public int updatePwd(SysUser user);

	public int insertPermission(SysUR sysUR);

	public List<SysUR>selectPermission(Parameter parameter);

	public  int deletePermission(SysUR sysUR);

	public int getCountsPermission();
}
