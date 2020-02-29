package com.schoolSecuritySystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated
     */
    public StudentInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student_info
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAcademyIsNull() {
            addCriterion("academy is null");
            return (Criteria) this;
        }

        public Criteria andAcademyIsNotNull() {
            addCriterion("academy is not null");
            return (Criteria) this;
        }

        public Criteria andAcademyEqualTo(String value) {
            addCriterion("academy =", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotEqualTo(String value) {
            addCriterion("academy <>", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyGreaterThan(String value) {
            addCriterion("academy >", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyGreaterThanOrEqualTo(String value) {
            addCriterion("academy >=", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyLessThan(String value) {
            addCriterion("academy <", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyLessThanOrEqualTo(String value) {
            addCriterion("academy <=", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyLike(String value) {
            addCriterion("academy like", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotLike(String value) {
            addCriterion("academy not like", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyIn(List<String> values) {
            addCriterion("academy in", values, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotIn(List<String> values) {
            addCriterion("academy not in", values, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyBetween(String value1, String value2) {
            addCriterion("academy between", value1, value2, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotBetween(String value1, String value2) {
            addCriterion("academy not between", value1, value2, "academy");
            return (Criteria) this;
        }

        public Criteria andClassroomIsNull() {
            addCriterion("classroom is null");
            return (Criteria) this;
        }

        public Criteria andClassroomIsNotNull() {
            addCriterion("classroom is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomEqualTo(String value) {
            addCriterion("classroom =", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomNotEqualTo(String value) {
            addCriterion("classroom <>", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomGreaterThan(String value) {
            addCriterion("classroom >", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomGreaterThanOrEqualTo(String value) {
            addCriterion("classroom >=", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomLessThan(String value) {
            addCriterion("classroom <", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomLessThanOrEqualTo(String value) {
            addCriterion("classroom <=", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomLike(String value) {
            addCriterion("classroom like", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomNotLike(String value) {
            addCriterion("classroom not like", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomIn(List<String> values) {
            addCriterion("classroom in", values, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomNotIn(List<String> values) {
            addCriterion("classroom not in", values, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomBetween(String value1, String value2) {
            addCriterion("classroom between", value1, value2, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomNotBetween(String value1, String value2) {
            addCriterion("classroom not between", value1, value2, "classroom");
            return (Criteria) this;
        }

        public Criteria andMobliephoneIsNull() {
            addCriterion("mobliePhone is null");
            return (Criteria) this;
        }

        public Criteria andMobliephoneIsNotNull() {
            addCriterion("mobliePhone is not null");
            return (Criteria) this;
        }

        public Criteria andMobliephoneEqualTo(String value) {
            addCriterion("mobliePhone =", value, "mobliephone");
            return (Criteria) this;
        }

        public Criteria andMobliephoneNotEqualTo(String value) {
            addCriterion("mobliePhone <>", value, "mobliephone");
            return (Criteria) this;
        }

        public Criteria andMobliephoneGreaterThan(String value) {
            addCriterion("mobliePhone >", value, "mobliephone");
            return (Criteria) this;
        }

        public Criteria andMobliephoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobliePhone >=", value, "mobliephone");
            return (Criteria) this;
        }

        public Criteria andMobliephoneLessThan(String value) {
            addCriterion("mobliePhone <", value, "mobliephone");
            return (Criteria) this;
        }

        public Criteria andMobliephoneLessThanOrEqualTo(String value) {
            addCriterion("mobliePhone <=", value, "mobliephone");
            return (Criteria) this;
        }

        public Criteria andMobliephoneLike(String value) {
            addCriterion("mobliePhone like", value, "mobliephone");
            return (Criteria) this;
        }

        public Criteria andMobliephoneNotLike(String value) {
            addCriterion("mobliePhone not like", value, "mobliephone");
            return (Criteria) this;
        }

        public Criteria andMobliephoneIn(List<String> values) {
            addCriterion("mobliePhone in", values, "mobliephone");
            return (Criteria) this;
        }

        public Criteria andMobliephoneNotIn(List<String> values) {
            addCriterion("mobliePhone not in", values, "mobliephone");
            return (Criteria) this;
        }

        public Criteria andMobliephoneBetween(String value1, String value2) {
            addCriterion("mobliePhone between", value1, value2, "mobliephone");
            return (Criteria) this;
        }

        public Criteria andMobliephoneNotBetween(String value1, String value2) {
            addCriterion("mobliePhone not between", value1, value2, "mobliephone");
            return (Criteria) this;
        }

        public Criteria andStudentcardidIsNull() {
            addCriterion("studentCardId is null");
            return (Criteria) this;
        }

        public Criteria andStudentcardidIsNotNull() {
            addCriterion("studentCardId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentcardidEqualTo(String value) {
            addCriterion("studentCardId =", value, "studentcardid");
            return (Criteria) this;
        }

        public Criteria andStudentcardidNotEqualTo(String value) {
            addCriterion("studentCardId <>", value, "studentcardid");
            return (Criteria) this;
        }

        public Criteria andStudentcardidGreaterThan(String value) {
            addCriterion("studentCardId >", value, "studentcardid");
            return (Criteria) this;
        }

        public Criteria andStudentcardidGreaterThanOrEqualTo(String value) {
            addCriterion("studentCardId >=", value, "studentcardid");
            return (Criteria) this;
        }

        public Criteria andStudentcardidLessThan(String value) {
            addCriterion("studentCardId <", value, "studentcardid");
            return (Criteria) this;
        }

        public Criteria andStudentcardidLessThanOrEqualTo(String value) {
            addCriterion("studentCardId <=", value, "studentcardid");
            return (Criteria) this;
        }

        public Criteria andStudentcardidLike(String value) {
            addCriterion("studentCardId like", value, "studentcardid");
            return (Criteria) this;
        }

        public Criteria andStudentcardidNotLike(String value) {
            addCriterion("studentCardId not like", value, "studentcardid");
            return (Criteria) this;
        }

        public Criteria andStudentcardidIn(List<String> values) {
            addCriterion("studentCardId in", values, "studentcardid");
            return (Criteria) this;
        }

        public Criteria andStudentcardidNotIn(List<String> values) {
            addCriterion("studentCardId not in", values, "studentcardid");
            return (Criteria) this;
        }

        public Criteria andStudentcardidBetween(String value1, String value2) {
            addCriterion("studentCardId between", value1, value2, "studentcardid");
            return (Criteria) this;
        }

        public Criteria andStudentcardidNotBetween(String value1, String value2) {
            addCriterion("studentCardId not between", value1, value2, "studentcardid");
            return (Criteria) this;
        }

        public Criteria andDomitoryIsNull() {
            addCriterion("domitory is null");
            return (Criteria) this;
        }

        public Criteria andDomitoryIsNotNull() {
            addCriterion("domitory is not null");
            return (Criteria) this;
        }

        public Criteria andDomitoryEqualTo(Integer value) {
            addCriterion("domitory =", value, "domitory");
            return (Criteria) this;
        }

        public Criteria andDomitoryNotEqualTo(Integer value) {
            addCriterion("domitory <>", value, "domitory");
            return (Criteria) this;
        }

        public Criteria andDomitoryGreaterThan(Integer value) {
            addCriterion("domitory >", value, "domitory");
            return (Criteria) this;
        }

        public Criteria andDomitoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("domitory >=", value, "domitory");
            return (Criteria) this;
        }

        public Criteria andDomitoryLessThan(Integer value) {
            addCriterion("domitory <", value, "domitory");
            return (Criteria) this;
        }

        public Criteria andDomitoryLessThanOrEqualTo(Integer value) {
            addCriterion("domitory <=", value, "domitory");
            return (Criteria) this;
        }

        public Criteria andDomitoryIn(List<Integer> values) {
            addCriterion("domitory in", values, "domitory");
            return (Criteria) this;
        }

        public Criteria andDomitoryNotIn(List<Integer> values) {
            addCriterion("domitory not in", values, "domitory");
            return (Criteria) this;
        }

        public Criteria andDomitoryBetween(Integer value1, Integer value2) {
            addCriterion("domitory between", value1, value2, "domitory");
            return (Criteria) this;
        }

        public Criteria andDomitoryNotBetween(Integer value1, Integer value2) {
            addCriterion("domitory not between", value1, value2, "domitory");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIsNull() {
            addCriterion("emergencyContact is null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIsNotNull() {
            addCriterion("emergencyContact is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactEqualTo(String value) {
            addCriterion("emergencyContact =", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotEqualTo(String value) {
            addCriterion("emergencyContact <>", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactGreaterThan(String value) {
            addCriterion("emergencyContact >", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactGreaterThanOrEqualTo(String value) {
            addCriterion("emergencyContact >=", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLessThan(String value) {
            addCriterion("emergencyContact <", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLessThanOrEqualTo(String value) {
            addCriterion("emergencyContact <=", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLike(String value) {
            addCriterion("emergencyContact like", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotLike(String value) {
            addCriterion("emergencyContact not like", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIn(List<String> values) {
            addCriterion("emergencyContact in", values, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotIn(List<String> values) {
            addCriterion("emergencyContact not in", values, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactBetween(String value1, String value2) {
            addCriterion("emergencyContact between", value1, value2, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotBetween(String value1, String value2) {
            addCriterion("emergencyContact not between", value1, value2, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactmobilephoneIsNull() {
            addCriterion("emergencyContactMobilePhone is null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactmobilephoneIsNotNull() {
            addCriterion("emergencyContactMobilePhone is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactmobilephoneEqualTo(Integer value) {
            addCriterion("emergencyContactMobilePhone =", value, "emergencycontactmobilephone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactmobilephoneNotEqualTo(Integer value) {
            addCriterion("emergencyContactMobilePhone <>", value, "emergencycontactmobilephone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactmobilephoneGreaterThan(Integer value) {
            addCriterion("emergencyContactMobilePhone >", value, "emergencycontactmobilephone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactmobilephoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("emergencyContactMobilePhone >=", value, "emergencycontactmobilephone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactmobilephoneLessThan(Integer value) {
            addCriterion("emergencyContactMobilePhone <", value, "emergencycontactmobilephone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactmobilephoneLessThanOrEqualTo(Integer value) {
            addCriterion("emergencyContactMobilePhone <=", value, "emergencycontactmobilephone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactmobilephoneIn(List<Integer> values) {
            addCriterion("emergencyContactMobilePhone in", values, "emergencycontactmobilephone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactmobilephoneNotIn(List<Integer> values) {
            addCriterion("emergencyContactMobilePhone not in", values, "emergencycontactmobilephone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactmobilephoneBetween(Integer value1, Integer value2) {
            addCriterion("emergencyContactMobilePhone between", value1, value2, "emergencycontactmobilephone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactmobilephoneNotBetween(Integer value1, Integer value2) {
            addCriterion("emergencyContactMobilePhone not between", value1, value2, "emergencycontactmobilephone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Integer value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Integer value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Integer value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Integer value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Integer value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Integer> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Integer> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Integer value1, Integer value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student_info
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student_info
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}