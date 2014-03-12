package com.bonc.GESysServer.pojo;

import java.sql.Timestamp;

public class Menu {
	private String menuId;
	private String menuName;
	private Integer menuLevel;
	private Integer menuOrder;
	private String menuDesc;
	private String parentMenuId;
	private Integer status;
	private Timestamp createTime;
	
	
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param menuId
	 * @param menuName
	 * @param menuLevel
	 * @param menuOrder
	 * @param menuDesc
	 * @param parentMenuId
	 * @param status
	 * @param createTime
	 */
	public Menu(String menuId, String menuName, Integer menuLevel,
			Integer menuOrder, String menuDesc, String parentMenuId,
			Integer status, Timestamp createTime) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuLevel = menuLevel;
		this.menuOrder = menuOrder;
		this.menuDesc = menuDesc;
		this.parentMenuId = parentMenuId;
		this.status = status;
		this.createTime = createTime;
	}
	/**
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
	 * @return the menuLevel
	 */
	public Integer getMenuLevel() {
		return menuLevel;
	}
	/**
	 * @param menuLevel the menuLevel to set
	 */
	public void setMenuLevel(Integer menuLevel) {
		this.menuLevel = menuLevel;
	}
	/**
	 * @return the menuOrder
	 */
	public Integer getMenuOrder() {
		return menuOrder;
	}
	/**
	 * @param menuOrder the menuOrder to set
	 */
	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}
	/**
	 * @return the menuDesc
	 */
	public String getMenuDesc() {
		return menuDesc;
	}
	/**
	 * @param menuDesc the menuDesc to set
	 */
	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}
	/**
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
