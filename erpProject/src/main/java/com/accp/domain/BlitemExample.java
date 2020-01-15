package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BlitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlitemExample() {
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

        public Criteria andAdjustdateIsNull() {
            addCriterion("AdjustDate is null");
            return (Criteria) this;
        }

        public Criteria andAdjustdateIsNotNull() {
            addCriterion("AdjustDate is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustdateEqualTo(Date value) {
            addCriterionForJDBCDate("AdjustDate =", value, "adjustdate");
            return (Criteria) this;
        }

        public Criteria andAdjustdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("AdjustDate <>", value, "adjustdate");
            return (Criteria) this;
        }

        public Criteria andAdjustdateGreaterThan(Date value) {
            addCriterionForJDBCDate("AdjustDate >", value, "adjustdate");
            return (Criteria) this;
        }

        public Criteria andAdjustdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AdjustDate >=", value, "adjustdate");
            return (Criteria) this;
        }

        public Criteria andAdjustdateLessThan(Date value) {
            addCriterionForJDBCDate("AdjustDate <", value, "adjustdate");
            return (Criteria) this;
        }

        public Criteria andAdjustdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AdjustDate <=", value, "adjustdate");
            return (Criteria) this;
        }

        public Criteria andAdjustdateIn(List<Date> values) {
            addCriterionForJDBCDate("AdjustDate in", values, "adjustdate");
            return (Criteria) this;
        }

        public Criteria andAdjustdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("AdjustDate not in", values, "adjustdate");
            return (Criteria) this;
        }

        public Criteria andAdjustdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AdjustDate between", value1, value2, "adjustdate");
            return (Criteria) this;
        }

        public Criteria andAdjustdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AdjustDate not between", value1, value2, "adjustdate");
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
            addCriterion("VoucherNo is null");
            return (Criteria) this;
        }

        public Criteria andVouchernoIsNotNull() {
            addCriterion("VoucherNo is not null");
            return (Criteria) this;
        }

        public Criteria andVouchernoEqualTo(String value) {
            addCriterion("VoucherNo =", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotEqualTo(String value) {
            addCriterion("VoucherNo <>", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoGreaterThan(String value) {
            addCriterion("VoucherNo >", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoGreaterThanOrEqualTo(String value) {
            addCriterion("VoucherNo >=", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLessThan(String value) {
            addCriterion("VoucherNo <", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLessThanOrEqualTo(String value) {
            addCriterion("VoucherNo <=", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLike(String value) {
            addCriterion("VoucherNo like", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotLike(String value) {
            addCriterion("VoucherNo not like", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoIn(List<String> values) {
            addCriterion("VoucherNo in", values, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotIn(List<String> values) {
            addCriterion("VoucherNo not in", values, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoBetween(String value1, String value2) {
            addCriterion("VoucherNo between", value1, value2, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotBetween(String value1, String value2) {
            addCriterion("VoucherNo not between", value1, value2, "voucherno");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidIsNull() {
            addCriterion("IncSubjectID is null");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidIsNotNull() {
            addCriterion("IncSubjectID is not null");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidEqualTo(Integer value) {
            addCriterion("IncSubjectID =", value, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidNotEqualTo(Integer value) {
            addCriterion("IncSubjectID <>", value, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidGreaterThan(Integer value) {
            addCriterion("IncSubjectID >", value, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("IncSubjectID >=", value, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidLessThan(Integer value) {
            addCriterion("IncSubjectID <", value, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("IncSubjectID <=", value, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidIn(List<Integer> values) {
            addCriterion("IncSubjectID in", values, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidNotIn(List<Integer> values) {
            addCriterion("IncSubjectID not in", values, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidBetween(Integer value1, Integer value2) {
            addCriterion("IncSubjectID between", value1, value2, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("IncSubjectID not between", value1, value2, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andDecsujectidIsNull() {
            addCriterion("DecSujectID is null");
            return (Criteria) this;
        }

        public Criteria andDecsujectidIsNotNull() {
            addCriterion("DecSujectID is not null");
            return (Criteria) this;
        }

        public Criteria andDecsujectidEqualTo(Integer value) {
            addCriterion("DecSujectID =", value, "decsujectid");
            return (Criteria) this;
        }

        public Criteria andDecsujectidNotEqualTo(Integer value) {
            addCriterion("DecSujectID <>", value, "decsujectid");
            return (Criteria) this;
        }

        public Criteria andDecsujectidGreaterThan(Integer value) {
            addCriterion("DecSujectID >", value, "decsujectid");
            return (Criteria) this;
        }

        public Criteria andDecsujectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DecSujectID >=", value, "decsujectid");
            return (Criteria) this;
        }

        public Criteria andDecsujectidLessThan(Integer value) {
            addCriterion("DecSujectID <", value, "decsujectid");
            return (Criteria) this;
        }

        public Criteria andDecsujectidLessThanOrEqualTo(Integer value) {
            addCriterion("DecSujectID <=", value, "decsujectid");
            return (Criteria) this;
        }

        public Criteria andDecsujectidIn(List<Integer> values) {
            addCriterion("DecSujectID in", values, "decsujectid");
            return (Criteria) this;
        }

        public Criteria andDecsujectidNotIn(List<Integer> values) {
            addCriterion("DecSujectID not in", values, "decsujectid");
            return (Criteria) this;
        }

        public Criteria andDecsujectidBetween(Integer value1, Integer value2) {
            addCriterion("DecSujectID between", value1, value2, "decsujectid");
            return (Criteria) this;
        }

        public Criteria andDecsujectidNotBetween(Integer value1, Integer value2) {
            addCriterion("DecSujectID not between", value1, value2, "decsujectid");
            return (Criteria) this;
        }

        public Criteria andZerofilterIsNull() {
            addCriterion("ZeroFilter is null");
            return (Criteria) this;
        }

        public Criteria andZerofilterIsNotNull() {
            addCriterion("ZeroFilter is not null");
            return (Criteria) this;
        }

        public Criteria andZerofilterEqualTo(Integer value) {
            addCriterion("ZeroFilter =", value, "zerofilter");
            return (Criteria) this;
        }

        public Criteria andZerofilterNotEqualTo(Integer value) {
            addCriterion("ZeroFilter <>", value, "zerofilter");
            return (Criteria) this;
        }

        public Criteria andZerofilterGreaterThan(Integer value) {
            addCriterion("ZeroFilter >", value, "zerofilter");
            return (Criteria) this;
        }

        public Criteria andZerofilterGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZeroFilter >=", value, "zerofilter");
            return (Criteria) this;
        }

        public Criteria andZerofilterLessThan(Integer value) {
            addCriterion("ZeroFilter <", value, "zerofilter");
            return (Criteria) this;
        }

        public Criteria andZerofilterLessThanOrEqualTo(Integer value) {
            addCriterion("ZeroFilter <=", value, "zerofilter");
            return (Criteria) this;
        }

        public Criteria andZerofilterIn(List<Integer> values) {
            addCriterion("ZeroFilter in", values, "zerofilter");
            return (Criteria) this;
        }

        public Criteria andZerofilterNotIn(List<Integer> values) {
            addCriterion("ZeroFilter not in", values, "zerofilter");
            return (Criteria) this;
        }

        public Criteria andZerofilterBetween(Integer value1, Integer value2) {
            addCriterion("ZeroFilter between", value1, value2, "zerofilter");
            return (Criteria) this;
        }

        public Criteria andZerofilterNotBetween(Integer value1, Integer value2) {
            addCriterion("ZeroFilter not between", value1, value2, "zerofilter");
            return (Criteria) this;
        }

        public Criteria andSalesidIsNull() {
            addCriterion("SalesID is null");
            return (Criteria) this;
        }

        public Criteria andSalesidIsNotNull() {
            addCriterion("SalesID is not null");
            return (Criteria) this;
        }

        public Criteria andSalesidEqualTo(Integer value) {
            addCriterion("SalesID =", value, "salesid");
            return (Criteria) this;
        }

        public Criteria andSalesidNotEqualTo(Integer value) {
            addCriterion("SalesID <>", value, "salesid");
            return (Criteria) this;
        }

        public Criteria andSalesidGreaterThan(Integer value) {
            addCriterion("SalesID >", value, "salesid");
            return (Criteria) this;
        }

        public Criteria andSalesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SalesID >=", value, "salesid");
            return (Criteria) this;
        }

        public Criteria andSalesidLessThan(Integer value) {
            addCriterion("SalesID <", value, "salesid");
            return (Criteria) this;
        }

        public Criteria andSalesidLessThanOrEqualTo(Integer value) {
            addCriterion("SalesID <=", value, "salesid");
            return (Criteria) this;
        }

        public Criteria andSalesidIn(List<Integer> values) {
            addCriterion("SalesID in", values, "salesid");
            return (Criteria) this;
        }

        public Criteria andSalesidNotIn(List<Integer> values) {
            addCriterion("SalesID not in", values, "salesid");
            return (Criteria) this;
        }

        public Criteria andSalesidBetween(Integer value1, Integer value2) {
            addCriterion("SalesID between", value1, value2, "salesid");
            return (Criteria) this;
        }

        public Criteria andSalesidNotBetween(Integer value1, Integer value2) {
            addCriterion("SalesID not between", value1, value2, "salesid");
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