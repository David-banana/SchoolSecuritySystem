package com.schoolSecuritySystem.dao;

import com.schoolSecuritySystem.pojo.EntranceGuardInfo;
import com.schoolSecuritySystem.pojo.EntranceGuardInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EntranceGuardInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrance_guard_info
     *
     * @mbggenerated
     */
    int countByExample(EntranceGuardInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrance_guard_info
     *
     * @mbggenerated
     */
    int deleteByExample(EntranceGuardInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrance_guard_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrance_guard_info
     *
     * @mbggenerated
     */
    int insert(EntranceGuardInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrance_guard_info
     *
     * @mbggenerated
     */
    int insertSelective(EntranceGuardInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrance_guard_info
     *
     * @mbggenerated
     */
    List<EntranceGuardInfo> selectByExample(EntranceGuardInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrance_guard_info
     *
     * @mbggenerated
     */
    EntranceGuardInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrance_guard_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") EntranceGuardInfo record, @Param("example") EntranceGuardInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrance_guard_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") EntranceGuardInfo record, @Param("example") EntranceGuardInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrance_guard_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(EntranceGuardInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrance_guard_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(EntranceGuardInfo record);
}