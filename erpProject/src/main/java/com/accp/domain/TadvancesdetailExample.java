package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TadvancesdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TadvancesdetailExample() {
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

        public Criteria andDateIsNull() {
            addCriterion("Date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("Date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("Date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("Date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("Date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("Date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Date not between", value1, value2, "date");
            return (Criteria) this;
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

        public Criteria andInvoiceIsNull() {
            addCriterion("Invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("Invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(String value) {
            addCriterion("Invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(String value) {
            addCriterion("Invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(String value) {
            addCriterion("Invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("Invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(String value) {
            addCriterion("Invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(String value) {
            addCriterion("Invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLike(String value) {
            addCriterion("Invoice like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotLike(String value) {
            addCriterion("Invoice not like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<String> values) {
            addCriterion("Invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<String> values) {
            addCriterion("Invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(String value1, String value2) {
            addCriterion("Invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(String value1, String value2) {
            addCriterion("Invoice not between", value1, value2, "invoice");
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

        public Criteria andTradingnameIsNull() {
            addCriterion("TradingName is null");
            return (Criteria) this;
        }

        public Criteria andTradingnameIsNotNull() {
            addCriterion("TradingName is not null");
            return (Criteria) this;
        }

        public Criteria andTradingnameEqualTo(String value) {
            addCriterion("TradingName =", value, "tradingname");
            return (Criteria) this;
        }

        public Criteria andTradingnameNotEqualTo(String value) {
            addCriterion("TradingName <>", value, "tradingname");
            return (Criteria) this;
        }

        public Criteria andTradingnameGreaterThan(String value) {
            addCriterion("TradingName >", value, "tradingname");
            return (Criteria) this;
        }

        public Criteria andTradingnameGreaterThanOrEqualTo(String value) {
            addCriterion("TradingName >=", value, "tradingname");
            return (Criteria) this;
        }

        public Criteria andTradingnameLessThan(String value) {
            addCriterion("TradingName <", value, "tradingname");
            return (Criteria) this;
        }

        public Criteria andTradingnameLessThanOrEqualTo(String value) {
            addCriterion("TradingName <=", value, "tradingname");
            return (Criteria) this;
        }

        public Criteria andTradingnameLike(String value) {
            addCriterion("TradingName like", value, "tradingname");
            return (Criteria) this;
        }

        public Criteria andTradingnameNotLike(String value) {
            addCriterion("TradingName not like", value, "tradingname");
            return (Criteria) this;
        }

        public Criteria andTradingnameIn(List<String> values) {
            addCriterion("TradingName in", values, "tradingname");
            return (Criteria) this;
        }

        public Criteria andTradingnameNotIn(List<String> values) {
            addCriterion("TradingName not in", values, "tradingname");
            return (Criteria) this;
        }

        public Criteria andTradingnameBetween(String value1, String value2) {
            addCriterion("TradingName between", value1, value2, "tradingname");
            return (Criteria) this;
        }

        public Criteria andTradingnameNotBetween(String value1, String value2) {
            addCriterion("TradingName not between", value1, value2, "tradingname");
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

        public Criteria andDepartnameIsNull() {
            addCriterion("DepartName is null");
            return (Criteria) this;
        }

        public Criteria andDepartnameIsNotNull() {
            addCriterion("DepartName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartnameEqualTo(String value) {
            addCriterion("DepartName =", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotEqualTo(String value) {
            addCriterion("DepartName <>", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThan(String value) {
            addCriterion("DepartName >", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThanOrEqualTo(String value) {
            addCriterion("DepartName >=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThan(String value) {
            addCriterion("DepartName <", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThanOrEqualTo(String value) {
            addCriterion("DepartName <=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLike(String value) {
            addCriterion("DepartName like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotLike(String value) {
            addCriterion("DepartName not like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameIn(List<String> values) {
            addCriterion("DepartName in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotIn(List<String> values) {
            addCriterion("DepartName not in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameBetween(String value1, String value2) {
            addCriterion("DepartName between", value1, value2, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotBetween(String value1, String value2) {
            addCriterion("DepartName not between", value1, value2, "departname");
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

        public Criteria andObjectnameIsNull() {
            addCriterion("ObjectName is null");
            return (Criteria) this;
        }

        public Criteria andObjectnameIsNotNull() {
            addCriterion("ObjectName is not null");
            return (Criteria) this;
        }

        public Criteria andObjectnameEqualTo(String value) {
            addCriterion("ObjectName =", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotEqualTo(String value) {
            addCriterion("ObjectName <>", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameGreaterThan(String value) {
            addCriterion("ObjectName >", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("ObjectName >=", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLessThan(String value) {
            addCriterion("ObjectName <", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLessThanOrEqualTo(String value) {
            addCriterion("ObjectName <=", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLike(String value) {
            addCriterion("ObjectName like", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotLike(String value) {
            addCriterion("ObjectName not like", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameIn(List<String> values) {
            addCriterion("ObjectName in", values, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotIn(List<String> values) {
            addCriterion("ObjectName not in", values, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameBetween(String value1, String value2) {
            addCriterion("ObjectName between", value1, value2, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotBetween(String value1, String value2) {
            addCriterion("ObjectName not between", value1, value2, "objectname");
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

        public Criteria andYdanmoneyIsNull() {
            addCriterion("YdanMoney is null");
            return (Criteria) this;
        }

        public Criteria andYdanmoneyIsNotNull() {
            addCriterion("YdanMoney is not null");
            return (Criteria) this;
        }

        public Criteria andYdanmoneyEqualTo(Double value) {
            addCriterion("YdanMoney =", value, "ydanmoney");
            return (Criteria) this;
        }

        public Criteria andYdanmoneyNotEqualTo(Double value) {
            addCriterion("YdanMoney <>", value, "ydanmoney");
            return (Criteria) this;
        }

        public Criteria andYdanmoneyGreaterThan(Double value) {
            addCriterion("YdanMoney >", value, "ydanmoney");
            return (Criteria) this;
        }

        public Criteria andYdanmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("YdanMoney >=", value, "ydanmoney");
            return (Criteria) this;
        }

        public Criteria andYdanmoneyLessThan(Double value) {
            addCriterion("YdanMoney <", value, "ydanmoney");
            return (Criteria) this;
        }

        public Criteria andYdanmoneyLessThanOrEqualTo(Double value) {
            addCriterion("YdanMoney <=", value, "ydanmoney");
            return (Criteria) this;
        }

        public Criteria andYdanmoneyIn(List<Double> values) {
            addCriterion("YdanMoney in", values, "ydanmoney");
            return (Criteria) this;
        }

        public Criteria andYdanmoneyNotIn(List<Double> values) {
            addCriterion("YdanMoney not in", values, "ydanmoney");
            return (Criteria) this;
        }

        public Criteria andYdanmoneyBetween(Double value1, Double value2) {
            addCriterion("YdanMoney between", value1, value2, "ydanmoney");
            return (Criteria) this;
        }

        public Criteria andYdanmoneyNotBetween(Double value1, Double value2) {
            addCriterion("YdanMoney not between", value1, value2, "ydanmoney");
            return (Criteria) this;
        }

        public Criteria andXxingmoneyIsNull() {
            addCriterion("XXingMoney is null");
            return (Criteria) this;
        }

        public Criteria andXxingmoneyIsNotNull() {
            addCriterion("XXingMoney is not null");
            return (Criteria) this;
        }

        public Criteria andXxingmoneyEqualTo(Double value) {
            addCriterion("XXingMoney =", value, "xxingmoney");
            return (Criteria) this;
        }

        public Criteria andXxingmoneyNotEqualTo(Double value) {
            addCriterion("XXingMoney <>", value, "xxingmoney");
            return (Criteria) this;
        }

        public Criteria andXxingmoneyGreaterThan(Double value) {
            addCriterion("XXingMoney >", value, "xxingmoney");
            return (Criteria) this;
        }

        public Criteria andXxingmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("XXingMoney >=", value, "xxingmoney");
            return (Criteria) this;
        }

        public Criteria andXxingmoneyLessThan(Double value) {
            addCriterion("XXingMoney <", value, "xxingmoney");
            return (Criteria) this;
        }

        public Criteria andXxingmoneyLessThanOrEqualTo(Double value) {
            addCriterion("XXingMoney <=", value, "xxingmoney");
            return (Criteria) this;
        }

        public Criteria andXxingmoneyIn(List<Double> values) {
            addCriterion("XXingMoney in", values, "xxingmoney");
            return (Criteria) this;
        }

        public Criteria andXxingmoneyNotIn(List<Double> values) {
            addCriterion("XXingMoney not in", values, "xxingmoney");
            return (Criteria) this;
        }

        public Criteria andXxingmoneyBetween(Double value1, Double value2) {
            addCriterion("XXingMoney between", value1, value2, "xxingmoney");
            return (Criteria) this;
        }

        public Criteria andXxingmoneyNotBetween(Double value1, Double value2) {
            addCriterion("XXingMoney not between", value1, value2, "xxingmoney");
            return (Criteria) this;
        }

        public Criteria andZrangmoneyIsNull() {
            addCriterion("ZRangMoney is null");
            return (Criteria) this;
        }

        public Criteria andZrangmoneyIsNotNull() {
            addCriterion("ZRangMoney is not null");
            return (Criteria) this;
        }

        public Criteria andZrangmoneyEqualTo(Double value) {
            addCriterion("ZRangMoney =", value, "zrangmoney");
            return (Criteria) this;
        }

        public Criteria andZrangmoneyNotEqualTo(Double value) {
            addCriterion("ZRangMoney <>", value, "zrangmoney");
            return (Criteria) this;
        }

        public Criteria andZrangmoneyGreaterThan(Double value) {
            addCriterion("ZRangMoney >", value, "zrangmoney");
            return (Criteria) this;
        }

        public Criteria andZrangmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ZRangMoney >=", value, "zrangmoney");
            return (Criteria) this;
        }

        public Criteria andZrangmoneyLessThan(Double value) {
            addCriterion("ZRangMoney <", value, "zrangmoney");
            return (Criteria) this;
        }

        public Criteria andZrangmoneyLessThanOrEqualTo(Double value) {
            addCriterion("ZRangMoney <=", value, "zrangmoney");
            return (Criteria) this;
        }

        public Criteria andZrangmoneyIn(List<Double> values) {
            addCriterion("ZRangMoney in", values, "zrangmoney");
            return (Criteria) this;
        }

        public Criteria andZrangmoneyNotIn(List<Double> values) {
            addCriterion("ZRangMoney not in", values, "zrangmoney");
            return (Criteria) this;
        }

        public Criteria andZrangmoneyBetween(Double value1, Double value2) {
            addCriterion("ZRangMoney between", value1, value2, "zrangmoney");
            return (Criteria) this;
        }

        public Criteria andZrangmoneyNotBetween(Double value1, Double value2) {
            addCriterion("ZRangMoney not between", value1, value2, "zrangmoney");
            return (Criteria) this;
        }

        public Criteria andCkuanmoneyIsNull() {
            addCriterion("CKuanMoney is null");
            return (Criteria) this;
        }

        public Criteria andCkuanmoneyIsNotNull() {
            addCriterion("CKuanMoney is not null");
            return (Criteria) this;
        }

        public Criteria andCkuanmoneyEqualTo(Double value) {
            addCriterion("CKuanMoney =", value, "ckuanmoney");
            return (Criteria) this;
        }

        public Criteria andCkuanmoneyNotEqualTo(Double value) {
            addCriterion("CKuanMoney <>", value, "ckuanmoney");
            return (Criteria) this;
        }

        public Criteria andCkuanmoneyGreaterThan(Double value) {
            addCriterion("CKuanMoney >", value, "ckuanmoney");
            return (Criteria) this;
        }

        public Criteria andCkuanmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("CKuanMoney >=", value, "ckuanmoney");
            return (Criteria) this;
        }

        public Criteria andCkuanmoneyLessThan(Double value) {
            addCriterion("CKuanMoney <", value, "ckuanmoney");
            return (Criteria) this;
        }

        public Criteria andCkuanmoneyLessThanOrEqualTo(Double value) {
            addCriterion("CKuanMoney <=", value, "ckuanmoney");
            return (Criteria) this;
        }

        public Criteria andCkuanmoneyIn(List<Double> values) {
            addCriterion("CKuanMoney in", values, "ckuanmoney");
            return (Criteria) this;
        }

        public Criteria andCkuanmoneyNotIn(List<Double> values) {
            addCriterion("CKuanMoney not in", values, "ckuanmoney");
            return (Criteria) this;
        }

        public Criteria andCkuanmoneyBetween(Double value1, Double value2) {
            addCriterion("CKuanMoney between", value1, value2, "ckuanmoney");
            return (Criteria) this;
        }

        public Criteria andCkuanmoneyNotBetween(Double value1, Double value2) {
            addCriterion("CKuanMoney not between", value1, value2, "ckuanmoney");
            return (Criteria) this;
        }

        public Criteria andCdimoneyIsNull() {
            addCriterion("CDiMoney is null");
            return (Criteria) this;
        }

        public Criteria andCdimoneyIsNotNull() {
            addCriterion("CDiMoney is not null");
            return (Criteria) this;
        }

        public Criteria andCdimoneyEqualTo(Double value) {
            addCriterion("CDiMoney =", value, "cdimoney");
            return (Criteria) this;
        }

        public Criteria andCdimoneyNotEqualTo(Double value) {
            addCriterion("CDiMoney <>", value, "cdimoney");
            return (Criteria) this;
        }

        public Criteria andCdimoneyGreaterThan(Double value) {
            addCriterion("CDiMoney >", value, "cdimoney");
            return (Criteria) this;
        }

        public Criteria andCdimoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("CDiMoney >=", value, "cdimoney");
            return (Criteria) this;
        }

        public Criteria andCdimoneyLessThan(Double value) {
            addCriterion("CDiMoney <", value, "cdimoney");
            return (Criteria) this;
        }

        public Criteria andCdimoneyLessThanOrEqualTo(Double value) {
            addCriterion("CDiMoney <=", value, "cdimoney");
            return (Criteria) this;
        }

        public Criteria andCdimoneyIn(List<Double> values) {
            addCriterion("CDiMoney in", values, "cdimoney");
            return (Criteria) this;
        }

        public Criteria andCdimoneyNotIn(List<Double> values) {
            addCriterion("CDiMoney not in", values, "cdimoney");
            return (Criteria) this;
        }

        public Criteria andCdimoneyBetween(Double value1, Double value2) {
            addCriterion("CDiMoney between", value1, value2, "cdimoney");
            return (Criteria) this;
        }

        public Criteria andCdimoneyNotBetween(Double value1, Double value2) {
            addCriterion("CDiMoney not between", value1, value2, "cdimoney");
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