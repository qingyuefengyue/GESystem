package com.bonc.GESysServer.mybitis.model;

public class RoleResource extends RoleResourceKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_resource.resource_type
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    private String resourceType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_resource.resource_type
     *
     * @return the value of role_resource.resource_type
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_resource.resource_type
     *
     * @param resourceType the value for role_resource.resource_type
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}