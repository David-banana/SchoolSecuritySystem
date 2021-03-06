package com.schoolSecuritySystem.dao;

import com.schoolSecuritySystem.pojo.DiningroomCardInfo;
import com.schoolSecuritySystem.pojo.DiningroomCardInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DiningroomCardInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_card_info
     *
     * @mbggenerated
     */
    int countByExample(DiningroomCardInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_card_info
     *
     * @mbggenerated
     */
    int deleteByExample(DiningroomCardInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_card_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_card_info
     *
     * @mbggenerated
     */
    int insert(DiningroomCardInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_card_info
     *
     * @mbggenerated
     */
    int insertSelective(DiningroomCardInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_card_info
     *
     * @mbggenerated
     */
    List<DiningroomCardInfo> selectByExample(DiningroomCardInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_card_info
     *
     * @mbggenerated
     */
    DiningroomCardInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_card_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DiningroomCardInfo record, @Param("example") DiningroomCardInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_card_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DiningroomCardInfo record, @Param("example") DiningroomCardInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_card_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DiningroomCardInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diningroom_card_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DiningroomCardInfo record);
}