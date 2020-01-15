package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class TmaterialcategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TmaterialcategoryExample() {
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

        public Criteria andClassidIsNull() {
            addCriterion("ClassID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("ClassID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("ClassID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("ClassID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("ClassID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClassID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("ClassID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("ClassID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("ClassID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("ClassID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("ClassID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("ClassID not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("ClassName is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("ClassName is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("ClassName =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("ClassName <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("ClassName >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("ClassName >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("ClassName <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("ClassName <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("ClassName like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("ClassName not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("ClassName in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("ClassName not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("ClassName between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("ClassName not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNull() {
            addCriterion("EngName is null");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNotNull() {
            addCriterion("EngName is not null");
            return (Criteria) this;
        }

        public Criteria andEngnameEqualTo(String value) {
            addCriterion("EngName =", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotEqualTo(String value) {
            addCriterion("EngName <>", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThan(String value) {
            addCriterion("EngName >", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("EngName >=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThan(String value) {
            addCriterion("EngName <", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThanOrEqualTo(String value) {
            addCriterion("EngName <=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLike(String value) {
            addCriterion("EngName like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotLike(String value) {
            addCriterion("EngName not like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameIn(List<String> values) {
            addCriterion("EngName in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotIn(List<String> values) {
            addCriterion("EngName not in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameBetween(String value1, String value2) {
            addCriterion("EngName between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotBetween(String value1, String value2) {
            addCriterion("EngName not between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andAccinventoryidIsNull() {
            addCriterion("AccInventoryID is null");
            return (Criteria) this;
        }

        public Criteria andAccinventoryidIsNotNull() {
            addCriterion("AccInventoryID is not null");
            return (Criteria) this;
        }

        public Criteria andAccinventoryidEqualTo(String value) {
            addCriterion("AccInventoryID =", value, "accinventoryid");
            return (Criteria) this;
        }

        public Criteria andAccinventoryidNotEqualTo(String value) {
            addCriterion("AccInventoryID <>", value, "accinventoryid");
            return (Criteria) this;
        }

        public Criteria andAccinventoryidGreaterThan(String value) {
            addCriterion("AccInventoryID >", value, "accinventoryid");
            return (Criteria) this;
        }

        public Criteria andAccinventoryidGreaterThanOrEqualTo(String value) {
            addCriterion("AccInventoryID >=", value, "accinventoryid");
            return (Criteria) this;
        }

        public Criteria andAccinventoryidLessThan(String value) {
            addCriterion("AccInventoryID <", value, "accinventoryid");
            return (Criteria) this;
        }

        public Criteria andAccinventoryidLessThanOrEqualTo(String value) {
            addCriterion("AccInventoryID <=", value, "accinventoryid");
            return (Criteria) this;
        }

        public Criteria andAccinventoryidLike(String value) {
            addCriterion("AccInventoryID like", value, "accinventoryid");
            return (Criteria) this;
        }

        public Criteria andAccinventoryidNotLike(String value) {
            addCriterion("AccInventoryID not like", value, "accinventoryid");
            return (Criteria) this;
        }

        public Criteria andAccinventoryidIn(List<String> values) {
            addCriterion("AccInventoryID in", values, "accinventoryid");
            return (Criteria) this;
        }

        public Criteria andAccinventoryidNotIn(List<String> values) {
            addCriterion("AccInventoryID not in", values, "accinventoryid");
            return (Criteria) this;
        }

        public Criteria andAccinventoryidBetween(String value1, String value2) {
            addCriterion("AccInventoryID between", value1, value2, "accinventoryid");
            return (Criteria) this;
        }

        public Criteria andAccinventoryidNotBetween(String value1, String value2) {
            addCriterion("AccInventoryID not between", value1, value2, "accinventoryid");
            return (Criteria) this;
        }

        public Criteria andAccsaleidIsNull() {
            addCriterion("AccSaleID is null");
            return (Criteria) this;
        }

        public Criteria andAccsaleidIsNotNull() {
            addCriterion("AccSaleID is not null");
            return (Criteria) this;
        }

        public Criteria andAccsaleidEqualTo(String value) {
            addCriterion("AccSaleID =", value, "accsaleid");
            return (Criteria) this;
        }

        public Criteria andAccsaleidNotEqualTo(String value) {
            addCriterion("AccSaleID <>", value, "accsaleid");
            return (Criteria) this;
        }

        public Criteria andAccsaleidGreaterThan(String value) {
            addCriterion("AccSaleID >", value, "accsaleid");
            return (Criteria) this;
        }

        public Criteria andAccsaleidGreaterThanOrEqualTo(String value) {
            addCriterion("AccSaleID >=", value, "accsaleid");
            return (Criteria) this;
        }

        public Criteria andAccsaleidLessThan(String value) {
            addCriterion("AccSaleID <", value, "accsaleid");
            return (Criteria) this;
        }

        public Criteria andAccsaleidLessThanOrEqualTo(String value) {
            addCriterion("AccSaleID <=", value, "accsaleid");
            return (Criteria) this;
        }

        public Criteria andAccsaleidLike(String value) {
            addCriterion("AccSaleID like", value, "accsaleid");
            return (Criteria) this;
        }

        public Criteria andAccsaleidNotLike(String value) {
            addCriterion("AccSaleID not like", value, "accsaleid");
            return (Criteria) this;
        }

        public Criteria andAccsaleidIn(List<String> values) {
            addCriterion("AccSaleID in", values, "accsaleid");
            return (Criteria) this;
        }

        public Criteria andAccsaleidNotIn(List<String> values) {
            addCriterion("AccSaleID not in", values, "accsaleid");
            return (Criteria) this;
        }

        public Criteria andAccsaleidBetween(String value1, String value2) {
            addCriterion("AccSaleID between", value1, value2, "accsaleid");
            return (Criteria) this;
        }

        public Criteria andAccsaleidNotBetween(String value1, String value2) {
            addCriterion("AccSaleID not between", value1, value2, "accsaleid");
            return (Criteria) this;
        }

        public Criteria andAccsalecostidIsNull() {
            addCriterion("AccSaleCostID is null");
            return (Criteria) this;
        }

        public Criteria andAccsalecostidIsNotNull() {
            addCriterion("AccSaleCostID is not null");
            return (Criteria) this;
        }

        public Criteria andAccsalecostidEqualTo(String value) {
            addCriterion("AccSaleCostID =", value, "accsalecostid");
            return (Criteria) this;
        }

        public Criteria andAccsalecostidNotEqualTo(String value) {
            addCriterion("AccSaleCostID <>", value, "accsalecostid");
            return (Criteria) this;
        }

        public Criteria andAccsalecostidGreaterThan(String value) {
            addCriterion("AccSaleCostID >", value, "accsalecostid");
            return (Criteria) this;
        }

        public Criteria andAccsalecostidGreaterThanOrEqualTo(String value) {
            addCriterion("AccSaleCostID >=", value, "accsalecostid");
            return (Criteria) this;
        }

        public Criteria andAccsalecostidLessThan(String value) {
            addCriterion("AccSaleCostID <", value, "accsalecostid");
            return (Criteria) this;
        }

        public Criteria andAccsalecostidLessThanOrEqualTo(String value) {
            addCriterion("AccSaleCostID <=", value, "accsalecostid");
            return (Criteria) this;
        }

        public Criteria andAccsalecostidLike(String value) {
            addCriterion("AccSaleCostID like", value, "accsalecostid");
            return (Criteria) this;
        }

        public Criteria andAccsalecostidNotLike(String value) {
            addCriterion("AccSaleCostID not like", value, "accsalecostid");
            return (Criteria) this;
        }

        public Criteria andAccsalecostidIn(List<String> values) {
            addCriterion("AccSaleCostID in", values, "accsalecostid");
            return (Criteria) this;
        }

        public Criteria andAccsalecostidNotIn(List<String> values) {
            addCriterion("AccSaleCostID not in", values, "accsalecostid");
            return (Criteria) this;
        }

        public Criteria andAccsalecostidBetween(String value1, String value2) {
            addCriterion("AccSaleCostID between", value1, value2, "accsalecostid");
            return (Criteria) this;
        }

        public Criteria andAccsalecostidNotBetween(String value1, String value2) {
            addCriterion("AccSaleCostID not between", value1, value2, "accsalecostid");
            return (Criteria) this;
        }

        public Criteria andSendoutwareidIsNull() {
            addCriterion("SendOutWareID is null");
            return (Criteria) this;
        }

        public Criteria andSendoutwareidIsNotNull() {
            addCriterion("SendOutWareID is not null");
            return (Criteria) this;
        }

        public Criteria andSendoutwareidEqualTo(String value) {
            addCriterion("SendOutWareID =", value, "sendoutwareid");
            return (Criteria) this;
        }

        public Criteria andSendoutwareidNotEqualTo(String value) {
            addCriterion("SendOutWareID <>", value, "sendoutwareid");
            return (Criteria) this;
        }

        public Criteria andSendoutwareidGreaterThan(String value) {
            addCriterion("SendOutWareID >", value, "sendoutwareid");
            return (Criteria) this;
        }

        public Criteria andSendoutwareidGreaterThanOrEqualTo(String value) {
            addCriterion("SendOutWareID >=", value, "sendoutwareid");
            return (Criteria) this;
        }

        public Criteria andSendoutwareidLessThan(String value) {
            addCriterion("SendOutWareID <", value, "sendoutwareid");
            return (Criteria) this;
        }

        public Criteria andSendoutwareidLessThanOrEqualTo(String value) {
            addCriterion("SendOutWareID <=", value, "sendoutwareid");
            return (Criteria) this;
        }

        public Criteria andSendoutwareidLike(String value) {
            addCriterion("SendOutWareID like", value, "sendoutwareid");
            return (Criteria) this;
        }

        public Criteria andSendoutwareidNotLike(String value) {
            addCriterion("SendOutWareID not like", value, "sendoutwareid");
            return (Criteria) this;
        }

        public Criteria andSendoutwareidIn(List<String> values) {
            addCriterion("SendOutWareID in", values, "sendoutwareid");
            return (Criteria) this;
        }

        public Criteria andSendoutwareidNotIn(List<String> values) {
            addCriterion("SendOutWareID not in", values, "sendoutwareid");
            return (Criteria) this;
        }

        public Criteria andSendoutwareidBetween(String value1, String value2) {
            addCriterion("SendOutWareID between", value1, value2, "sendoutwareid");
            return (Criteria) this;
        }

        public Criteria andSendoutwareidNotBetween(String value1, String value2) {
            addCriterion("SendOutWareID not between", value1, value2, "sendoutwareid");
            return (Criteria) this;
        }

        public Criteria andGiftexpenseidIsNull() {
            addCriterion("GiftExpenseID is null");
            return (Criteria) this;
        }

        public Criteria andGiftexpenseidIsNotNull() {
            addCriterion("GiftExpenseID is not null");
            return (Criteria) this;
        }

        public Criteria andGiftexpenseidEqualTo(String value) {
            addCriterion("GiftExpenseID =", value, "giftexpenseid");
            return (Criteria) this;
        }

        public Criteria andGiftexpenseidNotEqualTo(String value) {
            addCriterion("GiftExpenseID <>", value, "giftexpenseid");
            return (Criteria) this;
        }

        public Criteria andGiftexpenseidGreaterThan(String value) {
            addCriterion("GiftExpenseID >", value, "giftexpenseid");
            return (Criteria) this;
        }

        public Criteria andGiftexpenseidGreaterThanOrEqualTo(String value) {
            addCriterion("GiftExpenseID >=", value, "giftexpenseid");
            return (Criteria) this;
        }

        public Criteria andGiftexpenseidLessThan(String value) {
            addCriterion("GiftExpenseID <", value, "giftexpenseid");
            return (Criteria) this;
        }

        public Criteria andGiftexpenseidLessThanOrEqualTo(String value) {
            addCriterion("GiftExpenseID <=", value, "giftexpenseid");
            return (Criteria) this;
        }

        public Criteria andGiftexpenseidLike(String value) {
            addCriterion("GiftExpenseID like", value, "giftexpenseid");
            return (Criteria) this;
        }

        public Criteria andGiftexpenseidNotLike(String value) {
            addCriterion("GiftExpenseID not like", value, "giftexpenseid");
            return (Criteria) this;
        }

        public Criteria andGiftexpenseidIn(List<String> values) {
            addCriterion("GiftExpenseID in", values, "giftexpenseid");
            return (Criteria) this;
        }

        public Criteria andGiftexpenseidNotIn(List<String> values) {
            addCriterion("GiftExpenseID not in", values, "giftexpenseid");
            return (Criteria) this;
        }

        public Criteria andGiftexpenseidBetween(String value1, String value2) {
            addCriterion("GiftExpenseID between", value1, value2, "giftexpenseid");
            return (Criteria) this;
        }

        public Criteria andGiftexpenseidNotBetween(String value1, String value2) {
            addCriterion("GiftExpenseID not between", value1, value2, "giftexpenseid");
            return (Criteria) this;
        }

        public Criteria andOtherincomeidIsNull() {
            addCriterion("OtherIncomeID is null");
            return (Criteria) this;
        }

        public Criteria andOtherincomeidIsNotNull() {
            addCriterion("OtherIncomeID is not null");
            return (Criteria) this;
        }

        public Criteria andOtherincomeidEqualTo(String value) {
            addCriterion("OtherIncomeID =", value, "otherincomeid");
            return (Criteria) this;
        }

        public Criteria andOtherincomeidNotEqualTo(String value) {
            addCriterion("OtherIncomeID <>", value, "otherincomeid");
            return (Criteria) this;
        }

        public Criteria andOtherincomeidGreaterThan(String value) {
            addCriterion("OtherIncomeID >", value, "otherincomeid");
            return (Criteria) this;
        }

        public Criteria andOtherincomeidGreaterThanOrEqualTo(String value) {
            addCriterion("OtherIncomeID >=", value, "otherincomeid");
            return (Criteria) this;
        }

        public Criteria andOtherincomeidLessThan(String value) {
            addCriterion("OtherIncomeID <", value, "otherincomeid");
            return (Criteria) this;
        }

        public Criteria andOtherincomeidLessThanOrEqualTo(String value) {
            addCriterion("OtherIncomeID <=", value, "otherincomeid");
            return (Criteria) this;
        }

        public Criteria andOtherincomeidLike(String value) {
            addCriterion("OtherIncomeID like", value, "otherincomeid");
            return (Criteria) this;
        }

        public Criteria andOtherincomeidNotLike(String value) {
            addCriterion("OtherIncomeID not like", value, "otherincomeid");
            return (Criteria) this;
        }

        public Criteria andOtherincomeidIn(List<String> values) {
            addCriterion("OtherIncomeID in", values, "otherincomeid");
            return (Criteria) this;
        }

        public Criteria andOtherincomeidNotIn(List<String> values) {
            addCriterion("OtherIncomeID not in", values, "otherincomeid");
            return (Criteria) this;
        }

        public Criteria andOtherincomeidBetween(String value1, String value2) {
            addCriterion("OtherIncomeID between", value1, value2, "otherincomeid");
            return (Criteria) this;
        }

        public Criteria andOtherincomeidNotBetween(String value1, String value2) {
            addCriterion("OtherIncomeID not between", value1, value2, "otherincomeid");
            return (Criteria) this;
        }

        public Criteria andOtherexpenseidIsNull() {
            addCriterion("OtherExpenseID is null");
            return (Criteria) this;
        }

        public Criteria andOtherexpenseidIsNotNull() {
            addCriterion("OtherExpenseID is not null");
            return (Criteria) this;
        }

        public Criteria andOtherexpenseidEqualTo(String value) {
            addCriterion("OtherExpenseID =", value, "otherexpenseid");
            return (Criteria) this;
        }

        public Criteria andOtherexpenseidNotEqualTo(String value) {
            addCriterion("OtherExpenseID <>", value, "otherexpenseid");
            return (Criteria) this;
        }

        public Criteria andOtherexpenseidGreaterThan(String value) {
            addCriterion("OtherExpenseID >", value, "otherexpenseid");
            return (Criteria) this;
        }

        public Criteria andOtherexpenseidGreaterThanOrEqualTo(String value) {
            addCriterion("OtherExpenseID >=", value, "otherexpenseid");
            return (Criteria) this;
        }

        public Criteria andOtherexpenseidLessThan(String value) {
            addCriterion("OtherExpenseID <", value, "otherexpenseid");
            return (Criteria) this;
        }

        public Criteria andOtherexpenseidLessThanOrEqualTo(String value) {
            addCriterion("OtherExpenseID <=", value, "otherexpenseid");
            return (Criteria) this;
        }

        public Criteria andOtherexpenseidLike(String value) {
            addCriterion("OtherExpenseID like", value, "otherexpenseid");
            return (Criteria) this;
        }

        public Criteria andOtherexpenseidNotLike(String value) {
            addCriterion("OtherExpenseID not like", value, "otherexpenseid");
            return (Criteria) this;
        }

        public Criteria andOtherexpenseidIn(List<String> values) {
            addCriterion("OtherExpenseID in", values, "otherexpenseid");
            return (Criteria) this;
        }

        public Criteria andOtherexpenseidNotIn(List<String> values) {
            addCriterion("OtherExpenseID not in", values, "otherexpenseid");
            return (Criteria) this;
        }

        public Criteria andOtherexpenseidBetween(String value1, String value2) {
            addCriterion("OtherExpenseID between", value1, value2, "otherexpenseid");
            return (Criteria) this;
        }

        public Criteria andOtherexpenseidNotBetween(String value1, String value2) {
            addCriterion("OtherExpenseID not between", value1, value2, "otherexpenseid");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("Memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("Memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("Memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("Memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("Memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("Memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("Memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("Memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("Memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("Memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("Memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("Memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("Memo not between", value1, value2, "memo");
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