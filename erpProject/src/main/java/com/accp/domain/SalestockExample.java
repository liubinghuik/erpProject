package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SalestockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalestockExample() {
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

        public Criteria andXschukuidIsNull() {
            addCriterion("xschukuid is null");
            return (Criteria) this;
        }

        public Criteria andXschukuidIsNotNull() {
            addCriterion("xschukuid is not null");
            return (Criteria) this;
        }

        public Criteria andXschukuidEqualTo(Integer value) {
            addCriterion("xschukuid =", value, "xschukuid");
            return (Criteria) this;
        }

        public Criteria andXschukuidNotEqualTo(Integer value) {
            addCriterion("xschukuid <>", value, "xschukuid");
            return (Criteria) this;
        }

        public Criteria andXschukuidGreaterThan(Integer value) {
            addCriterion("xschukuid >", value, "xschukuid");
            return (Criteria) this;
        }

        public Criteria andXschukuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("xschukuid >=", value, "xschukuid");
            return (Criteria) this;
        }

        public Criteria andXschukuidLessThan(Integer value) {
            addCriterion("xschukuid <", value, "xschukuid");
            return (Criteria) this;
        }

        public Criteria andXschukuidLessThanOrEqualTo(Integer value) {
            addCriterion("xschukuid <=", value, "xschukuid");
            return (Criteria) this;
        }

        public Criteria andXschukuidIn(List<Integer> values) {
            addCriterion("xschukuid in", values, "xschukuid");
            return (Criteria) this;
        }

        public Criteria andXschukuidNotIn(List<Integer> values) {
            addCriterion("xschukuid not in", values, "xschukuid");
            return (Criteria) this;
        }

        public Criteria andXschukuidBetween(Integer value1, Integer value2) {
            addCriterion("xschukuid between", value1, value2, "xschukuid");
            return (Criteria) this;
        }

        public Criteria andXschukuidNotBetween(Integer value1, Integer value2) {
            addCriterion("xschukuid not between", value1, value2, "xschukuid");
            return (Criteria) this;
        }

        public Criteria andXschukunoIsNull() {
            addCriterion("xschukuNo is null");
            return (Criteria) this;
        }

        public Criteria andXschukunoIsNotNull() {
            addCriterion("xschukuNo is not null");
            return (Criteria) this;
        }

        public Criteria andXschukunoEqualTo(String value) {
            addCriterion("xschukuNo =", value, "xschukuno");
            return (Criteria) this;
        }

        public Criteria andXschukunoNotEqualTo(String value) {
            addCriterion("xschukuNo <>", value, "xschukuno");
            return (Criteria) this;
        }

        public Criteria andXschukunoGreaterThan(String value) {
            addCriterion("xschukuNo >", value, "xschukuno");
            return (Criteria) this;
        }

        public Criteria andXschukunoGreaterThanOrEqualTo(String value) {
            addCriterion("xschukuNo >=", value, "xschukuno");
            return (Criteria) this;
        }

        public Criteria andXschukunoLessThan(String value) {
            addCriterion("xschukuNo <", value, "xschukuno");
            return (Criteria) this;
        }

        public Criteria andXschukunoLessThanOrEqualTo(String value) {
            addCriterion("xschukuNo <=", value, "xschukuno");
            return (Criteria) this;
        }

        public Criteria andXschukunoLike(String value) {
            addCriterion("xschukuNo like", value, "xschukuno");
            return (Criteria) this;
        }

        public Criteria andXschukunoNotLike(String value) {
            addCriterion("xschukuNo not like", value, "xschukuno");
            return (Criteria) this;
        }

        public Criteria andXschukunoIn(List<String> values) {
            addCriterion("xschukuNo in", values, "xschukuno");
            return (Criteria) this;
        }

        public Criteria andXschukunoNotIn(List<String> values) {
            addCriterion("xschukuNo not in", values, "xschukuno");
            return (Criteria) this;
        }

        public Criteria andXschukunoBetween(String value1, String value2) {
            addCriterion("xschukuNo between", value1, value2, "xschukuno");
            return (Criteria) this;
        }

        public Criteria andXschukunoNotBetween(String value1, String value2) {
            addCriterion("xschukuNo not between", value1, value2, "xschukuno");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("customerID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("customerID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("customerID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("customerID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("customerID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("customerID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("customerID like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("customerID not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("customerID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("customerID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("customerID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("customerID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andDanjudateIsNull() {
            addCriterion("danjuDate is null");
            return (Criteria) this;
        }

        public Criteria andDanjudateIsNotNull() {
            addCriterion("danjuDate is not null");
            return (Criteria) this;
        }

        public Criteria andDanjudateEqualTo(Date value) {
            addCriterionForJDBCDate("danjuDate =", value, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateNotEqualTo(Date value) {
            addCriterionForJDBCDate("danjuDate <>", value, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateGreaterThan(Date value) {
            addCriterionForJDBCDate("danjuDate >", value, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("danjuDate >=", value, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateLessThan(Date value) {
            addCriterionForJDBCDate("danjuDate <", value, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("danjuDate <=", value, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateIn(List<Date> values) {
            addCriterionForJDBCDate("danjuDate in", values, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateNotIn(List<Date> values) {
            addCriterionForJDBCDate("danjuDate not in", values, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("danjuDate between", value1, value2, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("danjuDate not between", value1, value2, "danjudate");
            return (Criteria) this;
        }

        public Criteria andXschukulxIsNull() {
            addCriterion("xschukulx is null");
            return (Criteria) this;
        }

        public Criteria andXschukulxIsNotNull() {
            addCriterion("xschukulx is not null");
            return (Criteria) this;
        }

        public Criteria andXschukulxEqualTo(String value) {
            addCriterion("xschukulx =", value, "xschukulx");
            return (Criteria) this;
        }

        public Criteria andXschukulxNotEqualTo(String value) {
            addCriterion("xschukulx <>", value, "xschukulx");
            return (Criteria) this;
        }

        public Criteria andXschukulxGreaterThan(String value) {
            addCriterion("xschukulx >", value, "xschukulx");
            return (Criteria) this;
        }

        public Criteria andXschukulxGreaterThanOrEqualTo(String value) {
            addCriterion("xschukulx >=", value, "xschukulx");
            return (Criteria) this;
        }

        public Criteria andXschukulxLessThan(String value) {
            addCriterion("xschukulx <", value, "xschukulx");
            return (Criteria) this;
        }

        public Criteria andXschukulxLessThanOrEqualTo(String value) {
            addCriterion("xschukulx <=", value, "xschukulx");
            return (Criteria) this;
        }

        public Criteria andXschukulxLike(String value) {
            addCriterion("xschukulx like", value, "xschukulx");
            return (Criteria) this;
        }

        public Criteria andXschukulxNotLike(String value) {
            addCriterion("xschukulx not like", value, "xschukulx");
            return (Criteria) this;
        }

        public Criteria andXschukulxIn(List<String> values) {
            addCriterion("xschukulx in", values, "xschukulx");
            return (Criteria) this;
        }

        public Criteria andXschukulxNotIn(List<String> values) {
            addCriterion("xschukulx not in", values, "xschukulx");
            return (Criteria) this;
        }

        public Criteria andXschukulxBetween(String value1, String value2) {
            addCriterion("xschukulx between", value1, value2, "xschukulx");
            return (Criteria) this;
        }

        public Criteria andXschukulxNotBetween(String value1, String value2) {
            addCriterion("xschukulx not between", value1, value2, "xschukulx");
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

        public Criteria andDanjiahsifIsNull() {
            addCriterion("danjiahsif is null");
            return (Criteria) this;
        }

        public Criteria andDanjiahsifIsNotNull() {
            addCriterion("danjiahsif is not null");
            return (Criteria) this;
        }

        public Criteria andDanjiahsifEqualTo(Integer value) {
            addCriterion("danjiahsif =", value, "danjiahsif");
            return (Criteria) this;
        }

        public Criteria andDanjiahsifNotEqualTo(Integer value) {
            addCriterion("danjiahsif <>", value, "danjiahsif");
            return (Criteria) this;
        }

        public Criteria andDanjiahsifGreaterThan(Integer value) {
            addCriterion("danjiahsif >", value, "danjiahsif");
            return (Criteria) this;
        }

        public Criteria andDanjiahsifGreaterThanOrEqualTo(Integer value) {
            addCriterion("danjiahsif >=", value, "danjiahsif");
            return (Criteria) this;
        }

        public Criteria andDanjiahsifLessThan(Integer value) {
            addCriterion("danjiahsif <", value, "danjiahsif");
            return (Criteria) this;
        }

        public Criteria andDanjiahsifLessThanOrEqualTo(Integer value) {
            addCriterion("danjiahsif <=", value, "danjiahsif");
            return (Criteria) this;
        }

        public Criteria andDanjiahsifIn(List<Integer> values) {
            addCriterion("danjiahsif in", values, "danjiahsif");
            return (Criteria) this;
        }

        public Criteria andDanjiahsifNotIn(List<Integer> values) {
            addCriterion("danjiahsif not in", values, "danjiahsif");
            return (Criteria) this;
        }

        public Criteria andDanjiahsifBetween(Integer value1, Integer value2) {
            addCriterion("danjiahsif between", value1, value2, "danjiahsif");
            return (Criteria) this;
        }

        public Criteria andDanjiahsifNotBetween(Integer value1, Integer value2) {
            addCriterion("danjiahsif not between", value1, value2, "danjiahsif");
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

        public Criteria andGwmyIsNull() {
            addCriterion("gwmy is null");
            return (Criteria) this;
        }

        public Criteria andGwmyIsNotNull() {
            addCriterion("gwmy is not null");
            return (Criteria) this;
        }

        public Criteria andGwmyEqualTo(String value) {
            addCriterion("gwmy =", value, "gwmy");
            return (Criteria) this;
        }

        public Criteria andGwmyNotEqualTo(String value) {
            addCriterion("gwmy <>", value, "gwmy");
            return (Criteria) this;
        }

        public Criteria andGwmyGreaterThan(String value) {
            addCriterion("gwmy >", value, "gwmy");
            return (Criteria) this;
        }

        public Criteria andGwmyGreaterThanOrEqualTo(String value) {
            addCriterion("gwmy >=", value, "gwmy");
            return (Criteria) this;
        }

        public Criteria andGwmyLessThan(String value) {
            addCriterion("gwmy <", value, "gwmy");
            return (Criteria) this;
        }

        public Criteria andGwmyLessThanOrEqualTo(String value) {
            addCriterion("gwmy <=", value, "gwmy");
            return (Criteria) this;
        }

        public Criteria andGwmyLike(String value) {
            addCriterion("gwmy like", value, "gwmy");
            return (Criteria) this;
        }

        public Criteria andGwmyNotLike(String value) {
            addCriterion("gwmy not like", value, "gwmy");
            return (Criteria) this;
        }

        public Criteria andGwmyIn(List<String> values) {
            addCriterion("gwmy in", values, "gwmy");
            return (Criteria) this;
        }

        public Criteria andGwmyNotIn(List<String> values) {
            addCriterion("gwmy not in", values, "gwmy");
            return (Criteria) this;
        }

        public Criteria andGwmyBetween(String value1, String value2) {
            addCriterion("gwmy between", value1, value2, "gwmy");
            return (Criteria) this;
        }

        public Criteria andGwmyNotBetween(String value1, String value2) {
            addCriterion("gwmy not between", value1, value2, "gwmy");
            return (Criteria) this;
        }

        public Criteria andPzbmIsNull() {
            addCriterion("pzbm is null");
            return (Criteria) this;
        }

        public Criteria andPzbmIsNotNull() {
            addCriterion("pzbm is not null");
            return (Criteria) this;
        }

        public Criteria andPzbmEqualTo(String value) {
            addCriterion("pzbm =", value, "pzbm");
            return (Criteria) this;
        }

        public Criteria andPzbmNotEqualTo(String value) {
            addCriterion("pzbm <>", value, "pzbm");
            return (Criteria) this;
        }

        public Criteria andPzbmGreaterThan(String value) {
            addCriterion("pzbm >", value, "pzbm");
            return (Criteria) this;
        }

        public Criteria andPzbmGreaterThanOrEqualTo(String value) {
            addCriterion("pzbm >=", value, "pzbm");
            return (Criteria) this;
        }

        public Criteria andPzbmLessThan(String value) {
            addCriterion("pzbm <", value, "pzbm");
            return (Criteria) this;
        }

        public Criteria andPzbmLessThanOrEqualTo(String value) {
            addCriterion("pzbm <=", value, "pzbm");
            return (Criteria) this;
        }

        public Criteria andPzbmLike(String value) {
            addCriterion("pzbm like", value, "pzbm");
            return (Criteria) this;
        }

        public Criteria andPzbmNotLike(String value) {
            addCriterion("pzbm not like", value, "pzbm");
            return (Criteria) this;
        }

        public Criteria andPzbmIn(List<String> values) {
            addCriterion("pzbm in", values, "pzbm");
            return (Criteria) this;
        }

        public Criteria andPzbmNotIn(List<String> values) {
            addCriterion("pzbm not in", values, "pzbm");
            return (Criteria) this;
        }

        public Criteria andPzbmBetween(String value1, String value2) {
            addCriterion("pzbm between", value1, value2, "pzbm");
            return (Criteria) this;
        }

        public Criteria andPzbmNotBetween(String value1, String value2) {
            addCriterion("pzbm not between", value1, value2, "pzbm");
            return (Criteria) this;
        }

        public Criteria andBeizuIsNull() {
            addCriterion("beizu is null");
            return (Criteria) this;
        }

        public Criteria andBeizuIsNotNull() {
            addCriterion("beizu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizuEqualTo(String value) {
            addCriterion("beizu =", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuNotEqualTo(String value) {
            addCriterion("beizu <>", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuGreaterThan(String value) {
            addCriterion("beizu >", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuGreaterThanOrEqualTo(String value) {
            addCriterion("beizu >=", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuLessThan(String value) {
            addCriterion("beizu <", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuLessThanOrEqualTo(String value) {
            addCriterion("beizu <=", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuLike(String value) {
            addCriterion("beizu like", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuNotLike(String value) {
            addCriterion("beizu not like", value, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuIn(List<String> values) {
            addCriterion("beizu in", values, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuNotIn(List<String> values) {
            addCriterion("beizu not in", values, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuBetween(String value1, String value2) {
            addCriterion("beizu between", value1, value2, "beizu");
            return (Criteria) this;
        }

        public Criteria andBeizuNotBetween(String value1, String value2) {
            addCriterion("beizu not between", value1, value2, "beizu");
            return (Criteria) this;
        }

        public Criteria andDepartidIsNull() {
            addCriterion("DepartID is null");
            return (Criteria) this;
        }

        public Criteria andDepartidIsNotNull() {
            addCriterion("DepartID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartidEqualTo(String value) {
            addCriterion("DepartID =", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotEqualTo(String value) {
            addCriterion("DepartID <>", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThan(String value) {
            addCriterion("DepartID >", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThanOrEqualTo(String value) {
            addCriterion("DepartID >=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThan(String value) {
            addCriterion("DepartID <", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThanOrEqualTo(String value) {
            addCriterion("DepartID <=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLike(String value) {
            addCriterion("DepartID like", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotLike(String value) {
            addCriterion("DepartID not like", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidIn(List<String> values) {
            addCriterion("DepartID in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotIn(List<String> values) {
            addCriterion("DepartID not in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidBetween(String value1, String value2) {
            addCriterion("DepartID between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotBetween(String value1, String value2) {
            addCriterion("DepartID not between", value1, value2, "departid");
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

        public Criteria andFuhestatesIsNull() {
            addCriterion("fuhestates is null");
            return (Criteria) this;
        }

        public Criteria andFuhestatesIsNotNull() {
            addCriterion("fuhestates is not null");
            return (Criteria) this;
        }

        public Criteria andFuhestatesEqualTo(String value) {
            addCriterion("fuhestates =", value, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesNotEqualTo(String value) {
            addCriterion("fuhestates <>", value, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesGreaterThan(String value) {
            addCriterion("fuhestates >", value, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesGreaterThanOrEqualTo(String value) {
            addCriterion("fuhestates >=", value, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesLessThan(String value) {
            addCriterion("fuhestates <", value, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesLessThanOrEqualTo(String value) {
            addCriterion("fuhestates <=", value, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesLike(String value) {
            addCriterion("fuhestates like", value, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesNotLike(String value) {
            addCriterion("fuhestates not like", value, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesIn(List<String> values) {
            addCriterion("fuhestates in", values, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesNotIn(List<String> values) {
            addCriterion("fuhestates not in", values, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesBetween(String value1, String value2) {
            addCriterion("fuhestates between", value1, value2, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesNotBetween(String value1, String value2) {
            addCriterion("fuhestates not between", value1, value2, "fuhestates");
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