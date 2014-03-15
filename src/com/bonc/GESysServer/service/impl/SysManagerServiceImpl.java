package com.bonc.GESysServer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonc.GESysServer.mybitis.mapper.SysManagerInfoMapper;
import com.bonc.GESysServer.mybitis.model.SysManagerInfo;
import com.bonc.GESysServer.mybitis.model.SysMenuInfo;
import com.bonc.GESysServer.service.SysManagerService;
@Service
public class SysManagerServiceImpl implements SysManagerService {

	@Autowired
	private SysManagerInfoMapper managerInfoMapper;
	/* (non-Javadoc)
	 * @see com.bonc.GESysServer.service.SysManagerService#confirmLoginInfo(com.bonc.GESysServer.pojo.SysManagerInfo)
	 */
	@Override
	public SysManagerInfo confirmLoginInfo(SysManagerInfo sysManagerInfo) {
//		List<SysManagerInfo> list = managerInfoMapper.selectByParam(sysManagerInfo);
		//List<SysManagerInfo> list = managerInfoMapper.selectByParam(sysManagerInfo);
		SysManagerInfo t = managerInfoMapper.selectByPrimaryKey(sysManagerInfo.getManagerAccount());
		if(t != null){
			return t;
		}
		return null;
	}



	@Override
	public List<SysMenuInfo> getAuthMenuByUserCount(SysManagerInfo sysManagerInfo) {
		//更具管理员账号 加载管理员角色 ,通过角色查询菜单
		//List<SysRole> sysRoleList = sysRoleMapper.getRoleListByManager(sysManagerInfo);
		//通过角色查询出管理员对应的权限菜单
		return null;
	}

}
