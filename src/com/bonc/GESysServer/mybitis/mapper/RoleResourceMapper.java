package com.bonc.GESysServer.mybitis.mapper;

import com.bonc.GESysServer.mybitis.model.RoleResource;
import com.bonc.GESysServer.mybitis.model.RoleResourceExample;
import com.bonc.GESysServer.mybitis.model.RoleResourceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_resource
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int countByExample(RoleResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_resource
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int deleteByExample(RoleResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_resource
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int deleteByPrimaryKey(RoleResourceKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_resource
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int insert(RoleResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_resource
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int insertSelective(RoleResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_resource
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    List<RoleResource> selectByExample(RoleResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_resource
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    RoleResource selectByPrimaryKey(RoleResourceKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_resource
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int updateByExampleSelective(@Param("record") RoleResource record, @Param("example") RoleResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_resource
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int updateByExample(@Param("record") RoleResource record, @Param("example") RoleResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_resource
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int updateByPrimaryKeySelective(RoleResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_resource
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int updateByPrimaryKey(RoleResource record);
}