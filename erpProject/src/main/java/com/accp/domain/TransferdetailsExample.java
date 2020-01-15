package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class TransferdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransferdetailsExample() {
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

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("Unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("Unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("Unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andCurqtyIsNull() {
            addCriterion("CurQty is null");
            return (Criteria) this;
        }

        public Criteria andCurqtyIsNotNull() {
            addCriterion("CurQty is not null");
            return (Criteria) this;
        }

        public Criteria andCurqtyEqualTo(Integer value) {
            addCriterion("CurQty =", value, "curqty");
            return (Criteria) this;
        }

        public Criteria andCurqtyNotEqualTo(Integer value) {
            addCriterion("CurQty <>", value, "curqty");
            return (Criteria) this;
        }

        public Criteria andCurqtyGreaterThan(Integer value) {
            addCriterion("CurQty >", value, "curqty");
            return (Criteria) this;
        }

        public Criteria andCurqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("CurQty >=", value, "curqty");
            return (Criteria) this;
        }

        public Criteria andCurqtyLessThan(Integer value) {
            addCriterion("CurQty <", value, "curqty");
            return (Criteria) this;
        }

        public Criteria andCurqtyLessThanOrEqualTo(Integer value) {
            addCriterion("CurQty <=", value, "curqty");
            return (Criteria) this;
        }

        public Criteria andCurqtyIn(List<Integer> values) {
            addCriterion("CurQty in", values, "curqty");
            return (Criteria) this;
        }

        public Criteria andCurqtyNotIn(List<Integer> values) {
            addCriterion("CurQty not in", values, "curqty");
            return (Criteria) this;
        }

        public Criteria andCurqtyBetween(Integer value1, Integer value2) {
            addCriterion("CurQty between", value1, value2, "curqty");
            return (Criteria) this;
        }

        public Criteria andCurqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("CurQty not between", value1, value2, "curqty");
            return (Criteria) this;
        }

        public Criteria andHavebatchIsNull() {
            addCriterion("HaveBatch is null");
            return (Criteria) this;
        }

        public Criteria andHavebatchIsNotNull() {
            addCriterion("HaveBatch is not null");
            return (Criteria) this;
        }

        public Criteria andHavebatchEqualTo(String value) {
            addCriterion("HaveBatch =", value, "havebatch");
            return (Criteria) this;
        }

        public Criteria andHavebatchNotEqualTo(String value) {
            addCriterion("HaveBatch <>", value, "havebatch");
            return (Criteria) this;
        }

        public Criteria andHavebatchGreaterThan(String value) {
            addCriterion("HaveBatch >", value, "havebatch");
            return (Criteria) this;
        }

        public Criteria andHavebatchGreaterThanOrEqualTo(String value) {
            addCriterion("HaveBatch >=", value, "havebatch");
            return (Criteria) this;
        }

        public Criteria andHavebatchLessThan(String value) {
            addCriterion("HaveBatch <", value, "havebatch");
            return (Criteria) this;
        }

        public Criteria andHavebatchLessThanOrEqualTo(String value) {
            addCriterion("HaveBatch <=", value, "havebatch");
            return (Criteria) this;
        }

        public Criteria andHavebatchLike(String value) {
            addCriterion("HaveBatch like", value, "havebatch");
            return (Criteria) this;
        }

        public Criteria andHavebatchNotLike(String value) {
            addCriterion("HaveBatch not like", value, "havebatch");
            return (Criteria) this;
        }

        public Criteria andHavebatchIn(List<String> values) {
            addCriterion("HaveBatch in", values, "havebatch");
            return (Criteria) this;
        }

        public Criteria andHavebatchNotIn(List<String> values) {
            addCriterion("HaveBatch not in", values, "havebatch");
            return (Criteria) this;
        }

        public Criteria andHavebatchBetween(String value1, String value2) {
            addCriterion("HaveBatch between", value1, value2, "havebatch");
            return (Criteria) this;
        }

        public Criteria andHavebatchNotBetween(String value1, String value2) {
            addCriterion("HaveBatch not between", value1, value2, "havebatch");
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

        public Criteria andServicevalidityIsNull() {
            addCriterion("ServiceValidity is null");
            return (Criteria) this;
        }

        public Criteria andServicevalidityIsNotNull() {
            addCriterion("ServiceValidity is not null");
            return (Criteria) this;
        }

        public Criteria andServicevalidityEqualTo(String value) {
            addCriterion("ServiceValidity =", value, "servicevalidity");
            return (Criteria) this;
        }

        public Criteria andServicevalidityNotEqualTo(String value) {
            addCriterion("ServiceValidity <>", value, "servicevalidity");
            return (Criteria) this;
        }

        public Criteria andServicevalidityGreaterThan(String value) {
            addCriterion("ServiceValidity >", value, "servicevalidity");
            return (Criteria) this;
        }

        public Criteria andServicevalidityGreaterThanOrEqualTo(String value) {
            addCriterion("ServiceValidity >=", value, "servicevalidity");
            return (Criteria) this;
        }

        public Criteria andServicevalidityLessThan(String value) {
            addCriterion("ServiceValidity <", value, "servicevalidity");
            return (Criteria) this;
        }

        public Criteria andServicevalidityLessThanOrEqualTo(String value) {
            addCriterion("ServiceValidity <=", value, "servicevalidity");
            return (Criteria) this;
        }

        public Criteria andServicevalidityLike(String value) {
            addCriterion("ServiceValidity like", value, "servicevalidity");
            return (Criteria) this;
        }

        public Criteria andServicevalidityNotLike(String value) {
            addCriterion("ServiceValidity not like", value, "servicevalidity");
            return (Criteria) this;
        }

        public Criteria andServicevalidityIn(List<String> values) {
            addCriterion("ServiceValidity in", values, "servicevalidity");
            return (Criteria) this;
        }

        public Criteria andServicevalidityNotIn(List<String> values) {
            addCriterion("ServiceValidity not in", values, "servicevalidity");
            return (Criteria) this;
        }

        public Criteria andServicevalidityBetween(String value1, String value2) {
            addCriterion("ServiceValidity between", value1, value2, "servicevalidity");
            return (Criteria) this;
        }

        public Criteria andServicevalidityNotBetween(String value1, String value2) {
            addCriterion("ServiceValidity not between", value1, value2, "servicevalidity");
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