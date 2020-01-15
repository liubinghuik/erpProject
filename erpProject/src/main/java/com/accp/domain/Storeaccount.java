package com.accp.domain;

public class Storeaccount {
    private Integer lineno;

    private String warehouseid;

    private String prodid;

    private Integer ballamt;

    private Integer callamt;

    private Double sprice;

    private Double callcost;

    private Integer safeqty;

    private Double fbegprice;

    private Double fbegsum;

    private Integer january;

    private Integer period;

    public Integer getLineno() {
        return lineno;
    }

    public void setLineno(Integer lineno) {
        this.lineno = lineno;
    }

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getProdid() {
        return prodid;
    }

    public void setProdid(String prodid) {
        this.prodid = prodid;
    }

    public Integer getBallamt() {
        return ballamt;
    }

    public void setBallamt(Integer ballamt) {
        this.ballamt = ballamt;
    }

    public Integer getCallamt() {
        return callamt;
    }

    public void setCallamt(Integer callamt) {
        this.callamt = callamt;
    }

    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

    public Double getCallcost() {
        return callcost;
    }

    public void setCallcost(Double callcost) {
        this.callcost = callcost;
    }

    public Integer getSafeqty() {
        return safeqty;
    }

    public void setSafeqty(Integer safeqty) {
        this.safeqty = safeqty;
    }

    public Double getFbegprice() {
        return fbegprice;
    }

    public void setFbegprice(Double fbegprice) {
        this.fbegprice = fbegprice;
    }

    public Double getFbegsum() {
        return fbegsum;
    }

    public void setFbegsum(Double fbegsum) {
        this.fbegsum = fbegsum;
    }

    public Integer getJanuary() {
        return january;
    }

    public void setJanuary(Integer january) {
        this.january = january;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }
}