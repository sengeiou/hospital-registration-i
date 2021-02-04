package com.liurq.server.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public DoctorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
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
     * This method corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
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

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(String value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(String value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(String value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(String value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(String value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLike(String value) {
            addCriterion("doctor_id like", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotLike(String value) {
            addCriterion("doctor_id not like", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<String> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<String> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(String value1, String value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(String value1, String value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNull() {
            addCriterion("doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNotNull() {
            addCriterion("doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameEqualTo(String value) {
            addCriterion("doctor_name =", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotEqualTo(String value) {
            addCriterion("doctor_name <>", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThan(String value) {
            addCriterion("doctor_name >", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_name >=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThan(String value) {
            addCriterion("doctor_name <", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("doctor_name <=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLike(String value) {
            addCriterion("doctor_name like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotLike(String value) {
            addCriterion("doctor_name not like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIn(List<String> values) {
            addCriterion("doctor_name in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotIn(List<String> values) {
            addCriterion("doctor_name not in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameBetween(String value1, String value2) {
            addCriterion("doctor_name between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotBetween(String value1, String value2) {
            addCriterion("doctor_name not between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorSexIsNull() {
            addCriterion("doctor_sex is null");
            return (Criteria) this;
        }

        public Criteria andDoctorSexIsNotNull() {
            addCriterion("doctor_sex is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorSexEqualTo(String value) {
            addCriterion("doctor_sex =", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexNotEqualTo(String value) {
            addCriterion("doctor_sex <>", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexGreaterThan(String value) {
            addCriterion("doctor_sex >", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_sex >=", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexLessThan(String value) {
            addCriterion("doctor_sex <", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexLessThanOrEqualTo(String value) {
            addCriterion("doctor_sex <=", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexLike(String value) {
            addCriterion("doctor_sex like", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexNotLike(String value) {
            addCriterion("doctor_sex not like", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexIn(List<String> values) {
            addCriterion("doctor_sex in", values, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexNotIn(List<String> values) {
            addCriterion("doctor_sex not in", values, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexBetween(String value1, String value2) {
            addCriterion("doctor_sex between", value1, value2, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexNotBetween(String value1, String value2) {
            addCriterion("doctor_sex not between", value1, value2, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorWorkAgeIsNull() {
            addCriterion("doctor_work_age is null");
            return (Criteria) this;
        }

        public Criteria andDoctorWorkAgeIsNotNull() {
            addCriterion("doctor_work_age is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorWorkAgeEqualTo(Integer value) {
            addCriterion("doctor_work_age =", value, "doctorWorkAge");
            return (Criteria) this;
        }

        public Criteria andDoctorWorkAgeNotEqualTo(Integer value) {
            addCriterion("doctor_work_age <>", value, "doctorWorkAge");
            return (Criteria) this;
        }

        public Criteria andDoctorWorkAgeGreaterThan(Integer value) {
            addCriterion("doctor_work_age >", value, "doctorWorkAge");
            return (Criteria) this;
        }

        public Criteria andDoctorWorkAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_work_age >=", value, "doctorWorkAge");
            return (Criteria) this;
        }

        public Criteria andDoctorWorkAgeLessThan(Integer value) {
            addCriterion("doctor_work_age <", value, "doctorWorkAge");
            return (Criteria) this;
        }

        public Criteria andDoctorWorkAgeLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_work_age <=", value, "doctorWorkAge");
            return (Criteria) this;
        }

        public Criteria andDoctorWorkAgeIn(List<Integer> values) {
            addCriterion("doctor_work_age in", values, "doctorWorkAge");
            return (Criteria) this;
        }

        public Criteria andDoctorWorkAgeNotIn(List<Integer> values) {
            addCriterion("doctor_work_age not in", values, "doctorWorkAge");
            return (Criteria) this;
        }

        public Criteria andDoctorWorkAgeBetween(Integer value1, Integer value2) {
            addCriterion("doctor_work_age between", value1, value2, "doctorWorkAge");
            return (Criteria) this;
        }

        public Criteria andDoctorWorkAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_work_age not between", value1, value2, "doctorWorkAge");
            return (Criteria) this;
        }

        public Criteria andDoctorLevelIsNull() {
            addCriterion("doctor_level is null");
            return (Criteria) this;
        }

        public Criteria andDoctorLevelIsNotNull() {
            addCriterion("doctor_level is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorLevelEqualTo(String value) {
            addCriterion("doctor_level =", value, "doctorLevel");
            return (Criteria) this;
        }

        public Criteria andDoctorLevelNotEqualTo(String value) {
            addCriterion("doctor_level <>", value, "doctorLevel");
            return (Criteria) this;
        }

        public Criteria andDoctorLevelGreaterThan(String value) {
            addCriterion("doctor_level >", value, "doctorLevel");
            return (Criteria) this;
        }

        public Criteria andDoctorLevelGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_level >=", value, "doctorLevel");
            return (Criteria) this;
        }

        public Criteria andDoctorLevelLessThan(String value) {
            addCriterion("doctor_level <", value, "doctorLevel");
            return (Criteria) this;
        }

        public Criteria andDoctorLevelLessThanOrEqualTo(String value) {
            addCriterion("doctor_level <=", value, "doctorLevel");
            return (Criteria) this;
        }

        public Criteria andDoctorLevelLike(String value) {
            addCriterion("doctor_level like", value, "doctorLevel");
            return (Criteria) this;
        }

        public Criteria andDoctorLevelNotLike(String value) {
            addCriterion("doctor_level not like", value, "doctorLevel");
            return (Criteria) this;
        }

        public Criteria andDoctorLevelIn(List<String> values) {
            addCriterion("doctor_level in", values, "doctorLevel");
            return (Criteria) this;
        }

        public Criteria andDoctorLevelNotIn(List<String> values) {
            addCriterion("doctor_level not in", values, "doctorLevel");
            return (Criteria) this;
        }

        public Criteria andDoctorLevelBetween(String value1, String value2) {
            addCriterion("doctor_level between", value1, value2, "doctorLevel");
            return (Criteria) this;
        }

        public Criteria andDoctorLevelNotBetween(String value1, String value2) {
            addCriterion("doctor_level not between", value1, value2, "doctorLevel");
            return (Criteria) this;
        }

        public Criteria andDoctorFeedbackRateIsNull() {
            addCriterion("doctor_feedback_rate is null");
            return (Criteria) this;
        }

        public Criteria andDoctorFeedbackRateIsNotNull() {
            addCriterion("doctor_feedback_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorFeedbackRateEqualTo(String value) {
            addCriterion("doctor_feedback_rate =", value, "doctorFeedbackRate");
            return (Criteria) this;
        }

        public Criteria andDoctorFeedbackRateNotEqualTo(String value) {
            addCriterion("doctor_feedback_rate <>", value, "doctorFeedbackRate");
            return (Criteria) this;
        }

        public Criteria andDoctorFeedbackRateGreaterThan(String value) {
            addCriterion("doctor_feedback_rate >", value, "doctorFeedbackRate");
            return (Criteria) this;
        }

        public Criteria andDoctorFeedbackRateGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_feedback_rate >=", value, "doctorFeedbackRate");
            return (Criteria) this;
        }

        public Criteria andDoctorFeedbackRateLessThan(String value) {
            addCriterion("doctor_feedback_rate <", value, "doctorFeedbackRate");
            return (Criteria) this;
        }

        public Criteria andDoctorFeedbackRateLessThanOrEqualTo(String value) {
            addCriterion("doctor_feedback_rate <=", value, "doctorFeedbackRate");
            return (Criteria) this;
        }

        public Criteria andDoctorFeedbackRateLike(String value) {
            addCriterion("doctor_feedback_rate like", value, "doctorFeedbackRate");
            return (Criteria) this;
        }

        public Criteria andDoctorFeedbackRateNotLike(String value) {
            addCriterion("doctor_feedback_rate not like", value, "doctorFeedbackRate");
            return (Criteria) this;
        }

        public Criteria andDoctorFeedbackRateIn(List<String> values) {
            addCriterion("doctor_feedback_rate in", values, "doctorFeedbackRate");
            return (Criteria) this;
        }

        public Criteria andDoctorFeedbackRateNotIn(List<String> values) {
            addCriterion("doctor_feedback_rate not in", values, "doctorFeedbackRate");
            return (Criteria) this;
        }

        public Criteria andDoctorFeedbackRateBetween(String value1, String value2) {
            addCriterion("doctor_feedback_rate between", value1, value2, "doctorFeedbackRate");
            return (Criteria) this;
        }

        public Criteria andDoctorFeedbackRateNotBetween(String value1, String value2) {
            addCriterion("doctor_feedback_rate not between", value1, value2, "doctorFeedbackRate");
            return (Criteria) this;
        }

        public Criteria andDoctorRegistrationCountIsNull() {
            addCriterion("doctor_registration_count is null");
            return (Criteria) this;
        }

        public Criteria andDoctorRegistrationCountIsNotNull() {
            addCriterion("doctor_registration_count is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorRegistrationCountEqualTo(Integer value) {
            addCriterion("doctor_registration_count =", value, "doctorRegistrationCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRegistrationCountNotEqualTo(Integer value) {
            addCriterion("doctor_registration_count <>", value, "doctorRegistrationCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRegistrationCountGreaterThan(Integer value) {
            addCriterion("doctor_registration_count >", value, "doctorRegistrationCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRegistrationCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_registration_count >=", value, "doctorRegistrationCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRegistrationCountLessThan(Integer value) {
            addCriterion("doctor_registration_count <", value, "doctorRegistrationCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRegistrationCountLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_registration_count <=", value, "doctorRegistrationCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRegistrationCountIn(List<Integer> values) {
            addCriterion("doctor_registration_count in", values, "doctorRegistrationCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRegistrationCountNotIn(List<Integer> values) {
            addCriterion("doctor_registration_count not in", values, "doctorRegistrationCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRegistrationCountBetween(Integer value1, Integer value2) {
            addCriterion("doctor_registration_count between", value1, value2, "doctorRegistrationCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRegistrationCountNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_registration_count not between", value1, value2, "doctorRegistrationCount");
            return (Criteria) this;
        }

        public Criteria andDoctorImageIsNull() {
            addCriterion("doctor_image is null");
            return (Criteria) this;
        }

        public Criteria andDoctorImageIsNotNull() {
            addCriterion("doctor_image is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorImageEqualTo(String value) {
            addCriterion("doctor_image =", value, "doctorImage");
            return (Criteria) this;
        }

        public Criteria andDoctorImageNotEqualTo(String value) {
            addCriterion("doctor_image <>", value, "doctorImage");
            return (Criteria) this;
        }

        public Criteria andDoctorImageGreaterThan(String value) {
            addCriterion("doctor_image >", value, "doctorImage");
            return (Criteria) this;
        }

        public Criteria andDoctorImageGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_image >=", value, "doctorImage");
            return (Criteria) this;
        }

        public Criteria andDoctorImageLessThan(String value) {
            addCriterion("doctor_image <", value, "doctorImage");
            return (Criteria) this;
        }

        public Criteria andDoctorImageLessThanOrEqualTo(String value) {
            addCriterion("doctor_image <=", value, "doctorImage");
            return (Criteria) this;
        }

        public Criteria andDoctorImageLike(String value) {
            addCriterion("doctor_image like", value, "doctorImage");
            return (Criteria) this;
        }

        public Criteria andDoctorImageNotLike(String value) {
            addCriterion("doctor_image not like", value, "doctorImage");
            return (Criteria) this;
        }

        public Criteria andDoctorImageIn(List<String> values) {
            addCriterion("doctor_image in", values, "doctorImage");
            return (Criteria) this;
        }

        public Criteria andDoctorImageNotIn(List<String> values) {
            addCriterion("doctor_image not in", values, "doctorImage");
            return (Criteria) this;
        }

        public Criteria andDoctorImageBetween(String value1, String value2) {
            addCriterion("doctor_image between", value1, value2, "doctorImage");
            return (Criteria) this;
        }

        public Criteria andDoctorImageNotBetween(String value1, String value2) {
            addCriterion("doctor_image not between", value1, value2, "doctorImage");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneIsNull() {
            addCriterion("doctor_phone is null");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneIsNotNull() {
            addCriterion("doctor_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneEqualTo(String value) {
            addCriterion("doctor_phone =", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneNotEqualTo(String value) {
            addCriterion("doctor_phone <>", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneGreaterThan(String value) {
            addCriterion("doctor_phone >", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_phone >=", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneLessThan(String value) {
            addCriterion("doctor_phone <", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneLessThanOrEqualTo(String value) {
            addCriterion("doctor_phone <=", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneLike(String value) {
            addCriterion("doctor_phone like", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneNotLike(String value) {
            addCriterion("doctor_phone not like", value, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneIn(List<String> values) {
            addCriterion("doctor_phone in", values, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneNotIn(List<String> values) {
            addCriterion("doctor_phone not in", values, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneBetween(String value1, String value2) {
            addCriterion("doctor_phone between", value1, value2, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorPhoneNotBetween(String value1, String value2) {
            addCriterion("doctor_phone not between", value1, value2, "doctorPhone");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_doctor
     *
     * @mbggenerated do_not_delete_during_merge Wed Feb 03 19:23:50 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_doctor
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
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