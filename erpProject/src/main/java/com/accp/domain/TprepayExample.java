package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TprepayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TprepayExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod1IsNull() {
            addCriterion("paymentmethod1 is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod1IsNotNull() {
            addCriterion("paymentmethod1 is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod1EqualTo(String value) {
            addCriterion("paymentmethod1 =", value, "paymentmethod1");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod1NotEqualTo(String value) {
            addCriterion("paymentmethod1 <>", value, "paymentmethod1");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod1GreaterThan(String value) {
            addCriterion("paymentmethod1 >", value, "paymentmethod1");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod1GreaterThanOrEqualTo(String value) {
            addCriterion("paymentmethod1 >=", value, "paymentmethod1");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod1LessThan(String value) {
            addCriterion("paymentmethod1 <", value, "paymentmethod1");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod1LessThanOrEqualTo(String value) {
            addCriterion("paymentmethod1 <=", value, "paymentmethod1");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod1Like(String value) {
            addCriterion("paymentmethod1 like", value, "paymentmethod1");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod1NotLike(String value) {
            addCriterion("paymentmethod1 not like", value, "paymentmethod1");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod1In(List<String> values) {
            addCriterion("paymentmethod1 in", values, "paymentmethod1");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod1NotIn(List<String> values) {
            addCriterion("paymentmethod1 not in", values, "paymentmethod1");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod1Between(String value1, String value2) {
            addCriterion("paymentmethod1 between", value1, value2, "paymentmethod1");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod1NotBetween(String value1, String value2) {
            addCriterion("paymentmethod1 not between", value1, value2, "paymentmethod1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1IsNull() {
            addCriterion("paymentamout1 is null");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1IsNotNull() {
            addCriterion("paymentamout1 is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1EqualTo(Double value) {
            addCriterion("paymentamout1 =", value, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1NotEqualTo(Double value) {
            addCriterion("paymentamout1 <>", value, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1GreaterThan(Double value) {
            addCriterion("paymentamout1 >", value, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1GreaterThanOrEqualTo(Double value) {
            addCriterion("paymentamout1 >=", value, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1LessThan(Double value) {
            addCriterion("paymentamout1 <", value, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1LessThanOrEqualTo(Double value) {
            addCriterion("paymentamout1 <=", value, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1In(List<Double> values) {
            addCriterion("paymentamout1 in", values, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1NotIn(List<Double> values) {
            addCriterion("paymentamout1 not in", values, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1Between(Double value1, Double value2) {
            addCriterion("paymentamout1 between", value1, value2, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1NotBetween(Double value1, Double value2) {
            addCriterion("paymentamout1 not between", value1, value2, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod2IsNull() {
            addCriterion("paymentmethod2 is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod2IsNotNull() {
            addCriterion("paymentmethod2 is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod2EqualTo(String value) {
            addCriterion("paymentmethod2 =", value, "paymentmethod2");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod2NotEqualTo(String value) {
            addCriterion("paymentmethod2 <>", value, "paymentmethod2");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod2GreaterThan(String value) {
            addCriterion("paymentmethod2 >", value, "paymentmethod2");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod2GreaterThanOrEqualTo(String value) {
            addCriterion("paymentmethod2 >=", value, "paymentmethod2");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod2LessThan(String value) {
            addCriterion("paymentmethod2 <", value, "paymentmethod2");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod2LessThanOrEqualTo(String value) {
            addCriterion("paymentmethod2 <=", value, "paymentmethod2");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod2Like(String value) {
            addCriterion("paymentmethod2 like", value, "paymentmethod2");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod2NotLike(String value) {
            addCriterion("paymentmethod2 not like", value, "paymentmethod2");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod2In(List<String> values) {
            addCriterion("paymentmethod2 in", values, "paymentmethod2");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod2NotIn(List<String> values) {
            addCriterion("paymentmethod2 not in", values, "paymentmethod2");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod2Between(String value1, String value2) {
            addCriterion("paymentmethod2 between", value1, value2, "paymentmethod2");
            return (Criteria) this;
        }

        public Criteria andPaymentmethod2NotBetween(String value1, String value2) {
            addCriterion("paymentmethod2 not between", value1, value2, "paymentmethod2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2IsNull() {
            addCriterion("paymentamout2 is null");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2IsNotNull() {
            addCriterion("paymentamout2 is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2EqualTo(Double value) {
            addCriterion("paymentamout2 =", value, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2NotEqualTo(Double value) {
            addCriterion("paymentamout2 <>", value, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2GreaterThan(Double value) {
            addCriterion("paymentamout2 >", value, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2GreaterThanOrEqualTo(Double value) {
            addCriterion("paymentamout2 >=", value, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2LessThan(Double value) {
            addCriterion("paymentamout2 <", value, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2LessThanOrEqualTo(Double value) {
            addCriterion("paymentamout2 <=", value, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2In(List<Double> values) {
            addCriterion("paymentamout2 in", values, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2NotIn(List<Double> values) {
            addCriterion("paymentamout2 not in", values, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2Between(Double value1, Double value2) {
            addCriterion("paymentamout2 between", value1, value2, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2NotBetween(Double value1, Double value2) {
            addCriterion("paymentamout2 not between", value1, value2, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIsNull() {
            addCriterion("currencyID is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIsNotNull() {
            addCriterion("currencyID is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyidEqualTo(String value) {
            addCriterion("currencyID =", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotEqualTo(String value) {
            addCriterion("currencyID <>", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidGreaterThan(String value) {
            addCriterion("currencyID >", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidGreaterThanOrEqualTo(String value) {
            addCriterion("currencyID >=", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLessThan(String value) {
            addCriterion("currencyID <", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLessThanOrEqualTo(String value) {
            addCriterion("currencyID <=", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLike(String value) {
            addCriterion("currencyID like", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotLike(String value) {
            addCriterion("currencyID not like", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIn(List<String> values) {
            addCriterion("currencyID in", values, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotIn(List<String> values) {
            addCriterion("currencyID not in", values, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidBetween(String value1, String value2) {
            addCriterion("currencyID between", value1, value2, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotBetween(String value1, String value2) {
            addCriterion("currencyID not between", value1, value2, "currencyid");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNull() {
            addCriterion("exchangeRate is null");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNotNull() {
            addCriterion("exchangeRate is not null");
            return (Criteria) this;
        }

        public Criteria andExchangerateEqualTo(Double value) {
            addCriterion("exchangeRate =", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotEqualTo(Double value) {
            addCriterion("exchangeRate <>", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThan(Double value) {
            addCriterion("exchangeRate >", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThanOrEqualTo(Double value) {
            addCriterion("exchangeRate >=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThan(Double value) {
            addCriterion("exchangeRate <", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThanOrEqualTo(Double value) {
            addCriterion("exchangeRate <=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateIn(List<Double> values) {
            addCriterion("exchangeRate in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotIn(List<Double> values) {
            addCriterion("exchangeRate not in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateBetween(Double value1, Double value2) {
            addCriterion("exchangeRate between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotBetween(Double value1, Double value2) {
            addCriterion("exchangeRate not between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andVouchercodeIsNull() {
            addCriterion("vouchercode is null");
            return (Criteria) this;
        }

        public Criteria andVouchercodeIsNotNull() {
            addCriterion("vouchercode is not null");
            return (Criteria) this;
        }

        public Criteria andVouchercodeEqualTo(String value) {
            addCriterion("vouchercode =", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeNotEqualTo(String value) {
            addCriterion("vouchercode <>", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeGreaterThan(String value) {
            addCriterion("vouchercode >", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeGreaterThanOrEqualTo(String value) {
            addCriterion("vouchercode >=", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeLessThan(String value) {
            addCriterion("vouchercode <", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeLessThanOrEqualTo(String value) {
            addCriterion("vouchercode <=", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeLike(String value) {
            addCriterion("vouchercode like", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeNotLike(String value) {
            addCriterion("vouchercode not like", value, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeIn(List<String> values) {
            addCriterion("vouchercode in", values, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeNotIn(List<String> values) {
            addCriterion("vouchercode not in", values, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeBetween(String value1, String value2) {
            addCriterion("vouchercode between", value1, value2, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andVouchercodeNotBetween(String value1, String value2) {
            addCriterion("vouchercode not between", value1, value2, "vouchercode");
            return (Criteria) this;
        }

        public Criteria andDepartidIsNull() {
            addCriterion("departID is null");
            return (Criteria) this;
        }

        public Criteria andDepartidIsNotNull() {
            addCriterion("departID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartidEqualTo(String value) {
            addCriterion("departID =", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotEqualTo(String value) {
            addCriterion("departID <>", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThan(String value) {
            addCriterion("departID >", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThanOrEqualTo(String value) {
            addCriterion("departID >=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThan(String value) {
            addCriterion("departID <", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThanOrEqualTo(String value) {
            addCriterion("departID <=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLike(String value) {
            addCriterion("departID like", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotLike(String value) {
            addCriterion("departID not like", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidIn(List<String> values) {
            addCriterion("departID in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotIn(List<String> values) {
            addCriterion("departID not in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidBetween(String value1, String value2) {
            addCriterion("departID between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotBetween(String value1, String value2) {
            addCriterion("departID not between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("project is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("project is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("project =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("project <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("project >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("project >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("project <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("project <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("project like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("project not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("project in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("project not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("project between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("project not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andVouchingmanIsNull() {
            addCriterion("vouchingman is null");
            return (Criteria) this;
        }

        public Criteria andVouchingmanIsNotNull() {
            addCriterion("vouchingman is not null");
            return (Criteria) this;
        }

        public Criteria andVouchingmanEqualTo(String value) {
            addCriterion("vouchingman =", value, "vouchingman");
            return (Criteria) this;
        }

        public Criteria andVouchingmanNotEqualTo(String value) {
            addCriterion("vouchingman <>", value, "vouchingman");
            return (Criteria) this;
        }

        public Criteria andVouchingmanGreaterThan(String value) {
            addCriterion("vouchingman >", value, "vouchingman");
            return (Criteria) this;
        }

        public Criteria andVouchingmanGreaterThanOrEqualTo(String value) {
            addCriterion("vouchingman >=", value, "vouchingman");
            return (Criteria) this;
        }

        public Criteria andVouchingmanLessThan(String value) {
            addCriterion("vouchingman <", value, "vouchingman");
            return (Criteria) this;
        }

        public Criteria andVouchingmanLessThanOrEqualTo(String value) {
            addCriterion("vouchingman <=", value, "vouchingman");
            return (Criteria) this;
        }

        public Criteria andVouchingmanLike(String value) {
            addCriterion("vouchingman like", value, "vouchingman");
            return (Criteria) this;
        }

        public Criteria andVouchingmanNotLike(String value) {
            addCriterion("vouchingman not like", value, "vouchingman");
            return (Criteria) this;
        }

        public Criteria andVouchingmanIn(List<String> values) {
            addCriterion("vouchingman in", values, "vouchingman");
            return (Criteria) this;
        }

        public Criteria andVouchingmanNotIn(List<String> values) {
            addCriterion("vouchingman not in", values, "vouchingman");
            return (Criteria) this;
        }

        public Criteria andVouchingmanBetween(String value1, String value2) {
            addCriterion("vouchingman between", value1, value2, "vouchingman");
            return (Criteria) this;
        }

        public Criteria andVouchingmanNotBetween(String value1, String value2) {
            addCriterion("vouchingman not between", value1, value2, "vouchingman");
            return (Criteria) this;
        }

        public Criteria andAuditmanIsNull() {
            addCriterion("auditman is null");
            return (Criteria) this;
        }

        public Criteria andAuditmanIsNotNull() {
            addCriterion("auditman is not null");
            return (Criteria) this;
        }

        public Criteria andAuditmanEqualTo(String value) {
            addCriterion("auditman =", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanNotEqualTo(String value) {
            addCriterion("auditman <>", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanGreaterThan(String value) {
            addCriterion("auditman >", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanGreaterThanOrEqualTo(String value) {
            addCriterion("auditman >=", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanLessThan(String value) {
            addCriterion("auditman <", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanLessThanOrEqualTo(String value) {
            addCriterion("auditman <=", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanLike(String value) {
            addCriterion("auditman like", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanNotLike(String value) {
            addCriterion("auditman not like", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanIn(List<String> values) {
            addCriterion("auditman in", values, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanNotIn(List<String> values) {
            addCriterion("auditman not in", values, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanBetween(String value1, String value2) {
            addCriterion("auditman between", value1, value2, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanNotBetween(String value1, String value2) {
            addCriterion("auditman not between", value1, value2, "auditman");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCustom1IsNull() {
            addCriterion("custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCustom1IsNotNull() {
            addCriterion("custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom1EqualTo(String value) {
            addCriterion("custom1 =", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotEqualTo(String value) {
            addCriterion("custom1 <>", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1GreaterThan(String value) {
            addCriterion("custom1 >", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("custom1 >=", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1LessThan(String value) {
            addCriterion("custom1 <", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1LessThanOrEqualTo(String value) {
            addCriterion("custom1 <=", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1Like(String value) {
            addCriterion("custom1 like", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotLike(String value) {
            addCriterion("custom1 not like", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1In(List<String> values) {
            addCriterion("custom1 in", values, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotIn(List<String> values) {
            addCriterion("custom1 not in", values, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1Between(String value1, String value2) {
            addCriterion("custom1 between", value1, value2, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotBetween(String value1, String value2) {
            addCriterion("custom1 not between", value1, value2, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom2IsNull() {
            addCriterion("custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCustom2IsNotNull() {
            addCriterion("custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom2EqualTo(String value) {
            addCriterion("custom2 =", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotEqualTo(String value) {
            addCriterion("custom2 <>", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2GreaterThan(String value) {
            addCriterion("custom2 >", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("custom2 >=", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2LessThan(String value) {
            addCriterion("custom2 <", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2LessThanOrEqualTo(String value) {
            addCriterion("custom2 <=", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2Like(String value) {
            addCriterion("custom2 like", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotLike(String value) {
            addCriterion("custom2 not like", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2In(List<String> values) {
            addCriterion("custom2 in", values, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotIn(List<String> values) {
            addCriterion("custom2 not in", values, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2Between(String value1, String value2) {
            addCriterion("custom2 between", value1, value2, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotBetween(String value1, String value2) {
            addCriterion("custom2 not between", value1, value2, "custom2");
            return (Criteria) this;
        }

        public Criteria andAuditstateIsNull() {
            addCriterion("auditstate is null");
            return (Criteria) this;
        }

        public Criteria andAuditstateIsNotNull() {
            addCriterion("auditstate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstateEqualTo(Integer value) {
            addCriterion("auditstate =", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotEqualTo(Integer value) {
            addCriterion("auditstate <>", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateGreaterThan(Integer value) {
            addCriterion("auditstate >", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditstate >=", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLessThan(Integer value) {
            addCriterion("auditstate <", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLessThanOrEqualTo(Integer value) {
            addCriterion("auditstate <=", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateIn(List<Integer> values) {
            addCriterion("auditstate in", values, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotIn(List<Integer> values) {
            addCriterion("auditstate not in", values, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateBetween(Integer value1, Integer value2) {
            addCriterion("auditstate between", value1, value2, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotBetween(Integer value1, Integer value2) {
            addCriterion("auditstate not between", value1, value2, "auditstate");
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