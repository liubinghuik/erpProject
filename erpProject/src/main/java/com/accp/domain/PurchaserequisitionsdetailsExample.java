package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaserequisitionsdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaserequisitionsdetailsExample() {
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

        public Criteria andSernoIsNull() {
            addCriterion("SerNO is null");
            return (Criteria) this;
        }

        public Criteria andSernoIsNotNull() {
            addCriterion("SerNO is not null");
            return (Criteria) this;
        }

        public Criteria andSernoEqualTo(Integer value) {
            addCriterion("SerNO =", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotEqualTo(Integer value) {
            addCriterion("SerNO <>", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoGreaterThan(Integer value) {
            addCriterion("SerNO >", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SerNO >=", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoLessThan(Integer value) {
            addCriterion("SerNO <", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoLessThanOrEqualTo(Integer value) {
            addCriterion("SerNO <=", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoIn(List<Integer> values) {
            addCriterion("SerNO in", values, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotIn(List<Integer> values) {
            addCriterion("SerNO not in", values, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoBetween(Integer value1, Integer value2) {
            addCriterion("SerNO between", value1, value2, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotBetween(Integer value1, Integer value2) {
            addCriterion("SerNO not between", value1, value2, "serno");
            return (Criteria) this;
        }

        public Criteria andProdidIsNull() {
            addCriterion("ProdID is null");
            return (Criteria) this;
        }

        public Criteria andProdidIsNotNull() {
            addCriterion("ProdID is not null");
            return (Criteria) this;
        }

        public Criteria andProdidEqualTo(Date value) {
            addCriterionForJDBCDate("ProdID =", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotEqualTo(Date value) {
            addCriterionForJDBCDate("ProdID <>", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidGreaterThan(Date value) {
            addCriterionForJDBCDate("ProdID >", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ProdID >=", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidLessThan(Date value) {
            addCriterionForJDBCDate("ProdID <", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ProdID <=", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidIn(List<Date> values) {
            addCriterionForJDBCDate("ProdID in", values, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotIn(List<Date> values) {
            addCriterionForJDBCDate("ProdID not in", values, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ProdID between", value1, value2, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ProdID not between", value1, value2, "prodid");
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

        public Criteria andSunitidIsNull() {
            addCriterion("SUnitID is null");
            return (Criteria) this;
        }

        public Criteria andSunitidIsNotNull() {
            addCriterion("SUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andSunitidEqualTo(Integer value) {
            addCriterion("SUnitID =", value, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidNotEqualTo(Integer value) {
            addCriterion("SUnitID <>", value, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidGreaterThan(Integer value) {
            addCriterion("SUnitID >", value, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUnitID >=", value, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidLessThan(Integer value) {
            addCriterion("SUnitID <", value, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidLessThanOrEqualTo(Integer value) {
            addCriterion("SUnitID <=", value, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidIn(List<Integer> values) {
            addCriterion("SUnitID in", values, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidNotIn(List<Integer> values) {
            addCriterion("SUnitID not in", values, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidBetween(Integer value1, Integer value2) {
            addCriterion("SUnitID between", value1, value2, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("SUnitID not between", value1, value2, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSquantityIsNull() {
            addCriterion("SQuantity is null");
            return (Criteria) this;
        }

        public Criteria andSquantityIsNotNull() {
            addCriterion("SQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andSquantityEqualTo(Integer value) {
            addCriterion("SQuantity =", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityNotEqualTo(Integer value) {
            addCriterion("SQuantity <>", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityGreaterThan(Integer value) {
            addCriterion("SQuantity >", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("SQuantity >=", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityLessThan(Integer value) {
            addCriterion("SQuantity <", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityLessThanOrEqualTo(Integer value) {
            addCriterion("SQuantity <=", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityIn(List<Integer> values) {
            addCriterion("SQuantity in", values, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityNotIn(List<Integer> values) {
            addCriterion("SQuantity not in", values, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityBetween(Integer value1, Integer value2) {
            addCriterion("SQuantity between", value1, value2, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("SQuantity not between", value1, value2, "squantity");
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

        public Criteria andSpriceIsNull() {
            addCriterion("SPrice is null");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNotNull() {
            addCriterion("SPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSpriceEqualTo(Double value) {
            addCriterion("SPrice =", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotEqualTo(Double value) {
            addCriterion("SPrice <>", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThan(Double value) {
            addCriterion("SPrice >", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("SPrice >=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThan(Double value) {
            addCriterion("SPrice <", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThanOrEqualTo(Double value) {
            addCriterion("SPrice <=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceIn(List<Double> values) {
            addCriterion("SPrice in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotIn(List<Double> values) {
            addCriterion("SPrice not in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceBetween(Double value1, Double value2) {
            addCriterion("SPrice between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotBetween(Double value1, Double value2) {
            addCriterion("SPrice not between", value1, value2, "sprice");
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

        public Criteria andLastestcurridIsNull() {
            addCriterion("LastestCurrID is null");
            return (Criteria) this;
        }

        public Criteria andLastestcurridIsNotNull() {
            addCriterion("LastestCurrID is not null");
            return (Criteria) this;
        }

        public Criteria andLastestcurridEqualTo(Integer value) {
            addCriterion("LastestCurrID =", value, "lastestcurrid");
            return (Criteria) this;
        }

        public Criteria andLastestcurridNotEqualTo(Integer value) {
            addCriterion("LastestCurrID <>", value, "lastestcurrid");
            return (Criteria) this;
        }

        public Criteria andLastestcurridGreaterThan(Integer value) {
            addCriterion("LastestCurrID >", value, "lastestcurrid");
            return (Criteria) this;
        }

        public Criteria andLastestcurridGreaterThanOrEqualTo(Integer value) {
            addCriterion("LastestCurrID >=", value, "lastestcurrid");
            return (Criteria) this;
        }

        public Criteria andLastestcurridLessThan(Integer value) {
            addCriterion("LastestCurrID <", value, "lastestcurrid");
            return (Criteria) this;
        }

        public Criteria andLastestcurridLessThanOrEqualTo(Integer value) {
            addCriterion("LastestCurrID <=", value, "lastestcurrid");
            return (Criteria) this;
        }

        public Criteria andLastestcurridIn(List<Integer> values) {
            addCriterion("LastestCurrID in", values, "lastestcurrid");
            return (Criteria) this;
        }

        public Criteria andLastestcurridNotIn(List<Integer> values) {
            addCriterion("LastestCurrID not in", values, "lastestcurrid");
            return (Criteria) this;
        }

        public Criteria andLastestcurridBetween(Integer value1, Integer value2) {
            addCriterion("LastestCurrID between", value1, value2, "lastestcurrid");
            return (Criteria) this;
        }

        public Criteria andLastestcurridNotBetween(Integer value1, Integer value2) {
            addCriterion("LastestCurrID not between", value1, value2, "lastestcurrid");
            return (Criteria) this;
        }

        public Criteria andLastestpriceIsNull() {
            addCriterion("LastestPrice is null");
            return (Criteria) this;
        }

        public Criteria andLastestpriceIsNotNull() {
            addCriterion("LastestPrice is not null");
            return (Criteria) this;
        }

        public Criteria andLastestpriceEqualTo(Double value) {
            addCriterion("LastestPrice =", value, "lastestprice");
            return (Criteria) this;
        }

        public Criteria andLastestpriceNotEqualTo(Double value) {
            addCriterion("LastestPrice <>", value, "lastestprice");
            return (Criteria) this;
        }

        public Criteria andLastestpriceGreaterThan(Double value) {
            addCriterion("LastestPrice >", value, "lastestprice");
            return (Criteria) this;
        }

        public Criteria andLastestpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("LastestPrice >=", value, "lastestprice");
            return (Criteria) this;
        }

        public Criteria andLastestpriceLessThan(Double value) {
            addCriterion("LastestPrice <", value, "lastestprice");
            return (Criteria) this;
        }

        public Criteria andLastestpriceLessThanOrEqualTo(Double value) {
            addCriterion("LastestPrice <=", value, "lastestprice");
            return (Criteria) this;
        }

        public Criteria andLastestpriceIn(List<Double> values) {
            addCriterion("LastestPrice in", values, "lastestprice");
            return (Criteria) this;
        }

        public Criteria andLastestpriceNotIn(List<Double> values) {
            addCriterion("LastestPrice not in", values, "lastestprice");
            return (Criteria) this;
        }

        public Criteria andLastestpriceBetween(Double value1, Double value2) {
            addCriterion("LastestPrice between", value1, value2, "lastestprice");
            return (Criteria) this;
        }

        public Criteria andLastestpriceNotBetween(Double value1, Double value2) {
            addCriterion("LastestPrice not between", value1, value2, "lastestprice");
            return (Criteria) this;
        }

        public Criteria andLastestamountIsNull() {
            addCriterion("LastestAmount is null");
            return (Criteria) this;
        }

        public Criteria andLastestamountIsNotNull() {
            addCriterion("LastestAmount is not null");
            return (Criteria) this;
        }

        public Criteria andLastestamountEqualTo(Double value) {
            addCriterion("LastestAmount =", value, "lastestamount");
            return (Criteria) this;
        }

        public Criteria andLastestamountNotEqualTo(Double value) {
            addCriterion("LastestAmount <>", value, "lastestamount");
            return (Criteria) this;
        }

        public Criteria andLastestamountGreaterThan(Double value) {
            addCriterion("LastestAmount >", value, "lastestamount");
            return (Criteria) this;
        }

        public Criteria andLastestamountGreaterThanOrEqualTo(Double value) {
            addCriterion("LastestAmount >=", value, "lastestamount");
            return (Criteria) this;
        }

        public Criteria andLastestamountLessThan(Double value) {
            addCriterion("LastestAmount <", value, "lastestamount");
            return (Criteria) this;
        }

        public Criteria andLastestamountLessThanOrEqualTo(Double value) {
            addCriterion("LastestAmount <=", value, "lastestamount");
            return (Criteria) this;
        }

        public Criteria andLastestamountIn(List<Double> values) {
            addCriterion("LastestAmount in", values, "lastestamount");
            return (Criteria) this;
        }

        public Criteria andLastestamountNotIn(List<Double> values) {
            addCriterion("LastestAmount not in", values, "lastestamount");
            return (Criteria) this;
        }

        public Criteria andLastestamountBetween(Double value1, Double value2) {
            addCriterion("LastestAmount between", value1, value2, "lastestamount");
            return (Criteria) this;
        }

        public Criteria andLastestamountNotBetween(Double value1, Double value2) {
            addCriterion("LastestAmount not between", value1, value2, "lastestamount");
            return (Criteria) this;
        }

        public Criteria andPreindateIsNull() {
            addCriterion("PreInDate is null");
            return (Criteria) this;
        }

        public Criteria andPreindateIsNotNull() {
            addCriterion("PreInDate is not null");
            return (Criteria) this;
        }

        public Criteria andPreindateEqualTo(Date value) {
            addCriterionForJDBCDate("PreInDate =", value, "preindate");
            return (Criteria) this;
        }

        public Criteria andPreindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PreInDate <>", value, "preindate");
            return (Criteria) this;
        }

        public Criteria andPreindateGreaterThan(Date value) {
            addCriterionForJDBCDate("PreInDate >", value, "preindate");
            return (Criteria) this;
        }

        public Criteria andPreindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PreInDate >=", value, "preindate");
            return (Criteria) this;
        }

        public Criteria andPreindateLessThan(Date value) {
            addCriterionForJDBCDate("PreInDate <", value, "preindate");
            return (Criteria) this;
        }

        public Criteria andPreindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PreInDate <=", value, "preindate");
            return (Criteria) this;
        }

        public Criteria andPreindateIn(List<Date> values) {
            addCriterionForJDBCDate("PreInDate in", values, "preindate");
            return (Criteria) this;
        }

        public Criteria andPreindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PreInDate not in", values, "preindate");
            return (Criteria) this;
        }

        public Criteria andPreindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PreInDate between", value1, value2, "preindate");
            return (Criteria) this;
        }

        public Criteria andPreindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PreInDate not between", value1, value2, "preindate");
            return (Criteria) this;
        }

        public Criteria andSuggestpurdateIsNull() {
            addCriterion("SuggestPurDate is null");
            return (Criteria) this;
        }

        public Criteria andSuggestpurdateIsNotNull() {
            addCriterion("SuggestPurDate is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestpurdateEqualTo(Date value) {
            addCriterionForJDBCDate("SuggestPurDate =", value, "suggestpurdate");
            return (Criteria) this;
        }

        public Criteria andSuggestpurdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SuggestPurDate <>", value, "suggestpurdate");
            return (Criteria) this;
        }

        public Criteria andSuggestpurdateGreaterThan(Date value) {
            addCriterionForJDBCDate("SuggestPurDate >", value, "suggestpurdate");
            return (Criteria) this;
        }

        public Criteria andSuggestpurdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SuggestPurDate >=", value, "suggestpurdate");
            return (Criteria) this;
        }

        public Criteria andSuggestpurdateLessThan(Date value) {
            addCriterionForJDBCDate("SuggestPurDate <", value, "suggestpurdate");
            return (Criteria) this;
        }

        public Criteria andSuggestpurdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SuggestPurDate <=", value, "suggestpurdate");
            return (Criteria) this;
        }

        public Criteria andSuggestpurdateIn(List<Date> values) {
            addCriterionForJDBCDate("SuggestPurDate in", values, "suggestpurdate");
            return (Criteria) this;
        }

        public Criteria andSuggestpurdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SuggestPurDate not in", values, "suggestpurdate");
            return (Criteria) this;
        }

        public Criteria andSuggestpurdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SuggestPurDate between", value1, value2, "suggestpurdate");
            return (Criteria) this;
        }

        public Criteria andSuggestpurdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SuggestPurDate not between", value1, value2, "suggestpurdate");
            return (Criteria) this;
        }

        public Criteria andQtyremainIsNull() {
            addCriterion("QtyRemain is null");
            return (Criteria) this;
        }

        public Criteria andQtyremainIsNotNull() {
            addCriterion("QtyRemain is not null");
            return (Criteria) this;
        }

        public Criteria andQtyremainEqualTo(Integer value) {
            addCriterion("QtyRemain =", value, "qtyremain");
            return (Criteria) this;
        }

        public Criteria andQtyremainNotEqualTo(Integer value) {
            addCriterion("QtyRemain <>", value, "qtyremain");
            return (Criteria) this;
        }

        public Criteria andQtyremainGreaterThan(Integer value) {
            addCriterion("QtyRemain >", value, "qtyremain");
            return (Criteria) this;
        }

        public Criteria andQtyremainGreaterThanOrEqualTo(Integer value) {
            addCriterion("QtyRemain >=", value, "qtyremain");
            return (Criteria) this;
        }

        public Criteria andQtyremainLessThan(Integer value) {
            addCriterion("QtyRemain <", value, "qtyremain");
            return (Criteria) this;
        }

        public Criteria andQtyremainLessThanOrEqualTo(Integer value) {
            addCriterion("QtyRemain <=", value, "qtyremain");
            return (Criteria) this;
        }

        public Criteria andQtyremainIn(List<Integer> values) {
            addCriterion("QtyRemain in", values, "qtyremain");
            return (Criteria) this;
        }

        public Criteria andQtyremainNotIn(List<Integer> values) {
            addCriterion("QtyRemain not in", values, "qtyremain");
            return (Criteria) this;
        }

        public Criteria andQtyremainBetween(Integer value1, Integer value2) {
            addCriterion("QtyRemain between", value1, value2, "qtyremain");
            return (Criteria) this;
        }

        public Criteria andQtyremainNotBetween(Integer value1, Integer value2) {
            addCriterion("QtyRemain not between", value1, value2, "qtyremain");
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

        public Criteria andItemremarkIsNull() {
            addCriterion("ItemRemark is null");
            return (Criteria) this;
        }

        public Criteria andItemremarkIsNotNull() {
            addCriterion("ItemRemark is not null");
            return (Criteria) this;
        }

        public Criteria andItemremarkEqualTo(String value) {
            addCriterion("ItemRemark =", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkNotEqualTo(String value) {
            addCriterion("ItemRemark <>", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkGreaterThan(String value) {
            addCriterion("ItemRemark >", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkGreaterThanOrEqualTo(String value) {
            addCriterion("ItemRemark >=", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkLessThan(String value) {
            addCriterion("ItemRemark <", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkLessThanOrEqualTo(String value) {
            addCriterion("ItemRemark <=", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkLike(String value) {
            addCriterion("ItemRemark like", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkNotLike(String value) {
            addCriterion("ItemRemark not like", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkIn(List<String> values) {
            addCriterion("ItemRemark in", values, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkNotIn(List<String> values) {
            addCriterion("ItemRemark not in", values, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkBetween(String value1, String value2) {
            addCriterion("ItemRemark between", value1, value2, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkNotBetween(String value1, String value2) {
            addCriterion("ItemRemark not between", value1, value2, "itemremark");
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