package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SalesrequisitionsdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesrequisitionsdetailsExample() {
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

        public Criteria andSernoIsNull() {
            addCriterion("SerNO is null");
            return (Criteria) this;
        }

        public Criteria andSernoIsNotNull() {
            addCriterion("SerNO is not null");
            return (Criteria) this;
        }

        public Criteria andSernoEqualTo(String value) {
            addCriterion("SerNO =", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotEqualTo(String value) {
            addCriterion("SerNO <>", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoGreaterThan(String value) {
            addCriterion("SerNO >", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoGreaterThanOrEqualTo(String value) {
            addCriterion("SerNO >=", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoLessThan(String value) {
            addCriterion("SerNO <", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoLessThanOrEqualTo(String value) {
            addCriterion("SerNO <=", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoLike(String value) {
            addCriterion("SerNO like", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotLike(String value) {
            addCriterion("SerNO not like", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoIn(List<String> values) {
            addCriterion("SerNO in", values, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotIn(List<String> values) {
            addCriterion("SerNO not in", values, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoBetween(String value1, String value2) {
            addCriterion("SerNO between", value1, value2, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotBetween(String value1, String value2) {
            addCriterion("SerNO not between", value1, value2, "serno");
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

        public Criteria andUnitnameIsNull() {
            addCriterion("UnitName is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("UnitName is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("UnitName =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("UnitName <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("UnitName >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("UnitName >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("UnitName <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("UnitName <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("UnitName like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("UnitName not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("UnitName in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("UnitName not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("UnitName between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("UnitName not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andSquantityIsNull() {
            addCriterion("sQuantity is null");
            return (Criteria) this;
        }

        public Criteria andSquantityIsNotNull() {
            addCriterion("sQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andSquantityEqualTo(Integer value) {
            addCriterion("sQuantity =", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityNotEqualTo(Integer value) {
            addCriterion("sQuantity <>", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityGreaterThan(Integer value) {
            addCriterion("sQuantity >", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("sQuantity >=", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityLessThan(Integer value) {
            addCriterion("sQuantity <", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityLessThanOrEqualTo(Integer value) {
            addCriterion("sQuantity <=", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityIn(List<Integer> values) {
            addCriterion("sQuantity in", values, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityNotIn(List<Integer> values) {
            addCriterion("sQuantity not in", values, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityBetween(Integer value1, Integer value2) {
            addCriterion("sQuantity between", value1, value2, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("sQuantity not between", value1, value2, "squantity");
            return (Criteria) this;
        }

        public Criteria andZkqpriceIsNull() {
            addCriterion("ZkqPrice is null");
            return (Criteria) this;
        }

        public Criteria andZkqpriceIsNotNull() {
            addCriterion("ZkqPrice is not null");
            return (Criteria) this;
        }

        public Criteria andZkqpriceEqualTo(Double value) {
            addCriterion("ZkqPrice =", value, "zkqprice");
            return (Criteria) this;
        }

        public Criteria andZkqpriceNotEqualTo(Double value) {
            addCriterion("ZkqPrice <>", value, "zkqprice");
            return (Criteria) this;
        }

        public Criteria andZkqpriceGreaterThan(Double value) {
            addCriterion("ZkqPrice >", value, "zkqprice");
            return (Criteria) this;
        }

        public Criteria andZkqpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ZkqPrice >=", value, "zkqprice");
            return (Criteria) this;
        }

        public Criteria andZkqpriceLessThan(Double value) {
            addCriterion("ZkqPrice <", value, "zkqprice");
            return (Criteria) this;
        }

        public Criteria andZkqpriceLessThanOrEqualTo(Double value) {
            addCriterion("ZkqPrice <=", value, "zkqprice");
            return (Criteria) this;
        }

        public Criteria andZkqpriceIn(List<Double> values) {
            addCriterion("ZkqPrice in", values, "zkqprice");
            return (Criteria) this;
        }

        public Criteria andZkqpriceNotIn(List<Double> values) {
            addCriterion("ZkqPrice not in", values, "zkqprice");
            return (Criteria) this;
        }

        public Criteria andZkqpriceBetween(Double value1, Double value2) {
            addCriterion("ZkqPrice between", value1, value2, "zkqprice");
            return (Criteria) this;
        }

        public Criteria andZkqpriceNotBetween(Double value1, Double value2) {
            addCriterion("ZkqPrice not between", value1, value2, "zkqprice");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("Discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("Discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("Discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("Discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("Discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("Discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("Discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("Discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("Discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("Discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("Discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("Discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNull() {
            addCriterion("UnitPrice is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNotNull() {
            addCriterion("UnitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceEqualTo(Double value) {
            addCriterion("UnitPrice =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(Double value) {
            addCriterion("UnitPrice <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(Double value) {
            addCriterion("UnitPrice >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("UnitPrice >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(Double value) {
            addCriterion("UnitPrice <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(Double value) {
            addCriterion("UnitPrice <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<Double> values) {
            addCriterion("UnitPrice in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<Double> values) {
            addCriterion("UnitPrice not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(Double value1, Double value2) {
            addCriterion("UnitPrice between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(Double value1, Double value2) {
            addCriterion("UnitPrice not between", value1, value2, "unitprice");
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

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNull() {
            addCriterion("TaxRate is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("TaxRate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(Double value) {
            addCriterion("TaxRate =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(Double value) {
            addCriterion("TaxRate <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(Double value) {
            addCriterion("TaxRate >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(Double value) {
            addCriterion("TaxRate >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(Double value) {
            addCriterion("TaxRate <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(Double value) {
            addCriterion("TaxRate <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<Double> values) {
            addCriterion("TaxRate in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<Double> values) {
            addCriterion("TaxRate not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(Double value1, Double value2) {
            addCriterion("TaxRate between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(Double value1, Double value2) {
            addCriterion("TaxRate not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxlimitIsNull() {
            addCriterion("Taxlimit is null");
            return (Criteria) this;
        }

        public Criteria andTaxlimitIsNotNull() {
            addCriterion("Taxlimit is not null");
            return (Criteria) this;
        }

        public Criteria andTaxlimitEqualTo(Double value) {
            addCriterion("Taxlimit =", value, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitNotEqualTo(Double value) {
            addCriterion("Taxlimit <>", value, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitGreaterThan(Double value) {
            addCriterion("Taxlimit >", value, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitGreaterThanOrEqualTo(Double value) {
            addCriterion("Taxlimit >=", value, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitLessThan(Double value) {
            addCriterion("Taxlimit <", value, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitLessThanOrEqualTo(Double value) {
            addCriterion("Taxlimit <=", value, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitIn(List<Double> values) {
            addCriterion("Taxlimit in", values, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitNotIn(List<Double> values) {
            addCriterion("Taxlimit not in", values, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitBetween(Double value1, Double value2) {
            addCriterion("Taxlimit between", value1, value2, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitNotBetween(Double value1, Double value2) {
            addCriterion("Taxlimit not between", value1, value2, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceIsNull() {
            addCriterion("TaxInclusivePrice is null");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceIsNotNull() {
            addCriterion("TaxInclusivePrice is not null");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceEqualTo(Double value) {
            addCriterion("TaxInclusivePrice =", value, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceNotEqualTo(Double value) {
            addCriterion("TaxInclusivePrice <>", value, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceGreaterThan(Double value) {
            addCriterion("TaxInclusivePrice >", value, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("TaxInclusivePrice >=", value, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceLessThan(Double value) {
            addCriterion("TaxInclusivePrice <", value, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceLessThanOrEqualTo(Double value) {
            addCriterion("TaxInclusivePrice <=", value, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceIn(List<Double> values) {
            addCriterion("TaxInclusivePrice in", values, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceNotIn(List<Double> values) {
            addCriterion("TaxInclusivePrice not in", values, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceBetween(Double value1, Double value2) {
            addCriterion("TaxInclusivePrice between", value1, value2, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceNotBetween(Double value1, Double value2) {
            addCriterion("TaxInclusivePrice not between", value1, value2, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andComplimentartIsNull() {
            addCriterion("Complimentart is null");
            return (Criteria) this;
        }

        public Criteria andComplimentartIsNotNull() {
            addCriterion("Complimentart is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentartEqualTo(Integer value) {
            addCriterion("Complimentart =", value, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartNotEqualTo(Integer value) {
            addCriterion("Complimentart <>", value, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartGreaterThan(Integer value) {
            addCriterion("Complimentart >", value, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartGreaterThanOrEqualTo(Integer value) {
            addCriterion("Complimentart >=", value, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartLessThan(Integer value) {
            addCriterion("Complimentart <", value, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartLessThanOrEqualTo(Integer value) {
            addCriterion("Complimentart <=", value, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartIn(List<Integer> values) {
            addCriterion("Complimentart in", values, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartNotIn(List<Integer> values) {
            addCriterion("Complimentart not in", values, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartBetween(Integer value1, Integer value2) {
            addCriterion("Complimentart between", value1, value2, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartNotBetween(Integer value1, Integer value2) {
            addCriterion("Complimentart not between", value1, value2, "complimentart");
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