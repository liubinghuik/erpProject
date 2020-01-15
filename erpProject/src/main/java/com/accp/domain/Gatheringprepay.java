package com.accp.domain;

public class Gatheringprepay {
    private Integer id;

    private String receivableno;

    private String receivableno2;

    private Integer lineno;

    private Double takenmoney;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReceivableno() {
        return receivableno;
    }

    public void setReceivableno(String receivableno) {
        this.receivableno = receivableno;
    }

    public String getReceivableno2() {
        return receivableno2;
    }

    public void setReceivableno2(String receivableno2) {
        this.receivableno2 = receivableno2;
    }

    public Integer getLineno() {
        return lineno;
    }

    public void setLineno(Integer lineno) {
        this.lineno = lineno;
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
}