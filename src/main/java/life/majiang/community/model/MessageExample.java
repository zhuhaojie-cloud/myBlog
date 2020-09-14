package life.majiang.community.model;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public MessageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
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
     * This method corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContactIdIsNull() {
            addCriterion("contact_id is null");
            return (Criteria) this;
        }

        public Criteria andContactIdIsNotNull() {
            addCriterion("contact_id is not null");
            return (Criteria) this;
        }

        public Criteria andContactIdEqualTo(Long value) {
            addCriterion("contact_id =", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotEqualTo(Long value) {
            addCriterion("contact_id <>", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdGreaterThan(Long value) {
            addCriterion("contact_id >", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdGreaterThanOrEqualTo(Long value) {
            addCriterion("contact_id >=", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdLessThan(Long value) {
            addCriterion("contact_id <", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdLessThanOrEqualTo(Long value) {
            addCriterion("contact_id <=", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdIn(List<Long> values) {
            addCriterion("contact_id in", values, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotIn(List<Long> values) {
            addCriterion("contact_id not in", values, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdBetween(Long value1, Long value2) {
            addCriterion("contact_id between", value1, value2, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotBetween(Long value1, Long value2) {
            addCriterion("contact_id not between", value1, value2, "contactId");
            return (Criteria) this;
        }

        public Criteria andFromuserIsNull() {
            addCriterion("fromuser is null");
            return (Criteria) this;
        }

        public Criteria andFromuserIsNotNull() {
            addCriterion("fromuser is not null");
            return (Criteria) this;
        }

        public Criteria andFromuserEqualTo(Long value) {
            addCriterion("fromuser =", value, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserNotEqualTo(Long value) {
            addCriterion("fromuser <>", value, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserGreaterThan(Long value) {
            addCriterion("fromuser >", value, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserGreaterThanOrEqualTo(Long value) {
            addCriterion("fromuser >=", value, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserLessThan(Long value) {
            addCriterion("fromuser <", value, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserLessThanOrEqualTo(Long value) {
            addCriterion("fromuser <=", value, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserIn(List<Long> values) {
            addCriterion("fromuser in", values, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserNotIn(List<Long> values) {
            addCriterion("fromuser not in", values, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserBetween(Long value1, Long value2) {
            addCriterion("fromuser between", value1, value2, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserNotBetween(Long value1, Long value2) {
            addCriterion("fromuser not between", value1, value2, "fromuser");
            return (Criteria) this;
        }

        public Criteria andTouserIsNull() {
            addCriterion("touser is null");
            return (Criteria) this;
        }

        public Criteria andTouserIsNotNull() {
            addCriterion("touser is not null");
            return (Criteria) this;
        }

        public Criteria andTouserEqualTo(Long value) {
            addCriterion("touser =", value, "touser");
            return (Criteria) this;
        }

        public Criteria andTouserNotEqualTo(Long value) {
            addCriterion("touser <>", value, "touser");
            return (Criteria) this;
        }

        public Criteria andTouserGreaterThan(Long value) {
            addCriterion("touser >", value, "touser");
            return (Criteria) this;
        }

        public Criteria andTouserGreaterThanOrEqualTo(Long value) {
            addCriterion("touser >=", value, "touser");
            return (Criteria) this;
        }

        public Criteria andTouserLessThan(Long value) {
            addCriterion("touser <", value, "touser");
            return (Criteria) this;
        }

        public Criteria andTouserLessThanOrEqualTo(Long value) {
            addCriterion("touser <=", value, "touser");
            return (Criteria) this;
        }

        public Criteria andTouserIn(List<Long> values) {
            addCriterion("touser in", values, "touser");
            return (Criteria) this;
        }

        public Criteria andTouserNotIn(List<Long> values) {
            addCriterion("touser not in", values, "touser");
            return (Criteria) this;
        }

        public Criteria andTouserBetween(Long value1, Long value2) {
            addCriterion("touser between", value1, value2, "touser");
            return (Criteria) this;
        }

        public Criteria andTouserNotBetween(Long value1, Long value2) {
            addCriterion("touser not between", value1, value2, "touser");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("msg is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("msg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("msg =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("msg <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("msg >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("msg >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("msg <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("msg <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("msg like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("msg not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("msg in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("msg not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("msg between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("msg not between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Long value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Long value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Long value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Long value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Long value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Long> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Long> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Long value1, Long value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Long value1, Long value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andReadflagIsNull() {
            addCriterion("readflag is null");
            return (Criteria) this;
        }

        public Criteria andReadflagIsNotNull() {
            addCriterion("readflag is not null");
            return (Criteria) this;
        }

        public Criteria andReadflagEqualTo(Integer value) {
            addCriterion("readflag =", value, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagNotEqualTo(Integer value) {
            addCriterion("readflag <>", value, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagGreaterThan(Integer value) {
            addCriterion("readflag >", value, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("readflag >=", value, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagLessThan(Integer value) {
            addCriterion("readflag <", value, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagLessThanOrEqualTo(Integer value) {
            addCriterion("readflag <=", value, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagIn(List<Integer> values) {
            addCriterion("readflag in", values, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagNotIn(List<Integer> values) {
            addCriterion("readflag not in", values, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagBetween(Integer value1, Integer value2) {
            addCriterion("readflag between", value1, value2, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagNotBetween(Integer value1, Integer value2) {
            addCriterion("readflag not between", value1, value2, "readflag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table message
     *
     * @mbg.generated do_not_delete_during_merge Wed Sep 09 08:49:13 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table message
     *
     * @mbg.generated Wed Sep 09 08:49:13 CST 2020
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