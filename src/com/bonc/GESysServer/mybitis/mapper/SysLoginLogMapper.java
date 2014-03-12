package com.bonc.GESysServer.mybitis.mapper;

import com.bonc.GESysServer.mybitis.model.SysLoginLog;
import com.bonc.GESysServer.mybitis.model.SysLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLoginLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int countByExample(SysLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int deleteByExample(SysLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int deleteByPrimaryKey(Integer flowId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int insert(SysLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int insertSelective(SysLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    List<SysLoginLog> selectByExample(SysLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    SysLoginLog selectByPrimaryKey(Integer flowId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int updateByExampleSelective(@Param("record") SysLoginLog record, @Param("example") SysLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int updateByExample(@Param("record") SysLoginLog record, @Param("example") SysLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int updateByPrimaryKeySelective(SysLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int updateByPrimaryKey(SysLoginLog record);
}