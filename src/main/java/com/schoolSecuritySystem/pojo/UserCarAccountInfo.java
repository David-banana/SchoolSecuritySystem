package com.schoolSecuritySystem.pojo;

import java.io.Serializable;

public class UserCarAccountInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_car_account_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_car_account_info.user_CardId
     *
     * @mbggenerated
     */
    private String userCardid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_car_account_info.car_number
     *
     * @mbggenerated
     */
    private String carNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_car_account_info.surplus
     *
     * @mbggenerated
     */
    private Integer surplus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_car_account_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_car_account_info.id
     *
     * @return the value of user_car_account_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_car_account_info.id
     *
     * @param id the value for user_car_account_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_car_account_info.user_CardId
     *
     * @return the value of user_car_account_info.user_CardId
     *
     * @mbggenerated
     */
    public String getUserCardid() {
        return userCardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_car_account_info.user_CardId
     *
     * @param userCardid the value for user_car_account_info.user_CardId
     *
     * @mbggenerated
     */
    public void setUserCardid(String userCardid) {
        this.userCardid = userCardid == null ? null : userCardid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_car_account_info.car_number
     *
     * @return the value of user_car_account_info.car_number
     *
     * @mbggenerated
     */
    public String getCarNumber() {
        return carNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_car_account_info.car_number
     *
     * @param carNumber the value for user_car_account_info.car_number
     *
     * @mbggenerated
     */
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_car_account_info.surplus
     *
     * @return the value of user_car_account_info.surplus
     *
     * @mbggenerated
     */
    public Integer getSurplus() {
        return surplus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_car_account_info.surplus
     *
     * @param surplus the value for user_car_account_info.surplus
     *
     * @mbggenerated
     */
    public void setSurplus(Integer surplus) {
        this.surplus = surplus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_car_account_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userCardid=").append(userCardid);
        sb.append(", carNumber=").append(carNumber);
        sb.append(", surplus=").append(surplus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}