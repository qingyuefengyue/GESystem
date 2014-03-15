package com.bonc.GESysServer.mybitis.model;

import java.util.ArrayList;
import java.util.List;

public class AreaInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public AreaInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
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
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("area_id like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("area_id not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdIsNull() {
            addCriterion("parent_area_id is null");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdIsNotNull() {
            addCriterion("parent_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdEqualTo(String value) {
            addCriterion("parent_area_id =", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdNotEqualTo(String value) {
            addCriterion("parent_area_id <>", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdGreaterThan(String value) {
            addCriterion("parent_area_id >", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_area_id >=", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdLessThan(String value) {
            addCriterion("parent_area_id <", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdLessThanOrEqualTo(String value) {
            addCriterion("parent_area_id <=", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdLike(String value) {
            addCriterion("parent_area_id like", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdNotLike(String value) {
            addCriterion("parent_area_id not like", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdIn(List<String> values) {
            addCriterion("parent_area_id in", values, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdNotIn(List<String> values) {
            addCriterion("parent_area_id not in", values, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdBetween(String value1, String value2) {
            addCriterion("parent_area_id between", value1, value2, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdNotBetween(String value1, String value2) {
            addCriterion("parent_area_id not between", value1, value2, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIsNull() {
            addCriterion("area_level is null");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIsNotNull() {
            addCriterion("area_level is not null");
            return (Criteria) this;
        }

        public Criteria andAreaLevelEqualTo(Integer value) {
            addCriterion("area_level =", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelNotEqualTo(Integer value) {
            addCriterion("area_level <>", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelGreaterThan(Integer value) {
            addCriterion("area_level >", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_level >=", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelLessThan(Integer value) {
            addCriterion("area_level <", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelLessThanOrEqualTo(Integer value) {
            addCriterion("area_level <=", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIn(List<Integer> values) {
            addCriterion("area_level in", values, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelNotIn(List<Integer> values) {
            addCriterion("area_level not in", values, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelBetween(Integer value1, Integer value2) {
            addCriterion("area_level between", value1, value2, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("area_level not between", value1, value2, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaOrderIsNull() {
            addCriterion("area_order is null");
            return (Criteria) this;
        }

        public Criteria andAreaOrderIsNotNull() {
            addCriterion("area_order is not null");
            return (Criteria) this;
        }

        public Criteria andAreaOrderEqualTo(Integer value) {
            addCriterion("area_order =", value, "areaOrder");
            return (Criteria) this;
        }

        public Criteria andAreaOrderNotEqualTo(Integer value) {
            addCriterion("area_order <>", value, "areaOrder");
            return (Criteria) this;
        }

        public Criteria andAreaOrderGreaterThan(Integer value) {
            addCriterion("area_order >", value, "areaOrder");
            return (Criteria) this;
        }

        public Criteria andAreaOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_order >=", value, "areaOrder");
            return (Criteria) this;
        }

        public Criteria andAreaOrderLessThan(Integer value) {
            addCriterion("area_order <", value, "areaOrder");
            return (Criteria) this;
        }

        public Criteria andAreaOrderLessThanOrEqualTo(Integer value) {
            addCriterion("area_order <=", value, "areaOrder");
            return (Criteria) this;
        }

        public Criteria andAreaOrderIn(List<Integer> values) {
            addCriterion("area_order in", values, "areaOrder");
            return (Criteria) this;
        }

        public Criteria andAreaOrderNotIn(List<Integer> values) {
            addCriterion("area_order not in", values, "areaOrder");
            return (Criteria) this;
        }

        public Criteria andAreaOrderBetween(Integer value1, Integer value2) {
            addCriterion("area_order between", value1, value2, "areaOrder");
            return (Criteria) this;
        }

        public Criteria andAreaOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("area_order not between", value1, value2, "areaOrder");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table area_info
     *
     * @mbggenerated do_not_delete_during_merge Fri Mar 14 00:08:14 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table area_info
     *
     * @mbggenerated Fri Mar 14 00:08:14 CST 2014
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