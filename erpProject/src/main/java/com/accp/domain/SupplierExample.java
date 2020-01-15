package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andFullnameIsNull() {
            addCriterion("fullName is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("fullName is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("fullName =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("fullName <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("fullName >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("fullName >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("fullName <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("fullName <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("fullName like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("fullName not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("fullName in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("fullName not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("fullName between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("fullName not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("shortName is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("shortName is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("shortName =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("shortName <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("shortName >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("shortName >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("shortName <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("shortName <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("shortName like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("shortName not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("shortName in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("shortName not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("shortName between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("shortName not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameIsNull() {
            addCriterion("engFullName is null");
            return (Criteria) this;
        }

        public Criteria andEngfullnameIsNotNull() {
            addCriterion("engFullName is not null");
            return (Criteria) this;
        }

        public Criteria andEngfullnameEqualTo(String value) {
            addCriterion("engFullName =", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameNotEqualTo(String value) {
            addCriterion("engFullName <>", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameGreaterThan(String value) {
            addCriterion("engFullName >", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameGreaterThanOrEqualTo(String value) {
            addCriterion("engFullName >=", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameLessThan(String value) {
            addCriterion("engFullName <", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameLessThanOrEqualTo(String value) {
            addCriterion("engFullName <=", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameLike(String value) {
            addCriterion("engFullName like", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameNotLike(String value) {
            addCriterion("engFullName not like", value, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameIn(List<String> values) {
            addCriterion("engFullName in", values, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameNotIn(List<String> values) {
            addCriterion("engFullName not in", values, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameBetween(String value1, String value2) {
            addCriterion("engFullName between", value1, value2, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngfullnameNotBetween(String value1, String value2) {
            addCriterion("engFullName not between", value1, value2, "engfullname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameIsNull() {
            addCriterion("engShortName is null");
            return (Criteria) this;
        }

        public Criteria andEngshortnameIsNotNull() {
            addCriterion("engShortName is not null");
            return (Criteria) this;
        }

        public Criteria andEngshortnameEqualTo(String value) {
            addCriterion("engShortName =", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameNotEqualTo(String value) {
            addCriterion("engShortName <>", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameGreaterThan(String value) {
            addCriterion("engShortName >", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("engShortName >=", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameLessThan(String value) {
            addCriterion("engShortName <", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameLessThanOrEqualTo(String value) {
            addCriterion("engShortName <=", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameLike(String value) {
            addCriterion("engShortName like", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameNotLike(String value) {
            addCriterion("engShortName not like", value, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameIn(List<String> values) {
            addCriterion("engShortName in", values, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameNotIn(List<String> values) {
            addCriterion("engShortName not in", values, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameBetween(String value1, String value2) {
            addCriterion("engShortName between", value1, value2, "engshortname");
            return (Criteria) this;
        }

        public Criteria andEngshortnameNotBetween(String value1, String value2) {
            addCriterion("engShortName not between", value1, value2, "engshortname");
            return (Criteria) this;
        }

        public Criteria andFundsattributionIsNull() {
            addCriterion("fundsAttribution is null");
            return (Criteria) this;
        }

        public Criteria andFundsattributionIsNotNull() {
            addCriterion("fundsAttribution is not null");
            return (Criteria) this;
        }

        public Criteria andFundsattributionEqualTo(String value) {
            addCriterion("fundsAttribution =", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionNotEqualTo(String value) {
            addCriterion("fundsAttribution <>", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionGreaterThan(String value) {
            addCriterion("fundsAttribution >", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionGreaterThanOrEqualTo(String value) {
            addCriterion("fundsAttribution >=", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionLessThan(String value) {
            addCriterion("fundsAttribution <", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionLessThanOrEqualTo(String value) {
            addCriterion("fundsAttribution <=", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionLike(String value) {
            addCriterion("fundsAttribution like", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionNotLike(String value) {
            addCriterion("fundsAttribution not like", value, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionIn(List<String> values) {
            addCriterion("fundsAttribution in", values, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionNotIn(List<String> values) {
            addCriterion("fundsAttribution not in", values, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionBetween(String value1, String value2) {
            addCriterion("fundsAttribution between", value1, value2, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andFundsattributionNotBetween(String value1, String value2) {
            addCriterion("fundsAttribution not between", value1, value2, "fundsattribution");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("classId is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classId is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(String value) {
            addCriterion("classId =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(String value) {
            addCriterion("classId <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(String value) {
            addCriterion("classId >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(String value) {
            addCriterion("classId >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(String value) {
            addCriterion("classId <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(String value) {
            addCriterion("classId <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLike(String value) {
            addCriterion("classId like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotLike(String value) {
            addCriterion("classId not like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<String> values) {
            addCriterion("classId in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<String> values) {
            addCriterion("classId not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(String value1, String value2) {
            addCriterion("classId between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(String value1, String value2) {
            addCriterion("classId not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIsNull() {
            addCriterion("currencyId is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIsNotNull() {
            addCriterion("currencyId is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyidEqualTo(String value) {
            addCriterion("currencyId =", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotEqualTo(String value) {
            addCriterion("currencyId <>", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidGreaterThan(String value) {
            addCriterion("currencyId >", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidGreaterThanOrEqualTo(String value) {
            addCriterion("currencyId >=", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLessThan(String value) {
            addCriterion("currencyId <", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLessThanOrEqualTo(String value) {
            addCriterion("currencyId <=", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLike(String value) {
            addCriterion("currencyId like", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotLike(String value) {
            addCriterion("currencyId not like", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIn(List<String> values) {
            addCriterion("currencyId in", values, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotIn(List<String> values) {
            addCriterion("currencyId not in", values, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidBetween(String value1, String value2) {
            addCriterion("currencyId between", value1, value2, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotBetween(String value1, String value2) {
            addCriterion("currencyId not between", value1, value2, "currencyid");
            return (Criteria) this;
        }

        public Criteria andChiefnameIsNull() {
            addCriterion("chiefName is null");
            return (Criteria) this;
        }

        public Criteria andChiefnameIsNotNull() {
            addCriterion("chiefName is not null");
            return (Criteria) this;
        }

        public Criteria andChiefnameEqualTo(String value) {
            addCriterion("chiefName =", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameNotEqualTo(String value) {
            addCriterion("chiefName <>", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameGreaterThan(String value) {
            addCriterion("chiefName >", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameGreaterThanOrEqualTo(String value) {
            addCriterion("chiefName >=", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameLessThan(String value) {
            addCriterion("chiefName <", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameLessThanOrEqualTo(String value) {
            addCriterion("chiefName <=", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameLike(String value) {
            addCriterion("chiefName like", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameNotLike(String value) {
            addCriterion("chiefName not like", value, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameIn(List<String> values) {
            addCriterion("chiefName in", values, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameNotIn(List<String> values) {
            addCriterion("chiefName not in", values, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameBetween(String value1, String value2) {
            addCriterion("chiefName between", value1, value2, "chiefname");
            return (Criteria) this;
        }

        public Criteria andChiefnameNotBetween(String value1, String value2) {
            addCriterion("chiefName not between", value1, value2, "chiefname");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkMan is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkMan is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkMan =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkMan <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkMan >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkMan >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkMan <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkMan <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkMan like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkMan not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkMan in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkMan not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkMan between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkMan not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNull() {
            addCriterion("personID is null");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNotNull() {
            addCriterion("personID is not null");
            return (Criteria) this;
        }

        public Criteria andPersonidEqualTo(String value) {
            addCriterion("personID =", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotEqualTo(String value) {
            addCriterion("personID <>", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThan(String value) {
            addCriterion("personID >", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThanOrEqualTo(String value) {
            addCriterion("personID >=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThan(String value) {
            addCriterion("personID <", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThanOrEqualTo(String value) {
            addCriterion("personID <=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLike(String value) {
            addCriterion("personID like", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotLike(String value) {
            addCriterion("personID not like", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidIn(List<String> values) {
            addCriterion("personID in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotIn(List<String> values) {
            addCriterion("personID not in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidBetween(String value1, String value2) {
            addCriterion("personID between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotBetween(String value1, String value2) {
            addCriterion("personID not between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andTaxnoIsNull() {
            addCriterion("taxNo is null");
            return (Criteria) this;
        }

        public Criteria andTaxnoIsNotNull() {
            addCriterion("taxNo is not null");
            return (Criteria) this;
        }

        public Criteria andTaxnoEqualTo(String value) {
            addCriterion("taxNo =", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotEqualTo(String value) {
            addCriterion("taxNo <>", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoGreaterThan(String value) {
            addCriterion("taxNo >", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("taxNo >=", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLessThan(String value) {
            addCriterion("taxNo <", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLessThanOrEqualTo(String value) {
            addCriterion("taxNo <=", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLike(String value) {
            addCriterion("taxNo like", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotLike(String value) {
            addCriterion("taxNo not like", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoIn(List<String> values) {
            addCriterion("taxNo in", values, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotIn(List<String> values) {
            addCriterion("taxNo not in", values, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoBetween(String value1, String value2) {
            addCriterion("taxNo between", value1, value2, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotBetween(String value1, String value2) {
            addCriterion("taxNo not between", value1, value2, "taxno");
            return (Criteria) this;
        }

        public Criteria andCapitalizationIsNull() {
            addCriterion("capitalization is null");
            return (Criteria) this;
        }

        public Criteria andCapitalizationIsNotNull() {
            addCriterion("capitalization is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalizationEqualTo(Double value) {
            addCriterion("capitalization =", value, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationNotEqualTo(Double value) {
            addCriterion("capitalization <>", value, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationGreaterThan(Double value) {
            addCriterion("capitalization >", value, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationGreaterThanOrEqualTo(Double value) {
            addCriterion("capitalization >=", value, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationLessThan(Double value) {
            addCriterion("capitalization <", value, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationLessThanOrEqualTo(Double value) {
            addCriterion("capitalization <=", value, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationIn(List<Double> values) {
            addCriterion("capitalization in", values, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationNotIn(List<Double> values) {
            addCriterion("capitalization not in", values, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationBetween(Double value1, Double value2) {
            addCriterion("capitalization between", value1, value2, "capitalization");
            return (Criteria) this;
        }

        public Criteria andCapitalizationNotBetween(Double value1, Double value2) {
            addCriterion("capitalization not between", value1, value2, "capitalization");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassIsNull() {
            addCriterion("industrialClass is null");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassIsNotNull() {
            addCriterion("industrialClass is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassEqualTo(String value) {
            addCriterion("industrialClass =", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassNotEqualTo(String value) {
            addCriterion("industrialClass <>", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassGreaterThan(String value) {
            addCriterion("industrialClass >", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassGreaterThanOrEqualTo(String value) {
            addCriterion("industrialClass >=", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassLessThan(String value) {
            addCriterion("industrialClass <", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassLessThanOrEqualTo(String value) {
            addCriterion("industrialClass <=", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassLike(String value) {
            addCriterion("industrialClass like", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassNotLike(String value) {
            addCriterion("industrialClass not like", value, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassIn(List<String> values) {
            addCriterion("industrialClass in", values, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassNotIn(List<String> values) {
            addCriterion("industrialClass not in", values, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassBetween(String value1, String value2) {
            addCriterion("industrialClass between", value1, value2, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andIndustrialclassNotBetween(String value1, String value2) {
            addCriterion("industrialClass not between", value1, value2, "industrialclass");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andWebaddressIsNull() {
            addCriterion("webAddress is null");
            return (Criteria) this;
        }

        public Criteria andWebaddressIsNotNull() {
            addCriterion("webAddress is not null");
            return (Criteria) this;
        }

        public Criteria andWebaddressEqualTo(String value) {
            addCriterion("webAddress =", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressNotEqualTo(String value) {
            addCriterion("webAddress <>", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressGreaterThan(String value) {
            addCriterion("webAddress >", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressGreaterThanOrEqualTo(String value) {
            addCriterion("webAddress >=", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressLessThan(String value) {
            addCriterion("webAddress <", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressLessThanOrEqualTo(String value) {
            addCriterion("webAddress <=", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressLike(String value) {
            addCriterion("webAddress like", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressNotLike(String value) {
            addCriterion("webAddress not like", value, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressIn(List<String> values) {
            addCriterion("webAddress in", values, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressNotIn(List<String> values) {
            addCriterion("webAddress not in", values, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressBetween(String value1, String value2) {
            addCriterion("webAddress between", value1, value2, "webaddress");
            return (Criteria) this;
        }

        public Criteria andWebaddressNotBetween(String value1, String value2) {
            addCriterion("webAddress not between", value1, value2, "webaddress");
            return (Criteria) this;
        }

        public Criteria andFaxnoIsNull() {
            addCriterion("faxNo is null");
            return (Criteria) this;
        }

        public Criteria andFaxnoIsNotNull() {
            addCriterion("faxNo is not null");
            return (Criteria) this;
        }

        public Criteria andFaxnoEqualTo(String value) {
            addCriterion("faxNo =", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoNotEqualTo(String value) {
            addCriterion("faxNo <>", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoGreaterThan(String value) {
            addCriterion("faxNo >", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("faxNo >=", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoLessThan(String value) {
            addCriterion("faxNo <", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoLessThanOrEqualTo(String value) {
            addCriterion("faxNo <=", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoLike(String value) {
            addCriterion("faxNo like", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoNotLike(String value) {
            addCriterion("faxNo not like", value, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoIn(List<String> values) {
            addCriterion("faxNo in", values, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoNotIn(List<String> values) {
            addCriterion("faxNo not in", values, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoBetween(String value1, String value2) {
            addCriterion("faxNo between", value1, value2, "faxno");
            return (Criteria) this;
        }

        public Criteria andFaxnoNotBetween(String value1, String value2) {
            addCriterion("faxNo not between", value1, value2, "faxno");
            return (Criteria) this;
        }

        public Criteria andTelephone1IsNull() {
            addCriterion("telephone1 is null");
            return (Criteria) this;
        }

        public Criteria andTelephone1IsNotNull() {
            addCriterion("telephone1 is not null");
            return (Criteria) this;
        }

        public Criteria andTelephone1EqualTo(String value) {
            addCriterion("telephone1 =", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1NotEqualTo(String value) {
            addCriterion("telephone1 <>", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1GreaterThan(String value) {
            addCriterion("telephone1 >", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1GreaterThanOrEqualTo(String value) {
            addCriterion("telephone1 >=", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1LessThan(String value) {
            addCriterion("telephone1 <", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1LessThanOrEqualTo(String value) {
            addCriterion("telephone1 <=", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1Like(String value) {
            addCriterion("telephone1 like", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1NotLike(String value) {
            addCriterion("telephone1 not like", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1In(List<String> values) {
            addCriterion("telephone1 in", values, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1NotIn(List<String> values) {
            addCriterion("telephone1 not in", values, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1Between(String value1, String value2) {
            addCriterion("telephone1 between", value1, value2, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1NotBetween(String value1, String value2) {
            addCriterion("telephone1 not between", value1, value2, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone2IsNull() {
            addCriterion("telephone2 is null");
            return (Criteria) this;
        }

        public Criteria andTelephone2IsNotNull() {
            addCriterion("telephone2 is not null");
            return (Criteria) this;
        }

        public Criteria andTelephone2EqualTo(String value) {
            addCriterion("telephone2 =", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotEqualTo(String value) {
            addCriterion("telephone2 <>", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2GreaterThan(String value) {
            addCriterion("telephone2 >", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2GreaterThanOrEqualTo(String value) {
            addCriterion("telephone2 >=", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2LessThan(String value) {
            addCriterion("telephone2 <", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2LessThanOrEqualTo(String value) {
            addCriterion("telephone2 <=", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2Like(String value) {
            addCriterion("telephone2 like", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotLike(String value) {
            addCriterion("telephone2 not like", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2In(List<String> values) {
            addCriterion("telephone2 in", values, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotIn(List<String> values) {
            addCriterion("telephone2 not in", values, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2Between(String value1, String value2) {
            addCriterion("telephone2 between", value1, value2, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotBetween(String value1, String value2) {
            addCriterion("telephone2 not between", value1, value2, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone3IsNull() {
            addCriterion("telephone3 is null");
            return (Criteria) this;
        }

        public Criteria andTelephone3IsNotNull() {
            addCriterion("telephone3 is not null");
            return (Criteria) this;
        }

        public Criteria andTelephone3EqualTo(String value) {
            addCriterion("telephone3 =", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3NotEqualTo(String value) {
            addCriterion("telephone3 <>", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3GreaterThan(String value) {
            addCriterion("telephone3 >", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3GreaterThanOrEqualTo(String value) {
            addCriterion("telephone3 >=", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3LessThan(String value) {
            addCriterion("telephone3 <", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3LessThanOrEqualTo(String value) {
            addCriterion("telephone3 <=", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3Like(String value) {
            addCriterion("telephone3 like", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3NotLike(String value) {
            addCriterion("telephone3 not like", value, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3In(List<String> values) {
            addCriterion("telephone3 in", values, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3NotIn(List<String> values) {
            addCriterion("telephone3 not in", values, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3Between(String value1, String value2) {
            addCriterion("telephone3 between", value1, value2, "telephone3");
            return (Criteria) this;
        }

        public Criteria andTelephone3NotBetween(String value1, String value2) {
            addCriterion("telephone3 not between", value1, value2, "telephone3");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("mobilephone =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("mobilephone <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("mobilephone >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobilephone >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("mobilephone <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("mobilephone <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("mobilephone like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("mobilephone not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("mobilephone in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("mobilephone not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("mobilephone between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("mobilephone not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNull() {
            addCriterion("bankAccount is null");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNotNull() {
            addCriterion("bankAccount is not null");
            return (Criteria) this;
        }

        public Criteria andBankaccountEqualTo(String value) {
            addCriterion("bankAccount =", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotEqualTo(String value) {
            addCriterion("bankAccount <>", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThan(String value) {
            addCriterion("bankAccount >", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("bankAccount >=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThan(String value) {
            addCriterion("bankAccount <", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThanOrEqualTo(String value) {
            addCriterion("bankAccount <=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLike(String value) {
            addCriterion("bankAccount like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotLike(String value) {
            addCriterion("bankAccount not like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountIn(List<String> values) {
            addCriterion("bankAccount in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotIn(List<String> values) {
            addCriterion("bankAccount not in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountBetween(String value1, String value2) {
            addCriterion("bankAccount between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotBetween(String value1, String value2) {
            addCriterion("bankAccount not between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxIsNull() {
            addCriterion("priceOfTax is null");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxIsNotNull() {
            addCriterion("priceOfTax is not null");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxEqualTo(Integer value) {
            addCriterion("priceOfTax =", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxNotEqualTo(Integer value) {
            addCriterion("priceOfTax <>", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxGreaterThan(Integer value) {
            addCriterion("priceOfTax >", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("priceOfTax >=", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxLessThan(Integer value) {
            addCriterion("priceOfTax <", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxLessThanOrEqualTo(Integer value) {
            addCriterion("priceOfTax <=", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxIn(List<Integer> values) {
            addCriterion("priceOfTax in", values, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxNotIn(List<Integer> values) {
            addCriterion("priceOfTax not in", values, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxBetween(Integer value1, Integer value2) {
            addCriterion("priceOfTax between", value1, value2, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxNotBetween(Integer value1, Integer value2) {
            addCriterion("priceOfTax not between", value1, value2, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andInvaliddateIsNull() {
            addCriterion("invalidDate is null");
            return (Criteria) this;
        }

        public Criteria andInvaliddateIsNotNull() {
            addCriterion("invalidDate is not null");
            return (Criteria) this;
        }

        public Criteria andInvaliddateEqualTo(Integer value) {
            addCriterion("invalidDate =", value, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateNotEqualTo(Integer value) {
            addCriterion("invalidDate <>", value, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateGreaterThan(Integer value) {
            addCriterion("invalidDate >", value, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateGreaterThanOrEqualTo(Integer value) {
            addCriterion("invalidDate >=", value, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateLessThan(Integer value) {
            addCriterion("invalidDate <", value, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateLessThanOrEqualTo(Integer value) {
            addCriterion("invalidDate <=", value, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateIn(List<Integer> values) {
            addCriterion("invalidDate in", values, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateNotIn(List<Integer> values) {
            addCriterion("invalidDate not in", values, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateBetween(Integer value1, Integer value2) {
            addCriterion("invalidDate between", value1, value2, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andInvaliddateNotBetween(Integer value1, Integer value2) {
            addCriterion("invalidDate not between", value1, value2, "invaliddate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateIsNull() {
            addCriterion("earliestTradeDate is null");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateIsNotNull() {
            addCriterion("earliestTradeDate is not null");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateEqualTo(Date value) {
            addCriterionForJDBCDate("earliestTradeDate =", value, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("earliestTradeDate <>", value, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateGreaterThan(Date value) {
            addCriterionForJDBCDate("earliestTradeDate >", value, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("earliestTradeDate >=", value, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateLessThan(Date value) {
            addCriterionForJDBCDate("earliestTradeDate <", value, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("earliestTradeDate <=", value, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateIn(List<Date> values) {
            addCriterionForJDBCDate("earliestTradeDate in", values, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("earliestTradeDate not in", values, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("earliestTradeDate between", value1, value2, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andEarliesttradedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("earliestTradeDate not between", value1, value2, "earliesttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateIsNull() {
            addCriterion("firstTradeDate is null");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateIsNotNull() {
            addCriterion("firstTradeDate is not null");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateEqualTo(Date value) {
            addCriterionForJDBCDate("firstTradeDate =", value, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("firstTradeDate <>", value, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateGreaterThan(Date value) {
            addCriterionForJDBCDate("firstTradeDate >", value, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstTradeDate >=", value, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateLessThan(Date value) {
            addCriterionForJDBCDate("firstTradeDate <", value, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstTradeDate <=", value, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateIn(List<Date> values) {
            addCriterionForJDBCDate("firstTradeDate in", values, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("firstTradeDate not in", values, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstTradeDate between", value1, value2, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andFirsttradedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstTradeDate not between", value1, value2, "firsttradedate");
            return (Criteria) this;
        }

        public Criteria andLatelytradedateIsNull() {
            addCriterion("latelyTradeDate is null");
            return (Criteria) this;
        }

        public Criteria andLatelytradedateIsNotNull() {
            addCriterion("latelyTradeDate is not null");
            return (Criteria) this;
        }

        public Criteria andLatelytradedateEqualTo(Date value) {
            addCriterionForJDBCDate("latelyTradeDate =", value, "latelytradedate");
            return (Criteria) this;
        }

        public Criteria andLatelytradedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("latelyTradeDate <>", value, "latelytradedate");
            return (Criteria) this;
        }

        public Criteria andLatelytradedateGreaterThan(Date value) {
            addCriterionForJDBCDate("latelyTradeDate >", value, "latelytradedate");
            return (Criteria) this;
        }

        public Criteria andLatelytradedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("latelyTradeDate >=", value, "latelytradedate");
            return (Criteria) this;
        }

        public Criteria andLatelytradedateLessThan(Date value) {
            addCriterionForJDBCDate("latelyTradeDate <", value, "latelytradedate");
            return (Criteria) this;
        }

        public Criteria andLatelytradedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("latelyTradeDate <=", value, "latelytradedate");
            return (Criteria) this;
        }

        public Criteria andLatelytradedateIn(List<Date> values) {
            addCriterionForJDBCDate("latelyTradeDate in", values, "latelytradedate");
            return (Criteria) this;
        }

        public Criteria andLatelytradedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("latelyTradeDate not in", values, "latelytradedate");
            return (Criteria) this;
        }

        public Criteria andLatelytradedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("latelyTradeDate between", value1, value2, "latelytradedate");
            return (Criteria) this;
        }

        public Criteria andLatelytradedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("latelyTradeDate not between", value1, value2, "latelytradedate");
            return (Criteria) this;
        }

        public Criteria andLatelyreturnIsNull() {
            addCriterion("latelyReturn is null");
            return (Criteria) this;
        }

        public Criteria andLatelyreturnIsNotNull() {
            addCriterion("latelyReturn is not null");
            return (Criteria) this;
        }

        public Criteria andLatelyreturnEqualTo(Date value) {
            addCriterionForJDBCDate("latelyReturn =", value, "latelyreturn");
            return (Criteria) this;
        }

        public Criteria andLatelyreturnNotEqualTo(Date value) {
            addCriterionForJDBCDate("latelyReturn <>", value, "latelyreturn");
            return (Criteria) this;
        }

        public Criteria andLatelyreturnGreaterThan(Date value) {
            addCriterionForJDBCDate("latelyReturn >", value, "latelyreturn");
            return (Criteria) this;
        }

        public Criteria andLatelyreturnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("latelyReturn >=", value, "latelyreturn");
            return (Criteria) this;
        }

        public Criteria andLatelyreturnLessThan(Date value) {
            addCriterionForJDBCDate("latelyReturn <", value, "latelyreturn");
            return (Criteria) this;
        }

        public Criteria andLatelyreturnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("latelyReturn <=", value, "latelyreturn");
            return (Criteria) this;
        }

        public Criteria andLatelyreturnIn(List<Date> values) {
            addCriterionForJDBCDate("latelyReturn in", values, "latelyreturn");
            return (Criteria) this;
        }

        public Criteria andLatelyreturnNotIn(List<Date> values) {
            addCriterionForJDBCDate("latelyReturn not in", values, "latelyreturn");
            return (Criteria) this;
        }

        public Criteria andLatelyreturnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("latelyReturn between", value1, value2, "latelyreturn");
            return (Criteria) this;
        }

        public Criteria andLatelyreturnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("latelyReturn not between", value1, value2, "latelyreturn");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvIsNull() {
            addCriterion("startAdvRecv is null");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvIsNotNull() {
            addCriterion("startAdvRecv is not null");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvEqualTo(Double value) {
            addCriterion("startAdvRecv =", value, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvNotEqualTo(Double value) {
            addCriterion("startAdvRecv <>", value, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvGreaterThan(Double value) {
            addCriterion("startAdvRecv >", value, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvGreaterThanOrEqualTo(Double value) {
            addCriterion("startAdvRecv >=", value, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvLessThan(Double value) {
            addCriterion("startAdvRecv <", value, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvLessThanOrEqualTo(Double value) {
            addCriterion("startAdvRecv <=", value, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvIn(List<Double> values) {
            addCriterion("startAdvRecv in", values, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvNotIn(List<Double> values) {
            addCriterion("startAdvRecv not in", values, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvBetween(Double value1, Double value2) {
            addCriterion("startAdvRecv between", value1, value2, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartadvrecvNotBetween(Double value1, Double value2) {
            addCriterion("startAdvRecv not between", value1, value2, "startadvrecv");
            return (Criteria) this;
        }

        public Criteria andStartreceivableIsNull() {
            addCriterion("startReceivable is null");
            return (Criteria) this;
        }

        public Criteria andStartreceivableIsNotNull() {
            addCriterion("startReceivable is not null");
            return (Criteria) this;
        }

        public Criteria andStartreceivableEqualTo(Double value) {
            addCriterion("startReceivable =", value, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableNotEqualTo(Double value) {
            addCriterion("startReceivable <>", value, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableGreaterThan(Double value) {
            addCriterion("startReceivable >", value, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableGreaterThanOrEqualTo(Double value) {
            addCriterion("startReceivable >=", value, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableLessThan(Double value) {
            addCriterion("startReceivable <", value, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableLessThanOrEqualTo(Double value) {
            addCriterion("startReceivable <=", value, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableIn(List<Double> values) {
            addCriterion("startReceivable in", values, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableNotIn(List<Double> values) {
            addCriterion("startReceivable not in", values, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableBetween(Double value1, Double value2) {
            addCriterion("startReceivable between", value1, value2, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andStartreceivableNotBetween(Double value1, Double value2) {
            addCriterion("startReceivable not between", value1, value2, "startreceivable");
            return (Criteria) this;
        }

        public Criteria andAmountquotaIsNull() {
            addCriterion("amountQuota is null");
            return (Criteria) this;
        }

        public Criteria andAmountquotaIsNotNull() {
            addCriterion("amountQuota is not null");
            return (Criteria) this;
        }

        public Criteria andAmountquotaEqualTo(Double value) {
            addCriterion("amountQuota =", value, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaNotEqualTo(Double value) {
            addCriterion("amountQuota <>", value, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaGreaterThan(Double value) {
            addCriterion("amountQuota >", value, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaGreaterThanOrEqualTo(Double value) {
            addCriterion("amountQuota >=", value, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaLessThan(Double value) {
            addCriterion("amountQuota <", value, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaLessThanOrEqualTo(Double value) {
            addCriterion("amountQuota <=", value, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaIn(List<Double> values) {
            addCriterion("amountQuota in", values, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaNotIn(List<Double> values) {
            addCriterion("amountQuota not in", values, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaBetween(Double value1, Double value2) {
            addCriterion("amountQuota between", value1, value2, "amountquota");
            return (Criteria) this;
        }

        public Criteria andAmountquotaNotBetween(Double value1, Double value2) {
            addCriterion("amountQuota not between", value1, value2, "amountquota");
            return (Criteria) this;
        }

        public Criteria andRecvwayIsNull() {
            addCriterion("recvWay is null");
            return (Criteria) this;
        }

        public Criteria andRecvwayIsNotNull() {
            addCriterion("recvWay is not null");
            return (Criteria) this;
        }

        public Criteria andRecvwayEqualTo(Integer value) {
            addCriterion("recvWay =", value, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayNotEqualTo(Integer value) {
            addCriterion("recvWay <>", value, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayGreaterThan(Integer value) {
            addCriterion("recvWay >", value, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayGreaterThanOrEqualTo(Integer value) {
            addCriterion("recvWay >=", value, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayLessThan(Integer value) {
            addCriterion("recvWay <", value, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayLessThanOrEqualTo(Integer value) {
            addCriterion("recvWay <=", value, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayIn(List<Integer> values) {
            addCriterion("recvWay in", values, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayNotIn(List<Integer> values) {
            addCriterion("recvWay not in", values, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayBetween(Integer value1, Integer value2) {
            addCriterion("recvWay between", value1, value2, "recvway");
            return (Criteria) this;
        }

        public Criteria andRecvwayNotBetween(Integer value1, Integer value2) {
            addCriterion("recvWay not between", value1, value2, "recvway");
            return (Criteria) this;
        }

        public Criteria andDistdaysIsNull() {
            addCriterion("distDays is null");
            return (Criteria) this;
        }

        public Criteria andDistdaysIsNotNull() {
            addCriterion("distDays is not null");
            return (Criteria) this;
        }

        public Criteria andDistdaysEqualTo(Integer value) {
            addCriterion("distDays =", value, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysNotEqualTo(Integer value) {
            addCriterion("distDays <>", value, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysGreaterThan(Integer value) {
            addCriterion("distDays >", value, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("distDays >=", value, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysLessThan(Integer value) {
            addCriterion("distDays <", value, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysLessThanOrEqualTo(Integer value) {
            addCriterion("distDays <=", value, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysIn(List<Integer> values) {
            addCriterion("distDays in", values, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysNotIn(List<Integer> values) {
            addCriterion("distDays not in", values, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysBetween(Integer value1, Integer value2) {
            addCriterion("distDays between", value1, value2, "distdays");
            return (Criteria) this;
        }

        public Criteria andDistdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("distDays not between", value1, value2, "distdays");
            return (Criteria) this;
        }

        public Criteria andDayofcloseIsNull() {
            addCriterion("dayOfClose is null");
            return (Criteria) this;
        }

        public Criteria andDayofcloseIsNotNull() {
            addCriterion("dayOfClose is not null");
            return (Criteria) this;
        }

        public Criteria andDayofcloseEqualTo(Integer value) {
            addCriterion("dayOfClose =", value, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseNotEqualTo(Integer value) {
            addCriterion("dayOfClose <>", value, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseGreaterThan(Integer value) {
            addCriterion("dayOfClose >", value, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseGreaterThanOrEqualTo(Integer value) {
            addCriterion("dayOfClose >=", value, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseLessThan(Integer value) {
            addCriterion("dayOfClose <", value, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseLessThanOrEqualTo(Integer value) {
            addCriterion("dayOfClose <=", value, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseIn(List<Integer> values) {
            addCriterion("dayOfClose in", values, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseNotIn(List<Integer> values) {
            addCriterion("dayOfClose not in", values, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseBetween(Integer value1, Integer value2) {
            addCriterion("dayOfClose between", value1, value2, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofcloseNotBetween(Integer value1, Integer value2) {
            addCriterion("dayOfClose not between", value1, value2, "dayofclose");
            return (Criteria) this;
        }

        public Criteria andDayofrecvIsNull() {
            addCriterion("dayOfRecv is null");
            return (Criteria) this;
        }

        public Criteria andDayofrecvIsNotNull() {
            addCriterion("dayOfRecv is not null");
            return (Criteria) this;
        }

        public Criteria andDayofrecvEqualTo(Integer value) {
            addCriterion("dayOfRecv =", value, "dayofrecv");
            return (Criteria) this;
        }

        public Criteria andDayofrecvNotEqualTo(Integer value) {
            addCriterion("dayOfRecv <>", value, "dayofrecv");
            return (Criteria) this;
        }

        public Criteria andDayofrecvGreaterThan(Integer value) {
            addCriterion("dayOfRecv >", value, "dayofrecv");
            return (Criteria) this;
        }

        public Criteria andDayofrecvGreaterThanOrEqualTo(Integer value) {
            addCriterion("dayOfRecv >=", value, "dayofrecv");
            return (Criteria) this;
        }

        public Criteria andDayofrecvLessThan(Integer value) {
            addCriterion("dayOfRecv <", value, "dayofrecv");
            return (Criteria) this;
        }

        public Criteria andDayofrecvLessThanOrEqualTo(Integer value) {
            addCriterion("dayOfRecv <=", value, "dayofrecv");
            return (Criteria) this;
        }

        public Criteria andDayofrecvIn(List<Integer> values) {
            addCriterion("dayOfRecv in", values, "dayofrecv");
            return (Criteria) this;
        }

        public Criteria andDayofrecvNotIn(List<Integer> values) {
            addCriterion("dayOfRecv not in", values, "dayofrecv");
            return (Criteria) this;
        }

        public Criteria andDayofrecvBetween(Integer value1, Integer value2) {
            addCriterion("dayOfRecv between", value1, value2, "dayofrecv");
            return (Criteria) this;
        }

        public Criteria andDayofrecvNotBetween(Integer value1, Integer value2) {
            addCriterion("dayOfRecv not between", value1, value2, "dayofrecv");
            return (Criteria) this;
        }

        public Criteria andCreditlevelIsNull() {
            addCriterion("creditLevel is null");
            return (Criteria) this;
        }

        public Criteria andCreditlevelIsNotNull() {
            addCriterion("creditLevel is not null");
            return (Criteria) this;
        }

        public Criteria andCreditlevelEqualTo(String value) {
            addCriterion("creditLevel =", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotEqualTo(String value) {
            addCriterion("creditLevel <>", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelGreaterThan(String value) {
            addCriterion("creditLevel >", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelGreaterThanOrEqualTo(String value) {
            addCriterion("creditLevel >=", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLessThan(String value) {
            addCriterion("creditLevel <", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLessThanOrEqualTo(String value) {
            addCriterion("creditLevel <=", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLike(String value) {
            addCriterion("creditLevel like", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotLike(String value) {
            addCriterion("creditLevel not like", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelIn(List<String> values) {
            addCriterion("creditLevel in", values, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotIn(List<String> values) {
            addCriterion("creditLevel not in", values, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelBetween(String value1, String value2) {
            addCriterion("creditLevel between", value1, value2, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotBetween(String value1, String value2) {
            addCriterion("creditLevel not between", value1, value2, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andMemaoIsNull() {
            addCriterion("memao is null");
            return (Criteria) this;
        }

        public Criteria andMemaoIsNotNull() {
            addCriterion("memao is not null");
            return (Criteria) this;
        }

        public Criteria andMemaoEqualTo(String value) {
            addCriterion("memao =", value, "memao");
            return (Criteria) this;
        }

        public Criteria andMemaoNotEqualTo(String value) {
            addCriterion("memao <>", value, "memao");
            return (Criteria) this;
        }

        public Criteria andMemaoGreaterThan(String value) {
            addCriterion("memao >", value, "memao");
            return (Criteria) this;
        }

        public Criteria andMemaoGreaterThanOrEqualTo(String value) {
            addCriterion("memao >=", value, "memao");
            return (Criteria) this;
        }

        public Criteria andMemaoLessThan(String value) {
            addCriterion("memao <", value, "memao");
            return (Criteria) this;
        }

        public Criteria andMemaoLessThanOrEqualTo(String value) {
            addCriterion("memao <=", value, "memao");
            return (Criteria) this;
        }

        public Criteria andMemaoLike(String value) {
            addCriterion("memao like", value, "memao");
            return (Criteria) this;
        }

        public Criteria andMemaoNotLike(String value) {
            addCriterion("memao not like", value, "memao");
            return (Criteria) this;
        }

        public Criteria andMemaoIn(List<String> values) {
            addCriterion("memao in", values, "memao");
            return (Criteria) this;
        }

        public Criteria andMemaoNotIn(List<String> values) {
            addCriterion("memao not in", values, "memao");
            return (Criteria) this;
        }

        public Criteria andMemaoBetween(String value1, String value2) {
            addCriterion("memao between", value1, value2, "memao");
            return (Criteria) this;
        }

        public Criteria andMemaoNotBetween(String value1, String value2) {
            addCriterion("memao not between", value1, value2, "memao");
            return (Criteria) this;
        }

        public Criteria andCoulumn1IsNull() {
            addCriterion("coulumn1 is null");
            return (Criteria) this;
        }

        public Criteria andCoulumn1IsNotNull() {
            addCriterion("coulumn1 is not null");
            return (Criteria) this;
        }

        public Criteria andCoulumn1EqualTo(String value) {
            addCriterion("coulumn1 =", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1NotEqualTo(String value) {
            addCriterion("coulumn1 <>", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1GreaterThan(String value) {
            addCriterion("coulumn1 >", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1GreaterThanOrEqualTo(String value) {
            addCriterion("coulumn1 >=", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1LessThan(String value) {
            addCriterion("coulumn1 <", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1LessThanOrEqualTo(String value) {
            addCriterion("coulumn1 <=", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1Like(String value) {
            addCriterion("coulumn1 like", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1NotLike(String value) {
            addCriterion("coulumn1 not like", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1In(List<String> values) {
            addCriterion("coulumn1 in", values, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1NotIn(List<String> values) {
            addCriterion("coulumn1 not in", values, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1Between(String value1, String value2) {
            addCriterion("coulumn1 between", value1, value2, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1NotBetween(String value1, String value2) {
            addCriterion("coulumn1 not between", value1, value2, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn2IsNull() {
            addCriterion("coulumn2 is null");
            return (Criteria) this;
        }

        public Criteria andCoulumn2IsNotNull() {
            addCriterion("coulumn2 is not null");
            return (Criteria) this;
        }

        public Criteria andCoulumn2EqualTo(String value) {
            addCriterion("coulumn2 =", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2NotEqualTo(String value) {
            addCriterion("coulumn2 <>", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2GreaterThan(String value) {
            addCriterion("coulumn2 >", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2GreaterThanOrEqualTo(String value) {
            addCriterion("coulumn2 >=", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2LessThan(String value) {
            addCriterion("coulumn2 <", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2LessThanOrEqualTo(String value) {
            addCriterion("coulumn2 <=", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2Like(String value) {
            addCriterion("coulumn2 like", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2NotLike(String value) {
            addCriterion("coulumn2 not like", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2In(List<String> values) {
            addCriterion("coulumn2 in", values, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2NotIn(List<String> values) {
            addCriterion("coulumn2 not in", values, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2Between(String value1, String value2) {
            addCriterion("coulumn2 between", value1, value2, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2NotBetween(String value1, String value2) {
            addCriterion("coulumn2 not between", value1, value2, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn3IsNull() {
            addCriterion("coulumn3 is null");
            return (Criteria) this;
        }

        public Criteria andCoulumn3IsNotNull() {
            addCriterion("coulumn3 is not null");
            return (Criteria) this;
        }

        public Criteria andCoulumn3EqualTo(String value) {
            addCriterion("coulumn3 =", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3NotEqualTo(String value) {
            addCriterion("coulumn3 <>", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3GreaterThan(String value) {
            addCriterion("coulumn3 >", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3GreaterThanOrEqualTo(String value) {
            addCriterion("coulumn3 >=", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3LessThan(String value) {
            addCriterion("coulumn3 <", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3LessThanOrEqualTo(String value) {
            addCriterion("coulumn3 <=", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3Like(String value) {
            addCriterion("coulumn3 like", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3NotLike(String value) {
            addCriterion("coulumn3 not like", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3In(List<String> values) {
            addCriterion("coulumn3 in", values, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3NotIn(List<String> values) {
            addCriterion("coulumn3 not in", values, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3Between(String value1, String value2) {
            addCriterion("coulumn3 between", value1, value2, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3NotBetween(String value1, String value2) {
            addCriterion("coulumn3 not between", value1, value2, "coulumn3");
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