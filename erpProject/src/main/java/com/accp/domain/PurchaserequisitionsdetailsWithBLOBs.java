package com.accp.domain;

public class PurchaserequisitionsdetailsWithBLOBs extends Purchaserequisitionsdetails {
    private byte[] trantype;

    private byte[] fromno;

    public byte[] getTrantype() {
        return trantype;
    }

    public void setTrantype(byte[] trantype) {
        this.trantype = trantype;
    }

    public byte[] getFromno() {
        return fromno;
    }

    public void setFromno(byte[] fromno) {
        this.fromno = fromno;
    }
}