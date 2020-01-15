package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class GatheringprepayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GatheringprepayExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReceivablenoIsNull() {
            addCriterion("ReceivableNo is null");
            return (Criteria) this;
        }

        public Criteria andReceivablenoIsNotNull() {
            addCriterion("ReceivableNo is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablenoEqualTo(String value) {
            addCriterion("ReceivableNo =", value, "receivableno");
            return (Criteria) this;
        }

        public Criteria andReceivablenoNotEqualTo(String value) {
            addCriterion("ReceivableNo <>", value, "receivableno");
            return (Criteria) this;
        }

        public Criteria andReceivablenoGreaterThan(String value) {
            addCriterion("ReceivableNo >", value, "receivableno");
            return (Criteria) this;
        }

        public Criteria andReceivablenoGreaterThanOrEqualTo(String value) {
            addCriterion("ReceivableNo >=", value, "receivableno");
            return (Criteria) this;
        }

        public Criteria andReceivablenoLessThan(String value) {
            addCriterion("ReceivableNo <", value, "receivableno");
            return (Criteria) this;
        }

        public Criteria andReceivablenoLessThanOrEqualTo(String value) {
            addCriterion("ReceivableNo <=", value, "receivableno");
            return (Criteria) this;
        }

        public Criteria andReceivablenoLike(String value) {
            addCriterion("ReceivableNo like", value, "receivableno");
            return (Criteria) this;
        }

        public Criteria andReceivablenoNotLike(String value) {
            addCriterion("ReceivableNo not like", value, "receivableno");
            return (Criteria) this;
        }

        public Criteria andReceivablenoIn(List<String> values) {
            addCriterion("ReceivableNo in", values, "receivableno");
            return (Criteria) this;
        }

        public Criteria andReceivablenoNotIn(List<String> values) {
            addCriterion("ReceivableNo not in", values, "receivableno");
            return (Criteria) this;
        }

        public Criteria andReceivablenoBetween(String value1, String value2) {
            addCriterion("ReceivableNo between", value1, value2, "receivableno");
            return (Criteria) this;
        }

        public Criteria andReceivablenoNotBetween(String value1, String value2) {
            addCriterion("ReceivableNo not between", value1, value2, "receivableno");
            return (Criteria) this;
        }

        public Criteria andReceivableno2IsNull() {
            addCriterion("ReCeivableNo2 is null");
            return (Criteria) this;
        }

        public Criteria andReceivableno2IsNotNull() {
            addCriterion("ReCeivableNo2 is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableno2EqualTo(String value) {
            addCriterion("ReCeivableNo2 =", value, "receivableno2");
            return (Criteria) this;
        }

        public Criteria andReceivableno2NotEqualTo(String value) {
            addCriterion("ReCeivableNo2 <>", value, "receivableno2");
            return (Criteria) this;
        }

        public Criteria andReceivableno2GreaterThan(String value) {
            addCriterion("ReCeivableNo2 >", value, "receivableno2");
            return (Criteria) this;
        }

        public Criteria andReceivableno2GreaterThanOrEqualTo(String value) {
            addCriterion("ReCeivableNo2 >=", value, "receivableno2");
            return (Criteria) this;
        }

        public Criteria andReceivableno2LessThan(String value) {
            addCriterion("ReCeivableNo2 <", value, "receivableno2");
            return (Criteria) this;
        }

        public Criteria andReceivableno2LessThanOrEqualTo(String value) {
            addCriterion("ReCeivableNo2 <=", value, "receivableno2");
            return (Criteria) this;
        }

        public Criteria andReceivableno2Like(String value) {
            addCriterion("ReCeivableNo2 like", value, "receivableno2");
            return (Criteria) this;
        }

        public Criteria andReceivableno2NotLike(String value) {
            addCriterion("ReCeivableNo2 not like", value, "receivableno2");
            return (Criteria) this;
        }

        public Criteria andReceivableno2In(List<String> values) {
            addCriterion("ReCeivableNo2 in", values, "receivableno2");
            return (Criteria) this;
        }

        public Criteria andReceivableno2NotIn(List<String> values) {
            addCriterion("ReCeivableNo2 not in", values, "receivableno2");
            return (Criteria) this;
        }

        public Criteria andReceivableno2Between(String value1, String value2) {
            addCriterion("ReCeivableNo2 between", value1, value2, "receivableno2");
            return (Criteria) this;
        }

        public Criteria andReceivableno2NotBetween(String value1, String value2) {
            addCriterion("ReCeivableNo2 not between", value1, value2, "receivableno2");
            return (Criteria) this;
        }

        public Criteria andLinenoIsNull() {
            addCriterion("LineNo is null");
            return (Criteria) this;
        }

        public Criteria andLinenoIsNotNull() {
            addCriterion("LineNo is not null");
            return (Criteria) this;
        }

        public Criteria andLinenoEqualTo(Integer value) {
            addCriterion("LineNo =", value, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoNotEqualTo(Integer value) {
            addCriterion("LineNo <>", value, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoGreaterThan(Integer value) {
            addCriterion("LineNo >", value, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("LineNo >=", value, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoLessThan(Integer value) {
            addCriterion("LineNo <", value, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoLessThanOrEqualTo(Integer value) {
            addCriterion("LineNo <=", value, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoIn(List<Integer> values) {
            addCriterion("LineNo in", values, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoNotIn(List<Integer> values) {
            addCriterion("LineNo not in", values, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoBetween(Integer value1, Integer value2) {
            addCriterion("LineNo between", value1, value2, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoNotBetween(Integer value1, Integer value2) {
            addCriterion("LineNo not between", value1, value2, "lineno");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyIsNull() {
            addCriterion("Takenmoney is null");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyIsNotNull() {
            addCriterion("Takenmoney is not null");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyEqualTo(Double value) {
            addCriterion("Takenmoney =", value, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyNotEqualTo(Double value) {
            addCriterion("Takenmoney <>", value, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyGreaterThan(Double value) {
            addCriterion("Takenmoney >", value, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("Takenmoney >=", value, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyLessThan(Double value) {
            addCriterion("Takenmoney <", value, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyLessThanOrEqualTo(Double value) {
            addCriterion("Takenmoney <=", value, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyIn(List<Double> values) {
            addCriterion("Takenmoney in", values, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyNotIn(List<Double> values) {
            addCriterion("Takenmoney not in", values, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyBetween(Double value1, Double value2) {
            addCriterion("Takenmoney between", value1, value2, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andTakenmoneyNotBetween(Double value1, Double value2) {
            addCriterion("Takenmoney not between", value1, value2, "takenmoney");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("State not between", value1, value2, "state");
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