package com.bonc.GESysServer.mybitis.mapper;

import com.bonc.GESysServer.mybitis.model.SysMenuRole;
import com.bonc.GESysServer.mybitis.model.SysMenuRoleExample;
import com.bonc.GESysServer.mybitis.model.SysMenuRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int countByExample(SysMenuRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int deleteByExample(SysMenuRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int deleteByPrimaryKey(SysMenuRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int insert(SysMenuRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int insertSelective(SysMenuRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    List<SysMenuRole> selectByExample(SysMenuRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    SysMenuRole selectByPrimaryKey(SysMenuRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int updateByExampleSelective(@Param("record") SysMenuRole record, @Param("example") SysMenuRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int updateByExample(@Param("record") SysMenuRole record, @Param("example") SysMenuRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int updateByPrimaryKeySelective(SysMenuRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int updateByPrimaryKey(SysMenuRole record);
}