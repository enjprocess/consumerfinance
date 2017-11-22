package com.enfo.consumerfinance.model;

public class DepositConfirmModel {

    
    private String orgCode;
    
    private String signDate;
    
    private String loanContNo;

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getLoanContNo() {
        return loanContNo;
    }

    public void setLoanContNo(String loanContNo) {
        this.loanContNo = loanContNo;
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

}
