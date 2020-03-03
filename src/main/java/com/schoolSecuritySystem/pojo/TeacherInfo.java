package com.schoolSecuritySystem.pojo;

import java.io.Serializable;

public class TeacherInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.gender
     *
     * @mbggenerated
     */
    private Integer gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.academy
     *
     * @mbggenerated
     */
    private String academy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.mobliePhone
     *
     * @mbggenerated
     */
    private String mobliephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.teacherCardId
     *
     * @mbggenerated
     */
    private String teachercardid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.emergencyContact
     *
     * @mbggenerated
     */
    private String emergencycontact;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.emergencyContactMobilePhone
     *
     * @mbggenerated
     */
    private String emergencycontactmobilephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.Email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.role
     *
     * @mbggenerated
     */
    private Integer role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.work
     *
     * @mbggenerated
     */
    private String work;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teacher_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.id
     *
     * @return the value of teacher_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.id
     *
     * @param id the value for teacher_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.name
     *
     * @return the value of teacher_info.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.name
     *
     * @param name the value for teacher_info.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.gender
     *
     * @return the value of teacher_info.gender
     *
     * @mbggenerated
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.gender
     *
     * @param gender the value for teacher_info.gender
     *
     * @mbggenerated
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.academy
     *
     * @return the value of teacher_info.academy
     *
     * @mbggenerated
     */
    public String getAcademy() {
        return academy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.academy
     *
     * @param academy the value for teacher_info.academy
     *
     * @mbggenerated
     */
    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.mobliePhone
     *
     * @return the value of teacher_info.mobliePhone
     *
     * @mbggenerated
     */
    public String getMobliephone() {
        return mobliephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.mobliePhone
     *
     * @param mobliephone the value for teacher_info.mobliePhone
     *
     * @mbggenerated
     */
    public void setMobliephone(String mobliephone) {
        this.mobliephone = mobliephone == null ? null : mobliephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.teacherCardId
     *
     * @return the value of teacher_info.teacherCardId
     *
     * @mbggenerated
     */
    public String getTeachercardid() {
        return teachercardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.teacherCardId
     *
     * @param teachercardid the value for teacher_info.teacherCardId
     *
     * @mbggenerated
     */
    public void setTeachercardid(String teachercardid) {
        this.teachercardid = teachercardid == null ? null : teachercardid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.address
     *
     * @return the value of teacher_info.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.address
     *
     * @param address the value for teacher_info.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.emergencyContact
     *
     * @return the value of teacher_info.emergencyContact
     *
     * @mbggenerated
     */
    public String getEmergencycontact() {
        return emergencycontact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.emergencyContact
     *
     * @param emergencycontact the value for teacher_info.emergencyContact
     *
     * @mbggenerated
     */
    public void setEmergencycontact(String emergencycontact) {
        this.emergencycontact = emergencycontact == null ? null : emergencycontact.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.emergencyContactMobilePhone
     *
     * @return the value of teacher_info.emergencyContactMobilePhone
     *
     * @mbggenerated
     */
    public String getEmergencycontactmobilephone() {
        return emergencycontactmobilephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.emergencyContactMobilePhone
     *
     * @param emergencycontactmobilephone the value for teacher_info.emergencyContactMobilePhone
     *
     * @mbggenerated
     */
    public void setEmergencycontactmobilephone(String emergencycontactmobilephone) {
        this.emergencycontactmobilephone = emergencycontactmobilephone == null ? null : emergencycontactmobilephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.Email
     *
     * @return the value of teacher_info.Email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.Email
     *
     * @param email the value for teacher_info.Email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.role
     *
     * @return the value of teacher_info.role
     *
     * @mbggenerated
     */
    public Integer getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.role
     *
     * @param role the value for teacher_info.role
     *
     * @mbggenerated
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.work
     *
     * @return the value of teacher_info.work
     *
     * @mbggenerated
     */
    public String getWork() {
        return work;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.work
     *
     * @param work the value for teacher_info.work
     *
     * @mbggenerated
     */
    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
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
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", academy=").append(academy);
        sb.append(", mobliephone=").append(mobliephone);
        sb.append(", teachercardid=").append(teachercardid);
        sb.append(", address=").append(address);
        sb.append(", emergencycontact=").append(emergencycontact);
        sb.append(", emergencycontactmobilephone=").append(emergencycontactmobilephone);
        sb.append(", email=").append(email);
        sb.append(", role=").append(role);
        sb.append(", work=").append(work);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}