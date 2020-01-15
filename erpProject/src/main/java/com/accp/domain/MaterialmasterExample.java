package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MaterialmasterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialmasterExample() {
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

        public Criteria andProdidIsNull() {
            addCriterion("ProdID is null");
            return (Criteria) this;
        }

        public Criteria andProdidIsNotNull() {
            addCriterion("ProdID is not null");
            return (Criteria) this;
        }

        public Criteria andProdidEqualTo(String value) {
            addCriterion("ProdID =", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotEqualTo(String value) {
            addCriterion("ProdID <>", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidGreaterThan(String value) {
            addCriterion("ProdID >", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidGreaterThanOrEqualTo(String value) {
            addCriterion("ProdID >=", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidLessThan(String value) {
            addCriterion("ProdID <", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidLessThanOrEqualTo(String value) {
            addCriterion("ProdID <=", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidLike(String value) {
            addCriterion("ProdID like", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotLike(String value) {
            addCriterion("ProdID not like", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidIn(List<String> values) {
            addCriterion("ProdID in", values, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotIn(List<String> values) {
            addCriterion("ProdID not in", values, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidBetween(String value1, String value2) {
            addCriterion("ProdID between", value1, value2, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotBetween(String value1, String value2) {
            addCriterion("ProdID not between", value1, value2, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdnameIsNull() {
            addCriterion("ProdName is null");
            return (Criteria) this;
        }

        public Criteria andProdnameIsNotNull() {
            addCriterion("ProdName is not null");
            return (Criteria) this;
        }

        public Criteria andProdnameEqualTo(String value) {
            addCriterion("ProdName =", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotEqualTo(String value) {
            addCriterion("ProdName <>", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameGreaterThan(String value) {
            addCriterion("ProdName >", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProdName >=", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameLessThan(String value) {
            addCriterion("ProdName <", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameLessThanOrEqualTo(String value) {
            addCriterion("ProdName <=", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameLike(String value) {
            addCriterion("ProdName like", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotLike(String value) {
            addCriterion("ProdName not like", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameIn(List<String> values) {
            addCriterion("ProdName in", values, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotIn(List<String> values) {
            addCriterion("ProdName not in", values, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameBetween(String value1, String value2) {
            addCriterion("ProdName between", value1, value2, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotBetween(String value1, String value2) {
            addCriterion("ProdName not between", value1, value2, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdsizeIsNull() {
            addCriterion("ProdSize is null");
            return (Criteria) this;
        }

        public Criteria andProdsizeIsNotNull() {
            addCriterion("ProdSize is not null");
            return (Criteria) this;
        }

        public Criteria andProdsizeEqualTo(String value) {
            addCriterion("ProdSize =", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeNotEqualTo(String value) {
            addCriterion("ProdSize <>", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeGreaterThan(String value) {
            addCriterion("ProdSize >", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeGreaterThanOrEqualTo(String value) {
            addCriterion("ProdSize >=", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeLessThan(String value) {
            addCriterion("ProdSize <", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeLessThanOrEqualTo(String value) {
            addCriterion("ProdSize <=", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeLike(String value) {
            addCriterion("ProdSize like", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeNotLike(String value) {
            addCriterion("ProdSize not like", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeIn(List<String> values) {
            addCriterion("ProdSize in", values, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeNotIn(List<String> values) {
            addCriterion("ProdSize not in", values, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeBetween(String value1, String value2) {
            addCriterion("ProdSize between", value1, value2, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeNotBetween(String value1, String value2) {
            addCriterion("ProdSize not between", value1, value2, "prodsize");
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

        public Criteria andStdunitidIsNull() {
            addCriterion("StdUnitID is null");
            return (Criteria) this;
        }

        public Criteria andStdunitidIsNotNull() {
            addCriterion("StdUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andStdunitidEqualTo(Integer value) {
            addCriterion("StdUnitID =", value, "stdunitid");
            return (Criteria) this;
        }

        public Criteria andStdunitidNotEqualTo(Integer value) {
            addCriterion("StdUnitID <>", value, "stdunitid");
            return (Criteria) this;
        }

        public Criteria andStdunitidGreaterThan(Integer value) {
            addCriterion("StdUnitID >", value, "stdunitid");
            return (Criteria) this;
        }

        public Criteria andStdunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StdUnitID >=", value, "stdunitid");
            return (Criteria) this;
        }

        public Criteria andStdunitidLessThan(Integer value) {
            addCriterion("StdUnitID <", value, "stdunitid");
            return (Criteria) this;
        }

        public Criteria andStdunitidLessThanOrEqualTo(Integer value) {
            addCriterion("StdUnitID <=", value, "stdunitid");
            return (Criteria) this;
        }

        public Criteria andStdunitidIn(List<Integer> values) {
            addCriterion("StdUnitID in", values, "stdunitid");
            return (Criteria) this;
        }

        public Criteria andStdunitidNotIn(List<Integer> values) {
            addCriterion("StdUnitID not in", values, "stdunitid");
            return (Criteria) this;
        }

        public Criteria andStdunitidBetween(Integer value1, Integer value2) {
            addCriterion("StdUnitID between", value1, value2, "stdunitid");
            return (Criteria) this;
        }

        public Criteria andStdunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("StdUnitID not between", value1, value2, "stdunitid");
            return (Criteria) this;
        }

        public Criteria andBarcodeidIsNull() {
            addCriterion("BarCodeID is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeidIsNotNull() {
            addCriterion("BarCodeID is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeidEqualTo(String value) {
            addCriterion("BarCodeID =", value, "barcodeid");
            return (Criteria) this;
        }

        public Criteria andBarcodeidNotEqualTo(String value) {
            addCriterion("BarCodeID <>", value, "barcodeid");
            return (Criteria) this;
        }

        public Criteria andBarcodeidGreaterThan(String value) {
            addCriterion("BarCodeID >", value, "barcodeid");
            return (Criteria) this;
        }

        public Criteria andBarcodeidGreaterThanOrEqualTo(String value) {
            addCriterion("BarCodeID >=", value, "barcodeid");
            return (Criteria) this;
        }

        public Criteria andBarcodeidLessThan(String value) {
            addCriterion("BarCodeID <", value, "barcodeid");
            return (Criteria) this;
        }

        public Criteria andBarcodeidLessThanOrEqualTo(String value) {
            addCriterion("BarCodeID <=", value, "barcodeid");
            return (Criteria) this;
        }

        public Criteria andBarcodeidLike(String value) {
            addCriterion("BarCodeID like", value, "barcodeid");
            return (Criteria) this;
        }

        public Criteria andBarcodeidNotLike(String value) {
            addCriterion("BarCodeID not like", value, "barcodeid");
            return (Criteria) this;
        }

        public Criteria andBarcodeidIn(List<String> values) {
            addCriterion("BarCodeID in", values, "barcodeid");
            return (Criteria) this;
        }

        public Criteria andBarcodeidNotIn(List<String> values) {
            addCriterion("BarCodeID not in", values, "barcodeid");
            return (Criteria) this;
        }

        public Criteria andBarcodeidBetween(String value1, String value2) {
            addCriterion("BarCodeID between", value1, value2, "barcodeid");
            return (Criteria) this;
        }

        public Criteria andBarcodeidNotBetween(String value1, String value2) {
            addCriterion("BarCodeID not between", value1, value2, "barcodeid");
            return (Criteria) this;
        }

        public Criteria andSuggestpriceIsNull() {
            addCriterion("SuggestPrice is null");
            return (Criteria) this;
        }

        public Criteria andSuggestpriceIsNotNull() {
            addCriterion("SuggestPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestpriceEqualTo(Double value) {
            addCriterion("SuggestPrice =", value, "suggestprice");
            return (Criteria) this;
        }

        public Criteria andSuggestpriceNotEqualTo(Double value) {
            addCriterion("SuggestPrice <>", value, "suggestprice");
            return (Criteria) this;
        }

        public Criteria andSuggestpriceGreaterThan(Double value) {
            addCriterion("SuggestPrice >", value, "suggestprice");
            return (Criteria) this;
        }

        public Criteria andSuggestpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("SuggestPrice >=", value, "suggestprice");
            return (Criteria) this;
        }

        public Criteria andSuggestpriceLessThan(Double value) {
            addCriterion("SuggestPrice <", value, "suggestprice");
            return (Criteria) this;
        }

        public Criteria andSuggestpriceLessThanOrEqualTo(Double value) {
            addCriterion("SuggestPrice <=", value, "suggestprice");
            return (Criteria) this;
        }

        public Criteria andSuggestpriceIn(List<Double> values) {
            addCriterion("SuggestPrice in", values, "suggestprice");
            return (Criteria) this;
        }

        public Criteria andSuggestpriceNotIn(List<Double> values) {
            addCriterion("SuggestPrice not in", values, "suggestprice");
            return (Criteria) this;
        }

        public Criteria andSuggestpriceBetween(Double value1, Double value2) {
            addCriterion("SuggestPrice between", value1, value2, "suggestprice");
            return (Criteria) this;
        }

        public Criteria andSuggestpriceNotBetween(Double value1, Double value2) {
            addCriterion("SuggestPrice not between", value1, value2, "suggestprice");
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

        public Criteria andCurridEqualTo(Integer value) {
            addCriterion("CurrID =", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridNotEqualTo(Integer value) {
            addCriterion("CurrID <>", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridGreaterThan(Integer value) {
            addCriterion("CurrID >", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridGreaterThanOrEqualTo(Integer value) {
            addCriterion("CurrID >=", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridLessThan(Integer value) {
            addCriterion("CurrID <", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridLessThanOrEqualTo(Integer value) {
            addCriterion("CurrID <=", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridIn(List<Integer> values) {
            addCriterion("CurrID in", values, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridNotIn(List<Integer> values) {
            addCriterion("CurrID not in", values, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridBetween(Integer value1, Integer value2) {
            addCriterion("CurrID between", value1, value2, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridNotBetween(Integer value1, Integer value2) {
            addCriterion("CurrID not between", value1, value2, "currid");
            return (Criteria) this;
        }

        public Criteria andProdformIsNull() {
            addCriterion("ProdForm is null");
            return (Criteria) this;
        }

        public Criteria andProdformIsNotNull() {
            addCriterion("ProdForm is not null");
            return (Criteria) this;
        }

        public Criteria andProdformEqualTo(String value) {
            addCriterion("ProdForm =", value, "prodform");
            return (Criteria) this;
        }

        public Criteria andProdformNotEqualTo(String value) {
            addCriterion("ProdForm <>", value, "prodform");
            return (Criteria) this;
        }

        public Criteria andProdformGreaterThan(String value) {
            addCriterion("ProdForm >", value, "prodform");
            return (Criteria) this;
        }

        public Criteria andProdformGreaterThanOrEqualTo(String value) {
            addCriterion("ProdForm >=", value, "prodform");
            return (Criteria) this;
        }

        public Criteria andProdformLessThan(String value) {
            addCriterion("ProdForm <", value, "prodform");
            return (Criteria) this;
        }

        public Criteria andProdformLessThanOrEqualTo(String value) {
            addCriterion("ProdForm <=", value, "prodform");
            return (Criteria) this;
        }

        public Criteria andProdformLike(String value) {
            addCriterion("ProdForm like", value, "prodform");
            return (Criteria) this;
        }

        public Criteria andProdformNotLike(String value) {
            addCriterion("ProdForm not like", value, "prodform");
            return (Criteria) this;
        }

        public Criteria andProdformIn(List<String> values) {
            addCriterion("ProdForm in", values, "prodform");
            return (Criteria) this;
        }

        public Criteria andProdformNotIn(List<String> values) {
            addCriterion("ProdForm not in", values, "prodform");
            return (Criteria) this;
        }

        public Criteria andProdformBetween(String value1, String value2) {
            addCriterion("ProdForm between", value1, value2, "prodform");
            return (Criteria) this;
        }

        public Criteria andProdformNotBetween(String value1, String value2) {
            addCriterion("ProdForm not between", value1, value2, "prodform");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxIsNull() {
            addCriterion("PriceOfTax is null");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxIsNotNull() {
            addCriterion("PriceOfTax is not null");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxEqualTo(Integer value) {
            addCriterion("PriceOfTax =", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxNotEqualTo(Integer value) {
            addCriterion("PriceOfTax <>", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxGreaterThan(Integer value) {
            addCriterion("PriceOfTax >", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("PriceOfTax >=", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxLessThan(Integer value) {
            addCriterion("PriceOfTax <", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxLessThanOrEqualTo(Integer value) {
            addCriterion("PriceOfTax <=", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxIn(List<Integer> values) {
            addCriterion("PriceOfTax in", values, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxNotIn(List<Integer> values) {
            addCriterion("PriceOfTax not in", values, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxBetween(Integer value1, Integer value2) {
            addCriterion("PriceOfTax between", value1, value2, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxNotBetween(Integer value1, Integer value2) {
            addCriterion("PriceOfTax not between", value1, value2, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andTaxitemsidIsNull() {
            addCriterion("TaxItemsID is null");
            return (Criteria) this;
        }

        public Criteria andTaxitemsidIsNotNull() {
            addCriterion("TaxItemsID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxitemsidEqualTo(Integer value) {
            addCriterion("TaxItemsID =", value, "taxitemsid");
            return (Criteria) this;
        }

        public Criteria andTaxitemsidNotEqualTo(Integer value) {
            addCriterion("TaxItemsID <>", value, "taxitemsid");
            return (Criteria) this;
        }

        public Criteria andTaxitemsidGreaterThan(Integer value) {
            addCriterion("TaxItemsID >", value, "taxitemsid");
            return (Criteria) this;
        }

        public Criteria andTaxitemsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TaxItemsID >=", value, "taxitemsid");
            return (Criteria) this;
        }

        public Criteria andTaxitemsidLessThan(Integer value) {
            addCriterion("TaxItemsID <", value, "taxitemsid");
            return (Criteria) this;
        }

        public Criteria andTaxitemsidLessThanOrEqualTo(Integer value) {
            addCriterion("TaxItemsID <=", value, "taxitemsid");
            return (Criteria) this;
        }

        public Criteria andTaxitemsidIn(List<Integer> values) {
            addCriterion("TaxItemsID in", values, "taxitemsid");
            return (Criteria) this;
        }

        public Criteria andTaxitemsidNotIn(List<Integer> values) {
            addCriterion("TaxItemsID not in", values, "taxitemsid");
            return (Criteria) this;
        }

        public Criteria andTaxitemsidBetween(Integer value1, Integer value2) {
            addCriterion("TaxItemsID between", value1, value2, "taxitemsid");
            return (Criteria) this;
        }

        public Criteria andTaxitemsidNotBetween(Integer value1, Integer value2) {
            addCriterion("TaxItemsID not between", value1, value2, "taxitemsid");
            return (Criteria) this;
        }

        public Criteria andBusitaxrateIsNull() {
            addCriterion("BusiTaxRate is null");
            return (Criteria) this;
        }

        public Criteria andBusitaxrateIsNotNull() {
            addCriterion("BusiTaxRate is not null");
            return (Criteria) this;
        }

        public Criteria andBusitaxrateEqualTo(Double value) {
            addCriterion("BusiTaxRate =", value, "busitaxrate");
            return (Criteria) this;
        }

        public Criteria andBusitaxrateNotEqualTo(Double value) {
            addCriterion("BusiTaxRate <>", value, "busitaxrate");
            return (Criteria) this;
        }

        public Criteria andBusitaxrateGreaterThan(Double value) {
            addCriterion("BusiTaxRate >", value, "busitaxrate");
            return (Criteria) this;
        }

        public Criteria andBusitaxrateGreaterThanOrEqualTo(Double value) {
            addCriterion("BusiTaxRate >=", value, "busitaxrate");
            return (Criteria) this;
        }

        public Criteria andBusitaxrateLessThan(Double value) {
            addCriterion("BusiTaxRate <", value, "busitaxrate");
            return (Criteria) this;
        }

        public Criteria andBusitaxrateLessThanOrEqualTo(Double value) {
            addCriterion("BusiTaxRate <=", value, "busitaxrate");
            return (Criteria) this;
        }

        public Criteria andBusitaxrateIn(List<Double> values) {
            addCriterion("BusiTaxRate in", values, "busitaxrate");
            return (Criteria) this;
        }

        public Criteria andBusitaxrateNotIn(List<Double> values) {
            addCriterion("BusiTaxRate not in", values, "busitaxrate");
            return (Criteria) this;
        }

        public Criteria andBusitaxrateBetween(Double value1, Double value2) {
            addCriterion("BusiTaxRate between", value1, value2, "busitaxrate");
            return (Criteria) this;
        }

        public Criteria andBusitaxrateNotBetween(Double value1, Double value2) {
            addCriterion("BusiTaxRate not between", value1, value2, "busitaxrate");
            return (Criteria) this;
        }

        public Criteria andAdvancedaysIsNull() {
            addCriterion("AdvanceDays is null");
            return (Criteria) this;
        }

        public Criteria andAdvancedaysIsNotNull() {
            addCriterion("AdvanceDays is not null");
            return (Criteria) this;
        }

        public Criteria andAdvancedaysEqualTo(Integer value) {
            addCriterion("AdvanceDays =", value, "advancedays");
            return (Criteria) this;
        }

        public Criteria andAdvancedaysNotEqualTo(Integer value) {
            addCriterion("AdvanceDays <>", value, "advancedays");
            return (Criteria) this;
        }

        public Criteria andAdvancedaysGreaterThan(Integer value) {
            addCriterion("AdvanceDays >", value, "advancedays");
            return (Criteria) this;
        }

        public Criteria andAdvancedaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdvanceDays >=", value, "advancedays");
            return (Criteria) this;
        }

        public Criteria andAdvancedaysLessThan(Integer value) {
            addCriterion("AdvanceDays <", value, "advancedays");
            return (Criteria) this;
        }

        public Criteria andAdvancedaysLessThanOrEqualTo(Integer value) {
            addCriterion("AdvanceDays <=", value, "advancedays");
            return (Criteria) this;
        }

        public Criteria andAdvancedaysIn(List<Integer> values) {
            addCriterion("AdvanceDays in", values, "advancedays");
            return (Criteria) this;
        }

        public Criteria andAdvancedaysNotIn(List<Integer> values) {
            addCriterion("AdvanceDays not in", values, "advancedays");
            return (Criteria) this;
        }

        public Criteria andAdvancedaysBetween(Integer value1, Integer value2) {
            addCriterion("AdvanceDays between", value1, value2, "advancedays");
            return (Criteria) this;
        }

        public Criteria andAdvancedaysNotBetween(Integer value1, Integer value2) {
            addCriterion("AdvanceDays not between", value1, value2, "advancedays");
            return (Criteria) this;
        }

        public Criteria andMajorsupplierIsNull() {
            addCriterion("MajorSupplier is null");
            return (Criteria) this;
        }

        public Criteria andMajorsupplierIsNotNull() {
            addCriterion("MajorSupplier is not null");
            return (Criteria) this;
        }

        public Criteria andMajorsupplierEqualTo(Integer value) {
            addCriterion("MajorSupplier =", value, "majorsupplier");
            return (Criteria) this;
        }

        public Criteria andMajorsupplierNotEqualTo(Integer value) {
            addCriterion("MajorSupplier <>", value, "majorsupplier");
            return (Criteria) this;
        }

        public Criteria andMajorsupplierGreaterThan(Integer value) {
            addCriterion("MajorSupplier >", value, "majorsupplier");
            return (Criteria) this;
        }

        public Criteria andMajorsupplierGreaterThanOrEqualTo(Integer value) {
            addCriterion("MajorSupplier >=", value, "majorsupplier");
            return (Criteria) this;
        }

        public Criteria andMajorsupplierLessThan(Integer value) {
            addCriterion("MajorSupplier <", value, "majorsupplier");
            return (Criteria) this;
        }

        public Criteria andMajorsupplierLessThanOrEqualTo(Integer value) {
            addCriterion("MajorSupplier <=", value, "majorsupplier");
            return (Criteria) this;
        }

        public Criteria andMajorsupplierIn(List<Integer> values) {
            addCriterion("MajorSupplier in", values, "majorsupplier");
            return (Criteria) this;
        }

        public Criteria andMajorsupplierNotIn(List<Integer> values) {
            addCriterion("MajorSupplier not in", values, "majorsupplier");
            return (Criteria) this;
        }

        public Criteria andMajorsupplierBetween(Integer value1, Integer value2) {
            addCriterion("MajorSupplier between", value1, value2, "majorsupplier");
            return (Criteria) this;
        }

        public Criteria andMajorsupplierNotBetween(Integer value1, Integer value2) {
            addCriterion("MajorSupplier not between", value1, value2, "majorsupplier");
            return (Criteria) this;
        }

        public Criteria andSalespriceaIsNull() {
            addCriterion("SalesPriceA is null");
            return (Criteria) this;
        }

        public Criteria andSalespriceaIsNotNull() {
            addCriterion("SalesPriceA is not null");
            return (Criteria) this;
        }

        public Criteria andSalespriceaEqualTo(Double value) {
            addCriterion("SalesPriceA =", value, "salespricea");
            return (Criteria) this;
        }

        public Criteria andSalespriceaNotEqualTo(Double value) {
            addCriterion("SalesPriceA <>", value, "salespricea");
            return (Criteria) this;
        }

        public Criteria andSalespriceaGreaterThan(Double value) {
            addCriterion("SalesPriceA >", value, "salespricea");
            return (Criteria) this;
        }

        public Criteria andSalespriceaGreaterThanOrEqualTo(Double value) {
            addCriterion("SalesPriceA >=", value, "salespricea");
            return (Criteria) this;
        }

        public Criteria andSalespriceaLessThan(Double value) {
            addCriterion("SalesPriceA <", value, "salespricea");
            return (Criteria) this;
        }

        public Criteria andSalespriceaLessThanOrEqualTo(Double value) {
            addCriterion("SalesPriceA <=", value, "salespricea");
            return (Criteria) this;
        }

        public Criteria andSalespriceaIn(List<Double> values) {
            addCriterion("SalesPriceA in", values, "salespricea");
            return (Criteria) this;
        }

        public Criteria andSalespriceaNotIn(List<Double> values) {
            addCriterion("SalesPriceA not in", values, "salespricea");
            return (Criteria) this;
        }

        public Criteria andSalespriceaBetween(Double value1, Double value2) {
            addCriterion("SalesPriceA between", value1, value2, "salespricea");
            return (Criteria) this;
        }

        public Criteria andSalespriceaNotBetween(Double value1, Double value2) {
            addCriterion("SalesPriceA not between", value1, value2, "salespricea");
            return (Criteria) this;
        }

        public Criteria andSalespricebIsNull() {
            addCriterion("SalesPriceB is null");
            return (Criteria) this;
        }

        public Criteria andSalespricebIsNotNull() {
            addCriterion("SalesPriceB is not null");
            return (Criteria) this;
        }

        public Criteria andSalespricebEqualTo(Double value) {
            addCriterion("SalesPriceB =", value, "salespriceb");
            return (Criteria) this;
        }

        public Criteria andSalespricebNotEqualTo(Double value) {
            addCriterion("SalesPriceB <>", value, "salespriceb");
            return (Criteria) this;
        }

        public Criteria andSalespricebGreaterThan(Double value) {
            addCriterion("SalesPriceB >", value, "salespriceb");
            return (Criteria) this;
        }

        public Criteria andSalespricebGreaterThanOrEqualTo(Double value) {
            addCriterion("SalesPriceB >=", value, "salespriceb");
            return (Criteria) this;
        }

        public Criteria andSalespricebLessThan(Double value) {
            addCriterion("SalesPriceB <", value, "salespriceb");
            return (Criteria) this;
        }

        public Criteria andSalespricebLessThanOrEqualTo(Double value) {
            addCriterion("SalesPriceB <=", value, "salespriceb");
            return (Criteria) this;
        }

        public Criteria andSalespricebIn(List<Double> values) {
            addCriterion("SalesPriceB in", values, "salespriceb");
            return (Criteria) this;
        }

        public Criteria andSalespricebNotIn(List<Double> values) {
            addCriterion("SalesPriceB not in", values, "salespriceb");
            return (Criteria) this;
        }

        public Criteria andSalespricebBetween(Double value1, Double value2) {
            addCriterion("SalesPriceB between", value1, value2, "salespriceb");
            return (Criteria) this;
        }

        public Criteria andSalespricebNotBetween(Double value1, Double value2) {
            addCriterion("SalesPriceB not between", value1, value2, "salespriceb");
            return (Criteria) this;
        }

        public Criteria andSalespricecIsNull() {
            addCriterion("SalesPriceC is null");
            return (Criteria) this;
        }

        public Criteria andSalespricecIsNotNull() {
            addCriterion("SalesPriceC is not null");
            return (Criteria) this;
        }

        public Criteria andSalespricecEqualTo(Double value) {
            addCriterion("SalesPriceC =", value, "salespricec");
            return (Criteria) this;
        }

        public Criteria andSalespricecNotEqualTo(Double value) {
            addCriterion("SalesPriceC <>", value, "salespricec");
            return (Criteria) this;
        }

        public Criteria andSalespricecGreaterThan(Double value) {
            addCriterion("SalesPriceC >", value, "salespricec");
            return (Criteria) this;
        }

        public Criteria andSalespricecGreaterThanOrEqualTo(Double value) {
            addCriterion("SalesPriceC >=", value, "salespricec");
            return (Criteria) this;
        }

        public Criteria andSalespricecLessThan(Double value) {
            addCriterion("SalesPriceC <", value, "salespricec");
            return (Criteria) this;
        }

        public Criteria andSalespricecLessThanOrEqualTo(Double value) {
            addCriterion("SalesPriceC <=", value, "salespricec");
            return (Criteria) this;
        }

        public Criteria andSalespricecIn(List<Double> values) {
            addCriterion("SalesPriceC in", values, "salespricec");
            return (Criteria) this;
        }

        public Criteria andSalespricecNotIn(List<Double> values) {
            addCriterion("SalesPriceC not in", values, "salespricec");
            return (Criteria) this;
        }

        public Criteria andSalespricecBetween(Double value1, Double value2) {
            addCriterion("SalesPriceC between", value1, value2, "salespricec");
            return (Criteria) this;
        }

        public Criteria andSalespricecNotBetween(Double value1, Double value2) {
            addCriterion("SalesPriceC not between", value1, value2, "salespricec");
            return (Criteria) this;
        }

        public Criteria andSalespricedIsNull() {
            addCriterion("SalesPriceD is null");
            return (Criteria) this;
        }

        public Criteria andSalespricedIsNotNull() {
            addCriterion("SalesPriceD is not null");
            return (Criteria) this;
        }

        public Criteria andSalespricedEqualTo(Double value) {
            addCriterion("SalesPriceD =", value, "salespriced");
            return (Criteria) this;
        }

        public Criteria andSalespricedNotEqualTo(Double value) {
            addCriterion("SalesPriceD <>", value, "salespriced");
            return (Criteria) this;
        }

        public Criteria andSalespricedGreaterThan(Double value) {
            addCriterion("SalesPriceD >", value, "salespriced");
            return (Criteria) this;
        }

        public Criteria andSalespricedGreaterThanOrEqualTo(Double value) {
            addCriterion("SalesPriceD >=", value, "salespriced");
            return (Criteria) this;
        }

        public Criteria andSalespricedLessThan(Double value) {
            addCriterion("SalesPriceD <", value, "salespriced");
            return (Criteria) this;
        }

        public Criteria andSalespricedLessThanOrEqualTo(Double value) {
            addCriterion("SalesPriceD <=", value, "salespriced");
            return (Criteria) this;
        }

        public Criteria andSalespricedIn(List<Double> values) {
            addCriterion("SalesPriceD in", values, "salespriced");
            return (Criteria) this;
        }

        public Criteria andSalespricedNotIn(List<Double> values) {
            addCriterion("SalesPriceD not in", values, "salespriced");
            return (Criteria) this;
        }

        public Criteria andSalespricedBetween(Double value1, Double value2) {
            addCriterion("SalesPriceD between", value1, value2, "salespriced");
            return (Criteria) this;
        }

        public Criteria andSalespricedNotBetween(Double value1, Double value2) {
            addCriterion("SalesPriceD not between", value1, value2, "salespriced");
            return (Criteria) this;
        }

        public Criteria andSalespriceeIsNull() {
            addCriterion("SalesPriceE is null");
            return (Criteria) this;
        }

        public Criteria andSalespriceeIsNotNull() {
            addCriterion("SalesPriceE is not null");
            return (Criteria) this;
        }

        public Criteria andSalespriceeEqualTo(Double value) {
            addCriterion("SalesPriceE =", value, "salespricee");
            return (Criteria) this;
        }

        public Criteria andSalespriceeNotEqualTo(Double value) {
            addCriterion("SalesPriceE <>", value, "salespricee");
            return (Criteria) this;
        }

        public Criteria andSalespriceeGreaterThan(Double value) {
            addCriterion("SalesPriceE >", value, "salespricee");
            return (Criteria) this;
        }

        public Criteria andSalespriceeGreaterThanOrEqualTo(Double value) {
            addCriterion("SalesPriceE >=", value, "salespricee");
            return (Criteria) this;
        }

        public Criteria andSalespriceeLessThan(Double value) {
            addCriterion("SalesPriceE <", value, "salespricee");
            return (Criteria) this;
        }

        public Criteria andSalespriceeLessThanOrEqualTo(Double value) {
            addCriterion("SalesPriceE <=", value, "salespricee");
            return (Criteria) this;
        }

        public Criteria andSalespriceeIn(List<Double> values) {
            addCriterion("SalesPriceE in", values, "salespricee");
            return (Criteria) this;
        }

        public Criteria andSalespriceeNotIn(List<Double> values) {
            addCriterion("SalesPriceE not in", values, "salespricee");
            return (Criteria) this;
        }

        public Criteria andSalespriceeBetween(Double value1, Double value2) {
            addCriterion("SalesPriceE between", value1, value2, "salespricee");
            return (Criteria) this;
        }

        public Criteria andSalespriceeNotBetween(Double value1, Double value2) {
            addCriterion("SalesPriceE not between", value1, value2, "salespricee");
            return (Criteria) this;
        }

        public Criteria andStdpriceIsNull() {
            addCriterion("StdPrice is null");
            return (Criteria) this;
        }

        public Criteria andStdpriceIsNotNull() {
            addCriterion("StdPrice is not null");
            return (Criteria) this;
        }

        public Criteria andStdpriceEqualTo(Double value) {
            addCriterion("StdPrice =", value, "stdprice");
            return (Criteria) this;
        }

        public Criteria andStdpriceNotEqualTo(Double value) {
            addCriterion("StdPrice <>", value, "stdprice");
            return (Criteria) this;
        }

        public Criteria andStdpriceGreaterThan(Double value) {
            addCriterion("StdPrice >", value, "stdprice");
            return (Criteria) this;
        }

        public Criteria andStdpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("StdPrice >=", value, "stdprice");
            return (Criteria) this;
        }

        public Criteria andStdpriceLessThan(Double value) {
            addCriterion("StdPrice <", value, "stdprice");
            return (Criteria) this;
        }

        public Criteria andStdpriceLessThanOrEqualTo(Double value) {
            addCriterion("StdPrice <=", value, "stdprice");
            return (Criteria) this;
        }

        public Criteria andStdpriceIn(List<Double> values) {
            addCriterion("StdPrice in", values, "stdprice");
            return (Criteria) this;
        }

        public Criteria andStdpriceNotIn(List<Double> values) {
            addCriterion("StdPrice not in", values, "stdprice");
            return (Criteria) this;
        }

        public Criteria andStdpriceBetween(Double value1, Double value2) {
            addCriterion("StdPrice between", value1, value2, "stdprice");
            return (Criteria) this;
        }

        public Criteria andStdpriceNotBetween(Double value1, Double value2) {
            addCriterion("StdPrice not between", value1, value2, "stdprice");
            return (Criteria) this;
        }

        public Criteria andBatchusedIsNull() {
            addCriterion("BatchUsed is null");
            return (Criteria) this;
        }

        public Criteria andBatchusedIsNotNull() {
            addCriterion("BatchUsed is not null");
            return (Criteria) this;
        }

        public Criteria andBatchusedEqualTo(Integer value) {
            addCriterion("BatchUsed =", value, "batchused");
            return (Criteria) this;
        }

        public Criteria andBatchusedNotEqualTo(Integer value) {
            addCriterion("BatchUsed <>", value, "batchused");
            return (Criteria) this;
        }

        public Criteria andBatchusedGreaterThan(Integer value) {
            addCriterion("BatchUsed >", value, "batchused");
            return (Criteria) this;
        }

        public Criteria andBatchusedGreaterThanOrEqualTo(Integer value) {
            addCriterion("BatchUsed >=", value, "batchused");
            return (Criteria) this;
        }

        public Criteria andBatchusedLessThan(Integer value) {
            addCriterion("BatchUsed <", value, "batchused");
            return (Criteria) this;
        }

        public Criteria andBatchusedLessThanOrEqualTo(Integer value) {
            addCriterion("BatchUsed <=", value, "batchused");
            return (Criteria) this;
        }

        public Criteria andBatchusedIn(List<Integer> values) {
            addCriterion("BatchUsed in", values, "batchused");
            return (Criteria) this;
        }

        public Criteria andBatchusedNotIn(List<Integer> values) {
            addCriterion("BatchUsed not in", values, "batchused");
            return (Criteria) this;
        }

        public Criteria andBatchusedBetween(Integer value1, Integer value2) {
            addCriterion("BatchUsed between", value1, value2, "batchused");
            return (Criteria) this;
        }

        public Criteria andBatchusedNotBetween(Integer value1, Integer value2) {
            addCriterion("BatchUsed not between", value1, value2, "batchused");
            return (Criteria) this;
        }

        public Criteria andEffectdateusedIsNull() {
            addCriterion("EffectDateUsed is null");
            return (Criteria) this;
        }

        public Criteria andEffectdateusedIsNotNull() {
            addCriterion("EffectDateUsed is not null");
            return (Criteria) this;
        }

        public Criteria andEffectdateusedEqualTo(Integer value) {
            addCriterion("EffectDateUsed =", value, "effectdateused");
            return (Criteria) this;
        }

        public Criteria andEffectdateusedNotEqualTo(Integer value) {
            addCriterion("EffectDateUsed <>", value, "effectdateused");
            return (Criteria) this;
        }

        public Criteria andEffectdateusedGreaterThan(Integer value) {
            addCriterion("EffectDateUsed >", value, "effectdateused");
            return (Criteria) this;
        }

        public Criteria andEffectdateusedGreaterThanOrEqualTo(Integer value) {
            addCriterion("EffectDateUsed >=", value, "effectdateused");
            return (Criteria) this;
        }

        public Criteria andEffectdateusedLessThan(Integer value) {
            addCriterion("EffectDateUsed <", value, "effectdateused");
            return (Criteria) this;
        }

        public Criteria andEffectdateusedLessThanOrEqualTo(Integer value) {
            addCriterion("EffectDateUsed <=", value, "effectdateused");
            return (Criteria) this;
        }

        public Criteria andEffectdateusedIn(List<Integer> values) {
            addCriterion("EffectDateUsed in", values, "effectdateused");
            return (Criteria) this;
        }

        public Criteria andEffectdateusedNotIn(List<Integer> values) {
            addCriterion("EffectDateUsed not in", values, "effectdateused");
            return (Criteria) this;
        }

        public Criteria andEffectdateusedBetween(Integer value1, Integer value2) {
            addCriterion("EffectDateUsed between", value1, value2, "effectdateused");
            return (Criteria) this;
        }

        public Criteria andEffectdateusedNotBetween(Integer value1, Integer value2) {
            addCriterion("EffectDateUsed not between", value1, value2, "effectdateused");
            return (Criteria) this;
        }

        public Criteria andValiddateusedIsNull() {
            addCriterion("ValidDateUsed is null");
            return (Criteria) this;
        }

        public Criteria andValiddateusedIsNotNull() {
            addCriterion("ValidDateUsed is not null");
            return (Criteria) this;
        }

        public Criteria andValiddateusedEqualTo(Integer value) {
            addCriterion("ValidDateUsed =", value, "validdateused");
            return (Criteria) this;
        }

        public Criteria andValiddateusedNotEqualTo(Integer value) {
            addCriterion("ValidDateUsed <>", value, "validdateused");
            return (Criteria) this;
        }

        public Criteria andValiddateusedGreaterThan(Integer value) {
            addCriterion("ValidDateUsed >", value, "validdateused");
            return (Criteria) this;
        }

        public Criteria andValiddateusedGreaterThanOrEqualTo(Integer value) {
            addCriterion("ValidDateUsed >=", value, "validdateused");
            return (Criteria) this;
        }

        public Criteria andValiddateusedLessThan(Integer value) {
            addCriterion("ValidDateUsed <", value, "validdateused");
            return (Criteria) this;
        }

        public Criteria andValiddateusedLessThanOrEqualTo(Integer value) {
            addCriterion("ValidDateUsed <=", value, "validdateused");
            return (Criteria) this;
        }

        public Criteria andValiddateusedIn(List<Integer> values) {
            addCriterion("ValidDateUsed in", values, "validdateused");
            return (Criteria) this;
        }

        public Criteria andValiddateusedNotIn(List<Integer> values) {
            addCriterion("ValidDateUsed not in", values, "validdateused");
            return (Criteria) this;
        }

        public Criteria andValiddateusedBetween(Integer value1, Integer value2) {
            addCriterion("ValidDateUsed between", value1, value2, "validdateused");
            return (Criteria) this;
        }

        public Criteria andValiddateusedNotBetween(Integer value1, Integer value2) {
            addCriterion("ValidDateUsed not between", value1, value2, "validdateused");
            return (Criteria) this;
        }

        public Criteria andDefvaliddayIsNull() {
            addCriterion("DefValidDay is null");
            return (Criteria) this;
        }

        public Criteria andDefvaliddayIsNotNull() {
            addCriterion("DefValidDay is not null");
            return (Criteria) this;
        }

        public Criteria andDefvaliddayEqualTo(Integer value) {
            addCriterion("DefValidDay =", value, "defvalidday");
            return (Criteria) this;
        }

        public Criteria andDefvaliddayNotEqualTo(Integer value) {
            addCriterion("DefValidDay <>", value, "defvalidday");
            return (Criteria) this;
        }

        public Criteria andDefvaliddayGreaterThan(Integer value) {
            addCriterion("DefValidDay >", value, "defvalidday");
            return (Criteria) this;
        }

        public Criteria andDefvaliddayGreaterThanOrEqualTo(Integer value) {
            addCriterion("DefValidDay >=", value, "defvalidday");
            return (Criteria) this;
        }

        public Criteria andDefvaliddayLessThan(Integer value) {
            addCriterion("DefValidDay <", value, "defvalidday");
            return (Criteria) this;
        }

        public Criteria andDefvaliddayLessThanOrEqualTo(Integer value) {
            addCriterion("DefValidDay <=", value, "defvalidday");
            return (Criteria) this;
        }

        public Criteria andDefvaliddayIn(List<Integer> values) {
            addCriterion("DefValidDay in", values, "defvalidday");
            return (Criteria) this;
        }

        public Criteria andDefvaliddayNotIn(List<Integer> values) {
            addCriterion("DefValidDay not in", values, "defvalidday");
            return (Criteria) this;
        }

        public Criteria andDefvaliddayBetween(Integer value1, Integer value2) {
            addCriterion("DefValidDay between", value1, value2, "defvalidday");
            return (Criteria) this;
        }

        public Criteria andDefvaliddayNotBetween(Integer value1, Integer value2) {
            addCriterion("DefValidDay not between", value1, value2, "defvalidday");
            return (Criteria) this;
        }

        public Criteria andSafeqtyIsNull() {
            addCriterion("SafeQty is null");
            return (Criteria) this;
        }

        public Criteria andSafeqtyIsNotNull() {
            addCriterion("SafeQty is not null");
            return (Criteria) this;
        }

        public Criteria andSafeqtyEqualTo(Integer value) {
            addCriterion("SafeQty =", value, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyNotEqualTo(Integer value) {
            addCriterion("SafeQty <>", value, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyGreaterThan(Integer value) {
            addCriterion("SafeQty >", value, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("SafeQty >=", value, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyLessThan(Integer value) {
            addCriterion("SafeQty <", value, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyLessThanOrEqualTo(Integer value) {
            addCriterion("SafeQty <=", value, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyIn(List<Integer> values) {
            addCriterion("SafeQty in", values, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyNotIn(List<Integer> values) {
            addCriterion("SafeQty not in", values, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyBetween(Integer value1, Integer value2) {
            addCriterion("SafeQty between", value1, value2, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("SafeQty not between", value1, value2, "safeqty");
            return (Criteria) this;
        }

        public Criteria andBavgcostIsNull() {
            addCriterion("BAvgCost is null");
            return (Criteria) this;
        }

        public Criteria andBavgcostIsNotNull() {
            addCriterion("BAvgCost is not null");
            return (Criteria) this;
        }

        public Criteria andBavgcostEqualTo(Double value) {
            addCriterion("BAvgCost =", value, "bavgcost");
            return (Criteria) this;
        }

        public Criteria andBavgcostNotEqualTo(Double value) {
            addCriterion("BAvgCost <>", value, "bavgcost");
            return (Criteria) this;
        }

        public Criteria andBavgcostGreaterThan(Double value) {
            addCriterion("BAvgCost >", value, "bavgcost");
            return (Criteria) this;
        }

        public Criteria andBavgcostGreaterThanOrEqualTo(Double value) {
            addCriterion("BAvgCost >=", value, "bavgcost");
            return (Criteria) this;
        }

        public Criteria andBavgcostLessThan(Double value) {
            addCriterion("BAvgCost <", value, "bavgcost");
            return (Criteria) this;
        }

        public Criteria andBavgcostLessThanOrEqualTo(Double value) {
            addCriterion("BAvgCost <=", value, "bavgcost");
            return (Criteria) this;
        }

        public Criteria andBavgcostIn(List<Double> values) {
            addCriterion("BAvgCost in", values, "bavgcost");
            return (Criteria) this;
        }

        public Criteria andBavgcostNotIn(List<Double> values) {
            addCriterion("BAvgCost not in", values, "bavgcost");
            return (Criteria) this;
        }

        public Criteria andBavgcostBetween(Double value1, Double value2) {
            addCriterion("BAvgCost between", value1, value2, "bavgcost");
            return (Criteria) this;
        }

        public Criteria andBavgcostNotBetween(Double value1, Double value2) {
            addCriterion("BAvgCost not between", value1, value2, "bavgcost");
            return (Criteria) this;
        }

        public Criteria andBstdcostIsNull() {
            addCriterion("BStdCost is null");
            return (Criteria) this;
        }

        public Criteria andBstdcostIsNotNull() {
            addCriterion("BStdCost is not null");
            return (Criteria) this;
        }

        public Criteria andBstdcostEqualTo(Double value) {
            addCriterion("BStdCost =", value, "bstdcost");
            return (Criteria) this;
        }

        public Criteria andBstdcostNotEqualTo(Double value) {
            addCriterion("BStdCost <>", value, "bstdcost");
            return (Criteria) this;
        }

        public Criteria andBstdcostGreaterThan(Double value) {
            addCriterion("BStdCost >", value, "bstdcost");
            return (Criteria) this;
        }

        public Criteria andBstdcostGreaterThanOrEqualTo(Double value) {
            addCriterion("BStdCost >=", value, "bstdcost");
            return (Criteria) this;
        }

        public Criteria andBstdcostLessThan(Double value) {
            addCriterion("BStdCost <", value, "bstdcost");
            return (Criteria) this;
        }

        public Criteria andBstdcostLessThanOrEqualTo(Double value) {
            addCriterion("BStdCost <=", value, "bstdcost");
            return (Criteria) this;
        }

        public Criteria andBstdcostIn(List<Double> values) {
            addCriterion("BStdCost in", values, "bstdcost");
            return (Criteria) this;
        }

        public Criteria andBstdcostNotIn(List<Double> values) {
            addCriterion("BStdCost not in", values, "bstdcost");
            return (Criteria) this;
        }

        public Criteria andBstdcostBetween(Double value1, Double value2) {
            addCriterion("BStdCost between", value1, value2, "bstdcost");
            return (Criteria) this;
        }

        public Criteria andBstdcostNotBetween(Double value1, Double value2) {
            addCriterion("BStdCost not between", value1, value2, "bstdcost");
            return (Criteria) this;
        }

        public Criteria andCavgcostIsNull() {
            addCriterion("CAvgCost is null");
            return (Criteria) this;
        }

        public Criteria andCavgcostIsNotNull() {
            addCriterion("CAvgCost is not null");
            return (Criteria) this;
        }

        public Criteria andCavgcostEqualTo(Double value) {
            addCriterion("CAvgCost =", value, "cavgcost");
            return (Criteria) this;
        }

        public Criteria andCavgcostNotEqualTo(Double value) {
            addCriterion("CAvgCost <>", value, "cavgcost");
            return (Criteria) this;
        }

        public Criteria andCavgcostGreaterThan(Double value) {
            addCriterion("CAvgCost >", value, "cavgcost");
            return (Criteria) this;
        }

        public Criteria andCavgcostGreaterThanOrEqualTo(Double value) {
            addCriterion("CAvgCost >=", value, "cavgcost");
            return (Criteria) this;
        }

        public Criteria andCavgcostLessThan(Double value) {
            addCriterion("CAvgCost <", value, "cavgcost");
            return (Criteria) this;
        }

        public Criteria andCavgcostLessThanOrEqualTo(Double value) {
            addCriterion("CAvgCost <=", value, "cavgcost");
            return (Criteria) this;
        }

        public Criteria andCavgcostIn(List<Double> values) {
            addCriterion("CAvgCost in", values, "cavgcost");
            return (Criteria) this;
        }

        public Criteria andCavgcostNotIn(List<Double> values) {
            addCriterion("CAvgCost not in", values, "cavgcost");
            return (Criteria) this;
        }

        public Criteria andCavgcostBetween(Double value1, Double value2) {
            addCriterion("CAvgCost between", value1, value2, "cavgcost");
            return (Criteria) this;
        }

        public Criteria andCavgcostNotBetween(Double value1, Double value2) {
            addCriterion("CAvgCost not between", value1, value2, "cavgcost");
            return (Criteria) this;
        }

        public Criteria andCstdcostIsNull() {
            addCriterion("CStdCost is null");
            return (Criteria) this;
        }

        public Criteria andCstdcostIsNotNull() {
            addCriterion("CStdCost is not null");
            return (Criteria) this;
        }

        public Criteria andCstdcostEqualTo(Double value) {
            addCriterion("CStdCost =", value, "cstdcost");
            return (Criteria) this;
        }

        public Criteria andCstdcostNotEqualTo(Double value) {
            addCriterion("CStdCost <>", value, "cstdcost");
            return (Criteria) this;
        }

        public Criteria andCstdcostGreaterThan(Double value) {
            addCriterion("CStdCost >", value, "cstdcost");
            return (Criteria) this;
        }

        public Criteria andCstdcostGreaterThanOrEqualTo(Double value) {
            addCriterion("CStdCost >=", value, "cstdcost");
            return (Criteria) this;
        }

        public Criteria andCstdcostLessThan(Double value) {
            addCriterion("CStdCost <", value, "cstdcost");
            return (Criteria) this;
        }

        public Criteria andCstdcostLessThanOrEqualTo(Double value) {
            addCriterion("CStdCost <=", value, "cstdcost");
            return (Criteria) this;
        }

        public Criteria andCstdcostIn(List<Double> values) {
            addCriterion("CStdCost in", values, "cstdcost");
            return (Criteria) this;
        }

        public Criteria andCstdcostNotIn(List<Double> values) {
            addCriterion("CStdCost not in", values, "cstdcost");
            return (Criteria) this;
        }

        public Criteria andCstdcostBetween(Double value1, Double value2) {
            addCriterion("CStdCost between", value1, value2, "cstdcost");
            return (Criteria) this;
        }

        public Criteria andCstdcostNotBetween(Double value1, Double value2) {
            addCriterion("CStdCost not between", value1, value2, "cstdcost");
            return (Criteria) this;
        }

        public Criteria andBoutstockdayIsNull() {
            addCriterion("BOutStockDay is null");
            return (Criteria) this;
        }

        public Criteria andBoutstockdayIsNotNull() {
            addCriterion("BOutStockDay is not null");
            return (Criteria) this;
        }

        public Criteria andBoutstockdayEqualTo(Date value) {
            addCriterionForJDBCDate("BOutStockDay =", value, "boutstockday");
            return (Criteria) this;
        }

        public Criteria andBoutstockdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("BOutStockDay <>", value, "boutstockday");
            return (Criteria) this;
        }

        public Criteria andBoutstockdayGreaterThan(Date value) {
            addCriterionForJDBCDate("BOutStockDay >", value, "boutstockday");
            return (Criteria) this;
        }

        public Criteria andBoutstockdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BOutStockDay >=", value, "boutstockday");
            return (Criteria) this;
        }

        public Criteria andBoutstockdayLessThan(Date value) {
            addCriterionForJDBCDate("BOutStockDay <", value, "boutstockday");
            return (Criteria) this;
        }

        public Criteria andBoutstockdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BOutStockDay <=", value, "boutstockday");
            return (Criteria) this;
        }

        public Criteria andBoutstockdayIn(List<Date> values) {
            addCriterionForJDBCDate("BOutStockDay in", values, "boutstockday");
            return (Criteria) this;
        }

        public Criteria andBoutstockdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("BOutStockDay not in", values, "boutstockday");
            return (Criteria) this;
        }

        public Criteria andBoutstockdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BOutStockDay between", value1, value2, "boutstockday");
            return (Criteria) this;
        }

        public Criteria andBoutstockdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BOutStockDay not between", value1, value2, "boutstockday");
            return (Criteria) this;
        }

        public Criteria andBinstockdayIsNull() {
            addCriterion("BInStockDay is null");
            return (Criteria) this;
        }

        public Criteria andBinstockdayIsNotNull() {
            addCriterion("BInStockDay is not null");
            return (Criteria) this;
        }

        public Criteria andBinstockdayEqualTo(Date value) {
            addCriterionForJDBCDate("BInStockDay =", value, "binstockday");
            return (Criteria) this;
        }

        public Criteria andBinstockdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("BInStockDay <>", value, "binstockday");
            return (Criteria) this;
        }

        public Criteria andBinstockdayGreaterThan(Date value) {
            addCriterionForJDBCDate("BInStockDay >", value, "binstockday");
            return (Criteria) this;
        }

        public Criteria andBinstockdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BInStockDay >=", value, "binstockday");
            return (Criteria) this;
        }

        public Criteria andBinstockdayLessThan(Date value) {
            addCriterionForJDBCDate("BInStockDay <", value, "binstockday");
            return (Criteria) this;
        }

        public Criteria andBinstockdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BInStockDay <=", value, "binstockday");
            return (Criteria) this;
        }

        public Criteria andBinstockdayIn(List<Date> values) {
            addCriterionForJDBCDate("BInStockDay in", values, "binstockday");
            return (Criteria) this;
        }

        public Criteria andBinstockdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("BInStockDay not in", values, "binstockday");
            return (Criteria) this;
        }

        public Criteria andBinstockdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BInStockDay between", value1, value2, "binstockday");
            return (Criteria) this;
        }

        public Criteria andBinstockdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BInStockDay not between", value1, value2, "binstockday");
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

        public Criteria andProddescIsNull() {
            addCriterion("ProdDesc is null");
            return (Criteria) this;
        }

        public Criteria andProddescIsNotNull() {
            addCriterion("ProdDesc is not null");
            return (Criteria) this;
        }

        public Criteria andProddescEqualTo(String value) {
            addCriterion("ProdDesc =", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescNotEqualTo(String value) {
            addCriterion("ProdDesc <>", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescGreaterThan(String value) {
            addCriterion("ProdDesc >", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescGreaterThanOrEqualTo(String value) {
            addCriterion("ProdDesc >=", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescLessThan(String value) {
            addCriterion("ProdDesc <", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescLessThanOrEqualTo(String value) {
            addCriterion("ProdDesc <=", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescLike(String value) {
            addCriterion("ProdDesc like", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescNotLike(String value) {
            addCriterion("ProdDesc not like", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescIn(List<String> values) {
            addCriterion("ProdDesc in", values, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescNotIn(List<String> values) {
            addCriterion("ProdDesc not in", values, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescBetween(String value1, String value2) {
            addCriterion("ProdDesc between", value1, value2, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescNotBetween(String value1, String value2) {
            addCriterion("ProdDesc not between", value1, value2, "proddesc");
            return (Criteria) this;
        }

        public Criteria andCoulumn1IsNull() {
            addCriterion("Coulumn1 is null");
            return (Criteria) this;
        }

        public Criteria andCoulumn1IsNotNull() {
            addCriterion("Coulumn1 is not null");
            return (Criteria) this;
        }

        public Criteria andCoulumn1EqualTo(String value) {
            addCriterion("Coulumn1 =", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1NotEqualTo(String value) {
            addCriterion("Coulumn1 <>", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1GreaterThan(String value) {
            addCriterion("Coulumn1 >", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1GreaterThanOrEqualTo(String value) {
            addCriterion("Coulumn1 >=", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1LessThan(String value) {
            addCriterion("Coulumn1 <", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1LessThanOrEqualTo(String value) {
            addCriterion("Coulumn1 <=", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1Like(String value) {
            addCriterion("Coulumn1 like", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1NotLike(String value) {
            addCriterion("Coulumn1 not like", value, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1In(List<String> values) {
            addCriterion("Coulumn1 in", values, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1NotIn(List<String> values) {
            addCriterion("Coulumn1 not in", values, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1Between(String value1, String value2) {
            addCriterion("Coulumn1 between", value1, value2, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn1NotBetween(String value1, String value2) {
            addCriterion("Coulumn1 not between", value1, value2, "coulumn1");
            return (Criteria) this;
        }

        public Criteria andCoulumn2IsNull() {
            addCriterion("Coulumn2 is null");
            return (Criteria) this;
        }

        public Criteria andCoulumn2IsNotNull() {
            addCriterion("Coulumn2 is not null");
            return (Criteria) this;
        }

        public Criteria andCoulumn2EqualTo(String value) {
            addCriterion("Coulumn2 =", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2NotEqualTo(String value) {
            addCriterion("Coulumn2 <>", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2GreaterThan(String value) {
            addCriterion("Coulumn2 >", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2GreaterThanOrEqualTo(String value) {
            addCriterion("Coulumn2 >=", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2LessThan(String value) {
            addCriterion("Coulumn2 <", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2LessThanOrEqualTo(String value) {
            addCriterion("Coulumn2 <=", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2Like(String value) {
            addCriterion("Coulumn2 like", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2NotLike(String value) {
            addCriterion("Coulumn2 not like", value, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2In(List<String> values) {
            addCriterion("Coulumn2 in", values, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2NotIn(List<String> values) {
            addCriterion("Coulumn2 not in", values, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2Between(String value1, String value2) {
            addCriterion("Coulumn2 between", value1, value2, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn2NotBetween(String value1, String value2) {
            addCriterion("Coulumn2 not between", value1, value2, "coulumn2");
            return (Criteria) this;
        }

        public Criteria andCoulumn3IsNull() {
            addCriterion("Coulumn3 is null");
            return (Criteria) this;
        }

        public Criteria andCoulumn3IsNotNull() {
            addCriterion("Coulumn3 is not null");
            return (Criteria) this;
        }

        public Criteria andCoulumn3EqualTo(String value) {
            addCriterion("Coulumn3 =", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3NotEqualTo(String value) {
            addCriterion("Coulumn3 <>", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3GreaterThan(String value) {
            addCriterion("Coulumn3 >", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3GreaterThanOrEqualTo(String value) {
            addCriterion("Coulumn3 >=", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3LessThan(String value) {
            addCriterion("Coulumn3 <", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3LessThanOrEqualTo(String value) {
            addCriterion("Coulumn3 <=", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3Like(String value) {
            addCriterion("Coulumn3 like", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3NotLike(String value) {
            addCriterion("Coulumn3 not like", value, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3In(List<String> values) {
            addCriterion("Coulumn3 in", values, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3NotIn(List<String> values) {
            addCriterion("Coulumn3 not in", values, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3Between(String value1, String value2) {
            addCriterion("Coulumn3 between", value1, value2, "coulumn3");
            return (Criteria) this;
        }

        public Criteria andCoulumn3NotBetween(String value1, String value2) {
            addCriterion("Coulumn3 not between", value1, value2, "coulumn3");
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