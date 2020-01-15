package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class StoreaccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreaccountExample() {
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

        public Criteria andLinenoIsNull() {
            addCriterion("lineNo is null");
            return (Criteria) this;
        }

        public Criteria andLinenoIsNotNull() {
            addCriterion("lineNo is not null");
            return (Criteria) this;
        }

        public Criteria andLinenoEqualTo(Integer value) {
            addCriterion("lineNo =", value, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoNotEqualTo(Integer value) {
            addCriterion("lineNo <>", value, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoGreaterThan(Integer value) {
            addCriterion("lineNo >", value, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("lineNo >=", value, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoLessThan(Integer value) {
            addCriterion("lineNo <", value, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoLessThanOrEqualTo(Integer value) {
            addCriterion("lineNo <=", value, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoIn(List<Integer> values) {
            addCriterion("lineNo in", values, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoNotIn(List<Integer> values) {
            addCriterion("lineNo not in", values, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoBetween(Integer value1, Integer value2) {
            addCriterion("lineNo between", value1, value2, "lineno");
            return (Criteria) this;
        }

        public Criteria andLinenoNotBetween(Integer value1, Integer value2) {
            addCriterion("lineNo not between", value1, value2, "lineno");
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

        public Criteria andBallamtIsNull() {
            addCriterion("BAllAmt is null");
            return (Criteria) this;
        }

        public Criteria andBallamtIsNotNull() {
            addCriterion("BAllAmt is not null");
            return (Criteria) this;
        }

        public Criteria andBallamtEqualTo(Integer value) {
            addCriterion("BAllAmt =", value, "ballamt");
            return (Criteria) this;
        }

        public Criteria andBallamtNotEqualTo(Integer value) {
            addCriterion("BAllAmt <>", value, "ballamt");
            return (Criteria) this;
        }

        public Criteria andBallamtGreaterThan(Integer value) {
            addCriterion("BAllAmt >", value, "ballamt");
            return (Criteria) this;
        }

        public Criteria andBallamtGreaterThanOrEqualTo(Integer value) {
            addCriterion("BAllAmt >=", value, "ballamt");
            return (Criteria) this;
        }

        public Criteria andBallamtLessThan(Integer value) {
            addCriterion("BAllAmt <", value, "ballamt");
            return (Criteria) this;
        }

        public Criteria andBallamtLessThanOrEqualTo(Integer value) {
            addCriterion("BAllAmt <=", value, "ballamt");
            return (Criteria) this;
        }

        public Criteria andBallamtIn(List<Integer> values) {
            addCriterion("BAllAmt in", values, "ballamt");
            return (Criteria) this;
        }

        public Criteria andBallamtNotIn(List<Integer> values) {
            addCriterion("BAllAmt not in", values, "ballamt");
            return (Criteria) this;
        }

        public Criteria andBallamtBetween(Integer value1, Integer value2) {
            addCriterion("BAllAmt between", value1, value2, "ballamt");
            return (Criteria) this;
        }

        public Criteria andBallamtNotBetween(Integer value1, Integer value2) {
            addCriterion("BAllAmt not between", value1, value2, "ballamt");
            return (Criteria) this;
        }

        public Criteria andCallamtIsNull() {
            addCriterion("CAllAmt is null");
            return (Criteria) this;
        }

        public Criteria andCallamtIsNotNull() {
            addCriterion("CAllAmt is not null");
            return (Criteria) this;
        }

        public Criteria andCallamtEqualTo(Integer value) {
            addCriterion("CAllAmt =", value, "callamt");
            return (Criteria) this;
        }

        public Criteria andCallamtNotEqualTo(Integer value) {
            addCriterion("CAllAmt <>", value, "callamt");
            return (Criteria) this;
        }

        public Criteria andCallamtGreaterThan(Integer value) {
            addCriterion("CAllAmt >", value, "callamt");
            return (Criteria) this;
        }

        public Criteria andCallamtGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAllAmt >=", value, "callamt");
            return (Criteria) this;
        }

        public Criteria andCallamtLessThan(Integer value) {
            addCriterion("CAllAmt <", value, "callamt");
            return (Criteria) this;
        }

        public Criteria andCallamtLessThanOrEqualTo(Integer value) {
            addCriterion("CAllAmt <=", value, "callamt");
            return (Criteria) this;
        }

        public Criteria andCallamtIn(List<Integer> values) {
            addCriterion("CAllAmt in", values, "callamt");
            return (Criteria) this;
        }

        public Criteria andCallamtNotIn(List<Integer> values) {
            addCriterion("CAllAmt not in", values, "callamt");
            return (Criteria) this;
        }

        public Criteria andCallamtBetween(Integer value1, Integer value2) {
            addCriterion("CAllAmt between", value1, value2, "callamt");
            return (Criteria) this;
        }

        public Criteria andCallamtNotBetween(Integer value1, Integer value2) {
            addCriterion("CAllAmt not between", value1, value2, "callamt");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNull() {
            addCriterion("sPrice is null");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNotNull() {
            addCriterion("sPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSpriceEqualTo(Double value) {
            addCriterion("sPrice =", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotEqualTo(Double value) {
            addCriterion("sPrice <>", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThan(Double value) {
            addCriterion("sPrice >", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sPrice >=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThan(Double value) {
            addCriterion("sPrice <", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThanOrEqualTo(Double value) {
            addCriterion("sPrice <=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceIn(List<Double> values) {
            addCriterion("sPrice in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotIn(List<Double> values) {
            addCriterion("sPrice not in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceBetween(Double value1, Double value2) {
            addCriterion("sPrice between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotBetween(Double value1, Double value2) {
            addCriterion("sPrice not between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andCallcostIsNull() {
            addCriterion("CAllCost is null");
            return (Criteria) this;
        }

        public Criteria andCallcostIsNotNull() {
            addCriterion("CAllCost is not null");
            return (Criteria) this;
        }

        public Criteria andCallcostEqualTo(Double value) {
            addCriterion("CAllCost =", value, "callcost");
            return (Criteria) this;
        }

        public Criteria andCallcostNotEqualTo(Double value) {
            addCriterion("CAllCost <>", value, "callcost");
            return (Criteria) this;
        }

        public Criteria andCallcostGreaterThan(Double value) {
            addCriterion("CAllCost >", value, "callcost");
            return (Criteria) this;
        }

        public Criteria andCallcostGreaterThanOrEqualTo(Double value) {
            addCriterion("CAllCost >=", value, "callcost");
            return (Criteria) this;
        }

        public Criteria andCallcostLessThan(Double value) {
            addCriterion("CAllCost <", value, "callcost");
            return (Criteria) this;
        }

        public Criteria andCallcostLessThanOrEqualTo(Double value) {
            addCriterion("CAllCost <=", value, "callcost");
            return (Criteria) this;
        }

        public Criteria andCallcostIn(List<Double> values) {
            addCriterion("CAllCost in", values, "callcost");
            return (Criteria) this;
        }

        public Criteria andCallcostNotIn(List<Double> values) {
            addCriterion("CAllCost not in", values, "callcost");
            return (Criteria) this;
        }

        public Criteria andCallcostBetween(Double value1, Double value2) {
            addCriterion("CAllCost between", value1, value2, "callcost");
            return (Criteria) this;
        }

        public Criteria andCallcostNotBetween(Double value1, Double value2) {
            addCriterion("CAllCost not between", value1, value2, "callcost");
            return (Criteria) this;
        }

        public Criteria andSafeqtyIsNull() {
            addCriterion("SafeQty is null");
            return (Criteria) this;
        }

        public Criteria andSafeqtyIsNotNull() {
            addCriterion("SafeQty is not null");
            return (Criteria) this;
        }

        public Criteria andSafeqtyEqualTo(Integer value) {
            addCriterion("SafeQty =", value, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyNotEqualTo(Integer value) {
            addCriterion("SafeQty <>", value, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyGreaterThan(Integer value) {
            addCriterion("SafeQty >", value, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("SafeQty >=", value, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyLessThan(Integer value) {
            addCriterion("SafeQty <", value, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyLessThanOrEqualTo(Integer value) {
            addCriterion("SafeQty <=", value, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyIn(List<Integer> values) {
            addCriterion("SafeQty in", values, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyNotIn(List<Integer> values) {
            addCriterion("SafeQty not in", values, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyBetween(Integer value1, Integer value2) {
            addCriterion("SafeQty between", value1, value2, "safeqty");
            return (Criteria) this;
        }

        public Criteria andSafeqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("SafeQty not between", value1, value2, "safeqty");
            return (Criteria) this;
        }

        public Criteria andFbegpriceIsNull() {
            addCriterion("FBegPrice is null");
            return (Criteria) this;
        }

        public Criteria andFbegpriceIsNotNull() {
            addCriterion("FBegPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFbegpriceEqualTo(Double value) {
            addCriterion("FBegPrice =", value, "fbegprice");
            return (Criteria) this;
        }

        public Criteria andFbegpriceNotEqualTo(Double value) {
            addCriterion("FBegPrice <>", value, "fbegprice");
            return (Criteria) this;
        }

        public Criteria andFbegpriceGreaterThan(Double value) {
            addCriterion("FBegPrice >", value, "fbegprice");
            return (Criteria) this;
        }

        public Criteria andFbegpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("FBegPrice >=", value, "fbegprice");
            return (Criteria) this;
        }

        public Criteria andFbegpriceLessThan(Double value) {
            addCriterion("FBegPrice <", value, "fbegprice");
            return (Criteria) this;
        }

        public Criteria andFbegpriceLessThanOrEqualTo(Double value) {
            addCriterion("FBegPrice <=", value, "fbegprice");
            return (Criteria) this;
        }

        public Criteria andFbegpriceIn(List<Double> values) {
            addCriterion("FBegPrice in", values, "fbegprice");
            return (Criteria) this;
        }

        public Criteria andFbegpriceNotIn(List<Double> values) {
            addCriterion("FBegPrice not in", values, "fbegprice");
            return (Criteria) this;
        }

        public Criteria andFbegpriceBetween(Double value1, Double value2) {
            addCriterion("FBegPrice between", value1, value2, "fbegprice");
            return (Criteria) this;
        }

        public Criteria andFbegpriceNotBetween(Double value1, Double value2) {
            addCriterion("FBegPrice not between", value1, value2, "fbegprice");
            return (Criteria) this;
        }

        public Criteria andFbegsumIsNull() {
            addCriterion("FBegSum is null");
            return (Criteria) this;
        }

        public Criteria andFbegsumIsNotNull() {
            addCriterion("FBegSum is not null");
            return (Criteria) this;
        }

        public Criteria andFbegsumEqualTo(Double value) {
            addCriterion("FBegSum =", value, "fbegsum");
            return (Criteria) this;
        }

        public Criteria andFbegsumNotEqualTo(Double value) {
            addCriterion("FBegSum <>", value, "fbegsum");
            return (Criteria) this;
        }

        public Criteria andFbegsumGreaterThan(Double value) {
            addCriterion("FBegSum >", value, "fbegsum");
            return (Criteria) this;
        }

        public Criteria andFbegsumGreaterThanOrEqualTo(Double value) {
            addCriterion("FBegSum >=", value, "fbegsum");
            return (Criteria) this;
        }

        public Criteria andFbegsumLessThan(Double value) {
            addCriterion("FBegSum <", value, "fbegsum");
            return (Criteria) this;
        }

        public Criteria andFbegsumLessThanOrEqualTo(Double value) {
            addCriterion("FBegSum <=", value, "fbegsum");
            return (Criteria) this;
        }

        public Criteria andFbegsumIn(List<Double> values) {
            addCriterion("FBegSum in", values, "fbegsum");
            return (Criteria) this;
        }

        public Criteria andFbegsumNotIn(List<Double> values) {
            addCriterion("FBegSum not in", values, "fbegsum");
            return (Criteria) this;
        }

        public Criteria andFbegsumBetween(Double value1, Double value2) {
            addCriterion("FBegSum between", value1, value2, "fbegsum");
            return (Criteria) this;
        }

        public Criteria andFbegsumNotBetween(Double value1, Double value2) {
            addCriterion("FBegSum not between", value1, value2, "fbegsum");
            return (Criteria) this;
        }

        public Criteria andJanuaryIsNull() {
            addCriterion("January is null");
            return (Criteria) this;
        }

        public Criteria andJanuaryIsNotNull() {
            addCriterion("January is not null");
            return (Criteria) this;
        }

        public Criteria andJanuaryEqualTo(Integer value) {
            addCriterion("January =", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotEqualTo(Integer value) {
            addCriterion("January <>", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryGreaterThan(Integer value) {
            addCriterion("January >", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("January >=", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryLessThan(Integer value) {
            addCriterion("January <", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryLessThanOrEqualTo(Integer value) {
            addCriterion("January <=", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryIn(List<Integer> values) {
            addCriterion("January in", values, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotIn(List<Integer> values) {
            addCriterion("January not in", values, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryBetween(Integer value1, Integer value2) {
            addCriterion("January between", value1, value2, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotBetween(Integer value1, Integer value2) {
            addCriterion("January not between", value1, value2, "january");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("Period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("Period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Integer value) {
            addCriterion("Period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Integer value) {
            addCriterion("Period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Integer value) {
            addCriterion("Period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("Period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Integer value) {
            addCriterion("Period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("Period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Integer> values) {
            addCriterion("Period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Integer> values) {
            addCriterion("Period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Integer value1, Integer value2) {
            addCriterion("Period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("Period not between", value1, value2, "period");
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