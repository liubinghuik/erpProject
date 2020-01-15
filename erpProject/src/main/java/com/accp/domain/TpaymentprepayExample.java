package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class TpaymentprepayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TpaymentprepayExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andPaymentidIsNull() {
            addCriterion("paymentid is null");
            return (Criteria) this;
        }

        public Criteria andPaymentidIsNotNull() {
            addCriterion("paymentid is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentidEqualTo(String value) {
            addCriterion("paymentid =", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotEqualTo(String value) {
            addCriterion("paymentid <>", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidGreaterThan(String value) {
            addCriterion("paymentid >", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidGreaterThanOrEqualTo(String value) {
            addCriterion("paymentid >=", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidLessThan(String value) {
            addCriterion("paymentid <", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidLessThanOrEqualTo(String value) {
            addCriterion("paymentid <=", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidLike(String value) {
            addCriterion("paymentid like", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotLike(String value) {
            addCriterion("paymentid not like", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidIn(List<String> values) {
            addCriterion("paymentid in", values, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotIn(List<String> values) {
            addCriterion("paymentid not in", values, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidBetween(String value1, String value2) {
            addCriterion("paymentid between", value1, value2, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotBetween(String value1, String value2) {
            addCriterion("paymentid not between", value1, value2, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPrepayidIsNull() {
            addCriterion("prepayid is null");
            return (Criteria) this;
        }

        public Criteria andPrepayidIsNotNull() {
            addCriterion("prepayid is not null");
            return (Criteria) this;
        }

        public Criteria andPrepayidEqualTo(String value) {
            addCriterion("prepayid =", value, "prepayid");
            return (Criteria) this;
        }

        public Criteria andPrepayidNotEqualTo(String value) {
            addCriterion("prepayid <>", value, "prepayid");
            return (Criteria) this;
        }

        public Criteria andPrepayidGreaterThan(String value) {
            addCriterion("prepayid >", value, "prepayid");
            return (Criteria) this;
        }

        public Criteria andPrepayidGreaterThanOrEqualTo(String value) {
            addCriterion("prepayid >=", value, "prepayid");
            return (Criteria) this;
        }

        public Criteria andPrepayidLessThan(String value) {
            addCriterion("prepayid <", value, "prepayid");
            return (Criteria) this;
        }

        public Criteria andPrepayidLessThanOrEqualTo(String value) {
            addCriterion("prepayid <=", value, "prepayid");
            return (Criteria) this;
        }

        public Criteria andPrepayidLike(String value) {
            addCriterion("prepayid like", value, "prepayid");
            return (Criteria) this;
        }

        public Criteria andPrepayidNotLike(String value) {
            addCriterion("prepayid not like", value, "prepayid");
            return (Criteria) this;
        }

        public Criteria andPrepayidIn(List<String> values) {
            addCriterion("prepayid in", values, "prepayid");
            return (Criteria) this;
        }

        public Criteria andPrepayidNotIn(List<String> values) {
            addCriterion("prepayid not in", values, "prepayid");
            return (Criteria) this;
        }

        public Criteria andPrepayidBetween(String value1, String value2) {
            addCriterion("prepayid between", value1, value2, "prepayid");
            return (Criteria) this;
        }

        public Criteria andPrepayidNotBetween(String value1, String value2) {
            addCriterion("prepayid not between", value1, value2, "prepayid");
            return (Criteria) this;
        }

        public Criteria andPrepaydidIsNull() {
            addCriterion("prepaydid is null");
            return (Criteria) this;
        }

        public Criteria andPrepaydidIsNotNull() {
            addCriterion("prepaydid is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaydidEqualTo(Integer value) {
            addCriterion("prepaydid =", value, "prepaydid");
            return (Criteria) this;
        }

        public Criteria andPrepaydidNotEqualTo(Integer value) {
            addCriterion("prepaydid <>", value, "prepaydid");
            return (Criteria) this;
        }

        public Criteria andPrepaydidGreaterThan(Integer value) {
            addCriterion("prepaydid >", value, "prepaydid");
            return (Criteria) this;
        }

        public Criteria andPrepaydidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prepaydid >=", value, "prepaydid");
            return (Criteria) this;
        }

        public Criteria andPrepaydidLessThan(Integer value) {
            addCriterion("prepaydid <", value, "prepaydid");
            return (Criteria) this;
        }

        public Criteria andPrepaydidLessThanOrEqualTo(Integer value) {
            addCriterion("prepaydid <=", value, "prepaydid");
            return (Criteria) this;
        }

        public Criteria andPrepaydidIn(List<Integer> values) {
            addCriterion("prepaydid in", values, "prepaydid");
            return (Criteria) this;
        }

        public Criteria andPrepaydidNotIn(List<Integer> values) {
            addCriterion("prepaydid not in", values, "prepaydid");
            return (Criteria) this;
        }

        public Criteria andPrepaydidBetween(Integer value1, Integer value2) {
            addCriterion("prepaydid between", value1, value2, "prepaydid");
            return (Criteria) this;
        }

        public Criteria andPrepaydidNotBetween(Integer value1, Integer value2) {
            addCriterion("prepaydid not between", value1, value2, "prepaydid");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyIsNull() {
            addCriterion("takenmoney is null");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyIsNotNull() {
            addCriterion("takenmoney is not null");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyEqualTo(Double value) {
            addCriterion("takenmoney =", value, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyNotEqualTo(Double value) {
            addCriterion("takenmoney <>", value, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyGreaterThan(Double value) {
            addCriterion("takenmoney >", value, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("takenmoney >=", value, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyLessThan(Double value) {
            addCriterion("takenmoney <", value, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyLessThanOrEqualTo(Double value) {
            addCriterion("takenmoney <=", value, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyIn(List<Double> values) {
            addCriterion("takenmoney in", values, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyNotIn(List<Double> values) {
            addCriterion("takenmoney not in", values, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyBetween(Double value1, Double value2) {
            addCriterion("takenmoney between", value1, value2, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyNotBetween(Double value1, Double value2) {
            addCriterion("takenmoney not between", value1, value2, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andAuditIsNull() {
            addCriterion("audit is null");
            return (Criteria) this;
        }

        public Criteria andAuditIsNotNull() {
            addCriterion("audit is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEqualTo(Integer value) {
            addCriterion("audit =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(Integer value) {
            addCriterion("audit <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(Integer value) {
            addCriterion("audit >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(Integer value) {
            addCriterion("audit <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(Integer value) {
            addCriterion("audit <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<Integer> values) {
            addCriterion("audit in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<Integer> values) {
            addCriterion("audit not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(Integer value1, Integer value2) {
            addCriterion("audit between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(Integer value1, Integer value2) {
            addCriterion("audit not between", value1, value2, "audit");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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