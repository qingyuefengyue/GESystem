package com.bonc.GESysServer.service;

import java.util.List;

import com.bonc.GESysServer.mybitis.model.SysManagerInfo;
import com.bonc.GESysServer.mybitis.model.SysMenuInfo;

public interface SysManagerService {
	
	/**
	 * 验证管理员登陆信息
	 * */
	public SysManagerInfo confirmLoginInfo(SysManagerInfo sysManagerInfo);
	/**
	 * 根据管理员账号加载用户授权菜单
	 * */
	public List<SysMenuInfo> getAuthMenuByUserCount(SysManagerInfo sysManagerInfo);
}
