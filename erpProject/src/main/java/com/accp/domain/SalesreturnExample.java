package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SalesreturnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesreturnExample() {
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

        public Criteria andHasforeigntradeIsNull() {
            addCriterion("HasForeignTrade is null");
            return (Criteria) this;
        }

        public Criteria andHasforeigntradeIsNotNull() {
            addCriterion("HasForeignTrade is not null");
            return (Criteria) this;
        }

        public Criteria andHasforeigntradeEqualTo(String value) {
            addCriterion("HasForeignTrade =", value, "hasforeigntrade");
            return (Criteria) this;
        }

        public Criteria andHasforeigntradeNotEqualTo(String value) {
            addCriterion("HasForeignTrade <>", value, "hasforeigntrade");
            return (Criteria) this;
        }

        public Criteria andHasforeigntradeGreaterThan(String value) {
            addCriterion("HasForeignTrade >", value, "hasforeigntrade");
            return (Criteria) this;
        }

        public Criteria andHasforeigntradeGreaterThanOrEqualTo(String value) {
            addCriterion("HasForeignTrade >=", value, "hasforeigntrade");
            return (Criteria) this;
        }

        public Criteria andHasforeigntradeLessThan(String value) {
            addCriterion("HasForeignTrade <", value, "hasforeigntrade");
            return (Criteria) this;
        }

        public Criteria andHasforeigntradeLessThanOrEqualTo(String value) {
            addCriterion("HasForeignTrade <=", value, "hasforeigntrade");
            return (Criteria) this;
        }

        public Criteria andHasforeigntradeLike(String value) {
            addCriterion("HasForeignTrade like", value, "hasforeigntrade");
            return (Criteria) this;
        }

        public Criteria andHasforeigntradeNotLike(String value) {
            addCriterion("HasForeignTrade not like", value, "hasforeigntrade");
            return (Criteria) this;
        }

        public Criteria andHasforeigntradeIn(List<String> values) {
            addCriterion("HasForeignTrade in", values, "hasforeigntrade");
            return (Criteria) this;
        }

        public Criteria andHasforeigntradeNotIn(List<String> values) {
            addCriterion("HasForeignTrade not in", values, "hasforeigntrade");
            return (Criteria) this;
        }

        public Criteria andHasforeigntradeBetween(String value1, String value2) {
            addCriterion("HasForeignTrade between", value1, value2, "hasforeigntrade");
            return (Criteria) this;
        }

        public Criteria andHasforeigntradeNotBetween(String value1, String value2) {
            addCriterion("HasForeignTrade not between", value1, value2, "hasforeigntrade");
            return (Criteria) this;
        }

        public Criteria andCustidIsNull() {
            addCriterion("CustID is null");
            return (Criteria) this;
        }

        public Criteria andCustidIsNotNull() {
            addCriterion("CustID is not null");
            return (Criteria) this;
        }

        public Criteria andCustidEqualTo(String value) {
            addCriterion("CustID =", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotEqualTo(String value) {
            addCriterion("CustID <>", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidGreaterThan(String value) {
            addCriterion("CustID >", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidGreaterThanOrEqualTo(String value) {
            addCriterion("CustID >=", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLessThan(String value) {
            addCriterion("CustID <", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLessThanOrEqualTo(String value) {
            addCriterion("CustID <=", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLike(String value) {
            addCriterion("CustID like", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotLike(String value) {
            addCriterion("CustID not like", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidIn(List<String> values) {
            addCriterion("CustID in", values, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotIn(List<String> values) {
            addCriterion("CustID not in", values, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidBetween(String value1, String value2) {
            addCriterion("CustID between", value1, value2, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotBetween(String value1, String value2) {
            addCriterion("CustID not between", value1, value2, "custid");
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

        public Criteria andIsdeductIsNull() {
            addCriterion("ISDeduct is null");
            return (Criteria) this;
        }

        public Criteria andIsdeductIsNotNull() {
            addCriterion("ISDeduct is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeductEqualTo(Integer value) {
            addCriterion("ISDeduct =", value, "isdeduct");
            return (Criteria) this;
        }

        public Criteria andIsdeductNotEqualTo(Integer value) {
            addCriterion("ISDeduct <>", value, "isdeduct");
            return (Criteria) this;
        }

        public Criteria andIsdeductGreaterThan(Integer value) {
            addCriterion("ISDeduct >", value, "isdeduct");
            return (Criteria) this;
        }

        public Criteria andIsdeductGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISDeduct >=", value, "isdeduct");
            return (Criteria) this;
        }

        public Criteria andIsdeductLessThan(Integer value) {
            addCriterion("ISDeduct <", value, "isdeduct");
            return (Criteria) this;
        }

        public Criteria andIsdeductLessThanOrEqualTo(Integer value) {
            addCriterion("ISDeduct <=", value, "isdeduct");
            return (Criteria) this;
        }

        public Criteria andIsdeductIn(List<Integer> values) {
            addCriterion("ISDeduct in", values, "isdeduct");
            return (Criteria) this;
        }

        public Criteria andIsdeductNotIn(List<Integer> values) {
            addCriterion("ISDeduct not in", values, "isdeduct");
            return (Criteria) this;
        }

        public Criteria andIsdeductBetween(Integer value1, Integer value2) {
            addCriterion("ISDeduct between", value1, value2, "isdeduct");
            return (Criteria) this;
        }

        public Criteria andIsdeductNotBetween(Integer value1, Integer value2) {
            addCriterion("ISDeduct not between", value1, value2, "isdeduct");
            return (Criteria) this;
        }

        public Criteria andVouchernoIsNull() {
            addCriterion("VoucherNO is null");
            return (Criteria) this;
        }

        public Criteria andVouchernoIsNotNull() {
            addCriterion("VoucherNO is not null");
            return (Criteria) this;
        }

        public Criteria andVouchernoEqualTo(String value) {
            addCriterion("VoucherNO =", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotEqualTo(String value) {
            addCriterion("VoucherNO <>", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoGreaterThan(String value) {
            addCriterion("VoucherNO >", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoGreaterThanOrEqualTo(String value) {
            addCriterion("VoucherNO >=", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLessThan(String value) {
            addCriterion("VoucherNO <", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLessThanOrEqualTo(String value) {
            addCriterion("VoucherNO <=", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLike(String value) {
            addCriterion("VoucherNO like", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotLike(String value) {
            addCriterion("VoucherNO not like", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoIn(List<String> values) {
            addCriterion("VoucherNO in", values, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotIn(List<String> values) {
            addCriterion("VoucherNO not in", values, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoBetween(String value1, String value2) {
            addCriterion("VoucherNO between", value1, value2, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotBetween(String value1, String value2) {
            addCriterion("VoucherNO not between", value1, value2, "voucherno");
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

        public Criteria andFuhestatesIsNull() {
            addCriterion("fuhestates is null");
            return (Criteria) this;
        }

        public Criteria andFuhestatesIsNotNull() {
            addCriterion("fuhestates is not null");
            return (Criteria) this;
        }

        public Criteria andFuhestatesEqualTo(Integer value) {
            addCriterion("fuhestates =", value, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesNotEqualTo(Integer value) {
            addCriterion("fuhestates <>", value, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesGreaterThan(Integer value) {
            addCriterion("fuhestates >", value, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuhestates >=", value, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesLessThan(Integer value) {
            addCriterion("fuhestates <", value, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesLessThanOrEqualTo(Integer value) {
            addCriterion("fuhestates <=", value, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesIn(List<Integer> values) {
            addCriterion("fuhestates in", values, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesNotIn(List<Integer> values) {
            addCriterion("fuhestates not in", values, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesBetween(Integer value1, Integer value2) {
            addCriterion("fuhestates between", value1, value2, "fuhestates");
            return (Criteria) this;
        }

        public Criteria andFuhestatesNotBetween(Integer value1, Integer value2) {
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