package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TdebitnotereceivablemenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TdebitnotereceivablemenuExample() {
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

        public Criteria andCurrencyidIsNull() {
            addCriterion("CurrencyID is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIsNotNull() {
            addCriterion("CurrencyID is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyidEqualTo(String value) {
            addCriterion("CurrencyID =", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotEqualTo(String value) {
            addCriterion("CurrencyID <>", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidGreaterThan(String value) {
            addCriterion("CurrencyID >", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidGreaterThanOrEqualTo(String value) {
            addCriterion("CurrencyID >=", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLessThan(String value) {
            addCriterion("CurrencyID <", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLessThanOrEqualTo(String value) {
            addCriterion("CurrencyID <=", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLike(String value) {
            addCriterion("CurrencyID like", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotLike(String value) {
            addCriterion("CurrencyID not like", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIn(List<String> values) {
            addCriterion("CurrencyID in", values, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotIn(List<String> values) {
            addCriterion("CurrencyID not in", values, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidBetween(String value1, String value2) {
            addCriterion("CurrencyID between", value1, value2, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotBetween(String value1, String value2) {
            addCriterion("CurrencyID not between", value1, value2, "currencyid");
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBilldateIsNull() {
            addCriterion("BillDate is null");
            return (Criteria) this;
        }

        public Criteria andBilldateIsNotNull() {
            addCriterion("BillDate is not null");
            return (Criteria) this;
        }

        public Criteria andBilldateEqualTo(Date value) {
            addCriterionForJDBCDate("BillDate =", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BillDate <>", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateGreaterThan(Date value) {
            addCriterionForJDBCDate("BillDate >", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BillDate >=", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateLessThan(Date value) {
            addCriterionForJDBCDate("BillDate <", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BillDate <=", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateIn(List<Date> values) {
            addCriterionForJDBCDate("BillDate in", values, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BillDate not in", values, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BillDate between", value1, value2, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BillDate not between", value1, value2, "billdate");
            return (Criteria) this;
        }

        public Criteria andClearingoneIsNull() {
            addCriterion("ClearingOne is null");
            return (Criteria) this;
        }

        public Criteria andClearingoneIsNotNull() {
            addCriterion("ClearingOne is not null");
            return (Criteria) this;
        }

        public Criteria andClearingoneEqualTo(String value) {
            addCriterion("ClearingOne =", value, "clearingone");
            return (Criteria) this;
        }

        public Criteria andClearingoneNotEqualTo(String value) {
            addCriterion("ClearingOne <>", value, "clearingone");
            return (Criteria) this;
        }

        public Criteria andClearingoneGreaterThan(String value) {
            addCriterion("ClearingOne >", value, "clearingone");
            return (Criteria) this;
        }

        public Criteria andClearingoneGreaterThanOrEqualTo(String value) {
            addCriterion("ClearingOne >=", value, "clearingone");
            return (Criteria) this;
        }

        public Criteria andClearingoneLessThan(String value) {
            addCriterion("ClearingOne <", value, "clearingone");
            return (Criteria) this;
        }

        public Criteria andClearingoneLessThanOrEqualTo(String value) {
            addCriterion("ClearingOne <=", value, "clearingone");
            return (Criteria) this;
        }

        public Criteria andClearingoneLike(String value) {
            addCriterion("ClearingOne like", value, "clearingone");
            return (Criteria) this;
        }

        public Criteria andClearingoneNotLike(String value) {
            addCriterion("ClearingOne not like", value, "clearingone");
            return (Criteria) this;
        }

        public Criteria andClearingoneIn(List<String> values) {
            addCriterion("ClearingOne in", values, "clearingone");
            return (Criteria) this;
        }

        public Criteria andClearingoneNotIn(List<String> values) {
            addCriterion("ClearingOne not in", values, "clearingone");
            return (Criteria) this;
        }

        public Criteria andClearingoneBetween(String value1, String value2) {
            addCriterion("ClearingOne between", value1, value2, "clearingone");
            return (Criteria) this;
        }

        public Criteria andClearingoneNotBetween(String value1, String value2) {
            addCriterion("ClearingOne not between", value1, value2, "clearingone");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1IsNull() {
            addCriterion("Paymentamout1 is null");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1IsNotNull() {
            addCriterion("Paymentamout1 is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1EqualTo(Double value) {
            addCriterion("Paymentamout1 =", value, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1NotEqualTo(Double value) {
            addCriterion("Paymentamout1 <>", value, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1GreaterThan(Double value) {
            addCriterion("Paymentamout1 >", value, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1GreaterThanOrEqualTo(Double value) {
            addCriterion("Paymentamout1 >=", value, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1LessThan(Double value) {
            addCriterion("Paymentamout1 <", value, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1LessThanOrEqualTo(Double value) {
            addCriterion("Paymentamout1 <=", value, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1In(List<Double> values) {
            addCriterion("Paymentamout1 in", values, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1NotIn(List<Double> values) {
            addCriterion("Paymentamout1 not in", values, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1Between(Double value1, Double value2) {
            addCriterion("Paymentamout1 between", value1, value2, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andPaymentamout1NotBetween(Double value1, Double value2) {
            addCriterion("Paymentamout1 not between", value1, value2, "paymentamout1");
            return (Criteria) this;
        }

        public Criteria andClearingtwoIsNull() {
            addCriterion("ClearingTwo is null");
            return (Criteria) this;
        }

        public Criteria andClearingtwoIsNotNull() {
            addCriterion("ClearingTwo is not null");
            return (Criteria) this;
        }

        public Criteria andClearingtwoEqualTo(String value) {
            addCriterion("ClearingTwo =", value, "clearingtwo");
            return (Criteria) this;
        }

        public Criteria andClearingtwoNotEqualTo(String value) {
            addCriterion("ClearingTwo <>", value, "clearingtwo");
            return (Criteria) this;
        }

        public Criteria andClearingtwoGreaterThan(String value) {
            addCriterion("ClearingTwo >", value, "clearingtwo");
            return (Criteria) this;
        }

        public Criteria andClearingtwoGreaterThanOrEqualTo(String value) {
            addCriterion("ClearingTwo >=", value, "clearingtwo");
            return (Criteria) this;
        }

        public Criteria andClearingtwoLessThan(String value) {
            addCriterion("ClearingTwo <", value, "clearingtwo");
            return (Criteria) this;
        }

        public Criteria andClearingtwoLessThanOrEqualTo(String value) {
            addCriterion("ClearingTwo <=", value, "clearingtwo");
            return (Criteria) this;
        }

        public Criteria andClearingtwoLike(String value) {
            addCriterion("ClearingTwo like", value, "clearingtwo");
            return (Criteria) this;
        }

        public Criteria andClearingtwoNotLike(String value) {
            addCriterion("ClearingTwo not like", value, "clearingtwo");
            return (Criteria) this;
        }

        public Criteria andClearingtwoIn(List<String> values) {
            addCriterion("ClearingTwo in", values, "clearingtwo");
            return (Criteria) this;
        }

        public Criteria andClearingtwoNotIn(List<String> values) {
            addCriterion("ClearingTwo not in", values, "clearingtwo");
            return (Criteria) this;
        }

        public Criteria andClearingtwoBetween(String value1, String value2) {
            addCriterion("ClearingTwo between", value1, value2, "clearingtwo");
            return (Criteria) this;
        }

        public Criteria andClearingtwoNotBetween(String value1, String value2) {
            addCriterion("ClearingTwo not between", value1, value2, "clearingtwo");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2IsNull() {
            addCriterion("Paymentamout2 is null");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2IsNotNull() {
            addCriterion("Paymentamout2 is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2EqualTo(Double value) {
            addCriterion("Paymentamout2 =", value, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2NotEqualTo(Double value) {
            addCriterion("Paymentamout2 <>", value, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2GreaterThan(Double value) {
            addCriterion("Paymentamout2 >", value, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2GreaterThanOrEqualTo(Double value) {
            addCriterion("Paymentamout2 >=", value, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2LessThan(Double value) {
            addCriterion("Paymentamout2 <", value, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2LessThanOrEqualTo(Double value) {
            addCriterion("Paymentamout2 <=", value, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2In(List<Double> values) {
            addCriterion("Paymentamout2 in", values, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2NotIn(List<Double> values) {
            addCriterion("Paymentamout2 not in", values, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2Between(Double value1, Double value2) {
            addCriterion("Paymentamout2 between", value1, value2, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andPaymentamout2NotBetween(Double value1, Double value2) {
            addCriterion("Paymentamout2 not between", value1, value2, "paymentamout2");
            return (Criteria) this;
        }

        public Criteria andClearingthreeIsNull() {
            addCriterion("ClearingThree is null");
            return (Criteria) this;
        }

        public Criteria andClearingthreeIsNotNull() {
            addCriterion("ClearingThree is not null");
            return (Criteria) this;
        }

        public Criteria andClearingthreeEqualTo(String value) {
            addCriterion("ClearingThree =", value, "clearingthree");
            return (Criteria) this;
        }

        public Criteria andClearingthreeNotEqualTo(String value) {
            addCriterion("ClearingThree <>", value, "clearingthree");
            return (Criteria) this;
        }

        public Criteria andClearingthreeGreaterThan(String value) {
            addCriterion("ClearingThree >", value, "clearingthree");
            return (Criteria) this;
        }

        public Criteria andClearingthreeGreaterThanOrEqualTo(String value) {
            addCriterion("ClearingThree >=", value, "clearingthree");
            return (Criteria) this;
        }

        public Criteria andClearingthreeLessThan(String value) {
            addCriterion("ClearingThree <", value, "clearingthree");
            return (Criteria) this;
        }

        public Criteria andClearingthreeLessThanOrEqualTo(String value) {
            addCriterion("ClearingThree <=", value, "clearingthree");
            return (Criteria) this;
        }

        public Criteria andClearingthreeLike(String value) {
            addCriterion("ClearingThree like", value, "clearingthree");
            return (Criteria) this;
        }

        public Criteria andClearingthreeNotLike(String value) {
            addCriterion("ClearingThree not like", value, "clearingthree");
            return (Criteria) this;
        }

        public Criteria andClearingthreeIn(List<String> values) {
            addCriterion("ClearingThree in", values, "clearingthree");
            return (Criteria) this;
        }

        public Criteria andClearingthreeNotIn(List<String> values) {
            addCriterion("ClearingThree not in", values, "clearingthree");
            return (Criteria) this;
        }

        public Criteria andClearingthreeBetween(String value1, String value2) {
            addCriterion("ClearingThree between", value1, value2, "clearingthree");
            return (Criteria) this;
        }

        public Criteria andClearingthreeNotBetween(String value1, String value2) {
            addCriterion("ClearingThree not between", value1, value2, "clearingthree");
            return (Criteria) this;
        }

        public Criteria andPaymentamout3IsNull() {
            addCriterion("Paymentamout3 is null");
            return (Criteria) this;
        }

        public Criteria andPaymentamout3IsNotNull() {
            addCriterion("Paymentamout3 is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentamout3EqualTo(Double value) {
            addCriterion("Paymentamout3 =", value, "paymentamout3");
            return (Criteria) this;
        }

        public Criteria andPaymentamout3NotEqualTo(Double value) {
            addCriterion("Paymentamout3 <>", value, "paymentamout3");
            return (Criteria) this;
        }

        public Criteria andPaymentamout3GreaterThan(Double value) {
            addCriterion("Paymentamout3 >", value, "paymentamout3");
            return (Criteria) this;
        }

        public Criteria andPaymentamout3GreaterThanOrEqualTo(Double value) {
            addCriterion("Paymentamout3 >=", value, "paymentamout3");
            return (Criteria) this;
        }

        public Criteria andPaymentamout3LessThan(Double value) {
            addCriterion("Paymentamout3 <", value, "paymentamout3");
            return (Criteria) this;
        }

        public Criteria andPaymentamout3LessThanOrEqualTo(Double value) {
            addCriterion("Paymentamout3 <=", value, "paymentamout3");
            return (Criteria) this;
        }

        public Criteria andPaymentamout3In(List<Double> values) {
            addCriterion("Paymentamout3 in", values, "paymentamout3");
            return (Criteria) this;
        }

        public Criteria andPaymentamout3NotIn(List<Double> values) {
            addCriterion("Paymentamout3 not in", values, "paymentamout3");
            return (Criteria) this;
        }

        public Criteria andPaymentamout3Between(Double value1, Double value2) {
            addCriterion("Paymentamout3 between", value1, value2, "paymentamout3");
            return (Criteria) this;
        }

        public Criteria andPaymentamout3NotBetween(Double value1, Double value2) {
            addCriterion("Paymentamout3 not between", value1, value2, "paymentamout3");
            return (Criteria) this;
        }

        public Criteria andDiscountrateIsNull() {
            addCriterion("DiscountRate is null");
            return (Criteria) this;
        }

        public Criteria andDiscountrateIsNotNull() {
            addCriterion("DiscountRate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountrateEqualTo(Double value) {
            addCriterion("DiscountRate =", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateNotEqualTo(Double value) {
            addCriterion("DiscountRate <>", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateGreaterThan(Double value) {
            addCriterion("DiscountRate >", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateGreaterThanOrEqualTo(Double value) {
            addCriterion("DiscountRate >=", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateLessThan(Double value) {
            addCriterion("DiscountRate <", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateLessThanOrEqualTo(Double value) {
            addCriterion("DiscountRate <=", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateIn(List<Double> values) {
            addCriterion("DiscountRate in", values, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateNotIn(List<Double> values) {
            addCriterion("DiscountRate not in", values, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateBetween(Double value1, Double value2) {
            addCriterion("DiscountRate between", value1, value2, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateNotBetween(Double value1, Double value2) {
            addCriterion("DiscountRate not between", value1, value2, "discountrate");
            return (Criteria) this;
        }

        public Criteria andTerminationmouthIsNull() {
            addCriterion("TerminationMouth is null");
            return (Criteria) this;
        }

        public Criteria andTerminationmouthIsNotNull() {
            addCriterion("TerminationMouth is not null");
            return (Criteria) this;
        }

        public Criteria andTerminationmouthEqualTo(Date value) {
            addCriterionForJDBCDate("TerminationMouth =", value, "terminationmouth");
            return (Criteria) this;
        }

        public Criteria andTerminationmouthNotEqualTo(Date value) {
            addCriterionForJDBCDate("TerminationMouth <>", value, "terminationmouth");
            return (Criteria) this;
        }

        public Criteria andTerminationmouthGreaterThan(Date value) {
            addCriterionForJDBCDate("TerminationMouth >", value, "terminationmouth");
            return (Criteria) this;
        }

        public Criteria andTerminationmouthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TerminationMouth >=", value, "terminationmouth");
            return (Criteria) this;
        }

        public Criteria andTerminationmouthLessThan(Date value) {
            addCriterionForJDBCDate("TerminationMouth <", value, "terminationmouth");
            return (Criteria) this;
        }

        public Criteria andTerminationmouthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TerminationMouth <=", value, "terminationmouth");
            return (Criteria) this;
        }

        public Criteria andTerminationmouthIn(List<Date> values) {
            addCriterionForJDBCDate("TerminationMouth in", values, "terminationmouth");
            return (Criteria) this;
        }

        public Criteria andTerminationmouthNotIn(List<Date> values) {
            addCriterionForJDBCDate("TerminationMouth not in", values, "terminationmouth");
            return (Criteria) this;
        }

        public Criteria andTerminationmouthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TerminationMouth between", value1, value2, "terminationmouth");
            return (Criteria) this;
        }

        public Criteria andTerminationmouthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TerminationMouth not between", value1, value2, "terminationmouth");
            return (Criteria) this;
        }

        public Criteria andVoucheridIsNull() {
            addCriterion("VoucherId is null");
            return (Criteria) this;
        }

        public Criteria andVoucheridIsNotNull() {
            addCriterion("VoucherId is not null");
            return (Criteria) this;
        }

        public Criteria andVoucheridEqualTo(String value) {
            addCriterion("VoucherId =", value, "voucherid");
            return (Criteria) this;
        }

        public Criteria andVoucheridNotEqualTo(String value) {
            addCriterion("VoucherId <>", value, "voucherid");
            return (Criteria) this;
        }

        public Criteria andVoucheridGreaterThan(String value) {
            addCriterion("VoucherId >", value, "voucherid");
            return (Criteria) this;
        }

        public Criteria andVoucheridGreaterThanOrEqualTo(String value) {
            addCriterion("VoucherId >=", value, "voucherid");
            return (Criteria) this;
        }

        public Criteria andVoucheridLessThan(String value) {
            addCriterion("VoucherId <", value, "voucherid");
            return (Criteria) this;
        }

        public Criteria andVoucheridLessThanOrEqualTo(String value) {
            addCriterion("VoucherId <=", value, "voucherid");
            return (Criteria) this;
        }

        public Criteria andVoucheridLike(String value) {
            addCriterion("VoucherId like", value, "voucherid");
            return (Criteria) this;
        }

        public Criteria andVoucheridNotLike(String value) {
            addCriterion("VoucherId not like", value, "voucherid");
            return (Criteria) this;
        }

        public Criteria andVoucheridIn(List<String> values) {
            addCriterion("VoucherId in", values, "voucherid");
            return (Criteria) this;
        }

        public Criteria andVoucheridNotIn(List<String> values) {
            addCriterion("VoucherId not in", values, "voucherid");
            return (Criteria) this;
        }

        public Criteria andVoucheridBetween(String value1, String value2) {
            addCriterion("VoucherId between", value1, value2, "voucherid");
            return (Criteria) this;
        }

        public Criteria andVoucheridNotBetween(String value1, String value2) {
            addCriterion("VoucherId not between", value1, value2, "voucherid");
            return (Criteria) this;
        }

        public Criteria andDepartidIsNull() {
            addCriterion("DepartId is null");
            return (Criteria) this;
        }

        public Criteria andDepartidIsNotNull() {
            addCriterion("DepartId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartidEqualTo(String value) {
            addCriterion("DepartId =", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotEqualTo(String value) {
            addCriterion("DepartId <>", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThan(String value) {
            addCriterion("DepartId >", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThanOrEqualTo(String value) {
            addCriterion("DepartId >=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThan(String value) {
            addCriterion("DepartId <", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThanOrEqualTo(String value) {
            addCriterion("DepartId <=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLike(String value) {
            addCriterion("DepartId like", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotLike(String value) {
            addCriterion("DepartId not like", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidIn(List<String> values) {
            addCriterion("DepartId in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotIn(List<String> values) {
            addCriterion("DepartId not in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidBetween(String value1, String value2) {
            addCriterion("DepartId between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotBetween(String value1, String value2) {
            addCriterion("DepartId not between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andMakerIsNull() {
            addCriterion("Maker is null");
            return (Criteria) this;
        }

        public Criteria andMakerIsNotNull() {
            addCriterion("Maker is not null");
            return (Criteria) this;
        }

        public Criteria andMakerEqualTo(String value) {
            addCriterion("Maker =", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotEqualTo(String value) {
            addCriterion("Maker <>", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerGreaterThan(String value) {
            addCriterion("Maker >", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerGreaterThanOrEqualTo(String value) {
            addCriterion("Maker >=", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLessThan(String value) {
            addCriterion("Maker <", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLessThanOrEqualTo(String value) {
            addCriterion("Maker <=", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLike(String value) {
            addCriterion("Maker like", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotLike(String value) {
            addCriterion("Maker not like", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerIn(List<String> values) {
            addCriterion("Maker in", values, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotIn(List<String> values) {
            addCriterion("Maker not in", values, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerBetween(String value1, String value2) {
            addCriterion("Maker between", value1, value2, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotBetween(String value1, String value2) {
            addCriterion("Maker not between", value1, value2, "maker");
            return (Criteria) this;
        }

        public Criteria andPermitterIsNull() {
            addCriterion("Permitter is null");
            return (Criteria) this;
        }

        public Criteria andPermitterIsNotNull() {
            addCriterion("Permitter is not null");
            return (Criteria) this;
        }

        public Criteria andPermitterEqualTo(String value) {
            addCriterion("Permitter =", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterNotEqualTo(String value) {
            addCriterion("Permitter <>", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterGreaterThan(String value) {
            addCriterion("Permitter >", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterGreaterThanOrEqualTo(String value) {
            addCriterion("Permitter >=", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterLessThan(String value) {
            addCriterion("Permitter <", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterLessThanOrEqualTo(String value) {
            addCriterion("Permitter <=", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterLike(String value) {
            addCriterion("Permitter like", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterNotLike(String value) {
            addCriterion("Permitter not like", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterIn(List<String> values) {
            addCriterion("Permitter in", values, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterNotIn(List<String> values) {
            addCriterion("Permitter not in", values, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterBetween(String value1, String value2) {
            addCriterion("Permitter between", value1, value2, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterNotBetween(String value1, String value2) {
            addCriterion("Permitter not between", value1, value2, "permitter");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("Project is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("Project is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("Project =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("Project <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("Project >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("Project >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("Project <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("Project <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("Project like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("Project not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("Project in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("Project not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("Project between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("Project not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andCustom1IsNull() {
            addCriterion("Custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCustom1IsNotNull() {
            addCriterion("Custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom1EqualTo(String value) {
            addCriterion("Custom1 =", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotEqualTo(String value) {
            addCriterion("Custom1 <>", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1GreaterThan(String value) {
            addCriterion("Custom1 >", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("Custom1 >=", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1LessThan(String value) {
            addCriterion("Custom1 <", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1LessThanOrEqualTo(String value) {
            addCriterion("Custom1 <=", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1Like(String value) {
            addCriterion("Custom1 like", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotLike(String value) {
            addCriterion("Custom1 not like", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1In(List<String> values) {
            addCriterion("Custom1 in", values, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotIn(List<String> values) {
            addCriterion("Custom1 not in", values, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1Between(String value1, String value2) {
            addCriterion("Custom1 between", value1, value2, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotBetween(String value1, String value2) {
            addCriterion("Custom1 not between", value1, value2, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom2IsNull() {
            addCriterion("Custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCustom2IsNotNull() {
            addCriterion("Custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom2EqualTo(String value) {
            addCriterion("Custom2 =", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotEqualTo(String value) {
            addCriterion("Custom2 <>", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2GreaterThan(String value) {
            addCriterion("Custom2 >", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("Custom2 >=", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2LessThan(String value) {
            addCriterion("Custom2 <", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2LessThanOrEqualTo(String value) {
            addCriterion("Custom2 <=", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2Like(String value) {
            addCriterion("Custom2 like", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotLike(String value) {
            addCriterion("Custom2 not like", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2In(List<String> values) {
            addCriterion("Custom2 in", values, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotIn(List<String> values) {
            addCriterion("Custom2 not in", values, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2Between(String value1, String value2) {
            addCriterion("Custom2 between", value1, value2, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotBetween(String value1, String value2) {
            addCriterion("Custom2 not between", value1, value2, "custom2");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
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