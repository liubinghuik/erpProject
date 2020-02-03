package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomermasterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomermasterExample() {
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

        public Criteria andCmidIsNull() {
            addCriterion("Cmid is null");
            return (Criteria) this;
        }

        public Criteria andCmidIsNotNull() {
            addCriterion("Cmid is not null");
            return (Criteria) this;
        }

        public Criteria andCmidEqualTo(Integer value) {
            addCriterion("Cmid =", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotEqualTo(Integer value) {
            addCriterion("Cmid <>", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidGreaterThan(Integer value) {
            addCriterion("Cmid >", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Cmid >=", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidLessThan(Integer value) {
            addCriterion("Cmid <", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidLessThanOrEqualTo(Integer value) {
            addCriterion("Cmid <=", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidIn(List<Integer> values) {
            addCriterion("Cmid in", values, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotIn(List<Integer> values) {
            addCriterion("Cmid not in", values, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidBetween(Integer value1, Integer value2) {
            addCriterion("Cmid between", value1, value2, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotBetween(Integer value1, Integer value2) {
            addCriterion("Cmid not between", value1, value2, "cmid");
            return (Criteria) this;
        }

        public Criteria andFundsattributionIsNull() {
            addCriterion("FundsAttribution is null");
            return (Criteria) this;
        }

        public Criteria andFundsattributionIsNotNull() {
            addCriterion("FundsAttribution is not null");
            return (Criteria) this;
        }

        public Criteria andFundsattributionEqualTo(String value) {
            addCriterion("FundsAttribution =", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionNotEqualTo(String value) {
            addCriterion("FundsAttribution <>", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionGreaterThan(String value) {
            addCriterion("FundsAttribution >", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionGreaterThanOrEqualTo(String value) {
            addCriterion("FundsAttribution >=", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionLessThan(String value) {
            addCriterion("FundsAttribution <", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionLessThanOrEqualTo(String value) {
            addCriterion("FundsAttribution <=", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionLike(String value) {
            addCriterion("FundsAttribution like", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionNotLike(String value) {
            addCriterion("FundsAttribution not like", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionIn(List<String> values) {
            addCriterion("FundsAttribution in", values, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionNotIn(List<String> values) {
            addCriterion("FundsAttribution not in", values, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionBetween(String value1, String value2) {
            addCriterion("FundsAttribution between", value1, value2, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionNotBetween(String value1, String value2) {
            addCriterion("FundsAttribution not between", value1, value2, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNull() {
            addCriterion("FullName is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("FullName is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("FullName =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("FullName <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("FullName >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("FullName >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("FullName <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("FullName <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("FullName like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("FullName not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("FullName in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("FullName not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("FullName between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("FullName not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("ClassID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("ClassID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(String value) {
            addCriterion("ClassID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(String value) {
            addCriterion("ClassID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(String value) {
            addCriterion("ClassID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(String value) {
            addCriterion("ClassID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(String value) {
            addCriterion("ClassID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(String value) {
            addCriterion("ClassID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLike(String value) {
            addCriterion("ClassID like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotLike(String value) {
            addCriterion("ClassID not like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<String> values) {
            addCriterion("ClassID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<String> values) {
            addCriterion("ClassID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(String value1, String value2) {
            addCriterion("ClassID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(String value1, String value2) {
            addCriterion("ClassID not between", value1, value2, "classid");
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

        public Criteria andSareaIsNull() {
            addCriterion("Sarea is null");
            return (Criteria) this;
        }

        public Criteria andSareaIsNotNull() {
            addCriterion("Sarea is not null");
            return (Criteria) this;
        }

        public Criteria andSareaEqualTo(String value) {
            addCriterion("Sarea =", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaNotEqualTo(String value) {
            addCriterion("Sarea <>", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaGreaterThan(String value) {
            addCriterion("Sarea >", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaGreaterThanOrEqualTo(String value) {
            addCriterion("Sarea >=", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaLessThan(String value) {
            addCriterion("Sarea <", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaLessThanOrEqualTo(String value) {
            addCriterion("Sarea <=", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaLike(String value) {
            addCriterion("Sarea like", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaNotLike(String value) {
            addCriterion("Sarea not like", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaIn(List<String> values) {
            addCriterion("Sarea in", values, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaNotIn(List<String> values) {
            addCriterion("Sarea not in", values, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaBetween(String value1, String value2) {
            addCriterion("Sarea between", value1, value2, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaNotBetween(String value1, String value2) {
            addCriterion("Sarea not between", value1, value2, "sarea");
            return (Criteria) this;
        }

        public Criteria andEngfullnameIsNull() {
            addCriterion("EngFullName is null");
            return (Criteria) this;
        }

        public Criteria andEngfullnameIsNotNull() {
            addCriterion("EngFullName is not null");
            return (Criteria) this;
        }

        public Criteria andEngfullnameEqualTo(String value) {
            addCriterion("EngFullName =", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameNotEqualTo(String value) {
            addCriterion("EngFullName <>", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameGreaterThan(String value) {
            addCriterion("EngFullName >", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameGreaterThanOrEqualTo(String value) {
            addCriterion("EngFullName >=", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameLessThan(String value) {
            addCriterion("EngFullName <", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameLessThanOrEqualTo(String value) {
            addCriterion("EngFullName <=", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameLike(String value) {
            addCriterion("EngFullName like", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameNotLike(String value) {
            addCriterion("EngFullName not like", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameIn(List<String> values) {
            addCriterion("EngFullName in", values, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameNotIn(List<String> values) {
            addCriterion("EngFullName not in", values, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameBetween(String value1, String value2) {
            addCriterion("EngFullName between", value1, value2, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameNotBetween(String value1, String value2) {
            addCriterion("EngFullName not between", value1, value2, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameIsNull() {
            addCriterion("EngShortName is null");
            return (Criteria) this;
        }

        public Criteria andEngshortnameIsNotNull() {
            addCriterion("EngShortName is not null");
            return (Criteria) this;
        }

        public Criteria andEngshortnameEqualTo(String value) {
            addCriterion("EngShortName =", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameNotEqualTo(String value) {
            addCriterion("EngShortName <>", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameGreaterThan(String value) {
            addCriterion("EngShortName >", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("EngShortName >=", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameLessThan(String value) {
            addCriterion("EngShortName <", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameLessThanOrEqualTo(String value) {
            addCriterion("EngShortName <=", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameLike(String value) {
            addCriterion("EngShortName like", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameNotLike(String value) {
            addCriterion("EngShortName not like", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameIn(List<String> values) {
            addCriterion("EngShortName in", values, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameNotIn(List<String> values) {
            addCriterion("EngShortName not in", values, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameBetween(String value1, String value2) {
            addCriterion("EngShortName between", value1, value2, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameNotBetween(String value1, String value2) {
            addCriterion("EngShortName not between", value1, value2, "engshortname");
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

        public Criteria andChiefnameIsNull() {
            addCriterion("ChiefName is null");
            return (Criteria) this;
        }

        public Criteria andChiefnameIsNotNull() {
            addCriterion("ChiefName is not null");
            return (Criteria) this;
        }

        public Criteria andChiefnameEqualTo(String value) {
            addCriterion("ChiefName =", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameNotEqualTo(String value) {
            addCriterion("ChiefName <>", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameGreaterThan(String value) {
            addCriterion("ChiefName >", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameGreaterThanOrEqualTo(String value) {
            addCriterion("ChiefName >=", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameLessThan(String value) {
            addCriterion("ChiefName <", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameLessThanOrEqualTo(String value) {
            addCriterion("ChiefName <=", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameLike(String value) {
            addCriterion("ChiefName like", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameNotLike(String value) {
            addCriterion("ChiefName not like", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameIn(List<String> values) {
            addCriterion("ChiefName in", values, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameNotIn(List<String> values) {
            addCriterion("ChiefName not in", values, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameBetween(String value1, String value2) {
            addCriterion("ChiefName between", value1, value2, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameNotBetween(String value1, String value2) {
            addCriterion("ChiefName not between", value1, value2, "chiefname");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("LinkMan is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("LinkMan is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("LinkMan =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("LinkMan <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("LinkMan >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("LinkMan >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("LinkMan <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("LinkMan <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("LinkMan like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("LinkMan not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("LinkMan in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("LinkMan not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("LinkMan between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("LinkMan not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNull() {
            addCriterion("PersonID is null");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNotNull() {
            addCriterion("PersonID is not null");
            return (Criteria) this;
        }

        public Criteria andPersonidEqualTo(String value) {
            addCriterion("PersonID =", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotEqualTo(String value) {
            addCriterion("PersonID <>", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThan(String value) {
            addCriterion("PersonID >", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThanOrEqualTo(String value) {
            addCriterion("PersonID >=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThan(String value) {
            addCriterion("PersonID <", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThanOrEqualTo(String value) {
            addCriterion("PersonID <=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLike(String value) {
            addCriterion("PersonID like", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotLike(String value) {
            addCriterion("PersonID not like", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidIn(List<String> values) {
            addCriterion("PersonID in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotIn(List<String> values) {
            addCriterion("PersonID not in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidBetween(String value1, String value2) {
            addCriterion("PersonID between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotBetween(String value1, String value2) {
            addCriterion("PersonID not between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andTaxnoIsNull() {
            addCriterion("TaxNo is null");
            return (Criteria) this;
        }

        public Criteria andTaxnoIsNotNull() {
            addCriterion("TaxNo is not null");
            return (Criteria) this;
        }

        public Criteria andTaxnoEqualTo(String value) {
            addCriterion("TaxNo =", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotEqualTo(String value) {
            addCriterion("TaxNo <>", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoGreaterThan(String value) {
            addCriterion("TaxNo >", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("TaxNo >=", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLessThan(String value) {
            addCriterion("TaxNo <", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLessThanOrEqualTo(String value) {
            addCriterion("TaxNo <=", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLike(String value) {
            addCriterion("TaxNo like", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotLike(String value) {
            addCriterion("TaxNo not like", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoIn(List<String> values) {
            addCriterion("TaxNo in", values, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotIn(List<String> values) {
            addCriterion("TaxNo not in", values, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoBetween(String value1, String value2) {
            addCriterion("TaxNo between", value1, value2, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotBetween(String value1, String value2) {
            addCriterion("TaxNo not between", value1, value2, "taxno");
            return (Criteria) this;
        }

        public Criteria andCapitalizationIsNull() {
            addCriterion("Capitalization is null");
            return (Criteria) this;
        }

        public Criteria andCapitalizationIsNotNull() {
            addCriterion("Capitalization is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalizationEqualTo(Double value) {
            addCriterion("Capitalization =", value, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationNotEqualTo(Double value) {
            addCriterion("Capitalization <>", value, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationGreaterThan(Double value) {
            addCriterion("Capitalization >", value, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationGreaterThanOrEqualTo(Double value) {
            addCriterion("Capitalization >=", value, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationLessThan(Double value) {
            addCriterion("Capitalization <", value, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationLessThanOrEqualTo(Double value) {
            addCriterion("Capitalization <=", value, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationIn(List<Double> values) {
            addCriterion("Capitalization in", values, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationNotIn(List<Double> values) {
            addCriterion("Capitalization not in", values, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationBetween(Double value1, Double value2) {
            addCriterion("Capitalization between", value1, value2, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationNotBetween(Double value1, Double value2) {
            addCriterion("Capitalization not between", value1, value2, "capitalization");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassIsNull() {
            addCriterion("IndustrialClass is null");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassIsNotNull() {
            addCriterion("IndustrialClass is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassEqualTo(String value) {
            addCriterion("IndustrialClass =", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassNotEqualTo(String value) {
            addCriterion("IndustrialClass <>", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassGreaterThan(String value) {
            addCriterion("IndustrialClass >", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassGreaterThanOrEqualTo(String value) {
            addCriterion("IndustrialClass >=", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassLessThan(String value) {
            addCriterion("IndustrialClass <", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassLessThanOrEqualTo(String value) {
            addCriterion("IndustrialClass <=", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassLike(String value) {
            addCriterion("IndustrialClass like", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassNotLike(String value) {
            addCriterion("IndustrialClass not like", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassIn(List<String> values) {
            addCriterion("IndustrialClass in", values, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassNotIn(List<String> values) {
            addCriterion("IndustrialClass not in", values, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassBetween(String value1, String value2) {
            addCriterion("IndustrialClass between", value1, value2, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassNotBetween(String value1, String value2) {
            addCriterion("IndustrialClass not between", value1, value2, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andWebaddressIsNull() {
            addCriterion("WebAddress is null");
            return (Criteria) this;
        }

        public Criteria andWebaddressIsNotNull() {
            addCriterion("WebAddress is not null");
            return (Criteria) this;
        }

        public Criteria andWebaddressEqualTo(String value) {
            addCriterion("WebAddress =", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressNotEqualTo(String value) {
            addCriterion("WebAddress <>", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressGreaterThan(String value) {
            addCriterion("WebAddress >", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressGreaterThanOrEqualTo(String value) {
            addCriterion("WebAddress >=", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressLessThan(String value) {
            addCriterion("WebAddress <", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressLessThanOrEqualTo(String value) {
            addCriterion("WebAddress <=", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressLike(String value) {
            addCriterion("WebAddress like", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressNotLike(String value) {
            addCriterion("WebAddress not like", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressIn(List<String> values) {
            addCriterion("WebAddress in", values, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressNotIn(List<String> values) {
            addCriterion("WebAddress not in", values, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressBetween(String value1, String value2) {
            addCriterion("WebAddress between", value1, value2, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressNotBetween(String value1, String value2) {
            addCriterion("WebAddress not between", value1, value2, "webaddress");
            return (Criteria) this;
        }

        public Criteria andFaxnoIsNull() {
            addCriterion("FaxNo is null");
            return (Criteria) this;
        }

        public Criteria andFaxnoIsNotNull() {
            addCriterion("FaxNo is not null");
            return (Criteria) this;
        }

        public Criteria andFaxnoEqualTo(String value) {
            addCriterion("FaxNo =", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoNotEqualTo(String value) {
            addCriterion("FaxNo <>", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoGreaterThan(String value) {
            addCriterion("FaxNo >", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("FaxNo >=", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoLessThan(String value) {
            addCriterion("FaxNo <", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoLessThanOrEqualTo(String value) {
            addCriterion("FaxNo <=", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoLike(String value) {
            addCriterion("FaxNo like", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoNotLike(String value) {
            addCriterion("FaxNo not like", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoIn(List<String> values) {
            addCriterion("FaxNo in", values, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoNotIn(List<String> values) {
            addCriterion("FaxNo not in", values, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoBetween(String value1, String value2) {
            addCriterion("FaxNo between", value1, value2, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoNotBetween(String value1, String value2) {
            addCriterion("FaxNo not between", value1, value2, "faxno");
            return (Criteria) this;
        }

        public Criteria andTelephone1IsNull() {
            addCriterion("Telephone1 is null");
            return (Criteria) this;
        }

        public Criteria andTelephone1IsNotNull() {
            addCriterion("Telephone1 is not null");
            return (Criteria) this;
        }

        public Criteria andTelephone1EqualTo(String value) {
            addCriterion("Telephone1 =", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1NotEqualTo(String value) {
            addCriterion("Telephone1 <>", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1GreaterThan(String value) {
            addCriterion("Telephone1 >", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1GreaterThanOrEqualTo(String value) {
            addCriterion("Telephone1 >=", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1LessThan(String value) {
            addCriterion("Telephone1 <", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1LessThanOrEqualTo(String value) {
            addCriterion("Telephone1 <=", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1Like(String value) {
            addCriterion("Telephone1 like", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1NotLike(String value) {
            addCriterion("Telephone1 not like", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1In(List<String> values) {
            addCriterion("Telephone1 in", values, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1NotIn(List<String> values) {
            addCriterion("Telephone1 not in", values, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1Between(String value1, String value2) {
            addCriterion("Telephone1 between", value1, value2, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1NotBetween(String value1, String value2) {
            addCriterion("Telephone1 not between", value1, value2, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone2IsNull() {
            addCriterion("Telephone2 is null");
            return (Criteria) this;
        }

        public Criteria andTelephone2IsNotNull() {
            addCriterion("Telephone2 is not null");
            return (Criteria) this;
        }

        public Criteria andTelephone2EqualTo(String value) {
            addCriterion("Telephone2 =", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotEqualTo(String value) {
            addCriterion("Telephone2 <>", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2GreaterThan(String value) {
            addCriterion("Telephone2 >", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2GreaterThanOrEqualTo(String value) {
            addCriterion("Telephone2 >=", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2LessThan(String value) {
            addCriterion("Telephone2 <", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2LessThanOrEqualTo(String value) {
            addCriterion("Telephone2 <=", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2Like(String value) {
            addCriterion("Telephone2 like", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotLike(String value) {
            addCriterion("Telephone2 not like", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2In(List<String> values) {
            addCriterion("Telephone2 in", values, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotIn(List<String> values) {
            addCriterion("Telephone2 not in", values, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2Between(String value1, String value2) {
            addCriterion("Telephone2 between", value1, value2, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotBetween(String value1, String value2) {
            addCriterion("Telephone2 not between", value1, value2, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone3IsNull() {
            addCriterion("Telephone3 is null");
            return (Criteria) this;
        }

        public Criteria andTelephone3IsNotNull() {
            addCriterion("Telephone3 is not null");
            return (Criteria) this;
        }

        public Criteria andTelephone3EqualTo(String value) {
            addCriterion("Telephone3 =", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3NotEqualTo(String value) {
            addCriterion("Telephone3 <>", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3GreaterThan(String value) {
            addCriterion("Telephone3 >", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3GreaterThanOrEqualTo(String value) {
            addCriterion("Telephone3 >=", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3LessThan(String value) {
            addCriterion("Telephone3 <", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3LessThanOrEqualTo(String value) {
            addCriterion("Telephone3 <=", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3Like(String value) {
            addCriterion("Telephone3 like", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3NotLike(String value) {
            addCriterion("Telephone3 not like", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3In(List<String> values) {
            addCriterion("Telephone3 in", values, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3NotIn(List<String> values) {
            addCriterion("Telephone3 not in", values, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3Between(String value1, String value2) {
            addCriterion("Telephone3 between", value1, value2, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3NotBetween(String value1, String value2) {
            addCriterion("Telephone3 not between", value1, value2, "telephone3");
            return (Criteria) this;
        }

        public Criteria andMobiletelIsNull() {
            addCriterion("MobileTel is null");
            return (Criteria) this;
        }

        public Criteria andMobiletelIsNotNull() {
            addCriterion("MobileTel is not null");
            return (Criteria) this;
        }

        public Criteria andMobiletelEqualTo(String value) {
            addCriterion("MobileTel =", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelNotEqualTo(String value) {
            addCriterion("MobileTel <>", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelGreaterThan(String value) {
            addCriterion("MobileTel >", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelGreaterThanOrEqualTo(String value) {
            addCriterion("MobileTel >=", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelLessThan(String value) {
            addCriterion("MobileTel <", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelLessThanOrEqualTo(String value) {
            addCriterion("MobileTel <=", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelLike(String value) {
            addCriterion("MobileTel like", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelNotLike(String value) {
            addCriterion("MobileTel not like", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelIn(List<String> values) {
            addCriterion("MobileTel in", values, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelNotIn(List<String> values) {
            addCriterion("MobileTel not in", values, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelBetween(String value1, String value2) {
            addCriterion("MobileTel between", value1, value2, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelNotBetween(String value1, String value2) {
            addCriterion("MobileTel not between", value1, value2, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNull() {
            addCriterion("BankAccount is null");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNotNull() {
            addCriterion("BankAccount is not null");
            return (Criteria) this;
        }

        public Criteria andBankaccountEqualTo(String value) {
            addCriterion("BankAccount =", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotEqualTo(String value) {
            addCriterion("BankAccount <>", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThan(String value) {
            addCriterion("BankAccount >", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("BankAccount >=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThan(String value) {
            addCriterion("BankAccount <", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThanOrEqualTo(String value) {
            addCriterion("BankAccount <=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLike(String value) {
            addCriterion("BankAccount like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotLike(String value) {
            addCriterion("BankAccount not like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountIn(List<String> values) {
            addCriterion("BankAccount in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotIn(List<String> values) {
            addCriterion("BankAccount not in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountBetween(String value1, String value2) {
            addCriterion("BankAccount between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotBetween(String value1, String value2) {
            addCriterion("BankAccount not between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("BankID is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("BankID is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(String value) {
            addCriterion("BankID =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(String value) {
            addCriterion("BankID <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(String value) {
            addCriterion("BankID >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(String value) {
            addCriterion("BankID >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(String value) {
            addCriterion("BankID <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(String value) {
            addCriterion("BankID <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLike(String value) {
            addCriterion("BankID like", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotLike(String value) {
            addCriterion("BankID not like", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<String> values) {
            addCriterion("BankID in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<String> values) {
            addCriterion("BankID not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(String value1, String value2) {
            addCriterion("BankID between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(String value1, String value2) {
            addCriterion("BankID not between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateIsNull() {
            addCriterion("EarliestTradeDate is null");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateIsNotNull() {
            addCriterion("EarliestTradeDate is not null");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateEqualTo(Date value) {
            addCriterionForJDBCDate("EarliestTradeDate =", value, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EarliestTradeDate <>", value, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateGreaterThan(Date value) {
            addCriterionForJDBCDate("EarliestTradeDate >", value, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EarliestTradeDate >=", value, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateLessThan(Date value) {
            addCriterionForJDBCDate("EarliestTradeDate <", value, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EarliestTradeDate <=", value, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateIn(List<Date> values) {
            addCriterionForJDBCDate("EarliestTradeDate in", values, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EarliestTradeDate not in", values, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EarliestTradeDate between", value1, value2, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EarliestTradeDate not between", value1, value2, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateIsNull() {
            addCriterion("FirstTradeDate is null");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateIsNotNull() {
            addCriterion("FirstTradeDate is not null");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateEqualTo(Date value) {
            addCriterionForJDBCDate("FirstTradeDate =", value, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FirstTradeDate <>", value, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateGreaterThan(Date value) {
            addCriterionForJDBCDate("FirstTradeDate >", value, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FirstTradeDate >=", value, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateLessThan(Date value) {
            addCriterionForJDBCDate("FirstTradeDate <", value, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FirstTradeDate <=", value, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateIn(List<Date> values) {
            addCriterionForJDBCDate("FirstTradeDate in", values, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FirstTradeDate not in", values, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FirstTradeDate between", value1, value2, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FirstTradeDate not between", value1, value2, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andLatelytradeturndateIsNull() {
            addCriterion("LatelyTradeturnDate is null");
            return (Criteria) this;
        }

        public Criteria andLatelytradeturndateIsNotNull() {
            addCriterion("LatelyTradeturnDate is not null");
            return (Criteria) this;
        }

        public Criteria andLatelytradeturndateEqualTo(Date value) {
            addCriterionForJDBCDate("LatelyTradeturnDate =", value, "latelytradeturndate");
            return (Criteria) this;
        }

        public Criteria andLatelytradeturndateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LatelyTradeturnDate <>", value, "latelytradeturndate");
            return (Criteria) this;
        }

        public Criteria andLatelytradeturndateGreaterThan(Date value) {
            addCriterionForJDBCDate("LatelyTradeturnDate >", value, "latelytradeturndate");
            return (Criteria) this;
        }

        public Criteria andLatelytradeturndateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LatelyTradeturnDate >=", value, "latelytradeturndate");
            return (Criteria) this;
        }

        public Criteria andLatelytradeturndateLessThan(Date value) {
            addCriterionForJDBCDate("LatelyTradeturnDate <", value, "latelytradeturndate");
            return (Criteria) this;
        }

        public Criteria andLatelytradeturndateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LatelyTradeturnDate <=", value, "latelytradeturndate");
            return (Criteria) this;
        }

        public Criteria andLatelytradeturndateIn(List<Date> values) {
            addCriterionForJDBCDate("LatelyTradeturnDate in", values, "latelytradeturndate");
            return (Criteria) this;
        }

        public Criteria andLatelytradeturndateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LatelyTradeturnDate not in", values, "latelytradeturndate");
            return (Criteria) this;
        }

        public Criteria andLatelytradeturndateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LatelyTradeturnDate between", value1, value2, "latelytradeturndate");
            return (Criteria) this;
        }

        public Criteria andLatelytradeturndateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LatelyTradeturnDate not between", value1, value2, "latelytradeturndate");
            return (Criteria) this;
        }

        public Criteria andLatelyreturndateIsNull() {
            addCriterion("LatelyReturnDate is null");
            return (Criteria) this;
        }

        public Criteria andLatelyreturndateIsNotNull() {
            addCriterion("LatelyReturnDate is not null");
            return (Criteria) this;
        }

        public Criteria andLatelyreturndateEqualTo(Date value) {
            addCriterionForJDBCDate("LatelyReturnDate =", value, "latelyreturndate");
            return (Criteria) this;
        }

        public Criteria andLatelyreturndateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LatelyReturnDate <>", value, "latelyreturndate");
            return (Criteria) this;
        }

        public Criteria andLatelyreturndateGreaterThan(Date value) {
            addCriterionForJDBCDate("LatelyReturnDate >", value, "latelyreturndate");
            return (Criteria) this;
        }

        public Criteria andLatelyreturndateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LatelyReturnDate >=", value, "latelyreturndate");
            return (Criteria) this;
        }

        public Criteria andLatelyreturndateLessThan(Date value) {
            addCriterionForJDBCDate("LatelyReturnDate <", value, "latelyreturndate");
            return (Criteria) this;
        }

        public Criteria andLatelyreturndateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LatelyReturnDate <=", value, "latelyreturndate");
            return (Criteria) this;
        }

        public Criteria andLatelyreturndateIn(List<Date> values) {
            addCriterionForJDBCDate("LatelyReturnDate in", values, "latelyreturndate");
            return (Criteria) this;
        }

        public Criteria andLatelyreturndateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LatelyReturnDate not in", values, "latelyreturndate");
            return (Criteria) this;
        }

        public Criteria andLatelyreturndateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LatelyReturnDate between", value1, value2, "latelyreturndate");
            return (Criteria) this;
        }

        public Criteria andLatelyreturndateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LatelyReturnDate not between", value1, value2, "latelyreturndate");
            return (Criteria) this;
        }

        public Criteria andRateofdiscountIsNull() {
            addCriterion("RateOfDiscount is null");
            return (Criteria) this;
        }

        public Criteria andRateofdiscountIsNotNull() {
            addCriterion("RateOfDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andRateofdiscountEqualTo(Double value) {
            addCriterion("RateOfDiscount =", value, "rateofdiscount");
            return (Criteria) this;
        }

        public Criteria andRateofdiscountNotEqualTo(Double value) {
            addCriterion("RateOfDiscount <>", value, "rateofdiscount");
            return (Criteria) this;
        }

        public Criteria andRateofdiscountGreaterThan(Double value) {
            addCriterion("RateOfDiscount >", value, "rateofdiscount");
            return (Criteria) this;
        }

        public Criteria andRateofdiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("RateOfDiscount >=", value, "rateofdiscount");
            return (Criteria) this;
        }

        public Criteria andRateofdiscountLessThan(Double value) {
            addCriterion("RateOfDiscount <", value, "rateofdiscount");
            return (Criteria) this;
        }

        public Criteria andRateofdiscountLessThanOrEqualTo(Double value) {
            addCriterion("RateOfDiscount <=", value, "rateofdiscount");
            return (Criteria) this;
        }

        public Criteria andRateofdiscountIn(List<Double> values) {
            addCriterion("RateOfDiscount in", values, "rateofdiscount");
            return (Criteria) this;
        }

        public Criteria andRateofdiscountNotIn(List<Double> values) {
            addCriterion("RateOfDiscount not in", values, "rateofdiscount");
            return (Criteria) this;
        }

        public Criteria andRateofdiscountBetween(Double value1, Double value2) {
            addCriterion("RateOfDiscount between", value1, value2, "rateofdiscount");
            return (Criteria) this;
        }

        public Criteria andRateofdiscountNotBetween(Double value1, Double value2) {
            addCriterion("RateOfDiscount not between", value1, value2, "rateofdiscount");
            return (Criteria) this;
        }

        public Criteria andPricerankIsNull() {
            addCriterion("PriceRank is null");
            return (Criteria) this;
        }

        public Criteria andPricerankIsNotNull() {
            addCriterion("PriceRank is not null");
            return (Criteria) this;
        }

        public Criteria andPricerankEqualTo(Integer value) {
            addCriterion("PriceRank =", value, "pricerank");
            return (Criteria) this;
        }

        public Criteria andPricerankNotEqualTo(Integer value) {
            addCriterion("PriceRank <>", value, "pricerank");
            return (Criteria) this;
        }

        public Criteria andPricerankGreaterThan(Integer value) {
            addCriterion("PriceRank >", value, "pricerank");
            return (Criteria) this;
        }

        public Criteria andPricerankGreaterThanOrEqualTo(Integer value) {
            addCriterion("PriceRank >=", value, "pricerank");
            return (Criteria) this;
        }

        public Criteria andPricerankLessThan(Integer value) {
            addCriterion("PriceRank <", value, "pricerank");
            return (Criteria) this;
        }

        public Criteria andPricerankLessThanOrEqualTo(Integer value) {
            addCriterion("PriceRank <=", value, "pricerank");
            return (Criteria) this;
        }

        public Criteria andPricerankIn(List<Integer> values) {
            addCriterion("PriceRank in", values, "pricerank");
            return (Criteria) this;
        }

        public Criteria andPricerankNotIn(List<Integer> values) {
            addCriterion("PriceRank not in", values, "pricerank");
            return (Criteria) this;
        }

        public Criteria andPricerankBetween(Integer value1, Integer value2) {
            addCriterion("PriceRank between", value1, value2, "pricerank");
            return (Criteria) this;
        }

        public Criteria andPricerankNotBetween(Integer value1, Integer value2) {
            addCriterion("PriceRank not between", value1, value2, "pricerank");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxIsNull() {
            addCriterion("PriceofTax is null");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxIsNotNull() {
            addCriterion("PriceofTax is not null");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxEqualTo(Integer value) {
            addCriterion("PriceofTax =", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxNotEqualTo(Integer value) {
            addCriterion("PriceofTax <>", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxGreaterThan(Integer value) {
            addCriterion("PriceofTax >", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("PriceofTax >=", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxLessThan(Integer value) {
            addCriterion("PriceofTax <", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxLessThanOrEqualTo(Integer value) {
            addCriterion("PriceofTax <=", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxIn(List<Integer> values) {
            addCriterion("PriceofTax in", values, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxNotIn(List<Integer> values) {
            addCriterion("PriceofTax not in", values, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxBetween(Integer value1, Integer value2) {
            addCriterion("PriceofTax between", value1, value2, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxNotBetween(Integer value1, Integer value2) {
            addCriterion("PriceofTax not between", value1, value2, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andTransnewidIsNull() {
            addCriterion("TransNewID is null");
            return (Criteria) this;
        }

        public Criteria andTransnewidIsNotNull() {
            addCriterion("TransNewID is not null");
            return (Criteria) this;
        }

        public Criteria andTransnewidEqualTo(String value) {
            addCriterion("TransNewID =", value, "transnewid");
            return (Criteria) this;
        }

        public Criteria andTransnewidNotEqualTo(String value) {
            addCriterion("TransNewID <>", value, "transnewid");
            return (Criteria) this;
        }

        public Criteria andTransnewidGreaterThan(String value) {
            addCriterion("TransNewID >", value, "transnewid");
            return (Criteria) this;
        }

        public Criteria andTransnewidGreaterThanOrEqualTo(String value) {
            addCriterion("TransNewID >=", value, "transnewid");
            return (Criteria) this;
        }

        public Criteria andTransnewidLessThan(String value) {
            addCriterion("TransNewID <", value, "transnewid");
            return (Criteria) this;
        }

        public Criteria andTransnewidLessThanOrEqualTo(String value) {
            addCriterion("TransNewID <=", value, "transnewid");
            return (Criteria) this;
        }

        public Criteria andTransnewidLike(String value) {
            addCriterion("TransNewID like", value, "transnewid");
            return (Criteria) this;
        }

        public Criteria andTransnewidNotLike(String value) {
            addCriterion("TransNewID not like", value, "transnewid");
            return (Criteria) this;
        }

        public Criteria andTransnewidIn(List<String> values) {
            addCriterion("TransNewID in", values, "transnewid");
            return (Criteria) this;
        }

        public Criteria andTransnewidNotIn(List<String> values) {
            addCriterion("TransNewID not in", values, "transnewid");
            return (Criteria) this;
        }

        public Criteria andTransnewidBetween(String value1, String value2) {
            addCriterion("TransNewID between", value1, value2, "transnewid");
            return (Criteria) this;
        }

        public Criteria andTransnewidNotBetween(String value1, String value2) {
            addCriterion("TransNewID not between", value1, value2, "transnewid");
            return (Criteria) this;
        }

        public Criteria andBuildupdateIsNull() {
            addCriterion("BuildUpDate is null");
            return (Criteria) this;
        }

        public Criteria andBuildupdateIsNotNull() {
            addCriterion("BuildUpDate is not null");
            return (Criteria) this;
        }

        public Criteria andBuildupdateEqualTo(Date value) {
            addCriterionForJDBCDate("BuildUpDate =", value, "buildupdate");
            return (Criteria) this;
        }

        public Criteria andBuildupdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BuildUpDate <>", value, "buildupdate");
            return (Criteria) this;
        }

        public Criteria andBuildupdateGreaterThan(Date value) {
            addCriterionForJDBCDate("BuildUpDate >", value, "buildupdate");
            return (Criteria) this;
        }

        public Criteria andBuildupdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BuildUpDate >=", value, "buildupdate");
            return (Criteria) this;
        }

        public Criteria andBuildupdateLessThan(Date value) {
            addCriterionForJDBCDate("BuildUpDate <", value, "buildupdate");
            return (Criteria) this;
        }

        public Criteria andBuildupdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BuildUpDate <=", value, "buildupdate");
            return (Criteria) this;
        }

        public Criteria andBuildupdateIn(List<Date> values) {
            addCriterionForJDBCDate("BuildUpDate in", values, "buildupdate");
            return (Criteria) this;
        }

        public Criteria andBuildupdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BuildUpDate not in", values, "buildupdate");
            return (Criteria) this;
        }

        public Criteria andBuildupdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BuildUpDate between", value1, value2, "buildupdate");
            return (Criteria) this;
        }

        public Criteria andBuildupdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BuildUpDate not between", value1, value2, "buildupdate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateIsNull() {
            addCriterion("InvalidDate is null");
            return (Criteria) this;
        }

        public Criteria andInvaliddateIsNotNull() {
            addCriterion("InvalidDate is not null");
            return (Criteria) this;
        }

        public Criteria andInvaliddateEqualTo(Date value) {
            addCriterionForJDBCDate("InvalidDate =", value, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("InvalidDate <>", value, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateGreaterThan(Date value) {
            addCriterionForJDBCDate("InvalidDate >", value, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("InvalidDate >=", value, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateLessThan(Date value) {
            addCriterionForJDBCDate("InvalidDate <", value, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("InvalidDate <=", value, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateIn(List<Date> values) {
            addCriterionForJDBCDate("InvalidDate in", values, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("InvalidDate not in", values, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("InvalidDate between", value1, value2, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("InvalidDate not between", value1, value2, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andAmountquotaIsNull() {
            addCriterion("AmountQuota is null");
            return (Criteria) this;
        }

        public Criteria andAmountquotaIsNotNull() {
            addCriterion("AmountQuota is not null");
            return (Criteria) this;
        }

        public Criteria andAmountquotaEqualTo(Double value) {
            addCriterion("AmountQuota =", value, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaNotEqualTo(Double value) {
            addCriterion("AmountQuota <>", value, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaGreaterThan(Double value) {
            addCriterion("AmountQuota >", value, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaGreaterThanOrEqualTo(Double value) {
            addCriterion("AmountQuota >=", value, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaLessThan(Double value) {
            addCriterion("AmountQuota <", value, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaLessThanOrEqualTo(Double value) {
            addCriterion("AmountQuota <=", value, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaIn(List<Double> values) {
            addCriterion("AmountQuota in", values, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaNotIn(List<Double> values) {
            addCriterion("AmountQuota not in", values, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaBetween(Double value1, Double value2) {
            addCriterion("AmountQuota between", value1, value2, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaNotBetween(Double value1, Double value2) {
            addCriterion("AmountQuota not between", value1, value2, "amountquota");
            return (Criteria) this;
        }

        public Criteria andRemainquotaIsNull() {
            addCriterion("RemainQuota is null");
            return (Criteria) this;
        }

        public Criteria andRemainquotaIsNotNull() {
            addCriterion("RemainQuota is not null");
            return (Criteria) this;
        }

        public Criteria andRemainquotaEqualTo(Double value) {
            addCriterion("RemainQuota =", value, "remainquota");
            return (Criteria) this;
        }

        public Criteria andRemainquotaNotEqualTo(Double value) {
            addCriterion("RemainQuota <>", value, "remainquota");
            return (Criteria) this;
        }

        public Criteria andRemainquotaGreaterThan(Double value) {
            addCriterion("RemainQuota >", value, "remainquota");
            return (Criteria) this;
        }

        public Criteria andRemainquotaGreaterThanOrEqualTo(Double value) {
            addCriterion("RemainQuota >=", value, "remainquota");
            return (Criteria) this;
        }

        public Criteria andRemainquotaLessThan(Double value) {
            addCriterion("RemainQuota <", value, "remainquota");
            return (Criteria) this;
        }

        public Criteria andRemainquotaLessThanOrEqualTo(Double value) {
            addCriterion("RemainQuota <=", value, "remainquota");
            return (Criteria) this;
        }

        public Criteria andRemainquotaIn(List<Double> values) {
            addCriterion("RemainQuota in", values, "remainquota");
            return (Criteria) this;
        }

        public Criteria andRemainquotaNotIn(List<Double> values) {
            addCriterion("RemainQuota not in", values, "remainquota");
            return (Criteria) this;
        }

        public Criteria andRemainquotaBetween(Double value1, Double value2) {
            addCriterion("RemainQuota between", value1, value2, "remainquota");
            return (Criteria) this;
        }

        public Criteria andRemainquotaNotBetween(Double value1, Double value2) {
            addCriterion("RemainQuota not between", value1, value2, "remainquota");
            return (Criteria) this;
        }

        public Criteria andRecvwayIsNull() {
            addCriterion("RecvWay is null");
            return (Criteria) this;
        }

        public Criteria andRecvwayIsNotNull() {
            addCriterion("RecvWay is not null");
            return (Criteria) this;
        }

        public Criteria andRecvwayEqualTo(Integer value) {
            addCriterion("RecvWay =", value, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayNotEqualTo(Integer value) {
            addCriterion("RecvWay <>", value, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayGreaterThan(Integer value) {
            addCriterion("RecvWay >", value, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayGreaterThanOrEqualTo(Integer value) {
            addCriterion("RecvWay >=", value, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayLessThan(Integer value) {
            addCriterion("RecvWay <", value, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayLessThanOrEqualTo(Integer value) {
            addCriterion("RecvWay <=", value, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayIn(List<Integer> values) {
            addCriterion("RecvWay in", values, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayNotIn(List<Integer> values) {
            addCriterion("RecvWay not in", values, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayBetween(Integer value1, Integer value2) {
            addCriterion("RecvWay between", value1, value2, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayNotBetween(Integer value1, Integer value2) {
            addCriterion("RecvWay not between", value1, value2, "recvway");
            return (Criteria) this;
        }

        public Criteria andDistdaysIsNull() {
            addCriterion("DistDays is null");
            return (Criteria) this;
        }

        public Criteria andDistdaysIsNotNull() {
            addCriterion("DistDays is not null");
            return (Criteria) this;
        }

        public Criteria andDistdaysEqualTo(Integer value) {
            addCriterion("DistDays =", value, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysNotEqualTo(Integer value) {
            addCriterion("DistDays <>", value, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysGreaterThan(Integer value) {
            addCriterion("DistDays >", value, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("DistDays >=", value, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysLessThan(Integer value) {
            addCriterion("DistDays <", value, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysLessThanOrEqualTo(Integer value) {
            addCriterion("DistDays <=", value, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysIn(List<Integer> values) {
            addCriterion("DistDays in", values, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysNotIn(List<Integer> values) {
            addCriterion("DistDays not in", values, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysBetween(Integer value1, Integer value2) {
            addCriterion("DistDays between", value1, value2, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("DistDays not between", value1, value2, "distdays");
            return (Criteria) this;
        }

        public Criteria andDayofcloseIsNull() {
            addCriterion("DayOfClose is null");
            return (Criteria) this;
        }

        public Criteria andDayofcloseIsNotNull() {
            addCriterion("DayOfClose is not null");
            return (Criteria) this;
        }

        public Criteria andDayofcloseEqualTo(Integer value) {
            addCriterion("DayOfClose =", value, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseNotEqualTo(Integer value) {
            addCriterion("DayOfClose <>", value, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseGreaterThan(Integer value) {
            addCriterion("DayOfClose >", value, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseGreaterThanOrEqualTo(Integer value) {
            addCriterion("DayOfClose >=", value, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseLessThan(Integer value) {
            addCriterion("DayOfClose <", value, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseLessThanOrEqualTo(Integer value) {
            addCriterion("DayOfClose <=", value, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseIn(List<Integer> values) {
            addCriterion("DayOfClose in", values, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseNotIn(List<Integer> values) {
            addCriterion("DayOfClose not in", values, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseBetween(Integer value1, Integer value2) {
            addCriterion("DayOfClose between", value1, value2, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseNotBetween(Integer value1, Integer value2) {
            addCriterion("DayOfClose not between", value1, value2, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andCreditlevelIsNull() {
            addCriterion("CreditLevel is null");
            return (Criteria) this;
        }

        public Criteria andCreditlevelIsNotNull() {
            addCriterion("CreditLevel is not null");
            return (Criteria) this;
        }

        public Criteria andCreditlevelEqualTo(String value) {
            addCriterion("CreditLevel =", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotEqualTo(String value) {
            addCriterion("CreditLevel <>", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelGreaterThan(String value) {
            addCriterion("CreditLevel >", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelGreaterThanOrEqualTo(String value) {
            addCriterion("CreditLevel >=", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLessThan(String value) {
            addCriterion("CreditLevel <", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLessThanOrEqualTo(String value) {
            addCriterion("CreditLevel <=", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLike(String value) {
            addCriterion("CreditLevel like", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotLike(String value) {
            addCriterion("CreditLevel not like", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelIn(List<String> values) {
            addCriterion("CreditLevel in", values, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotIn(List<String> values) {
            addCriterion("CreditLevel not in", values, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelBetween(String value1, String value2) {
            addCriterion("CreditLevel between", value1, value2, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotBetween(String value1, String value2) {
            addCriterion("CreditLevel not between", value1, value2, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvIsNull() {
            addCriterion("StartAdvRecv is null");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvIsNotNull() {
            addCriterion("StartAdvRecv is not null");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvEqualTo(Double value) {
            addCriterion("StartAdvRecv =", value, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvNotEqualTo(Double value) {
            addCriterion("StartAdvRecv <>", value, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvGreaterThan(Double value) {
            addCriterion("StartAdvRecv >", value, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvGreaterThanOrEqualTo(Double value) {
            addCriterion("StartAdvRecv >=", value, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvLessThan(Double value) {
            addCriterion("StartAdvRecv <", value, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvLessThanOrEqualTo(Double value) {
            addCriterion("StartAdvRecv <=", value, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvIn(List<Double> values) {
            addCriterion("StartAdvRecv in", values, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvNotIn(List<Double> values) {
            addCriterion("StartAdvRecv not in", values, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvBetween(Double value1, Double value2) {
            addCriterion("StartAdvRecv between", value1, value2, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvNotBetween(Double value1, Double value2) {
            addCriterion("StartAdvRecv not between", value1, value2, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartreceivableIsNull() {
            addCriterion("StartReceivable is null");
            return (Criteria) this;
        }

        public Criteria andStartreceivableIsNotNull() {
            addCriterion("StartReceivable is not null");
            return (Criteria) this;
        }

        public Criteria andStartreceivableEqualTo(Double value) {
            addCriterion("StartReceivable =", value, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableNotEqualTo(Double value) {
            addCriterion("StartReceivable <>", value, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableGreaterThan(Double value) {
            addCriterion("StartReceivable >", value, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableGreaterThanOrEqualTo(Double value) {
            addCriterion("StartReceivable >=", value, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableLessThan(Double value) {
            addCriterion("StartReceivable <", value, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableLessThanOrEqualTo(Double value) {
            addCriterion("StartReceivable <=", value, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableIn(List<Double> values) {
            addCriterion("StartReceivable in", values, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableNotIn(List<Double> values) {
            addCriterion("StartReceivable not in", values, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableBetween(Double value1, Double value2) {
            addCriterion("StartReceivable between", value1, value2, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableNotBetween(Double value1, Double value2) {
            addCriterion("StartReceivable not between", value1, value2, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andCuradvrecvIsNull() {
            addCriterion("CurAdvRecv is null");
            return (Criteria) this;
        }

        public Criteria andCuradvrecvIsNotNull() {
            addCriterion("CurAdvRecv is not null");
            return (Criteria) this;
        }

        public Criteria andCuradvrecvEqualTo(Double value) {
            addCriterion("CurAdvRecv =", value, "curadvrecv");
            return (Criteria) this;
        }

        public Criteria andCuradvrecvNotEqualTo(Double value) {
            addCriterion("CurAdvRecv <>", value, "curadvrecv");
            return (Criteria) this;
        }

        public Criteria andCuradvrecvGreaterThan(Double value) {
            addCriterion("CurAdvRecv >", value, "curadvrecv");
            return (Criteria) this;
        }

        public Criteria andCuradvrecvGreaterThanOrEqualTo(Double value) {
            addCriterion("CurAdvRecv >=", value, "curadvrecv");
            return (Criteria) this;
        }

        public Criteria andCuradvrecvLessThan(Double value) {
            addCriterion("CurAdvRecv <", value, "curadvrecv");
            return (Criteria) this;
        }

        public Criteria andCuradvrecvLessThanOrEqualTo(Double value) {
            addCriterion("CurAdvRecv <=", value, "curadvrecv");
            return (Criteria) this;
        }

        public Criteria andCuradvrecvIn(List<Double> values) {
            addCriterion("CurAdvRecv in", values, "curadvrecv");
            return (Criteria) this;
        }

        public Criteria andCuradvrecvNotIn(List<Double> values) {
            addCriterion("CurAdvRecv not in", values, "curadvrecv");
            return (Criteria) this;
        }

        public Criteria andCuradvrecvBetween(Double value1, Double value2) {
            addCriterion("CurAdvRecv between", value1, value2, "curadvrecv");
            return (Criteria) this;
        }

        public Criteria andCuradvrecvNotBetween(Double value1, Double value2) {
            addCriterion("CurAdvRecv not between", value1, value2, "curadvrecv");
            return (Criteria) this;
        }

        public Criteria andCurreceivableIsNull() {
            addCriterion("CurReceivable is null");
            return (Criteria) this;
        }

        public Criteria andCurreceivableIsNotNull() {
            addCriterion("CurReceivable is not null");
            return (Criteria) this;
        }

        public Criteria andCurreceivableEqualTo(Double value) {
            addCriterion("CurReceivable =", value, "curreceivable");
            return (Criteria) this;
        }

        public Criteria andCurreceivableNotEqualTo(Double value) {
            addCriterion("CurReceivable <>", value, "curreceivable");
            return (Criteria) this;
        }

        public Criteria andCurreceivableGreaterThan(Double value) {
            addCriterion("CurReceivable >", value, "curreceivable");
            return (Criteria) this;
        }

        public Criteria andCurreceivableGreaterThanOrEqualTo(Double value) {
            addCriterion("CurReceivable >=", value, "curreceivable");
            return (Criteria) this;
        }

        public Criteria andCurreceivableLessThan(Double value) {
            addCriterion("CurReceivable <", value, "curreceivable");
            return (Criteria) this;
        }

        public Criteria andCurreceivableLessThanOrEqualTo(Double value) {
            addCriterion("CurReceivable <=", value, "curreceivable");
            return (Criteria) this;
        }

        public Criteria andCurreceivableIn(List<Double> values) {
            addCriterion("CurReceivable in", values, "curreceivable");
            return (Criteria) this;
        }

        public Criteria andCurreceivableNotIn(List<Double> values) {
            addCriterion("CurReceivable not in", values, "curreceivable");
            return (Criteria) this;
        }

        public Criteria andCurreceivableBetween(Double value1, Double value2) {
            addCriterion("CurReceivable between", value1, value2, "curreceivable");
            return (Criteria) this;
        }

        public Criteria andCurreceivableNotBetween(Double value1, Double value2) {
            addCriterion("CurReceivable not between", value1, value2, "curreceivable");
            return (Criteria) this;
        }

        public Criteria andWmoneyIsNull() {
            addCriterion("WMoney is null");
            return (Criteria) this;
        }

        public Criteria andWmoneyIsNotNull() {
            addCriterion("WMoney is not null");
            return (Criteria) this;
        }

        public Criteria andWmoneyEqualTo(Double value) {
            addCriterion("WMoney =", value, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyNotEqualTo(Double value) {
            addCriterion("WMoney <>", value, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyGreaterThan(Double value) {
            addCriterion("WMoney >", value, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("WMoney >=", value, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyLessThan(Double value) {
            addCriterion("WMoney <", value, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyLessThanOrEqualTo(Double value) {
            addCriterion("WMoney <=", value, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyIn(List<Double> values) {
            addCriterion("WMoney in", values, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyNotIn(List<Double> values) {
            addCriterion("WMoney not in", values, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyBetween(Double value1, Double value2) {
            addCriterion("WMoney between", value1, value2, "wmoney");
            return (Criteria) this;
        }

        public Criteria andWmoneyNotBetween(Double value1, Double value2) {
            addCriterion("WMoney not between", value1, value2, "wmoney");
            return (Criteria) this;
        }

        public Criteria andYadvrecvIsNull() {
            addCriterion("YAdvRecv is null");
            return (Criteria) this;
        }

        public Criteria andYadvrecvIsNotNull() {
            addCriterion("YAdvRecv is not null");
            return (Criteria) this;
        }

        public Criteria andYadvrecvEqualTo(String value) {
            addCriterion("YAdvRecv =", value, "yadvrecv");
            return (Criteria) this;
        }

        public Criteria andYadvrecvNotEqualTo(String value) {
            addCriterion("YAdvRecv <>", value, "yadvrecv");
            return (Criteria) this;
        }

        public Criteria andYadvrecvGreaterThan(String value) {
            addCriterion("YAdvRecv >", value, "yadvrecv");
            return (Criteria) this;
        }

        public Criteria andYadvrecvGreaterThanOrEqualTo(String value) {
            addCriterion("YAdvRecv >=", value, "yadvrecv");
            return (Criteria) this;
        }

        public Criteria andYadvrecvLessThan(String value) {
            addCriterion("YAdvRecv <", value, "yadvrecv");
            return (Criteria) this;
        }

        public Criteria andYadvrecvLessThanOrEqualTo(String value) {
            addCriterion("YAdvRecv <=", value, "yadvrecv");
            return (Criteria) this;
        }

        public Criteria andYadvrecvLike(String value) {
            addCriterion("YAdvRecv like", value, "yadvrecv");
            return (Criteria) this;
        }

        public Criteria andYadvrecvNotLike(String value) {
            addCriterion("YAdvRecv not like", value, "yadvrecv");
            return (Criteria) this;
        }

        public Criteria andYadvrecvIn(List<String> values) {
            addCriterion("YAdvRecv in", values, "yadvrecv");
            return (Criteria) this;
        }

        public Criteria andYadvrecvNotIn(List<String> values) {
            addCriterion("YAdvRecv not in", values, "yadvrecv");
            return (Criteria) this;
        }

        public Criteria andYadvrecvBetween(String value1, String value2) {
            addCriterion("YAdvRecv between", value1, value2, "yadvrecv");
            return (Criteria) this;
        }

        public Criteria andYadvrecvNotBetween(String value1, String value2) {
            addCriterion("YAdvRecv not between", value1, value2, "yadvrecv");
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

        public Criteria andColumn1IsNull() {
            addCriterion("Column1 is null");
            return (Criteria) this;
        }

        public Criteria andColumn1IsNotNull() {
            addCriterion("Column1 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn1EqualTo(String value) {
            addCriterion("Column1 =", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotEqualTo(String value) {
            addCriterion("Column1 <>", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThan(String value) {
            addCriterion("Column1 >", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThanOrEqualTo(String value) {
            addCriterion("Column1 >=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThan(String value) {
            addCriterion("Column1 <", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThanOrEqualTo(String value) {
            addCriterion("Column1 <=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Like(String value) {
            addCriterion("Column1 like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotLike(String value) {
            addCriterion("Column1 not like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1In(List<String> values) {
            addCriterion("Column1 in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotIn(List<String> values) {
            addCriterion("Column1 not in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Between(String value1, String value2) {
            addCriterion("Column1 between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotBetween(String value1, String value2) {
            addCriterion("Column1 not between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNull() {
            addCriterion("Column2 is null");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNotNull() {
            addCriterion("Column2 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn2EqualTo(String value) {
            addCriterion("Column2 =", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotEqualTo(String value) {
            addCriterion("Column2 <>", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThan(String value) {
            addCriterion("Column2 >", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThanOrEqualTo(String value) {
            addCriterion("Column2 >=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThan(String value) {
            addCriterion("Column2 <", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThanOrEqualTo(String value) {
            addCriterion("Column2 <=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Like(String value) {
            addCriterion("Column2 like", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotLike(String value) {
            addCriterion("Column2 not like", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2In(List<String> values) {
            addCriterion("Column2 in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotIn(List<String> values) {
            addCriterion("Column2 not in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Between(String value1, String value2) {
            addCriterion("Column2 between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotBetween(String value1, String value2) {
            addCriterion("Column2 not between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn3IsNull() {
            addCriterion("Column3 is null");
            return (Criteria) this;
        }

        public Criteria andColumn3IsNotNull() {
            addCriterion("Column3 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn3EqualTo(String value) {
            addCriterion("Column3 =", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotEqualTo(String value) {
            addCriterion("Column3 <>", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3GreaterThan(String value) {
            addCriterion("Column3 >", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3GreaterThanOrEqualTo(String value) {
            addCriterion("Column3 >=", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3LessThan(String value) {
            addCriterion("Column3 <", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3LessThanOrEqualTo(String value) {
            addCriterion("Column3 <=", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3Like(String value) {
            addCriterion("Column3 like", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotLike(String value) {
            addCriterion("Column3 not like", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3In(List<String> values) {
            addCriterion("Column3 in", values, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotIn(List<String> values) {
            addCriterion("Column3 not in", values, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3Between(String value1, String value2) {
            addCriterion("Column3 between", value1, value2, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotBetween(String value1, String value2) {
            addCriterion("Column3 not between", value1, value2, "column3");
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