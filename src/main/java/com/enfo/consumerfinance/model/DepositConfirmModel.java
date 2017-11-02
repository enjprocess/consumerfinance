package com.enfo.consumerfinance.model;

public class DepositConfirmModel {

    private String org_code;
    
    private String loan_date;
    
    private String loan_cont_no;

    public String getOrg_code() {
        return org_code;
    }

    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }

    public String getLoan_date() {
        return loan_date;
    }

    public void setLoan_date(String loan_date) {
        this.loan_date = loan_date;
    }

    public String getLoan_cont_no() {
        return loan_cont_no;
    }

    public void setLoan_cont_no(String loan_cont_no) {
        this.loan_cont_no = loan_cont_no;
    }
}
