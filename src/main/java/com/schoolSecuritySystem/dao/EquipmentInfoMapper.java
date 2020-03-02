package com.schoolSecuritySystem.dao;

import com.schoolSecuritySystem.pojo.EquipmentInfo;
import com.schoolSecuritySystem.pojo.EquipmentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment_info
     *
     * @mbggenerated
     */
    int countByExample(EquipmentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment_info
     *
     * @mbggenerated
     */
    int deleteByExample(EquipmentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment_info
     *
     * @mbggenerated
     */
    int insert(EquipmentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment_info
     *
     * @mbggenerated
     */
    int insertSelective(EquipmentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment_info
     *
     * @mbggenerated
     */
    List<EquipmentInfo> selectByExample(EquipmentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment_info
     *
     * @mbggenerated
     */
    EquipmentInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") EquipmentInfo record, @Param("example") EquipmentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") EquipmentInfo record, @Param("example") EquipmentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(EquipmentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(EquipmentInfo record);
}