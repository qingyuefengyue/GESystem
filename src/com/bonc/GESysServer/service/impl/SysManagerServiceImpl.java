package com.bonc.GESysServer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bonc.GESysServer.pojo.SysManagerInfo;
import com.bonc.GESysServer.pojo.SysMenuInfo;
import com.bonc.GESysServer.pojo.SysRole;
import com.bonc.GESysServer.pojo.mapper.SysManagerInfoMapper;
import com.bonc.GESysServer.pojo.mapper.SysRoleMapper;
import com.bonc.GESysServer.service.SysManagerService;

public class SysManagerServiceImpl implements SysManagerService {

	@Autowired
	private SysRoleMapper sysRoleMapper;
	
	@Autowired
	private SysManagerInfoMapper managerInfoMapper;
	
	
	/* (non-Javadoc)
	 * @see com.bonc.GESysServer.service.SysManagerService#confirmLoginInfo(com.bonc.GESysServer.pojo.SysManagerInfo)
	 */
	@Override
	public SysManagerInfo confirmLoginInfo(SysManagerInfo sysManagerInfo) {
		List<SysManagerInfo> resulList = managerInfoMapper.getManager(sysManagerInfo);
		if (resulList != null && resulList.size() > 0) {
			SysManagerInfo loginManager = resulList.get(0);
			return loginManager;
		}
		return null;
	}



	@Override
	public List<SysMenuInfo> getAuthMenuByUserCount(SysManagerInfo sysManagerInfo) {
		//更具管理员账号 加载管理员角色 ,通过角色查询菜单
		List<SysRole> sysRoleList = sysRoleMapper.getRoleListByManager(sysManagerInfo);
		//通过角色查询出管理员对应的权限菜单
		return null;
	}

}
