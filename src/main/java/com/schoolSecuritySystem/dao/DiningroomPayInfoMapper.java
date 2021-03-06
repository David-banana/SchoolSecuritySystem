package com.schoolSecuritySystem.dao;

import com.schoolSecuritySystem.pojo.DiningroomPayInfo;
import com.schoolSecuritySystem.pojo.DiningroomPayInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DiningroomPayInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_pay_info
     *
     * @mbggenerated
     */
    int countByExample(DiningroomPayInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_pay_info
     *
     * @mbggenerated
     */
    int deleteByExample(DiningroomPayInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_pay_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_pay_info
     *
     * @mbggenerated
     */
    int insert(DiningroomPayInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_pay_info
     *
     * @mbggenerated
     */
    int insertSelective(DiningroomPayInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_pay_info
     *
     * @mbggenerated
     */
    List<DiningroomPayInfo> selectByExample(DiningroomPayInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_pay_info
     *
     * @mbggenerated
     */
    DiningroomPayInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_pay_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DiningroomPayInfo record, @Param("example") DiningroomPayInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_pay_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DiningroomPayInfo record, @Param("example") DiningroomPayInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_pay_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DiningroomPayInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_pay_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DiningroomPayInfo record);
}