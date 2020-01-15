package com.accp.domain;

public class Department {
    private String departid;

    private String departname;

    private String engname;

    private String memo;

    private Integer female;

    private Integer male;

    private String salarytypeid;

    private String salaryclassname;

    private String calid;

    public String getDepartid() {
        return departid;
    }

    public void setDepartid(String departid) {
        this.departid = departid;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getFemale() {
        return female;
    }

    public void setFemale(Integer female) {
        this.female = female;
    }

    public Integer getMale() {
        return male;
    }

    public void setMale(Integer male) {
        this.male = male;
    }

    public String getSalarytypeid() {
        return salarytypeid;
    }

    public void setSalarytypeid(String salarytypeid) {
        this.salarytypeid = salarytypeid;
    }

    public String getSalaryclassname() {
        return salaryclassname;
    }

    public void setSalaryclassname(String salaryclassname) {
        this.salaryclassname = salaryclassname;
    }

    public String getCalid() {
        return calid;
    }

    public void setCalid(String calid) {
        this.calid = calid;
    }
}