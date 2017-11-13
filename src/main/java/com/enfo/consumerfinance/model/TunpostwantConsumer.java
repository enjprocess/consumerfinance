package com.enfo.consumerfinance.model;

import java.math.BigDecimal;

public class TunpostwantConsumer {

    
    private String busi_type;                               //1.业务类型(放款、还款)
    private Integer product_id;                             //2.产品ID号
    private Integer trade_date;                             //3.发生日期
    private BigDecimal principal_amount;                    //4.本金发生
    private BigDecimal interest_amount;                     //5.利息发生
    private BigDecimal yhs_amount;                          //6.印花税发生
    private String bank_acct;                               //7.银行帐号
    private Integer input_man = 888;                        //8.操作员
    
    public String getBusi_type() {
        return busi_type;
    }
    public void setBusi_type(String busi_type) {
        this.busi_type = busi_type;
    }
    public Integer getProduct_id() {
        return product_id;
    }
    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
    public Integer getTrade_date() {
        return trade_date;
    }
    public void setTrade_date(Integer trade_date) {
        this.trade_date = trade_date;
    }
    public BigDecimal getPrincipal_amount() {
        return principal_amount;
    }
    public void setPrincipal_amount(BigDecimal principal_amount) {
        this.principal_amount = principal_amount;
    }
    public BigDecimal getInterest_amount() {
        return interest_amount;
    }
    public void setInterest_amount(BigDecimal interest_amount) {
        this.interest_amount = interest_amount;
    }
    public BigDecimal getYhs_amount() {
        return yhs_amount;
    }
    public void setYhs_amount(BigDecimal yhs_amount) {
        this.yhs_amount = yhs_amount;
    }
    public String getBank_acct() {
        return bank_acct;
    }
    public void setBank_acct(String bank_acct) {
        this.bank_acct = bank_acct;
    }
    public Integer getInput_man() {
        return input_man;
    }
    public void setInput_man(Integer input_man) {
        this.input_man = input_man;
    }
    
}
