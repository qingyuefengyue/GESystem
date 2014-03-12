package com.bonc.GESysServer.pojo;

import java.sql.Timestamp;

/**
 * @author xz
 * @date 2014-03-09
 * @desc 用户角色对应的pojo 一个用户可以对应多个角色
 * */
public class SysRole {
	
	private String roleId;
	private String roleName;
	private Integer status;
	private Timestamp createTime;
	
	
	/**
	 * 
	 */
	public SysRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param roleId
	 * @param roleName
	 * @param status
	 * @param createTime
	 */
	public SysRole(String roleId, String roleName, Integer status,
			Timestamp createTime) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.status = status;
		this.createTime = createTime;
	}


	/**
	 * @return the roleId
	 */
	public String getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}
	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the createTime
	 */
	public Timestamp getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
	
	
}
