package com.bonc.GESysServer.pojo;

import java.sql.Timestamp;

/**
 * 系统管理员信息pojo
 * */
public class SysManagerInfo {
	/**管理员账号*/
	private String managerAccount;
	/**管理员姓名*/
	private String managerName;
	/**管理员登陆密码*/
	private String managerPwd;
	/**管理员手机号*/
	private String managerMobile;
	/**管理员邮箱*/
	private String managerEmail;
	/**管理员创建时间*/
	private Timestamp createTime;
	/**管理员状态*/
	private Integer status;
	
	
	public SysManagerInfo() {
		super();
	}
	
	/**
	 * @param managerAccount
	 * @param managerName
	 * @param managerPwd
	 * @param managerMobile
	 * @param managerEmail
	 * @param createTime
	 * @param status
	 */
	public SysManagerInfo(String managerAccount, String managerName,
			String managerPwd, String managerMobile, String managerEmail,
			Timestamp createTime, Integer status) {
		super();
		this.managerAccount = managerAccount;
		this.managerName = managerName;
		this.managerPwd = managerPwd;
		this.managerMobile = managerMobile;
		this.managerEmail = managerEmail;
		this.createTime = createTime;
		this.status = status;
	}

	/**
	 * @return the managerAccount
	 */
	public String getManagerAccount() {
		return managerAccount;
	}
	/**
	 * @param managerAccount the managerAccount to set
	 */
	public void setManagerAccount(String managerAccount) {
		this.managerAccount = managerAccount;
	}
	/**
	 * @return the managerName
	 */
	public String getManagerName() {
		return managerName;
	}
	/**
	 * @param managerName the managerName to set
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	/**
	 * @return the managerPwd
	 */
	public String getManagerPwd() {
		return managerPwd;
	}
	/**
	 * @param managerPwd the managerPwd to set
	 */
	public void setManagerPwd(String managerPwd) {
		this.managerPwd = managerPwd;
	}
	/**
	 * @return the managerMobile
	 */
	public String getManagerMobile() {
		return managerMobile;
	}
	/**
	 * @param managerMobile the managerMobile to set
	 */
	public void setManagerMobile(String managerMobile) {
		this.managerMobile = managerMobile;
	}
	/**
	 * @return the managerEmail
	 */
	public String getManagerEmail() {
		return managerEmail;
	}
	/**
	 * @param managerEmail the managerEmail to set
	 */
	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
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
	
	
	
}
