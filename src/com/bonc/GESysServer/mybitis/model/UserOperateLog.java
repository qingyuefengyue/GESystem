package com.bonc.GESysServer.mybitis.model;

import java.sql.Timestamp;

public class UserOperateLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_operate_log.flow_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private Integer flowId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_operate_log.user_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_operate_log.user_name
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_operate_log.operate_name
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private String operateName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_operate_log.operate_time
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private Timestamp operateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_operate_log.operate_msg
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private String operateMsg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_operate_log.flow_id
     *
     * @return the value of user_operate_log.flow_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public Integer getFlowId() {
        return flowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_operate_log.flow_id
     *
     * @param flowId the value for user_operate_log.flow_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_operate_log.user_id
     *
     * @return the value of user_operate_log.user_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_operate_log.user_id
     *
     * @param userId the value for user_operate_log.user_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_operate_log.user_name
     *
     * @return the value of user_operate_log.user_name
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_operate_log.user_name
     *
     * @param userName the value for user_operate_log.user_name
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_operate_log.operate_name
     *
     * @return the value of user_operate_log.operate_name
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public String getOperateName() {
        return operateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_operate_log.operate_name
     *
     * @param operateName the value for user_operate_log.operate_name
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_operate_log.operate_time
     *
     * @return the value of user_operate_log.operate_time
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public Timestamp getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_operate_log.operate_time
     *
     * @param operateTime the value for user_operate_log.operate_time
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setOperateTime(Timestamp operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_operate_log.operate_msg
     *
     * @return the value of user_operate_log.operate_msg
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public String getOperateMsg() {
        return operateMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_operate_log.operate_msg
     *
     * @param operateMsg the value for user_operate_log.operate_msg
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setOperateMsg(String operateMsg) {
        this.operateMsg = operateMsg;
    }
}