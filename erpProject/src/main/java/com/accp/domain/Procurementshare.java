package com.accp.domain;

import java.util.Date;

public class Procurementshare {
    private String psid;

    private Date createdate;

    private Double mlamount;

    private String assignstyle;

    private String voucherno;

    private String makersign;

    private String permittersign;

    private String status;

    private String remark;

    private String column1;

    private Integer audit;

    public String getPsid() {
        return psid;
    }

    public void setPsid(String psid) {
        this.psid = psid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Double getMlamount() {
        return mlamount;
    }

    public void setMlamount(Double mlamount) {
        this.mlamount = mlamount;
    }

    public String getAssignstyle() {
        return assignstyle;
    }

    public void setAssignstyle(String assignstyle) {
        this.assignstyle = assignstyle;
    }

    public String getVoucherno() {
        return voucherno;
    }

    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }

    public String getMakersign() {
        return makersign;
    }

    public void setMakersign(String makersign) {
        this.makersign = makersign;
    }

    public String getPermittersign() {
        return permittersign;
    }

    public void setPermittersign(String permittersign) {
        this.permittersign = permittersign;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }
}