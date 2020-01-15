package com.accp.domain;

import java.util.Date;

public class Purchaseorderdetails {
    private Integer lineno;

    private String prodid;

    private String prodname;

    private String prodsize;

    private Integer sunitid;

    private Integer squantity;

    private Double oldprice;

    private Double discount;

    private Double sprice;

    private Double amount;

    private Double taxrate;

    private Double taxamt;

    private Double vftotal;

    private Date preindate;

    private Integer qtyremain;

    private Integer isgift;

    private String trantype;

    private String fromno;

    private String itemremark;

    private String remark;

    public Integer getLineno() {
        return lineno;
    }

    public void setLineno(Integer lineno) {
        this.lineno = lineno;
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

    public Integer getSunitid() {
        return sunitid;
    }

    public void setSunitid(Integer sunitid) {
        this.sunitid = sunitid;
    }

    public Integer getSquantity() {
        return squantity;
    }

    public void setSquantity(Integer squantity) {
        this.squantity = squantity;
    }

    public Double getOldprice() {
        return oldprice;
    }

    public void setOldprice(Double oldprice) {
        this.oldprice = oldprice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(Double taxrate) {
        this.taxrate = taxrate;
    }

    public Double getTaxamt() {
        return taxamt;
    }

    public void setTaxamt(Double taxamt) {
        this.taxamt = taxamt;
    }

    public Double getVftotal() {
        return vftotal;
    }

    public void setVftotal(Double vftotal) {
        this.vftotal = vftotal;
    }

    public Date getPreindate() {
        return preindate;
    }

    public void setPreindate(Date preindate) {
        this.preindate = preindate;
    }

    public Integer getQtyremain() {
        return qtyremain;
    }

    public void setQtyremain(Integer qtyremain) {
        this.qtyremain = qtyremain;
    }

    public Integer getIsgift() {
        return isgift;
    }

    public void setIsgift(Integer isgift) {
        this.isgift = isgift;
    }

    public String getTrantype() {
        return trantype;
    }

    public void setTrantype(String trantype) {
        this.trantype = trantype;
    }

    public String getFromno() {
        return fromno;
    }

    public void setFromno(String fromno) {
        this.fromno = fromno;
    }

    public String getItemremark() {
        return itemremark;
    }

    public void setItemremark(String itemremark) {
        this.itemremark = itemremark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}