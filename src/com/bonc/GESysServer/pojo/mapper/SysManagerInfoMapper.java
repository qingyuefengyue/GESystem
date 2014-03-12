package com.bonc.GESysServer.pojo.mapper;

import java.util.List;

import com.bonc.GESysServer.pojo.SysManagerInfo;
import com.bonc.GESysServer.pojo.SysMenuInfo;

public interface SysManagerInfoMapper {
	/**
	 * 根据管理员账号 查询管理员所对应的菜单
	 * */
	public List<SysMenuInfo> loadMenuByCount(SysManagerInfo sysManagerInfo);
	/**
	 * 根据用户登陆信息查询对应的用户信息
	 * */
	public List<SysManagerInfo> getManager(SysManagerInfo sysManagerInfo);
}
