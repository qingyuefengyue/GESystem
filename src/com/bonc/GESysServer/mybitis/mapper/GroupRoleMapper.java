package com.bonc.GESysServer.mybitis.mapper;

import com.bonc.GESysServer.mybitis.model.GroupRole;
import com.bonc.GESysServer.mybitis.model.GroupRoleExample;
import com.bonc.GESysServer.mybitis.model.GroupRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int countByExample(GroupRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int deleteByExample(GroupRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int deleteByPrimaryKey(GroupRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int insert(GroupRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int insertSelective(GroupRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    List<GroupRole> selectByExample(GroupRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    GroupRole selectByPrimaryKey(GroupRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int updateByExampleSelective(@Param("record") GroupRole record, @Param("example") GroupRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int updateByExample(@Param("record") GroupRole record, @Param("example") GroupRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int updateByPrimaryKeySelective(GroupRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    int updateByPrimaryKey(GroupRole record);
}