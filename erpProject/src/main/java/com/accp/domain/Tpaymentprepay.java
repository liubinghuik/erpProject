package com.accp.domain;

public class Tpaymentprepay {
    private Integer id;

    private String paymentid;

    private String prepayid;

    private Integer prepaydid;

    private Double takenmoney;

    private Integer state;

    private Integer audit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getPrepayid() {
        return prepayid;
    }

    public void setPrepayid(String prepayid) {
        this.prepayid = prepayid;
    }

    public Integer getPrepaydid() {
        return prepaydid;
    }

    public void setPrepaydid(Integer prepaydid) {
        this.prepaydid = prepaydid;
    }

    public Double getTakenmoney() {
        return takenmoney;
    }

    public void setTakenmoney(Double takenmoney) {
        this.takenmoney = takenmoney;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }
}