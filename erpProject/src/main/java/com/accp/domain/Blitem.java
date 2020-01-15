package com.accp.domain;

import java.util.Date;

public class Blitem {
    private String billno;

    private Date adjustdate;

    private Integer wareid;

    private String voucherno;

    private Integer incsubjectid;

    private Integer decsujectid;

    private Integer zerofilter;

    private Integer salesid;

    private Integer departid;

    private String maker;

    private String permitter;

    private String remark;

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public Date getAdjustdate() {
        return adjustdate;
    }

    public void setAdjustdate(Date adjustdate) {
        this.adjustdate = adjustdate;
    }

    public Integer getWareid() {
        return wareid;
    }

    public void setWareid(Integer wareid) {
        this.wareid = wareid;
    }

    public String getVoucherno() {
        return voucherno;
    }

    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }

    public Integer getIncsubjectid() {
        return incsubjectid;
    }

    public void setIncsubjectid(Integer incsubjectid) {
        this.incsubjectid = incsubjectid;
    }

    public Integer getDecsujectid() {
        return decsujectid;
    }

    public void setDecsujectid(Integer decsujectid) {
        this.decsujectid = decsujectid;
    }

    public Integer getZerofilter() {
        return zerofilter;
    }

    public void setZerofilter(Integer zerofilter) {
        this.zerofilter = zerofilter;
    }

    public Integer getSalesid() {
        return salesid;
    }

    public void setSalesid(Integer salesid) {
        this.salesid = salesid;
    }

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}