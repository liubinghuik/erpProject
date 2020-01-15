package com.accp.domain;

import java.util.Date;

public class Transfer {
    private String billno;

    private Date adjustdate;

    private Integer wareid;

    private Integer wareinid;

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

    public Integer getWareinid() {
        return wareinid;
    }

    public void setWareinid(Integer wareinid) {
        this.wareinid = wareinid;
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