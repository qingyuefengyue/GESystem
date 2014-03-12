package com.bonc.GESysServer.mybitis.mapper;

import com.bonc.GESysServer.mybitis.model.AreaInfo;
import com.bonc.GESysServer.mybitis.model.AreaInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int countByExample(AreaInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int deleteByExample(AreaInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int deleteByPrimaryKey(String areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int insert(AreaInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int insertSelective(AreaInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    List<AreaInfo> selectByExample(AreaInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    AreaInfo selectByPrimaryKey(String areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int updateByExampleSelective(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int updateByExample(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int updateByPrimaryKeySelective(AreaInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Wed Mar 12 23:43:34 CST 2014
     */
    int updateByPrimaryKey(AreaInfo record);
}