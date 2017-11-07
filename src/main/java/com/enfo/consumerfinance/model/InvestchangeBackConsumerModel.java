package com.enfo.consumerfinance.model;

import java.math.BigDecimal;

public class InvestchangeBackConsumerModel {

    private Integer product_id;                 //产品ID号
    private Integer date;                       //日期
    private BigDecimal principal_amount;        //本金
    private BigDecimal interest_amount;         //利息/收益
    private String org_code;                    //服务商编码
    private String org_name;                    //服务商名称
    private String recv_file;                   //还款文件
    private Integer input_man = 888;            //操作员
    
    public InvestchangeBackConsumerModel() {
    }

    
    public InvestchangeBackConsumerModel(Integer product_id, Integer date,
            BigDecimal principal_amount, BigDecimal interest_amount,
            String org_code, String org_name, String recv_file,
            Integer input_man) {
        super();
        this.product_id = product_id;
        this.date = date;
        this.principal_amount = principal_amount;
        this.interest_amount = interest_amount;
        this.org_code = org_code;
        this.org_name = org_name;
        this.recv_file = recv_file;
        this.input_man = input_man;
    }



    public Integer getProduct_id() {
        return product_id;
    }
    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
    public Integer getDate() {
        return date;
    }
    public void setDate(Integer date) {
        this.date = date;
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
    public String getRecv_file() {
        return recv_file;
    }
    public void setRecv_file(String recv_file) {
        this.recv_file = recv_file;
    }
    public Integer getInput_man() {
        return input_man;
    }
    public void setInput_man(Integer input_man) {
        this.input_man = input_man;
    }

}
