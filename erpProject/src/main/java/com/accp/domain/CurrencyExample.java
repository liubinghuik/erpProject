package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CurrencyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurrencyExample() {
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

        public Criteria andCurrencynameIsNull() {
            addCriterion("CurrencyName is null");
            return (Criteria) this;
        }

        public Criteria andCurrencynameIsNotNull() {
            addCriterion("CurrencyName is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencynameEqualTo(String value) {
            addCriterion("CurrencyName =", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotEqualTo(String value) {
            addCriterion("CurrencyName <>", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameGreaterThan(String value) {
            addCriterion("CurrencyName >", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameGreaterThanOrEqualTo(String value) {
            addCriterion("CurrencyName >=", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameLessThan(String value) {
            addCriterion("CurrencyName <", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameLessThanOrEqualTo(String value) {
            addCriterion("CurrencyName <=", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameLike(String value) {
            addCriterion("CurrencyName like", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotLike(String value) {
            addCriterion("CurrencyName not like", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameIn(List<String> values) {
            addCriterion("CurrencyName in", values, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotIn(List<String> values) {
            addCriterion("CurrencyName not in", values, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameBetween(String value1, String value2) {
            addCriterion("CurrencyName between", value1, value2, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotBetween(String value1, String value2) {
            addCriterion("CurrencyName not between", value1, value2, "currencyname");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("ShortName is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("ShortName is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("ShortName =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("ShortName <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("ShortName >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("ShortName >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("ShortName <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("ShortName <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("ShortName like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("ShortName not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("ShortName in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("ShortName not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("ShortName between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("ShortName not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNull() {
            addCriterion("EngName is null");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNotNull() {
            addCriterion("EngName is not null");
            return (Criteria) this;
        }

        public Criteria andEngnameEqualTo(String value) {
            addCriterion("EngName =", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotEqualTo(String value) {
            addCriterion("EngName <>", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThan(String value) {
            addCriterion("EngName >", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("EngName >=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThan(String value) {
            addCriterion("EngName <", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThanOrEqualTo(String value) {
            addCriterion("EngName <=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLike(String value) {
            addCriterion("EngName like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotLike(String value) {
            addCriterion("EngName not like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameIn(List<String> values) {
            addCriterion("EngName in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotIn(List<String> values) {
            addCriterion("EngName not in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameBetween(String value1, String value2) {
            addCriterion("EngName between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotBetween(String value1, String value2) {
            addCriterion("EngName not between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("ModifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("ModifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterionForJDBCDate("ModifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterionForJDBCDate("ModifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterionForJDBCDate("ModifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ModifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ModifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ModifyDate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andFixedrateIsNull() {
            addCriterion("FixedRate is null");
            return (Criteria) this;
        }

        public Criteria andFixedrateIsNotNull() {
            addCriterion("FixedRate is not null");
            return (Criteria) this;
        }

        public Criteria andFixedrateEqualTo(Double value) {
            addCriterion("FixedRate =", value, "fixedrate");
            return (Criteria) this;
        }

        public Criteria andFixedrateNotEqualTo(Double value) {
            addCriterion("FixedRate <>", value, "fixedrate");
            return (Criteria) this;
        }

        public Criteria andFixedrateGreaterThan(Double value) {
            addCriterion("FixedRate >", value, "fixedrate");
            return (Criteria) this;
        }

        public Criteria andFixedrateGreaterThanOrEqualTo(Double value) {
            addCriterion("FixedRate >=", value, "fixedrate");
            return (Criteria) this;
        }

        public Criteria andFixedrateLessThan(Double value) {
            addCriterion("FixedRate <", value, "fixedrate");
            return (Criteria) this;
        }

        public Criteria andFixedrateLessThanOrEqualTo(Double value) {
            addCriterion("FixedRate <=", value, "fixedrate");
            return (Criteria) this;
        }

        public Criteria andFixedrateIn(List<Double> values) {
            addCriterion("FixedRate in", values, "fixedrate");
            return (Criteria) this;
        }

        public Criteria andFixedrateNotIn(List<Double> values) {
            addCriterion("FixedRate not in", values, "fixedrate");
            return (Criteria) this;
        }

        public Criteria andFixedrateBetween(Double value1, Double value2) {
            addCriterion("FixedRate between", value1, value2, "fixedrate");
            return (Criteria) this;
        }

        public Criteria andFixedrateNotBetween(Double value1, Double value2) {
            addCriterion("FixedRate not between", value1, value2, "fixedrate");
            return (Criteria) this;
        }

        public Criteria andBuyinrateIsNull() {
            addCriterion("BuyInRate is null");
            return (Criteria) this;
        }

        public Criteria andBuyinrateIsNotNull() {
            addCriterion("BuyInRate is not null");
            return (Criteria) this;
        }

        public Criteria andBuyinrateEqualTo(Double value) {
            addCriterion("BuyInRate =", value, "buyinrate");
            return (Criteria) this;
        }

        public Criteria andBuyinrateNotEqualTo(Double value) {
            addCriterion("BuyInRate <>", value, "buyinrate");
            return (Criteria) this;
        }

        public Criteria andBuyinrateGreaterThan(Double value) {
            addCriterion("BuyInRate >", value, "buyinrate");
            return (Criteria) this;
        }

        public Criteria andBuyinrateGreaterThanOrEqualTo(Double value) {
            addCriterion("BuyInRate >=", value, "buyinrate");
            return (Criteria) this;
        }

        public Criteria andBuyinrateLessThan(Double value) {
            addCriterion("BuyInRate <", value, "buyinrate");
            return (Criteria) this;
        }

        public Criteria andBuyinrateLessThanOrEqualTo(Double value) {
            addCriterion("BuyInRate <=", value, "buyinrate");
            return (Criteria) this;
        }

        public Criteria andBuyinrateIn(List<Double> values) {
            addCriterion("BuyInRate in", values, "buyinrate");
            return (Criteria) this;
        }

        public Criteria andBuyinrateNotIn(List<Double> values) {
            addCriterion("BuyInRate not in", values, "buyinrate");
            return (Criteria) this;
        }

        public Criteria andBuyinrateBetween(Double value1, Double value2) {
            addCriterion("BuyInRate between", value1, value2, "buyinrate");
            return (Criteria) this;
        }

        public Criteria andBuyinrateNotBetween(Double value1, Double value2) {
            addCriterion("BuyInRate not between", value1, value2, "buyinrate");
            return (Criteria) this;
        }

        public Criteria andSelloutrateIsNull() {
            addCriterion("SellOutRate is null");
            return (Criteria) this;
        }

        public Criteria andSelloutrateIsNotNull() {
            addCriterion("SellOutRate is not null");
            return (Criteria) this;
        }

        public Criteria andSelloutrateEqualTo(Double value) {
            addCriterion("SellOutRate =", value, "selloutrate");
            return (Criteria) this;
        }

        public Criteria andSelloutrateNotEqualTo(Double value) {
            addCriterion("SellOutRate <>", value, "selloutrate");
            return (Criteria) this;
        }

        public Criteria andSelloutrateGreaterThan(Double value) {
            addCriterion("SellOutRate >", value, "selloutrate");
            return (Criteria) this;
        }

        public Criteria andSelloutrateGreaterThanOrEqualTo(Double value) {
            addCriterion("SellOutRate >=", value, "selloutrate");
            return (Criteria) this;
        }

        public Criteria andSelloutrateLessThan(Double value) {
            addCriterion("SellOutRate <", value, "selloutrate");
            return (Criteria) this;
        }

        public Criteria andSelloutrateLessThanOrEqualTo(Double value) {
            addCriterion("SellOutRate <=", value, "selloutrate");
            return (Criteria) this;
        }

        public Criteria andSelloutrateIn(List<Double> values) {
            addCriterion("SellOutRate in", values, "selloutrate");
            return (Criteria) this;
        }

        public Criteria andSelloutrateNotIn(List<Double> values) {
            addCriterion("SellOutRate not in", values, "selloutrate");
            return (Criteria) this;
        }

        public Criteria andSelloutrateBetween(Double value1, Double value2) {
            addCriterion("SellOutRate between", value1, value2, "selloutrate");
            return (Criteria) this;
        }

        public Criteria andSelloutrateNotBetween(Double value1, Double value2) {
            addCriterion("SellOutRate not between", value1, value2, "selloutrate");
            return (Criteria) this;
        }

        public Criteria andPricedecidigitsIsNull() {
            addCriterion("PriceDeciDigits is null");
            return (Criteria) this;
        }

        public Criteria andPricedecidigitsIsNotNull() {
            addCriterion("PriceDeciDigits is not null");
            return (Criteria) this;
        }

        public Criteria andPricedecidigitsEqualTo(String value) {
            addCriterion("PriceDeciDigits =", value, "pricedecidigits");
            return (Criteria) this;
        }

        public Criteria andPricedecidigitsNotEqualTo(String value) {
            addCriterion("PriceDeciDigits <>", value, "pricedecidigits");
            return (Criteria) this;
        }

        public Criteria andPricedecidigitsGreaterThan(String value) {
            addCriterion("PriceDeciDigits >", value, "pricedecidigits");
            return (Criteria) this;
        }

        public Criteria andPricedecidigitsGreaterThanOrEqualTo(String value) {
            addCriterion("PriceDeciDigits >=", value, "pricedecidigits");
            return (Criteria) this;
        }

        public Criteria andPricedecidigitsLessThan(String value) {
            addCriterion("PriceDeciDigits <", value, "pricedecidigits");
            return (Criteria) this;
        }

        public Criteria andPricedecidigitsLessThanOrEqualTo(String value) {
            addCriterion("PriceDeciDigits <=", value, "pricedecidigits");
            return (Criteria) this;
        }

        public Criteria andPricedecidigitsLike(String value) {
            addCriterion("PriceDeciDigits like", value, "pricedecidigits");
            return (Criteria) this;
        }

        public Criteria andPricedecidigitsNotLike(String value) {
            addCriterion("PriceDeciDigits not like", value, "pricedecidigits");
            return (Criteria) this;
        }

        public Criteria andPricedecidigitsIn(List<String> values) {
            addCriterion("PriceDeciDigits in", values, "pricedecidigits");
            return (Criteria) this;
        }

        public Criteria andPricedecidigitsNotIn(List<String> values) {
            addCriterion("PriceDeciDigits not in", values, "pricedecidigits");
            return (Criteria) this;
        }

        public Criteria andPricedecidigitsBetween(String value1, String value2) {
            addCriterion("PriceDeciDigits between", value1, value2, "pricedecidigits");
            return (Criteria) this;
        }

        public Criteria andPricedecidigitsNotBetween(String value1, String value2) {
            addCriterion("PriceDeciDigits not between", value1, value2, "pricedecidigits");
            return (Criteria) this;
        }

        public Criteria andAmountdecidigitsIsNull() {
            addCriterion("AmountDeciDigits is null");
            return (Criteria) this;
        }

        public Criteria andAmountdecidigitsIsNotNull() {
            addCriterion("AmountDeciDigits is not null");
            return (Criteria) this;
        }

        public Criteria andAmountdecidigitsEqualTo(String value) {
            addCriterion("AmountDeciDigits =", value, "amountdecidigits");
            return (Criteria) this;
        }

        public Criteria andAmountdecidigitsNotEqualTo(String value) {
            addCriterion("AmountDeciDigits <>", value, "amountdecidigits");
            return (Criteria) this;
        }

        public Criteria andAmountdecidigitsGreaterThan(String value) {
            addCriterion("AmountDeciDigits >", value, "amountdecidigits");
            return (Criteria) this;
        }

        public Criteria andAmountdecidigitsGreaterThanOrEqualTo(String value) {
            addCriterion("AmountDeciDigits >=", value, "amountdecidigits");
            return (Criteria) this;
        }

        public Criteria andAmountdecidigitsLessThan(String value) {
            addCriterion("AmountDeciDigits <", value, "amountdecidigits");
            return (Criteria) this;
        }

        public Criteria andAmountdecidigitsLessThanOrEqualTo(String value) {
            addCriterion("AmountDeciDigits <=", value, "amountdecidigits");
            return (Criteria) this;
        }

        public Criteria andAmountdecidigitsLike(String value) {
            addCriterion("AmountDeciDigits like", value, "amountdecidigits");
            return (Criteria) this;
        }

        public Criteria andAmountdecidigitsNotLike(String value) {
            addCriterion("AmountDeciDigits not like", value, "amountdecidigits");
            return (Criteria) this;
        }

        public Criteria andAmountdecidigitsIn(List<String> values) {
            addCriterion("AmountDeciDigits in", values, "amountdecidigits");
            return (Criteria) this;
        }

        public Criteria andAmountdecidigitsNotIn(List<String> values) {
            addCriterion("AmountDeciDigits not in", values, "amountdecidigits");
            return (Criteria) this;
        }

        public Criteria andAmountdecidigitsBetween(String value1, String value2) {
            addCriterion("AmountDeciDigits between", value1, value2, "amountdecidigits");
            return (Criteria) this;
        }

        public Criteria andAmountdecidigitsNotBetween(String value1, String value2) {
            addCriterion("AmountDeciDigits not between", value1, value2, "amountdecidigits");
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