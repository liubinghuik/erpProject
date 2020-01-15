package com.accp.domain;

public class Procurementshareprice extends ProcurementsharepriceKey {
    private String feeclassid;

    private String fareclassname;

    private String currid;

    private Double amount;

    private Double exchrate;

    private Double mlamount;

    private String remarks;

    private String column1;

    public String getFeeclassid() {
        return feeclassid;
    }

    public void setFeeclassid(String feeclassid) {
        this.feeclassid = feeclassid;
    }

    public String getFareclassname() {
        return fareclassname;
    }

    public void setFareclassname(String fareclassname) {
        this.fareclassname = fareclassname;
    }

    public String getCurrid() {
        return currid;
    }

    public void setCurrid(String currid) {
        this.currid = currid;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getExchrate() {
        return exchrate;
    }

    public void setExchrate(Double exchrate) {
        this.exchrate = exchrate;
    }

    public Double getMlamount() {
        return mlamount;
    }

    public void setMlamount(Double mlamount) {
        this.mlamount = mlamount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }
}