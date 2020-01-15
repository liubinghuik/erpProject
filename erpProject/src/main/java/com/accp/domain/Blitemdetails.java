package com.accp.domain;

public class Blitemdetails {
    private String billno;

    private String prodid;

    private String prodname;

    private String prodsize;

    private Integer unit;

    private Integer curqty;

    private Integer checkqty;

    private Integer quantity;

    private Float price;

    private Float amount;

    private String havebatch;

    private String itemremark;

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getProdid() {
        return prodid;
    }

    public void setProdid(String prodid) {
        this.prodid = prodid;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getProdsize() {
        return prodsize;
    }

    public void setProdsize(String prodsize) {
        this.prodsize = prodsize;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getCurqty() {
        return curqty;
    }

    public void setCurqty(Integer curqty) {
        this.curqty = curqty;
    }

    public Integer getCheckqty() {
        return checkqty;
    }

    public void setCheckqty(Integer checkqty) {
        this.checkqty = checkqty;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getHavebatch() {
        return havebatch;
    }

    public void setHavebatch(String havebatch) {
        this.havebatch = havebatch;
    }

    public String getItemremark() {
        return itemremark;
    }

    public void setItemremark(String itemremark) {
        this.itemremark = itemremark;
    }
}