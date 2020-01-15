package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProcurementshareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcurementshareExample() {
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

        public Criteria andPsidIsNull() {
            addCriterion("PSId is null");
            return (Criteria) this;
        }

        public Criteria andPsidIsNotNull() {
            addCriterion("PSId is not null");
            return (Criteria) this;
        }

        public Criteria andPsidEqualTo(String value) {
            addCriterion("PSId =", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotEqualTo(String value) {
            addCriterion("PSId <>", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidGreaterThan(String value) {
            addCriterion("PSId >", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidGreaterThanOrEqualTo(String value) {
            addCriterion("PSId >=", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidLessThan(String value) {
            addCriterion("PSId <", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidLessThanOrEqualTo(String value) {
            addCriterion("PSId <=", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidLike(String value) {
            addCriterion("PSId like", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotLike(String value) {
            addCriterion("PSId not like", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidIn(List<String> values) {
            addCriterion("PSId in", values, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotIn(List<String> values) {
            addCriterion("PSId not in", values, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidBetween(String value1, String value2) {
            addCriterion("PSId between", value1, value2, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotBetween(String value1, String value2) {
            addCriterion("PSId not between", value1, value2, "psid");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andMlamountIsNull() {
            addCriterion("MlAmount is null");
            return (Criteria) this;
        }

        public Criteria andMlamountIsNotNull() {
            addCriterion("MlAmount is not null");
            return (Criteria) this;
        }

        public Criteria andMlamountEqualTo(Double value) {
            addCriterion("MlAmount =", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountNotEqualTo(Double value) {
            addCriterion("MlAmount <>", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountGreaterThan(Double value) {
            addCriterion("MlAmount >", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountGreaterThanOrEqualTo(Double value) {
            addCriterion("MlAmount >=", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountLessThan(Double value) {
            addCriterion("MlAmount <", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountLessThanOrEqualTo(Double value) {
            addCriterion("MlAmount <=", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountIn(List<Double> values) {
            addCriterion("MlAmount in", values, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountNotIn(List<Double> values) {
            addCriterion("MlAmount not in", values, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountBetween(Double value1, Double value2) {
            addCriterion("MlAmount between", value1, value2, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountNotBetween(Double value1, Double value2) {
            addCriterion("MlAmount not between", value1, value2, "mlamount");
            return (Criteria) this;
        }

        public Criteria andAssignstyleIsNull() {
            addCriterion("AssignStyle is null");
            return (Criteria) this;
        }

        public Criteria andAssignstyleIsNotNull() {
            addCriterion("AssignStyle is not null");
            return (Criteria) this;
        }

        public Criteria andAssignstyleEqualTo(String value) {
            addCriterion("AssignStyle =", value, "assignstyle");
            return (Criteria) this;
        }

        public Criteria andAssignstyleNotEqualTo(String value) {
            addCriterion("AssignStyle <>", value, "assignstyle");
            return (Criteria) this;
        }

        public Criteria andAssignstyleGreaterThan(String value) {
            addCriterion("AssignStyle >", value, "assignstyle");
            return (Criteria) this;
        }

        public Criteria andAssignstyleGreaterThanOrEqualTo(String value) {
            addCriterion("AssignStyle >=", value, "assignstyle");
            return (Criteria) this;
        }

        public Criteria andAssignstyleLessThan(String value) {
            addCriterion("AssignStyle <", value, "assignstyle");
            return (Criteria) this;
        }

        public Criteria andAssignstyleLessThanOrEqualTo(String value) {
            addCriterion("AssignStyle <=", value, "assignstyle");
            return (Criteria) this;
        }

        public Criteria andAssignstyleLike(String value) {
            addCriterion("AssignStyle like", value, "assignstyle");
            return (Criteria) this;
        }

        public Criteria andAssignstyleNotLike(String value) {
            addCriterion("AssignStyle not like", value, "assignstyle");
            return (Criteria) this;
        }

        public Criteria andAssignstyleIn(List<String> values) {
            addCriterion("AssignStyle in", values, "assignstyle");
            return (Criteria) this;
        }

        public Criteria andAssignstyleNotIn(List<String> values) {
            addCriterion("AssignStyle not in", values, "assignstyle");
            return (Criteria) this;
        }

        public Criteria andAssignstyleBetween(String value1, String value2) {
            addCriterion("AssignStyle between", value1, value2, "assignstyle");
            return (Criteria) this;
        }

        public Criteria andAssignstyleNotBetween(String value1, String value2) {
            addCriterion("AssignStyle not between", value1, value2, "assignstyle");
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

        public Criteria andMakersignIsNull() {
            addCriterion("MakerSign is null");
            return (Criteria) this;
        }

        public Criteria andMakersignIsNotNull() {
            addCriterion("MakerSign is not null");
            return (Criteria) this;
        }

        public Criteria andMakersignEqualTo(String value) {
            addCriterion("MakerSign =", value, "makersign");
            return (Criteria) this;
        }

        public Criteria andMakersignNotEqualTo(String value) {
            addCriterion("MakerSign <>", value, "makersign");
            return (Criteria) this;
        }

        public Criteria andMakersignGreaterThan(String value) {
            addCriterion("MakerSign >", value, "makersign");
            return (Criteria) this;
        }

        public Criteria andMakersignGreaterThanOrEqualTo(String value) {
            addCriterion("MakerSign >=", value, "makersign");
            return (Criteria) this;
        }

        public Criteria andMakersignLessThan(String value) {
            addCriterion("MakerSign <", value, "makersign");
            return (Criteria) this;
        }

        public Criteria andMakersignLessThanOrEqualTo(String value) {
            addCriterion("MakerSign <=", value, "makersign");
            return (Criteria) this;
        }

        public Criteria andMakersignLike(String value) {
            addCriterion("MakerSign like", value, "makersign");
            return (Criteria) this;
        }

        public Criteria andMakersignNotLike(String value) {
            addCriterion("MakerSign not like", value, "makersign");
            return (Criteria) this;
        }

        public Criteria andMakersignIn(List<String> values) {
            addCriterion("MakerSign in", values, "makersign");
            return (Criteria) this;
        }

        public Criteria andMakersignNotIn(List<String> values) {
            addCriterion("MakerSign not in", values, "makersign");
            return (Criteria) this;
        }

        public Criteria andMakersignBetween(String value1, String value2) {
            addCriterion("MakerSign between", value1, value2, "makersign");
            return (Criteria) this;
        }

        public Criteria andMakersignNotBetween(String value1, String value2) {
            addCriterion("MakerSign not between", value1, value2, "makersign");
            return (Criteria) this;
        }

        public Criteria andPermittersignIsNull() {
            addCriterion("PermitterSign is null");
            return (Criteria) this;
        }

        public Criteria andPermittersignIsNotNull() {
            addCriterion("PermitterSign is not null");
            return (Criteria) this;
        }

        public Criteria andPermittersignEqualTo(String value) {
            addCriterion("PermitterSign =", value, "permittersign");
            return (Criteria) this;
        }

        public Criteria andPermittersignNotEqualTo(String value) {
            addCriterion("PermitterSign <>", value, "permittersign");
            return (Criteria) this;
        }

        public Criteria andPermittersignGreaterThan(String value) {
            addCriterion("PermitterSign >", value, "permittersign");
            return (Criteria) this;
        }

        public Criteria andPermittersignGreaterThanOrEqualTo(String value) {
            addCriterion("PermitterSign >=", value, "permittersign");
            return (Criteria) this;
        }

        public Criteria andPermittersignLessThan(String value) {
            addCriterion("PermitterSign <", value, "permittersign");
            return (Criteria) this;
        }

        public Criteria andPermittersignLessThanOrEqualTo(String value) {
            addCriterion("PermitterSign <=", value, "permittersign");
            return (Criteria) this;
        }

        public Criteria andPermittersignLike(String value) {
            addCriterion("PermitterSign like", value, "permittersign");
            return (Criteria) this;
        }

        public Criteria andPermittersignNotLike(String value) {
            addCriterion("PermitterSign not like", value, "permittersign");
            return (Criteria) this;
        }

        public Criteria andPermittersignIn(List<String> values) {
            addCriterion("PermitterSign in", values, "permittersign");
            return (Criteria) this;
        }

        public Criteria andPermittersignNotIn(List<String> values) {
            addCriterion("PermitterSign not in", values, "permittersign");
            return (Criteria) this;
        }

        public Criteria andPermittersignBetween(String value1, String value2) {
            addCriterion("PermitterSign between", value1, value2, "permittersign");
            return (Criteria) this;
        }

        public Criteria andPermittersignNotBetween(String value1, String value2) {
            addCriterion("PermitterSign not between", value1, value2, "permittersign");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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