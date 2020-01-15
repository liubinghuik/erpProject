package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ModifypriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModifypriceExample() {
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

        public Criteria andMpidIsNull() {
            addCriterion("MPId is null");
            return (Criteria) this;
        }

        public Criteria andMpidIsNotNull() {
            addCriterion("MPId is not null");
            return (Criteria) this;
        }

        public Criteria andMpidEqualTo(String value) {
            addCriterion("MPId =", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotEqualTo(String value) {
            addCriterion("MPId <>", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidGreaterThan(String value) {
            addCriterion("MPId >", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidGreaterThanOrEqualTo(String value) {
            addCriterion("MPId >=", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidLessThan(String value) {
            addCriterion("MPId <", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidLessThanOrEqualTo(String value) {
            addCriterion("MPId <=", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidLike(String value) {
            addCriterion("MPId like", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotLike(String value) {
            addCriterion("MPId not like", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidIn(List<String> values) {
            addCriterion("MPId in", values, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotIn(List<String> values) {
            addCriterion("MPId not in", values, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidBetween(String value1, String value2) {
            addCriterion("MPId between", value1, value2, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotBetween(String value1, String value2) {
            addCriterion("MPId not between", value1, value2, "mpid");
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

        public Criteria andIncsubjectidIsNull() {
            addCriterion("IncSubjectId is null");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidIsNotNull() {
            addCriterion("IncSubjectId is not null");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidEqualTo(String value) {
            addCriterion("IncSubjectId =", value, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidNotEqualTo(String value) {
            addCriterion("IncSubjectId <>", value, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidGreaterThan(String value) {
            addCriterion("IncSubjectId >", value, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidGreaterThanOrEqualTo(String value) {
            addCriterion("IncSubjectId >=", value, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidLessThan(String value) {
            addCriterion("IncSubjectId <", value, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidLessThanOrEqualTo(String value) {
            addCriterion("IncSubjectId <=", value, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidLike(String value) {
            addCriterion("IncSubjectId like", value, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidNotLike(String value) {
            addCriterion("IncSubjectId not like", value, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidIn(List<String> values) {
            addCriterion("IncSubjectId in", values, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidNotIn(List<String> values) {
            addCriterion("IncSubjectId not in", values, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidBetween(String value1, String value2) {
            addCriterion("IncSubjectId between", value1, value2, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andIncsubjectidNotBetween(String value1, String value2) {
            addCriterion("IncSubjectId not between", value1, value2, "incsubjectid");
            return (Criteria) this;
        }

        public Criteria andDecsubjectidIsNull() {
            addCriterion("DecSubjectId is null");
            return (Criteria) this;
        }

        public Criteria andDecsubjectidIsNotNull() {
            addCriterion("DecSubjectId is not null");
            return (Criteria) this;
        }

        public Criteria andDecsubjectidEqualTo(String value) {
            addCriterion("DecSubjectId =", value, "decsubjectid");
            return (Criteria) this;
        }

        public Criteria andDecsubjectidNotEqualTo(String value) {
            addCriterion("DecSubjectId <>", value, "decsubjectid");
            return (Criteria) this;
        }

        public Criteria andDecsubjectidGreaterThan(String value) {
            addCriterion("DecSubjectId >", value, "decsubjectid");
            return (Criteria) this;
        }

        public Criteria andDecsubjectidGreaterThanOrEqualTo(String value) {
            addCriterion("DecSubjectId >=", value, "decsubjectid");
            return (Criteria) this;
        }

        public Criteria andDecsubjectidLessThan(String value) {
            addCriterion("DecSubjectId <", value, "decsubjectid");
            return (Criteria) this;
        }

        public Criteria andDecsubjectidLessThanOrEqualTo(String value) {
            addCriterion("DecSubjectId <=", value, "decsubjectid");
            return (Criteria) this;
        }

        public Criteria andDecsubjectidLike(String value) {
            addCriterion("DecSubjectId like", value, "decsubjectid");
            return (Criteria) this;
        }

        public Criteria andDecsubjectidNotLike(String value) {
            addCriterion("DecSubjectId not like", value, "decsubjectid");
            return (Criteria) this;
        }

        public Criteria andDecsubjectidIn(List<String> values) {
            addCriterion("DecSubjectId in", values, "decsubjectid");
            return (Criteria) this;
        }

        public Criteria andDecsubjectidNotIn(List<String> values) {
            addCriterion("DecSubjectId not in", values, "decsubjectid");
            return (Criteria) this;
        }

        public Criteria andDecsubjectidBetween(String value1, String value2) {
            addCriterion("DecSubjectId between", value1, value2, "decsubjectid");
            return (Criteria) this;
        }

        public Criteria andDecsubjectidNotBetween(String value1, String value2) {
            addCriterion("DecSubjectId not between", value1, value2, "decsubjectid");
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

        public Criteria andArrangestyleIsNull() {
            addCriterion("ArrangeStyle is null");
            return (Criteria) this;
        }

        public Criteria andArrangestyleIsNotNull() {
            addCriterion("ArrangeStyle is not null");
            return (Criteria) this;
        }

        public Criteria andArrangestyleEqualTo(String value) {
            addCriterion("ArrangeStyle =", value, "arrangestyle");
            return (Criteria) this;
        }

        public Criteria andArrangestyleNotEqualTo(String value) {
            addCriterion("ArrangeStyle <>", value, "arrangestyle");
            return (Criteria) this;
        }

        public Criteria andArrangestyleGreaterThan(String value) {
            addCriterion("ArrangeStyle >", value, "arrangestyle");
            return (Criteria) this;
        }

        public Criteria andArrangestyleGreaterThanOrEqualTo(String value) {
            addCriterion("ArrangeStyle >=", value, "arrangestyle");
            return (Criteria) this;
        }

        public Criteria andArrangestyleLessThan(String value) {
            addCriterion("ArrangeStyle <", value, "arrangestyle");
            return (Criteria) this;
        }

        public Criteria andArrangestyleLessThanOrEqualTo(String value) {
            addCriterion("ArrangeStyle <=", value, "arrangestyle");
            return (Criteria) this;
        }

        public Criteria andArrangestyleLike(String value) {
            addCriterion("ArrangeStyle like", value, "arrangestyle");
            return (Criteria) this;
        }

        public Criteria andArrangestyleNotLike(String value) {
            addCriterion("ArrangeStyle not like", value, "arrangestyle");
            return (Criteria) this;
        }

        public Criteria andArrangestyleIn(List<String> values) {
            addCriterion("ArrangeStyle in", values, "arrangestyle");
            return (Criteria) this;
        }

        public Criteria andArrangestyleNotIn(List<String> values) {
            addCriterion("ArrangeStyle not in", values, "arrangestyle");
            return (Criteria) this;
        }

        public Criteria andArrangestyleBetween(String value1, String value2) {
            addCriterion("ArrangeStyle between", value1, value2, "arrangestyle");
            return (Criteria) this;
        }

        public Criteria andArrangestyleNotBetween(String value1, String value2) {
            addCriterion("ArrangeStyle not between", value1, value2, "arrangestyle");
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

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
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