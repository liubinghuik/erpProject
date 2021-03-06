package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseorderExample() {
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

        public Criteria andBillnoIsNull() {
            addCriterion("BillNo is null");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNotNull() {
            addCriterion("BillNo is not null");
            return (Criteria) this;
        }

        public Criteria andBillnoEqualTo(String value) {
            addCriterion("BillNo =", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotEqualTo(String value) {
            addCriterion("BillNo <>", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThan(String value) {
            addCriterion("BillNo >", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("BillNo >=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThan(String value) {
            addCriterion("BillNo <", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThanOrEqualTo(String value) {
            addCriterion("BillNo <=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLike(String value) {
            addCriterion("BillNo like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotLike(String value) {
            addCriterion("BillNo not like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoIn(List<String> values) {
            addCriterion("BillNo in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotIn(List<String> values) {
            addCriterion("BillNo not in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoBetween(String value1, String value2) {
            addCriterion("BillNo between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotBetween(String value1, String value2) {
            addCriterion("BillNo not between", value1, value2, "billno");
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

        public Criteria andCustomeridIsNull() {
            addCriterion("CustomerID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("CustomerID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("CustomerID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("CustomerID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("CustomerID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("CustomerID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("CustomerID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("CustomerID like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("CustomerID not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("CustomerID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("CustomerID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("CustomerID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("CustomerID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNull() {
            addCriterion("AddressID is null");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNotNull() {
            addCriterion("AddressID is not null");
            return (Criteria) this;
        }

        public Criteria andAddressidEqualTo(String value) {
            addCriterion("AddressID =", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotEqualTo(String value) {
            addCriterion("AddressID <>", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThan(String value) {
            addCriterion("AddressID >", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThanOrEqualTo(String value) {
            addCriterion("AddressID >=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThan(String value) {
            addCriterion("AddressID <", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThanOrEqualTo(String value) {
            addCriterion("AddressID <=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLike(String value) {
            addCriterion("AddressID like", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotLike(String value) {
            addCriterion("AddressID not like", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidIn(List<String> values) {
            addCriterion("AddressID in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotIn(List<String> values) {
            addCriterion("AddressID not in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidBetween(String value1, String value2) {
            addCriterion("AddressID between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotBetween(String value1, String value2) {
            addCriterion("AddressID not between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andBillstyleidIsNull() {
            addCriterion("BillStyleID is null");
            return (Criteria) this;
        }

        public Criteria andBillstyleidIsNotNull() {
            addCriterion("BillStyleID is not null");
            return (Criteria) this;
        }

        public Criteria andBillstyleidEqualTo(Integer value) {
            addCriterion("BillStyleID =", value, "billstyleid");
            return (Criteria) this;
        }

        public Criteria andBillstyleidNotEqualTo(Integer value) {
            addCriterion("BillStyleID <>", value, "billstyleid");
            return (Criteria) this;
        }

        public Criteria andBillstyleidGreaterThan(Integer value) {
            addCriterion("BillStyleID >", value, "billstyleid");
            return (Criteria) this;
        }

        public Criteria andBillstyleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BillStyleID >=", value, "billstyleid");
            return (Criteria) this;
        }

        public Criteria andBillstyleidLessThan(Integer value) {
            addCriterion("BillStyleID <", value, "billstyleid");
            return (Criteria) this;
        }

        public Criteria andBillstyleidLessThanOrEqualTo(Integer value) {
            addCriterion("BillStyleID <=", value, "billstyleid");
            return (Criteria) this;
        }

        public Criteria andBillstyleidIn(List<Integer> values) {
            addCriterion("BillStyleID in", values, "billstyleid");
            return (Criteria) this;
        }

        public Criteria andBillstyleidNotIn(List<Integer> values) {
            addCriterion("BillStyleID not in", values, "billstyleid");
            return (Criteria) this;
        }

        public Criteria andBillstyleidBetween(Integer value1, Integer value2) {
            addCriterion("BillStyleID between", value1, value2, "billstyleid");
            return (Criteria) this;
        }

        public Criteria andBillstyleidNotBetween(Integer value1, Integer value2) {
            addCriterion("BillStyleID not between", value1, value2, "billstyleid");
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

        public Criteria andBillstatusIsNull() {
            addCriterion("BillStatus is null");
            return (Criteria) this;
        }

        public Criteria andBillstatusIsNotNull() {
            addCriterion("BillStatus is not null");
            return (Criteria) this;
        }

        public Criteria andBillstatusEqualTo(Integer value) {
            addCriterion("BillStatus =", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotEqualTo(Integer value) {
            addCriterion("BillStatus <>", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusGreaterThan(Integer value) {
            addCriterion("BillStatus >", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("BillStatus >=", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusLessThan(Integer value) {
            addCriterion("BillStatus <", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusLessThanOrEqualTo(Integer value) {
            addCriterion("BillStatus <=", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusIn(List<Integer> values) {
            addCriterion("BillStatus in", values, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotIn(List<Integer> values) {
            addCriterion("BillStatus not in", values, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusBetween(Integer value1, Integer value2) {
            addCriterion("BillStatus between", value1, value2, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("BillStatus not between", value1, value2, "billstatus");
            return (Criteria) this;
        }

        public Criteria andOutaddressIsNull() {
            addCriterion("OutAddress is null");
            return (Criteria) this;
        }

        public Criteria andOutaddressIsNotNull() {
            addCriterion("OutAddress is not null");
            return (Criteria) this;
        }

        public Criteria andOutaddressEqualTo(String value) {
            addCriterion("OutAddress =", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressNotEqualTo(String value) {
            addCriterion("OutAddress <>", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressGreaterThan(String value) {
            addCriterion("OutAddress >", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressGreaterThanOrEqualTo(String value) {
            addCriterion("OutAddress >=", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressLessThan(String value) {
            addCriterion("OutAddress <", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressLessThanOrEqualTo(String value) {
            addCriterion("OutAddress <=", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressLike(String value) {
            addCriterion("OutAddress like", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressNotLike(String value) {
            addCriterion("OutAddress not like", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressIn(List<String> values) {
            addCriterion("OutAddress in", values, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressNotIn(List<String> values) {
            addCriterion("OutAddress not in", values, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressBetween(String value1, String value2) {
            addCriterion("OutAddress between", value1, value2, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressNotBetween(String value1, String value2) {
            addCriterion("OutAddress not between", value1, value2, "outaddress");
            return (Criteria) this;
        }

        public Criteria andSalesnameIsNull() {
            addCriterion("SalesName is null");
            return (Criteria) this;
        }

        public Criteria andSalesnameIsNotNull() {
            addCriterion("SalesName is not null");
            return (Criteria) this;
        }

        public Criteria andSalesnameEqualTo(String value) {
            addCriterion("SalesName =", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameNotEqualTo(String value) {
            addCriterion("SalesName <>", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameGreaterThan(String value) {
            addCriterion("SalesName >", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameGreaterThanOrEqualTo(String value) {
            addCriterion("SalesName >=", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameLessThan(String value) {
            addCriterion("SalesName <", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameLessThanOrEqualTo(String value) {
            addCriterion("SalesName <=", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameLike(String value) {
            addCriterion("SalesName like", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameNotLike(String value) {
            addCriterion("SalesName not like", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameIn(List<String> values) {
            addCriterion("SalesName in", values, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameNotIn(List<String> values) {
            addCriterion("SalesName not in", values, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameBetween(String value1, String value2) {
            addCriterion("SalesName between", value1, value2, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameNotBetween(String value1, String value2) {
            addCriterion("SalesName not between", value1, value2, "salesname");
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

        public Criteria andDepartidEqualTo(Integer value) {
            addCriterion("DepartID =", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotEqualTo(Integer value) {
            addCriterion("DepartID <>", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThan(Integer value) {
            addCriterion("DepartID >", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DepartID >=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThan(Integer value) {
            addCriterion("DepartID <", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThanOrEqualTo(Integer value) {
            addCriterion("DepartID <=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidIn(List<Integer> values) {
            addCriterion("DepartID in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotIn(List<Integer> values) {
            addCriterion("DepartID not in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidBetween(Integer value1, Integer value2) {
            addCriterion("DepartID between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotBetween(Integer value1, Integer value2) {
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

        public Criteria andPojectnameIsNull() {
            addCriterion("PojectName is null");
            return (Criteria) this;
        }

        public Criteria andPojectnameIsNotNull() {
            addCriterion("PojectName is not null");
            return (Criteria) this;
        }

        public Criteria andPojectnameEqualTo(String value) {
            addCriterion("PojectName =", value, "pojectname");
            return (Criteria) this;
        }

        public Criteria andPojectnameNotEqualTo(String value) {
            addCriterion("PojectName <>", value, "pojectname");
            return (Criteria) this;
        }

        public Criteria andPojectnameGreaterThan(String value) {
            addCriterion("PojectName >", value, "pojectname");
            return (Criteria) this;
        }

        public Criteria andPojectnameGreaterThanOrEqualTo(String value) {
            addCriterion("PojectName >=", value, "pojectname");
            return (Criteria) this;
        }

        public Criteria andPojectnameLessThan(String value) {
            addCriterion("PojectName <", value, "pojectname");
            return (Criteria) this;
        }

        public Criteria andPojectnameLessThanOrEqualTo(String value) {
            addCriterion("PojectName <=", value, "pojectname");
            return (Criteria) this;
        }

        public Criteria andPojectnameLike(String value) {
            addCriterion("PojectName like", value, "pojectname");
            return (Criteria) this;
        }

        public Criteria andPojectnameNotLike(String value) {
            addCriterion("PojectName not like", value, "pojectname");
            return (Criteria) this;
        }

        public Criteria andPojectnameIn(List<String> values) {
            addCriterion("PojectName in", values, "pojectname");
            return (Criteria) this;
        }

        public Criteria andPojectnameNotIn(List<String> values) {
            addCriterion("PojectName not in", values, "pojectname");
            return (Criteria) this;
        }

        public Criteria andPojectnameBetween(String value1, String value2) {
            addCriterion("PojectName between", value1, value2, "pojectname");
            return (Criteria) this;
        }

        public Criteria andPojectnameNotBetween(String value1, String value2) {
            addCriterion("PojectName not between", value1, value2, "pojectname");
            return (Criteria) this;
        }

        public Criteria andAuditIsNull() {
            addCriterion("Audit is null");
            return (Criteria) this;
        }

        public Criteria andAuditIsNotNull() {
            addCriterion("Audit is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEqualTo(Integer value) {
            addCriterion("Audit =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(Integer value) {
            addCriterion("Audit <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(Integer value) {
            addCriterion("Audit >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(Integer value) {
            addCriterion("Audit >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(Integer value) {
            addCriterion("Audit <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(Integer value) {
            addCriterion("Audit <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<Integer> values) {
            addCriterion("Audit in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<Integer> values) {
            addCriterion("Audit not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(Integer value1, Integer value2) {
            addCriterion("Audit between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(Integer value1, Integer value2) {
            addCriterion("Audit not between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andColumn1IsNull() {
            addCriterion("column1 is null");
            return (Criteria) this;
        }

        public Criteria andColumn1IsNotNull() {
            addCriterion("column1 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn1EqualTo(String value) {
            addCriterion("column1 =", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotEqualTo(String value) {
            addCriterion("column1 <>", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThan(String value) {
            addCriterion("column1 >", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThanOrEqualTo(String value) {
            addCriterion("column1 >=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThan(String value) {
            addCriterion("column1 <", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThanOrEqualTo(String value) {
            addCriterion("column1 <=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Like(String value) {
            addCriterion("column1 like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotLike(String value) {
            addCriterion("column1 not like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1In(List<String> values) {
            addCriterion("column1 in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotIn(List<String> values) {
            addCriterion("column1 not in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Between(String value1, String value2) {
            addCriterion("column1 between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotBetween(String value1, String value2) {
            addCriterion("column1 not between", value1, value2, "column1");
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