package com.bonc.GESysServer.mybitis.model;

import java.sql.Timestamp;

public class GroupRole extends GroupRoleKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_role.id_type
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    private String idType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_role.start_time
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    private Timestamp startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_role.end_time
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    private Timestamp endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_role.update_time
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    private Timestamp updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_role.operator
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    private Timestamp operator;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_role.id_type
     *
     * @return the value of group_role.id_type
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public String getIdType() {
        return idType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_role.id_type
     *
     * @param idType the value for group_role.id_type
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_role.start_time
     *
     * @return the value of group_role.start_time
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public Timestamp getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_role.start_time
     *
     * @param startTime the value for group_role.start_time
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_role.end_time
     *
     * @return the value of group_role.end_time
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public Timestamp getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_role.end_time
     *
     * @param endTime the value for group_role.end_time
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_role.update_time
     *
     * @return the value of group_role.update_time
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_role.update_time
     *
     * @param updateTime the value for group_role.update_time
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_role.operator
     *
     * @return the value of group_role.operator
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public Timestamp getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_role.operator
     *
     * @param operator the value for group_role.operator
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public void setOperator(Timestamp operator) {
        this.operator = operator;
    }
}