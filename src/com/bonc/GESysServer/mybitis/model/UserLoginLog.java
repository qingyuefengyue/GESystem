package com.bonc.GESysServer.mybitis.model;

import java.sql.Timestamp;

public class UserLoginLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login_log.flow_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private Integer flowId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login_log.user_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login_log.user_name
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login_log.login_msg
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private String loginMsg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login_log.login_ip
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private String loginIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login_log.operate_time
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private Timestamp operateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login_log.flow_id
     *
     * @return the value of user_login_log.flow_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public Integer getFlowId() {
        return flowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login_log.flow_id
     *
     * @param flowId the value for user_login_log.flow_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login_log.user_id
     *
     * @return the value of user_login_log.user_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login_log.user_id
     *
     * @param userId the value for user_login_log.user_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login_log.user_name
     *
     * @return the value of user_login_log.user_name
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login_log.user_name
     *
     * @param userName the value for user_login_log.user_name
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login_log.login_msg
     *
     * @return the value of user_login_log.login_msg
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public String getLoginMsg() {
        return loginMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login_log.login_msg
     *
     * @param loginMsg the value for user_login_log.login_msg
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setLoginMsg(String loginMsg) {
        this.loginMsg = loginMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login_log.login_ip
     *
     * @return the value of user_login_log.login_ip
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login_log.login_ip
     *
     * @param loginIp the value for user_login_log.login_ip
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login_log.operate_time
     *
     * @return the value of user_login_log.operate_time
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public Timestamp getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login_log.operate_time
     *
     * @param operateTime the value for user_login_log.operate_time
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setOperateTime(Timestamp operateTime) {
        this.operateTime = operateTime;
    }
}