package com.bonc.GESysServer.pojo.mapper;

import java.util.List;

import com.bonc.GESysServer.pojo.SysManagerInfo;
import com.bonc.GESysServer.pojo.SysRole;

/**
 * @author xz
 * @date 2014-03-09
 * */
public interface SysRoleMapper {
	/**
	 *根据用户查询角色 
	 * */
	public List<SysRole> getRoleListByManager(SysManagerInfo  sysManagerInfo);
}
