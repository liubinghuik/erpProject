package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ProcurementsharepriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcurementsharepriceExample() {
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

        public Criteria andPsidIsNull() {
            addCriterion("PSID is null");
            return (Criteria) this;
        }

        public Criteria andPsidIsNotNull() {
            addCriterion("PSID is not null");
            return (Criteria) this;
        }

        public Criteria andPsidEqualTo(String value) {
            addCriterion("PSID =", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotEqualTo(String value) {
            addCriterion("PSID <>", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidGreaterThan(String value) {
            addCriterion("PSID >", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidGreaterThanOrEqualTo(String value) {
            addCriterion("PSID >=", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidLessThan(String value) {
            addCriterion("PSID <", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidLessThanOrEqualTo(String value) {
            addCriterion("PSID <=", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidLike(String value) {
            addCriterion("PSID like", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotLike(String value) {
            addCriterion("PSID not like", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidIn(List<String> values) {
            addCriterion("PSID in", values, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotIn(List<String> values) {
            addCriterion("PSID not in", values, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidBetween(String value1, String value2) {
            addCriterion("PSID between", value1, value2, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotBetween(String value1, String value2) {
            addCriterion("PSID not between", value1, value2, "psid");
            return (Criteria) this;
        }

        public Criteria andPspidIsNull() {
            addCriterion("PSPId is null");
            return (Criteria) this;
        }

        public Criteria andPspidIsNotNull() {
            addCriterion("PSPId is not null");
            return (Criteria) this;
        }

        public Criteria andPspidEqualTo(String value) {
            addCriterion("PSPId =", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidNotEqualTo(String value) {
            addCriterion("PSPId <>", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidGreaterThan(String value) {
            addCriterion("PSPId >", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidGreaterThanOrEqualTo(String value) {
            addCriterion("PSPId >=", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidLessThan(String value) {
            addCriterion("PSPId <", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidLessThanOrEqualTo(String value) {
            addCriterion("PSPId <=", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidLike(String value) {
            addCriterion("PSPId like", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidNotLike(String value) {
            addCriterion("PSPId not like", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidIn(List<String> values) {
            addCriterion("PSPId in", values, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidNotIn(List<String> values) {
            addCriterion("PSPId not in", values, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidBetween(String value1, String value2) {
            addCriterion("PSPId between", value1, value2, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidNotBetween(String value1, String value2) {
            addCriterion("PSPId not between", value1, value2, "pspid");
            return (Criteria) this;
        }

        public Criteria andFeeclassidIsNull() {
            addCriterion("FeeClassID is null");
            return (Criteria) this;
        }

        public Criteria andFeeclassidIsNotNull() {
            addCriterion("FeeClassID is not null");
            return (Criteria) this;
        }

        public Criteria andFeeclassidEqualTo(String value) {
            addCriterion("FeeClassID =", value, "feeclassid");
            return (Criteria) this;
        }

        public Criteria andFeeclassidNotEqualTo(String value) {
            addCriterion("FeeClassID <>", value, "feeclassid");
            return (Criteria) this;
        }

        public Criteria andFeeclassidGreaterThan(String value) {
            addCriterion("FeeClassID >", value, "feeclassid");
            return (Criteria) this;
        }

        public Criteria andFeeclassidGreaterThanOrEqualTo(String value) {
            addCriterion("FeeClassID >=", value, "feeclassid");
            return (Criteria) this;
        }

        public Criteria andFeeclassidLessThan(String value) {
            addCriterion("FeeClassID <", value, "feeclassid");
            return (Criteria) this;
        }

        public Criteria andFeeclassidLessThanOrEqualTo(String value) {
            addCriterion("FeeClassID <=", value, "feeclassid");
            return (Criteria) this;
        }

        public Criteria andFeeclassidLike(String value) {
            addCriterion("FeeClassID like", value, "feeclassid");
            return (Criteria) this;
        }

        public Criteria andFeeclassidNotLike(String value) {
            addCriterion("FeeClassID not like", value, "feeclassid");
            return (Criteria) this;
        }

        public Criteria andFeeclassidIn(List<String> values) {
            addCriterion("FeeClassID in", values, "feeclassid");
            return (Criteria) this;
        }

        public Criteria andFeeclassidNotIn(List<String> values) {
            addCriterion("FeeClassID not in", values, "feeclassid");
            return (Criteria) this;
        }

        public Criteria andFeeclassidBetween(String value1, String value2) {
            addCriterion("FeeClassID between", value1, value2, "feeclassid");
            return (Criteria) this;
        }

        public Criteria andFeeclassidNotBetween(String value1, String value2) {
            addCriterion("FeeClassID not between", value1, value2, "feeclassid");
            return (Criteria) this;
        }

        public Criteria andFareclassnameIsNull() {
            addCriterion("FareClassName is null");
            return (Criteria) this;
        }

        public Criteria andFareclassnameIsNotNull() {
            addCriterion("FareClassName is not null");
            return (Criteria) this;
        }

        public Criteria andFareclassnameEqualTo(String value) {
            addCriterion("FareClassName =", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameNotEqualTo(String value) {
            addCriterion("FareClassName <>", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameGreaterThan(String value) {
            addCriterion("FareClassName >", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameGreaterThanOrEqualTo(String value) {
            addCriterion("FareClassName >=", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameLessThan(String value) {
            addCriterion("FareClassName <", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameLessThanOrEqualTo(String value) {
            addCriterion("FareClassName <=", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameLike(String value) {
            addCriterion("FareClassName like", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameNotLike(String value) {
            addCriterion("FareClassName not like", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameIn(List<String> values) {
            addCriterion("FareClassName in", values, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameNotIn(List<String> values) {
            addCriterion("FareClassName not in", values, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameBetween(String value1, String value2) {
            addCriterion("FareClassName between", value1, value2, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameNotBetween(String value1, String value2) {
            addCriterion("FareClassName not between", value1, value2, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andCurridIsNull() {
            addCriterion("CurrID is null");
            return (Criteria) this;
        }

        public Criteria andCurridIsNotNull() {
            addCriterion("CurrID is not null");
            return (Criteria) this;
        }

        public Criteria andCurridEqualTo(String value) {
            addCriterion("CurrID =", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridNotEqualTo(String value) {
            addCriterion("CurrID <>", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridGreaterThan(String value) {
            addCriterion("CurrID >", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridGreaterThanOrEqualTo(String value) {
            addCriterion("CurrID >=", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridLessThan(String value) {
            addCriterion("CurrID <", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridLessThanOrEqualTo(String value) {
            addCriterion("CurrID <=", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridLike(String value) {
            addCriterion("CurrID like", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridNotLike(String value) {
            addCriterion("CurrID not like", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridIn(List<String> values) {
            addCriterion("CurrID in", values, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridNotIn(List<String> values) {
            addCriterion("CurrID not in", values, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridBetween(String value1, String value2) {
            addCriterion("CurrID between", value1, value2, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridNotBetween(String value1, String value2) {
            addCriterion("CurrID not between", value1, value2, "currid");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("Amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("Amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("Amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("Amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("Amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("Amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("Amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("Amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("Amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("Amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("Amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("Amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andExchrateIsNull() {
            addCriterion("ExchRate is null");
            return (Criteria) this;
        }

        public Criteria andExchrateIsNotNull() {
            addCriterion("ExchRate is not null");
            return (Criteria) this;
        }

        public Criteria andExchrateEqualTo(Double value) {
            addCriterion("ExchRate =", value, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateNotEqualTo(Double value) {
            addCriterion("ExchRate <>", value, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateGreaterThan(Double value) {
            addCriterion("ExchRate >", value, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateGreaterThanOrEqualTo(Double value) {
            addCriterion("ExchRate >=", value, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateLessThan(Double value) {
            addCriterion("ExchRate <", value, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateLessThanOrEqualTo(Double value) {
            addCriterion("ExchRate <=", value, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateIn(List<Double> values) {
            addCriterion("ExchRate in", values, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateNotIn(List<Double> values) {
            addCriterion("ExchRate not in", values, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateBetween(Double value1, Double value2) {
            addCriterion("ExchRate between", value1, value2, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateNotBetween(Double value1, Double value2) {
            addCriterion("ExchRate not between", value1, value2, "exchrate");
            return (Criteria) this;
        }

        public Criteria andMlamountIsNull() {
            addCriterion("MLAmount is null");
            return (Criteria) this;
        }

        public Criteria andMlamountIsNotNull() {
            addCriterion("MLAmount is not null");
            return (Criteria) this;
        }

        public Criteria andMlamountEqualTo(Double value) {
            addCriterion("MLAmount =", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountNotEqualTo(Double value) {
            addCriterion("MLAmount <>", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountGreaterThan(Double value) {
            addCriterion("MLAmount >", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountGreaterThanOrEqualTo(Double value) {
            addCriterion("MLAmount >=", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountLessThan(Double value) {
            addCriterion("MLAmount <", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountLessThanOrEqualTo(Double value) {
            addCriterion("MLAmount <=", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountIn(List<Double> values) {
            addCriterion("MLAmount in", values, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountNotIn(List<Double> values) {
            addCriterion("MLAmount not in", values, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountBetween(Double value1, Double value2) {
            addCriterion("MLAmount between", value1, value2, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountNotBetween(Double value1, Double value2) {
            addCriterion("MLAmount not between", value1, value2, "mlamount");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("Remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("Remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("Remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("Remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("Remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("Remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("Remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("Remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("Remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("Remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("Remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("Remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("Remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andColumn1IsNull() {
            addCriterion("COLUMN1 is null");
            return (Criteria) this;
        }

        public Criteria andColumn1IsNotNull() {
            addCriterion("COLUMN1 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn1EqualTo(String value) {
            addCriterion("COLUMN1 =", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotEqualTo(String value) {
            addCriterion("COLUMN1 <>", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThan(String value) {
            addCriterion("COLUMN1 >", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN1 >=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThan(String value) {
            addCriterion("COLUMN1 <", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThanOrEqualTo(String value) {
            addCriterion("COLUMN1 <=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Like(String value) {
            addCriterion("COLUMN1 like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotLike(String value) {
            addCriterion("COLUMN1 not like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1In(List<String> values) {
            addCriterion("COLUMN1 in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotIn(List<String> values) {
            addCriterion("COLUMN1 not in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Between(String value1, String value2) {
            addCriterion("COLUMN1 between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotBetween(String value1, String value2) {
            addCriterion("COLUMN1 not between", value1, value2, "column1");
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