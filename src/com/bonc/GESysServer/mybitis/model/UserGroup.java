package com.bonc.GESysServer.mybitis.model;

public class UserGroup {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_group.group_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private String groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_group.group_name
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_group.status
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_group.group_id
     *
     * @return the value of user_group.group_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_group.group_id
     *
     * @param groupId the value for user_group.group_id
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_group.group_name
     *
     * @return the value of user_group.group_name
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_group.group_name
     *
     * @param groupName the value for user_group.group_name
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_group.status
     *
     * @return the value of user_group.status
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_group.status
     *
     * @param status the value for user_group.status
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}