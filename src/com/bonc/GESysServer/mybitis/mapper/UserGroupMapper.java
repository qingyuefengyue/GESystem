package com.bonc.GESysServer.mybitis.mapper;

import com.bonc.GESysServer.mybitis.model.UserGroup;
import com.bonc.GESysServer.mybitis.model.UserGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int countByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int deleteByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int deleteByPrimaryKey(String groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int insert(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int insertSelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    List<UserGroup> selectByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    UserGroup selectByPrimaryKey(String groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int updateByExampleSelective(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int updateByExample(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int updateByPrimaryKeySelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int updateByPrimaryKey(UserGroup record);
}