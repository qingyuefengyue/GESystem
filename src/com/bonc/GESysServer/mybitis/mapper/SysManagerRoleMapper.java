package com.bonc.GESysServer.mybitis.mapper;

import com.bonc.GESysServer.mybitis.model.SysManagerRoleExample;
import com.bonc.GESysServer.mybitis.model.SysManagerRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysManagerRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_manager_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int countByExample(SysManagerRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_manager_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int deleteByExample(SysManagerRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_manager_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int deleteByPrimaryKey(SysManagerRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_manager_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int insert(SysManagerRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_manager_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int insertSelective(SysManagerRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_manager_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    List<SysManagerRoleKey> selectByExample(SysManagerRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_manager_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int updateByExampleSelective(@Param("record") SysManagerRoleKey record, @Param("example") SysManagerRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_manager_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int updateByExample(@Param("record") SysManagerRoleKey record, @Param("example") SysManagerRoleExample example);
}