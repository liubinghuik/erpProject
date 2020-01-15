package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ProcurementsharedetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcurementsharedetailsExample() {
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

        public Criteria andPsdidIsNull() {
            addCriterion("PSDId is null");
            return (Criteria) this;
        }

        public Criteria andPsdidIsNotNull() {
            addCriterion("PSDId is not null");
            return (Criteria) this;
        }

        public Criteria andPsdidEqualTo(String value) {
            addCriterion("PSDId =", value, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidNotEqualTo(String value) {
            addCriterion("PSDId <>", value, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidGreaterThan(String value) {
            addCriterion("PSDId >", value, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidGreaterThanOrEqualTo(String value) {
            addCriterion("PSDId >=", value, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidLessThan(String value) {
            addCriterion("PSDId <", value, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidLessThanOrEqualTo(String value) {
            addCriterion("PSDId <=", value, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidLike(String value) {
            addCriterion("PSDId like", value, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidNotLike(String value) {
            addCriterion("PSDId not like", value, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidIn(List<String> values) {
            addCriterion("PSDId in", values, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidNotIn(List<String> values) {
            addCriterion("PSDId not in", values, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidBetween(String value1, String value2) {
            addCriterion("PSDId between", value1, value2, "psdid");
            return (Criteria) this;
        }

        public Criteria andPsdidNotBetween(String value1, String value2) {
            addCriterion("PSDId not between", value1, value2, "psdid");
            return (Criteria) this;
        }

        public Criteria andPspidIsNull() {
            addCriterion("PSPId is null");
            return (Criteria) this;
        }

        public Criteria andPspidIsNotNull() {
            addCriterion("PSPId is not null");
            return (Criteria) this;
        }

        public Criteria andPspidEqualTo(String value) {
            addCriterion("PSPId =", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidNotEqualTo(String value) {
            addCriterion("PSPId <>", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidGreaterThan(String value) {
            addCriterion("PSPId >", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidGreaterThanOrEqualTo(String value) {
            addCriterion("PSPId >=", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidLessThan(String value) {
            addCriterion("PSPId <", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidLessThanOrEqualTo(String value) {
            addCriterion("PSPId <=", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidLike(String value) {
            addCriterion("PSPId like", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidNotLike(String value) {
            addCriterion("PSPId not like", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidIn(List<String> values) {
            addCriterion("PSPId in", values, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidNotIn(List<String> values) {
            addCriterion("PSPId not in", values, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidBetween(String value1, String value2) {
            addCriterion("PSPId between", value1, value2, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidNotBetween(String value1, String value2) {
            addCriterion("PSPId not between", value1, value2, "pspid");
            return (Criteria) this;
        }

        public Criteria andFromnoIsNull() {
            addCriterion("FromNO is null");
            return (Criteria) this;
        }

        public Criteria andFromnoIsNotNull() {
            addCriterion("FromNO is not null");
            return (Criteria) this;
        }

        public Criteria andFromnoEqualTo(String value) {
            addCriterion("FromNO =", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoNotEqualTo(String value) {
            addCriterion("FromNO <>", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoGreaterThan(String value) {
            addCriterion("FromNO >", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoGreaterThanOrEqualTo(String value) {
            addCriterion("FromNO >=", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoLessThan(String value) {
            addCriterion("FromNO <", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoLessThanOrEqualTo(String value) {
            addCriterion("FromNO <=", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoLike(String value) {
            addCriterion("FromNO like", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoNotLike(String value) {
            addCriterion("FromNO not like", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoIn(List<String> values) {
            addCriterion("FromNO in", values, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoNotIn(List<String> values) {
            addCriterion("FromNO not in", values, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoBetween(String value1, String value2) {
            addCriterion("FromNO between", value1, value2, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoNotBetween(String value1, String value2) {
            addCriterion("FromNO not between", value1, value2, "fromno");
            return (Criteria) this;
        }

        public Criteria andProdidIsNull() {
            addCriterion("ProdId is null");
            return (Criteria) this;
        }

        public Criteria andProdidIsNotNull() {
            addCriterion("ProdId is not null");
            return (Criteria) this;
        }

        public Criteria andProdidEqualTo(String value) {
            addCriterion("ProdId =", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotEqualTo(String value) {
            addCriterion("ProdId <>", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidGreaterThan(String value) {
            addCriterion("ProdId >", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidGreaterThanOrEqualTo(String value) {
            addCriterion("ProdId >=", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidLessThan(String value) {
            addCriterion("ProdId <", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidLessThanOrEqualTo(String value) {
            addCriterion("ProdId <=", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidLike(String value) {
            addCriterion("ProdId like", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotLike(String value) {
            addCriterion("ProdId not like", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidIn(List<String> values) {
            addCriterion("ProdId in", values, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotIn(List<String> values) {
            addCriterion("ProdId not in", values, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidBetween(String value1, String value2) {
            addCriterion("ProdId between", value1, value2, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotBetween(String value1, String value2) {
            addCriterion("ProdId not between", value1, value2, "prodid");
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

        public Criteria andVaamountIsNull() {
            addCriterion("VAAmount is null");
            return (Criteria) this;
        }

        public Criteria andVaamountIsNotNull() {
            addCriterion("VAAmount is not null");
            return (Criteria) this;
        }

        public Criteria andVaamountEqualTo(Double value) {
            addCriterion("VAAmount =", value, "vaamount");
            return (Criteria) this;
        }

        public Criteria andVaamountNotEqualTo(Double value) {
            addCriterion("VAAmount <>", value, "vaamount");
            return (Criteria) this;
        }

        public Criteria andVaamountGreaterThan(Double value) {
            addCriterion("VAAmount >", value, "vaamount");
            return (Criteria) this;
        }

        public Criteria andVaamountGreaterThanOrEqualTo(Double value) {
            addCriterion("VAAmount >=", value, "vaamount");
            return (Criteria) this;
        }

        public Criteria andVaamountLessThan(Double value) {
            addCriterion("VAAmount <", value, "vaamount");
            return (Criteria) this;
        }

        public Criteria andVaamountLessThanOrEqualTo(Double value) {
            addCriterion("VAAmount <=", value, "vaamount");
            return (Criteria) this;
        }

        public Criteria andVaamountIn(List<Double> values) {
            addCriterion("VAAmount in", values, "vaamount");
            return (Criteria) this;
        }

        public Criteria andVaamountNotIn(List<Double> values) {
            addCriterion("VAAmount not in", values, "vaamount");
            return (Criteria) this;
        }

        public Criteria andVaamountBetween(Double value1, Double value2) {
            addCriterion("VAAmount between", value1, value2, "vaamount");
            return (Criteria) this;
        }

        public Criteria andVaamountNotBetween(Double value1, Double value2) {
            addCriterion("VAAmount not between", value1, value2, "vaamount");
            return (Criteria) this;
        }

        public Criteria andVquantityIsNull() {
            addCriterion("VQuantity is null");
            return (Criteria) this;
        }

        public Criteria andVquantityIsNotNull() {
            addCriterion("VQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andVquantityEqualTo(Integer value) {
            addCriterion("VQuantity =", value, "vquantity");
            return (Criteria) this;
        }

        public Criteria andVquantityNotEqualTo(Integer value) {
            addCriterion("VQuantity <>", value, "vquantity");
            return (Criteria) this;
        }

        public Criteria andVquantityGreaterThan(Integer value) {
            addCriterion("VQuantity >", value, "vquantity");
            return (Criteria) this;
        }

        public Criteria andVquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("VQuantity >=", value, "vquantity");
            return (Criteria) this;
        }

        public Criteria andVquantityLessThan(Integer value) {
            addCriterion("VQuantity <", value, "vquantity");
            return (Criteria) this;
        }

        public Criteria andVquantityLessThanOrEqualTo(Integer value) {
            addCriterion("VQuantity <=", value, "vquantity");
            return (Criteria) this;
        }

        public Criteria andVquantityIn(List<Integer> values) {
            addCriterion("VQuantity in", values, "vquantity");
            return (Criteria) this;
        }

        public Criteria andVquantityNotIn(List<Integer> values) {
            addCriterion("VQuantity not in", values, "vquantity");
            return (Criteria) this;
        }

        public Criteria andVquantityBetween(Integer value1, Integer value2) {
            addCriterion("VQuantity between", value1, value2, "vquantity");
            return (Criteria) this;
        }

        public Criteria andVquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("VQuantity not between", value1, value2, "vquantity");
            return (Criteria) this;
        }

        public Criteria andSunitIsNull() {
            addCriterion("Sunit is null");
            return (Criteria) this;
        }

        public Criteria andSunitIsNotNull() {
            addCriterion("Sunit is not null");
            return (Criteria) this;
        }

        public Criteria andSunitEqualTo(String value) {
            addCriterion("Sunit =", value, "sunit");
            return (Criteria) this;
        }

        public Criteria andSunitNotEqualTo(String value) {
            addCriterion("Sunit <>", value, "sunit");
            return (Criteria) this;
        }

        public Criteria andSunitGreaterThan(String value) {
            addCriterion("Sunit >", value, "sunit");
            return (Criteria) this;
        }

        public Criteria andSunitGreaterThanOrEqualTo(String value) {
            addCriterion("Sunit >=", value, "sunit");
            return (Criteria) this;
        }

        public Criteria andSunitLessThan(String value) {
            addCriterion("Sunit <", value, "sunit");
            return (Criteria) this;
        }

        public Criteria andSunitLessThanOrEqualTo(String value) {
            addCriterion("Sunit <=", value, "sunit");
            return (Criteria) this;
        }

        public Criteria andSunitLike(String value) {
            addCriterion("Sunit like", value, "sunit");
            return (Criteria) this;
        }

        public Criteria andSunitNotLike(String value) {
            addCriterion("Sunit not like", value, "sunit");
            return (Criteria) this;
        }

        public Criteria andSunitIn(List<String> values) {
            addCriterion("Sunit in", values, "sunit");
            return (Criteria) this;
        }

        public Criteria andSunitNotIn(List<String> values) {
            addCriterion("Sunit not in", values, "sunit");
            return (Criteria) this;
        }

        public Criteria andSunitBetween(String value1, String value2) {
            addCriterion("Sunit between", value1, value2, "sunit");
            return (Criteria) this;
        }

        public Criteria andSunitNotBetween(String value1, String value2) {
            addCriterion("Sunit not between", value1, value2, "sunit");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andMlamountIsNull() {
            addCriterion("MLAmount is null");
            return (Criteria) this;
        }

        public Criteria andMlamountIsNotNull() {
            addCriterion("MLAmount is not null");
            return (Criteria) this;
        }

        public Criteria andMlamountEqualTo(Double value) {
            addCriterion("MLAmount =", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountNotEqualTo(Double value) {
            addCriterion("MLAmount <>", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountGreaterThan(Double value) {
            addCriterion("MLAmount >", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountGreaterThanOrEqualTo(Double value) {
            addCriterion("MLAmount >=", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountLessThan(Double value) {
            addCriterion("MLAmount <", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountLessThanOrEqualTo(Double value) {
            addCriterion("MLAmount <=", value, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountIn(List<Double> values) {
            addCriterion("MLAmount in", values, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountNotIn(List<Double> values) {
            addCriterion("MLAmount not in", values, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountBetween(Double value1, Double value2) {
            addCriterion("MLAmount between", value1, value2, "mlamount");
            return (Criteria) this;
        }

        public Criteria andMlamountNotBetween(Double value1, Double value2) {
            addCriterion("MLAmount not between", value1, value2, "mlamount");
            return (Criteria) this;
        }

        public Criteria andColumn1IsNull() {
            addCriterion("COLUMN1 is null");
            return (Criteria) this;
        }

        public Criteria andColumn1IsNotNull() {
            addCriterion("COLUMN1 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn1EqualTo(String value) {
            addCriterion("COLUMN1 =", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotEqualTo(String value) {
            addCriterion("COLUMN1 <>", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThan(String value) {
            addCriterion("COLUMN1 >", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN1 >=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThan(String value) {
            addCriterion("COLUMN1 <", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThanOrEqualTo(String value) {
            addCriterion("COLUMN1 <=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Like(String value) {
            addCriterion("COLUMN1 like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotLike(String value) {
            addCriterion("COLUMN1 not like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1In(List<String> values) {
            addCriterion("COLUMN1 in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotIn(List<String> values) {
            addCriterion("COLUMN1 not in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Between(String value1, String value2) {
            addCriterion("COLUMN1 between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotBetween(String value1, String value2) {
            addCriterion("COLUMN1 not between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNull() {
            addCriterion("COLUMN2 is null");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNotNull() {
            addCriterion("COLUMN2 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn2EqualTo(String value) {
            addCriterion("COLUMN2 =", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotEqualTo(String value) {
            addCriterion("COLUMN2 <>", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThan(String value) {
            addCriterion("COLUMN2 >", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN2 >=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThan(String value) {
            addCriterion("COLUMN2 <", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThanOrEqualTo(String value) {
            addCriterion("COLUMN2 <=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Like(String value) {
            addCriterion("COLUMN2 like", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotLike(String value) {
            addCriterion("COLUMN2 not like", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2In(List<String> values) {
            addCriterion("COLUMN2 in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotIn(List<String> values) {
            addCriterion("COLUMN2 not in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Between(String value1, String value2) {
            addCriterion("COLUMN2 between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotBetween(String value1, String value2) {
            addCriterion("COLUMN2 not between", value1, value2, "column2");
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