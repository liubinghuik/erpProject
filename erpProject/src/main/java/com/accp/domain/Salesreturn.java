package com.accp.domain;

import java.util.Date;

public class Salesreturn {
    private String billno;

    private Date billdate;

    private String currencyid;

    private Double exchrate;

    private String hasforeigntrade;

    private String custid;

    private String addressid;

    private Integer priceoftax;

    private String warehouseid;

    private Integer isdeduct;

    private String voucherno;

    private String maker;

    private String permitter;

    private String project;

    private String remark;

    private Integer fuhestates;

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public String getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(String currencyid) {
        this.currencyid = currencyid;
    }

    public Double getExchrate() {
        return exchrate;
    }

    public void setExchrate(Double exchrate) {
        this.exchrate = exchrate;
    }

    public String getHasforeigntrade() {
        return hasforeigntrade;
    }

    public void setHasforeigntrade(String hasforeigntrade) {
        this.hasforeigntrade = hasforeigntrade;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public String getAddressid() {
        return addressid;
    }

    public void setAddressid(String addressid) {
        this.addressid = addressid;
    }

    public Integer getPriceoftax() {
        return priceoftax;
    }

    public void setPriceoftax(Integer priceoftax) {
        this.priceoftax = priceoftax;
    }

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getIsdeduct() {
        return isdeduct;
    }

    public void setIsdeduct(Integer isdeduct) {
        this.isdeduct = isdeduct;
    }

    public String getVoucherno() {
        return voucherno;
    }

    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getPermitter() {
        return permitter;
    }

    public void setPermitter(String permitter) {
        this.permitter = permitter;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getFuhestates() {
        return fuhestates;
    }

    public void setFuhestates(Integer fuhestates) {
        this.fuhestates = fuhestates;
    }
}