package com.bonc.GESysServer.mybitis.mapper;

import com.bonc.GESysServer.mybitis.model.MenuInfo;
import com.bonc.GESysServer.mybitis.model.MenuInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_info
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int countByExample(MenuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_info
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int deleteByExample(MenuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_info
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int deleteByPrimaryKey(String menuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_info
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int insert(MenuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_info
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int insertSelective(MenuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_info
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    List<MenuInfo> selectByExample(MenuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_info
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    MenuInfo selectByPrimaryKey(String menuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_info
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int updateByExampleSelective(@Param("record") MenuInfo record, @Param("example") MenuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_info
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int updateByExample(@Param("record") MenuInfo record, @Param("example") MenuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_info
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int updateByPrimaryKeySelective(MenuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_info
     *
     * @mbggenerated Thu Mar 13 23:40:39 CST 2014
     */
    int updateByPrimaryKey(MenuInfo record);
}