package com.accp.domain;

import java.util.Date;

public class Tprepay {
    private String id;

    private Date date;

    private String sid;

    private String paymentmethod1;

    private Double paymentamout1;

    private String paymentmethod2;

    private Double paymentamout2;

    private String currencyid;

    private Double discount;

    private Date enddate;

    private Double exchangerate;

    private String vouchercode;

    private String departid;

    private String project;

    private String vouchingman;

    private String auditman;

    private String remark;

    private String custom1;

    private String custom2;

    private Integer auditstate;

    private Integer audit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getPaymentmethod1() {
        return paymentmethod1;
    }

    public void setPaymentmethod1(String paymentmethod1) {
        this.paymentmethod1 = paymentmethod1;
    }

    public Double getPaymentamout1() {
        return paymentamout1;
    }

    public void setPaymentamout1(Double paymentamout1) {
        this.paymentamout1 = paymentamout1;
    }

    public String getPaymentmethod2() {
        return paymentmethod2;
    }

    public void setPaymentmethod2(String paymentmethod2) {
        this.paymentmethod2 = paymentmethod2;
    }

    public Double getPaymentamout2() {
        return paymentamout2;
    }

    public void setPaymentamout2(Double paymentamout2) {
        this.paymentamout2 = paymentamout2;
    }

    public String getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(String currencyid) {
        this.currencyid = currencyid;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Double getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(Double exchangerate) {
        this.exchangerate = exchangerate;
    }

    public String getVouchercode() {
        return vouchercode;
    }

    public void setVouchercode(String vouchercode) {
        this.vouchercode = vouchercode;
    }

    public String getDepartid() {
        return departid;
    }

    public void setDepartid(String departid) {
        this.departid = departid;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getVouchingman() {
        return vouchingman;
    }

    public void setVouchingman(String vouchingman) {
        this.vouchingman = vouchingman;
    }

    public String getAuditman() {
        return auditman;
    }

    public void setAuditman(String auditman) {
        this.auditman = auditman;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1;
    }

    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2;
    }

    public Integer getAuditstate() {
        return auditstate;
    }

    public void setAuditstate(Integer auditstate) {
        this.auditstate = auditstate;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }
}