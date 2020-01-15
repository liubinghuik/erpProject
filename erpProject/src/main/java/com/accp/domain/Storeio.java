package com.accp.domain;

import java.util.Date;

public class Storeio {
    private Integer lineno;

    private String fromno;

    private String trantype;

    private String warehouseid;

    private Integer squantity;

    private String cmid;

    private String sid;

    private Double sprice;

    private Double amount;

    private Date outintime;

    public Integer getLineno() {
        return lineno;
    }

    public void setLineno(Integer lineno) {
        this.lineno = lineno;
    }

    public String getFromno() {
        return fromno;
    }

    public void setFromno(String fromno) {
        this.fromno = fromno;
    }

    public String getTrantype() {
        return trantype;
    }

    public void setTrantype(String trantype) {
        this.trantype = trantype;
    }

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getSquantity() {
        return squantity;
    }

    public void setSquantity(Integer squantity) {
        this.squantity = squantity;
    }

    public String getCmid() {
        return cmid;
    }

    public void setCmid(String cmid) {
        this.cmid = cmid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
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

    public Date getOutintime() {
        return outintime;
    }

    public void setOutintime(Date outintime) {
        this.outintime = outintime;
    }
}