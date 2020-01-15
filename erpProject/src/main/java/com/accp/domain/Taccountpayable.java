package com.accp.domain;

import java.util.Date;

public class Taccountpayable {
    private Integer id;

    private String billstype;

    private String billsno;

    private Date date;

    private String sid;

    private Double payment;

    private Double balance;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillstype() {
        return billstype;
    }

    public void setBillstype(String billstype) {
        this.billstype = billstype;
    }

    public String getBillsno() {
        return billsno;
    }

    public void setBillsno(String billsno) {
        this.billsno = billsno;
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

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}