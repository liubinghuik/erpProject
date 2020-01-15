package com.accp.domain;

import java.util.Date;

public class Currency {
    private String currencyid;

    private String currencyname;

    private String shortname;

    private String engname;

    private Date modifydate;

    private Double fixedrate;

    private Double buyinrate;

    private Double selloutrate;

    private String pricedecidigits;

    private String amountdecidigits;

    public String getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(String currencyid) {
        this.currencyid = currencyid;
    }

    public String getCurrencyname() {
        return currencyname;
    }

    public void setCurrencyname(String currencyname) {
        this.currencyname = currencyname;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Double getFixedrate() {
        return fixedrate;
    }

    public void setFixedrate(Double fixedrate) {
        this.fixedrate = fixedrate;
    }

    public Double getBuyinrate() {
        return buyinrate;
    }

    public void setBuyinrate(Double buyinrate) {
        this.buyinrate = buyinrate;
    }

    public Double getSelloutrate() {
        return selloutrate;
    }

    public void setSelloutrate(Double selloutrate) {
        this.selloutrate = selloutrate;
    }

    public String getPricedecidigits() {
        return pricedecidigits;
    }

    public void setPricedecidigits(String pricedecidigits) {
        this.pricedecidigits = pricedecidigits;
    }

    public String getAmountdecidigits() {
        return amountdecidigits;
    }

    public void setAmountdecidigits(String amountdecidigits) {
        this.amountdecidigits = amountdecidigits;
    }
}