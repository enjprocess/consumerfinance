package com.enfo.consumerfinance.model;

import java.math.BigDecimal;

public class InvestchangeConsumerModel {

    private Integer product_id;
    private Integer pay_date;
    private BigDecimal trade_money;
    private String org_code;
    private String org_name;
    private String loan_cont_no;
    private Integer input_man;
    private String pay_file;
    
    public InvestchangeConsumerModel() {
    }

    
    
    public InvestchangeConsumerModel(Integer product_id, Integer pay_date,
            BigDecimal trade_money, String org_code, String org_name,
            String loan_cont_no, Integer input_man, String pay_file) {
        super();
        this.product_id = product_id;
        this.pay_date = pay_date;
        this.trade_money = trade_money;
        this.org_code = org_code;
        this.org_name = org_name;
        this.loan_cont_no = loan_cont_no;
        this.input_man = input_man;
        this.pay_file = pay_file;
    }



    public Integer getProduct_id() {
        return product_id;
    }
    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
    public Integer getPay_date() {
        return pay_date;
    }
    public void setPay_date(Integer pay_date) {
        this.pay_date = pay_date;
    }
    public BigDecimal getTrade_money() {
        return trade_money;
    }
    public void setTrade_money(BigDecimal trade_money) {
        this.trade_money = trade_money;
    }
    public String getOrg_code() {
        return org_code;
    }
    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }
    public String getOrg_name() {
        return org_name;
    }
    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }
    public String getLoan_cont_no() {
        return loan_cont_no;
    }
    public void setLoan_cont_no(String loan_cont_no) {
        this.loan_cont_no = loan_cont_no;
    }
    public Integer getInput_man() {
        return input_man;
    }
    public void setInput_man(Integer input_man) {
        this.input_man = input_man;
    }
    public String getPay_file() {
        return pay_file;
    }
    public void setPay_file(String pay_file) {
        this.pay_file = pay_file;
    }
    
}
