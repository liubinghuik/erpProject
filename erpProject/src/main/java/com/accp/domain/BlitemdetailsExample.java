package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class BlitemdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlitemdetailsExample() {
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

        public Criteria andUnitEqualTo(Integer value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(Integer value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(Integer value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(Integer value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(Integer value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<Integer> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<Integer> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(Integer value1, Integer value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(Integer value1, Integer value2) {
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

        public Criteria andCheckqtyIsNull() {
            addCriterion("CheckQty is null");
            return (Criteria) this;
        }

        public Criteria andCheckqtyIsNotNull() {
            addCriterion("CheckQty is not null");
            return (Criteria) this;
        }

        public Criteria andCheckqtyEqualTo(Integer value) {
            addCriterion("CheckQty =", value, "checkqty");
            return (Criteria) this;
        }

        public Criteria andCheckqtyNotEqualTo(Integer value) {
            addCriterion("CheckQty <>", value, "checkqty");
            return (Criteria) this;
        }

        public Criteria andCheckqtyGreaterThan(Integer value) {
            addCriterion("CheckQty >", value, "checkqty");
            return (Criteria) this;
        }

        public Criteria andCheckqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("CheckQty >=", value, "checkqty");
            return (Criteria) this;
        }

        public Criteria andCheckqtyLessThan(Integer value) {
            addCriterion("CheckQty <", value, "checkqty");
            return (Criteria) this;
        }

        public Criteria andCheckqtyLessThanOrEqualTo(Integer value) {
            addCriterion("CheckQty <=", value, "checkqty");
            return (Criteria) this;
        }

        public Criteria andCheckqtyIn(List<Integer> values) {
            addCriterion("CheckQty in", values, "checkqty");
            return (Criteria) this;
        }

        public Criteria andCheckqtyNotIn(List<Integer> values) {
            addCriterion("CheckQty not in", values, "checkqty");
            return (Criteria) this;
        }

        public Criteria andCheckqtyBetween(Integer value1, Integer value2) {
            addCriterion("CheckQty between", value1, value2, "checkqty");
            return (Criteria) this;
        }

        public Criteria andCheckqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("CheckQty not between", value1, value2, "checkqty");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("Quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("Quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("Quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("Quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("Quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("Quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("Quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("Quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("Quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("Quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("Price not between", value1, value2, "price");
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

        public Criteria andAmountEqualTo(Float value) {
            addCriterion("Amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Float value) {
            addCriterion("Amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Float value) {
            addCriterion("Amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("Amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Float value) {
            addCriterion("Amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Float value) {
            addCriterion("Amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Float> values) {
            addCriterion("Amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Float> values) {
            addCriterion("Amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Float value1, Float value2) {
            addCriterion("Amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Float value1, Float value2) {
            addCriterion("Amount not between", value1, value2, "amount");
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