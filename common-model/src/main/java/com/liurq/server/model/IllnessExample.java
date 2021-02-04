package com.liurq.server.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IllnessExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table td_illness
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table td_illness
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table td_illness
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_illness
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public IllnessExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_illness
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_illness
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_illness
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_illness
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_illness
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_illness
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_illness
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
     * This method corresponds to the database table td_illness
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
     * This method corresponds to the database table td_illness
     *
     * @mbggenerated Wed Feb 03 19:23:50 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_illness
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
     * This class corresponds to the database table td_illness
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

        public Criteria andIllnessIdIsNull() {
            addCriterion("illness_id is null");
            return (Criteria) this;
        }

        public Criteria andIllnessIdIsNotNull() {
            addCriterion("illness_id is not null");
            return (Criteria) this;
        }

        public Criteria andIllnessIdEqualTo(String value) {
            addCriterion("illness_id =", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdNotEqualTo(String value) {
            addCriterion("illness_id <>", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdGreaterThan(String value) {
            addCriterion("illness_id >", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdGreaterThanOrEqualTo(String value) {
            addCriterion("illness_id >=", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdLessThan(String value) {
            addCriterion("illness_id <", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdLessThanOrEqualTo(String value) {
            addCriterion("illness_id <=", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdLike(String value) {
            addCriterion("illness_id like", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdNotLike(String value) {
            addCriterion("illness_id not like", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdIn(List<String> values) {
            addCriterion("illness_id in", values, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdNotIn(List<String> values) {
            addCriterion("illness_id not in", values, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdBetween(String value1, String value2) {
            addCriterion("illness_id between", value1, value2, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdNotBetween(String value1, String value2) {
            addCriterion("illness_id not between", value1, value2, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessNameIsNull() {
            addCriterion("illness_name is null");
            return (Criteria) this;
        }

        public Criteria andIllnessNameIsNotNull() {
            addCriterion("illness_name is not null");
            return (Criteria) this;
        }

        public Criteria andIllnessNameEqualTo(String value) {
            addCriterion("illness_name =", value, "illnessName");
            return (Criteria) this;
        }

        public Criteria andIllnessNameNotEqualTo(String value) {
            addCriterion("illness_name <>", value, "illnessName");
            return (Criteria) this;
        }

        public Criteria andIllnessNameGreaterThan(String value) {
            addCriterion("illness_name >", value, "illnessName");
            return (Criteria) this;
        }

        public Criteria andIllnessNameGreaterThanOrEqualTo(String value) {
            addCriterion("illness_name >=", value, "illnessName");
            return (Criteria) this;
        }

        public Criteria andIllnessNameLessThan(String value) {
            addCriterion("illness_name <", value, "illnessName");
            return (Criteria) this;
        }

        public Criteria andIllnessNameLessThanOrEqualTo(String value) {
            addCriterion("illness_name <=", value, "illnessName");
            return (Criteria) this;
        }

        public Criteria andIllnessNameLike(String value) {
            addCriterion("illness_name like", value, "illnessName");
            return (Criteria) this;
        }

        public Criteria andIllnessNameNotLike(String value) {
            addCriterion("illness_name not like", value, "illnessName");
            return (Criteria) this;
        }

        public Criteria andIllnessNameIn(List<String> values) {
            addCriterion("illness_name in", values, "illnessName");
            return (Criteria) this;
        }

        public Criteria andIllnessNameNotIn(List<String> values) {
            addCriterion("illness_name not in", values, "illnessName");
            return (Criteria) this;
        }

        public Criteria andIllnessNameBetween(String value1, String value2) {
            addCriterion("illness_name between", value1, value2, "illnessName");
            return (Criteria) this;
        }

        public Criteria andIllnessNameNotBetween(String value1, String value2) {
            addCriterion("illness_name not between", value1, value2, "illnessName");
            return (Criteria) this;
        }

        public Criteria andIllnessAliasIsNull() {
            addCriterion("illness_alias is null");
            return (Criteria) this;
        }

        public Criteria andIllnessAliasIsNotNull() {
            addCriterion("illness_alias is not null");
            return (Criteria) this;
        }

        public Criteria andIllnessAliasEqualTo(String value) {
            addCriterion("illness_alias =", value, "illnessAlias");
            return (Criteria) this;
        }

        public Criteria andIllnessAliasNotEqualTo(String value) {
            addCriterion("illness_alias <>", value, "illnessAlias");
            return (Criteria) this;
        }

        public Criteria andIllnessAliasGreaterThan(String value) {
            addCriterion("illness_alias >", value, "illnessAlias");
            return (Criteria) this;
        }

        public Criteria andIllnessAliasGreaterThanOrEqualTo(String value) {
            addCriterion("illness_alias >=", value, "illnessAlias");
            return (Criteria) this;
        }

        public Criteria andIllnessAliasLessThan(String value) {
            addCriterion("illness_alias <", value, "illnessAlias");
            return (Criteria) this;
        }

        public Criteria andIllnessAliasLessThanOrEqualTo(String value) {
            addCriterion("illness_alias <=", value, "illnessAlias");
            return (Criteria) this;
        }

        public Criteria andIllnessAliasLike(String value) {
            addCriterion("illness_alias like", value, "illnessAlias");
            return (Criteria) this;
        }

        public Criteria andIllnessAliasNotLike(String value) {
            addCriterion("illness_alias not like", value, "illnessAlias");
            return (Criteria) this;
        }

        public Criteria andIllnessAliasIn(List<String> values) {
            addCriterion("illness_alias in", values, "illnessAlias");
            return (Criteria) this;
        }

        public Criteria andIllnessAliasNotIn(List<String> values) {
            addCriterion("illness_alias not in", values, "illnessAlias");
            return (Criteria) this;
        }

        public Criteria andIllnessAliasBetween(String value1, String value2) {
            addCriterion("illness_alias between", value1, value2, "illnessAlias");
            return (Criteria) this;
        }

        public Criteria andIllnessAliasNotBetween(String value1, String value2) {
            addCriterion("illness_alias not between", value1, value2, "illnessAlias");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(String value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(String value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(String value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(String value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(String value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLike(String value) {
            addCriterion("deleted like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotLike(String value) {
            addCriterion("deleted not like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<String> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<String> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(String value1, String value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(String value1, String value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("department_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("department_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
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
     * This class corresponds to the database table td_illness
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
     * This class corresponds to the database table td_illness
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