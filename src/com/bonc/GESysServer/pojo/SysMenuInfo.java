package com.bonc.GESysServer.pojo;

import java.sql.Timestamp;

/**
 * @author xz
 * @desc 后台管理 菜单pojo
 * @date  2014-03-09
 * */
public class SysMenuInfo {
	private String menuId;
	private String menuName;
	private String menuPath;
	private String parentMenuId;
	private String createUserName;
	private Integer  status;
	private Timestamp createTime;
	
	
	
	/**
	 * 
	 */
	public SysMenuInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param menuId
	 * @param menuName
	 * @param menuPath
	 * @param parentMenuId
	 * @param createUserName
	 * @param status
	 * @param createTime
	 */
	public SysMenuInfo(String menuId, String menuName, String menuPath,
			String parentMenuId, String createUserName, Integer status,
			Timestamp createTime) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuPath = menuPath;
		this.parentMenuId = parentMenuId;
		this.createUserName = createUserName;
		this.status = status;
		this.createTime = createTime;
	}


	/**
	 *  获取用户菜单
	 * @return the menuId
	 */
	public String getMenuId() {
		return menuId;
	}
	/**
	 * @param menuId the menuId to set
	 */
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	/**
	 * 获取菜单名称
	 * @return the menuName
	 */
	public String getMenuName() {
		return menuName;
	}
	/**
	 * @param menuName the menuName to set
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	/**
	 * 获取菜单url
	 * @return the menuPath
	 */
	public String getMenuPath() {
		return menuPath;
	}
	/**
	 * @param menuPath the menuPath to set
	 */
	public void setMenuPath(String menuPath) {
		this.menuPath = menuPath;
	}
	/**
	 * 获取父菜单编码
	 * @return the parentMenuId
	 */
	public String getParentMenuId() {
		return parentMenuId;
	}
	/**
	 * @param parentMenuId the parentMenuId to set
	 */
	public void setParentMenuId(String parentMenuId) {
		this.parentMenuId = parentMenuId;
	}
	/**
	 * 获取创建人名称
	 * @return the createUserName
	 */
	public String getCreateUserName() {
		return createUserName;
	}
	/**
	 * @param createUserName the createUserName to set
	 */
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}
	/**
	 * 获取菜单状态
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
	 * 获取创建时间
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
