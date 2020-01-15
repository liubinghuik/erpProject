package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StoreioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreioExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andFromnoIsNull() {
            addCriterion("FromNO is null");
            return (Criteria) this;
        }

        public Criteria andFromnoIsNotNull() {
            addCriterion("FromNO is not null");
            return (Criteria) this;
        }

        public Criteria andFromnoEqualTo(String value) {
            addCriterion("FromNO =", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoNotEqualTo(String value) {
            addCriterion("FromNO <>", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoGreaterThan(String value) {
            addCriterion("FromNO >", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoGreaterThanOrEqualTo(String value) {
            addCriterion("FromNO >=", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoLessThan(String value) {
            addCriterion("FromNO <", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoLessThanOrEqualTo(String value) {
            addCriterion("FromNO <=", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoLike(String value) {
            addCriterion("FromNO like", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoNotLike(String value) {
            addCriterion("FromNO not like", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoIn(List<String> values) {
            addCriterion("FromNO in", values, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoNotIn(List<String> values) {
            addCriterion("FromNO not in", values, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoBetween(String value1, String value2) {
            addCriterion("FromNO between", value1, value2, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoNotBetween(String value1, String value2) {
            addCriterion("FromNO not between", value1, value2, "fromno");
            return (Criteria) this;
        }

        public Criteria andTrantypeIsNull() {
            addCriterion("TranType is null");
            return (Criteria) this;
        }

        public Criteria andTrantypeIsNotNull() {
            addCriterion("TranType is not null");
            return (Criteria) this;
        }

        public Criteria andTrantypeEqualTo(String value) {
            addCriterion("TranType =", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeNotEqualTo(String value) {
            addCriterion("TranType <>", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeGreaterThan(String value) {
            addCriterion("TranType >", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeGreaterThanOrEqualTo(String value) {
            addCriterion("TranType >=", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeLessThan(String value) {
            addCriterion("TranType <", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeLessThanOrEqualTo(String value) {
            addCriterion("TranType <=", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeLike(String value) {
            addCriterion("TranType like", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeNotLike(String value) {
            addCriterion("TranType not like", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeIn(List<String> values) {
            addCriterion("TranType in", values, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeNotIn(List<String> values) {
            addCriterion("TranType not in", values, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeBetween(String value1, String value2) {
            addCriterion("TranType between", value1, value2, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeNotBetween(String value1, String value2) {
            addCriterion("TranType not between", value1, value2, "trantype");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNull() {
            addCriterion("WareHouseID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("WareHouseID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(String value) {
            addCriterion("WareHouseID =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(String value) {
            addCriterion("WareHouseID <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(String value) {
            addCriterion("WareHouseID >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("WareHouseID >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(String value) {
            addCriterion("WareHouseID <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(String value) {
            addCriterion("WareHouseID <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLike(String value) {
            addCriterion("WareHouseID like", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotLike(String value) {
            addCriterion("WareHouseID not like", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<String> values) {
            addCriterion("WareHouseID in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<String> values) {
            addCriterion("WareHouseID not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(String value1, String value2) {
            addCriterion("WareHouseID between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(String value1, String value2) {
            addCriterion("WareHouseID not between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andSquantityIsNull() {
            addCriterion("sQuantity is null");
            return (Criteria) this;
        }

        public Criteria andSquantityIsNotNull() {
            addCriterion("sQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andSquantityEqualTo(Integer value) {
            addCriterion("sQuantity =", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityNotEqualTo(Integer value) {
            addCriterion("sQuantity <>", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityGreaterThan(Integer value) {
            addCriterion("sQuantity >", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("sQuantity >=", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityLessThan(Integer value) {
            addCriterion("sQuantity <", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityLessThanOrEqualTo(Integer value) {
            addCriterion("sQuantity <=", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityIn(List<Integer> values) {
            addCriterion("sQuantity in", values, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityNotIn(List<Integer> values) {
            addCriterion("sQuantity not in", values, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityBetween(Integer value1, Integer value2) {
            addCriterion("sQuantity between", value1, value2, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("sQuantity not between", value1, value2, "squantity");
            return (Criteria) this;
        }

        public Criteria andCmidIsNull() {
            addCriterion("CMID is null");
            return (Criteria) this;
        }

        public Criteria andCmidIsNotNull() {
            addCriterion("CMID is not null");
            return (Criteria) this;
        }

        public Criteria andCmidEqualTo(String value) {
            addCriterion("CMID =", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotEqualTo(String value) {
            addCriterion("CMID <>", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidGreaterThan(String value) {
            addCriterion("CMID >", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidGreaterThanOrEqualTo(String value) {
            addCriterion("CMID >=", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidLessThan(String value) {
            addCriterion("CMID <", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidLessThanOrEqualTo(String value) {
            addCriterion("CMID <=", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidLike(String value) {
            addCriterion("CMID like", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotLike(String value) {
            addCriterion("CMID not like", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidIn(List<String> values) {
            addCriterion("CMID in", values, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotIn(List<String> values) {
            addCriterion("CMID not in", values, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidBetween(String value1, String value2) {
            addCriterion("CMID between", value1, value2, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotBetween(String value1, String value2) {
            addCriterion("CMID not between", value1, value2, "cmid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("SID is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("SID is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("SID =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("SID <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("SID >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("SID >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("SID <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("SID <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("SID like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("SID not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("SID in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("SID not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("SID between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("SID not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNull() {
            addCriterion("sPrice is null");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNotNull() {
            addCriterion("sPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSpriceEqualTo(Double value) {
            addCriterion("sPrice =", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotEqualTo(Double value) {
            addCriterion("sPrice <>", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThan(Double value) {
            addCriterion("sPrice >", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sPrice >=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThan(Double value) {
            addCriterion("sPrice <", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThanOrEqualTo(Double value) {
            addCriterion("sPrice <=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceIn(List<Double> values) {
            addCriterion("sPrice in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotIn(List<Double> values) {
            addCriterion("sPrice not in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceBetween(Double value1, Double value2) {
            addCriterion("sPrice between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotBetween(Double value1, Double value2) {
            addCriterion("sPrice not between", value1, value2, "sprice");
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

        public Criteria andOutintimeIsNull() {
            addCriterion("outintime is null");
            return (Criteria) this;
        }

        public Criteria andOutintimeIsNotNull() {
            addCriterion("outintime is not null");
            return (Criteria) this;
        }

        public Criteria andOutintimeEqualTo(Date value) {
            addCriterionForJDBCDate("outintime =", value, "outintime");
            return (Criteria) this;
        }

        public Criteria andOutintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("outintime <>", value, "outintime");
            return (Criteria) this;
        }

        public Criteria andOutintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("outintime >", value, "outintime");
            return (Criteria) this;
        }

        public Criteria andOutintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("outintime >=", value, "outintime");
            return (Criteria) this;
        }

        public Criteria andOutintimeLessThan(Date value) {
            addCriterionForJDBCDate("outintime <", value, "outintime");
            return (Criteria) this;
        }

        public Criteria andOutintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("outintime <=", value, "outintime");
            return (Criteria) this;
        }

        public Criteria andOutintimeIn(List<Date> values) {
            addCriterionForJDBCDate("outintime in", values, "outintime");
            return (Criteria) this;
        }

        public Criteria andOutintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("outintime not in", values, "outintime");
            return (Criteria) this;
        }

        public Criteria andOutintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("outintime between", value1, value2, "outintime");
            return (Criteria) this;
        }

        public Criteria andOutintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("outintime not between", value1, value2, "outintime");
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