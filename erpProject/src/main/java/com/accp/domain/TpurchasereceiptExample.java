package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TpurchasereceiptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TpurchasereceiptExample() {
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

        public Criteria andCustidEqualTo(Integer value) {
            addCriterion("CustID =", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotEqualTo(Integer value) {
            addCriterion("CustID <>", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidGreaterThan(Integer value) {
            addCriterion("CustID >", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CustID >=", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLessThan(Integer value) {
            addCriterion("CustID <", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLessThanOrEqualTo(Integer value) {
            addCriterion("CustID <=", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidIn(List<Integer> values) {
            addCriterion("CustID in", values, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotIn(List<Integer> values) {
            addCriterion("CustID not in", values, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidBetween(Integer value1, Integer value2) {
            addCriterion("CustID between", value1, value2, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotBetween(Integer value1, Integer value2) {
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

        public Criteria andSaleclassidIsNull() {
            addCriterion("SaleClassID is null");
            return (Criteria) this;
        }

        public Criteria andSaleclassidIsNotNull() {
            addCriterion("SaleClassID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleclassidEqualTo(Integer value) {
            addCriterion("SaleClassID =", value, "saleclassid");
            return (Criteria) this;
        }

        public Criteria andSaleclassidNotEqualTo(Integer value) {
            addCriterion("SaleClassID <>", value, "saleclassid");
            return (Criteria) this;
        }

        public Criteria andSaleclassidGreaterThan(Integer value) {
            addCriterion("SaleClassID >", value, "saleclassid");
            return (Criteria) this;
        }

        public Criteria andSaleclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SaleClassID >=", value, "saleclassid");
            return (Criteria) this;
        }

        public Criteria andSaleclassidLessThan(Integer value) {
            addCriterion("SaleClassID <", value, "saleclassid");
            return (Criteria) this;
        }

        public Criteria andSaleclassidLessThanOrEqualTo(Integer value) {
            addCriterion("SaleClassID <=", value, "saleclassid");
            return (Criteria) this;
        }

        public Criteria andSaleclassidIn(List<Integer> values) {
            addCriterion("SaleClassID in", values, "saleclassid");
            return (Criteria) this;
        }

        public Criteria andSaleclassidNotIn(List<Integer> values) {
            addCriterion("SaleClassID not in", values, "saleclassid");
            return (Criteria) this;
        }

        public Criteria andSaleclassidBetween(Integer value1, Integer value2) {
            addCriterion("SaleClassID between", value1, value2, "saleclassid");
            return (Criteria) this;
        }

        public Criteria andSaleclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("SaleClassID not between", value1, value2, "saleclassid");
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

        public Criteria andWareidIsNull() {
            addCriterion("WareID is null");
            return (Criteria) this;
        }

        public Criteria andWareidIsNotNull() {
            addCriterion("WareID is not null");
            return (Criteria) this;
        }

        public Criteria andWareidEqualTo(Integer value) {
            addCriterion("WareID =", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidNotEqualTo(Integer value) {
            addCriterion("WareID <>", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidGreaterThan(Integer value) {
            addCriterion("WareID >", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WareID >=", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidLessThan(Integer value) {
            addCriterion("WareID <", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidLessThanOrEqualTo(Integer value) {
            addCriterion("WareID <=", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidIn(List<Integer> values) {
            addCriterion("WareID in", values, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidNotIn(List<Integer> values) {
            addCriterion("WareID not in", values, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidBetween(Integer value1, Integer value2) {
            addCriterion("WareID between", value1, value2, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidNotBetween(Integer value1, Integer value2) {
            addCriterion("WareID not between", value1, value2, "wareid");
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

        public Criteria andProjectidIsNull() {
            addCriterion("ProjectID is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("ProjectID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("ProjectID =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("ProjectID <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("ProjectID >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProjectID >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("ProjectID <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("ProjectID <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("ProjectID in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("ProjectID not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("ProjectID between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProjectID not between", value1, value2, "projectid");
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