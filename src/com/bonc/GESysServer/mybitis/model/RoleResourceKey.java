package com.bonc.GESysServer.mybitis.model;

public class RoleResourceKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_resource.role_id
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_resource.resource_id
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    private String resourceId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_resource.role_id
     *
     * @return the value of role_resource.role_id
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_resource.role_id
     *
     * @param roleId the value for role_resource.role_id
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_resource.resource_id
     *
     * @return the value of role_resource.resource_id
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_resource.resource_id
     *
     * @param resourceId the value for role_resource.resource_id
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}