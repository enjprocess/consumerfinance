package com.enfo.consumerfinance.model;

import java.math.BigDecimal;

public class ProductConsumerModel {

    private int product_id;                                  //产品ID号                                                                
    private String product_code;                             //产品编号                                                
    private String product_name;                             //产品名称                                                
    private String product_jc;                               //产品简称                                              
    private int start_date;                                  //产品起始日期                                              
    private int end_date;                                    //产品终止日期                                            
    private int fact_end_date;                               //产品实际结束日期                                                 
    private int valid_period;                                //产品期限(月)                                                
    private int period_unit;                                 //期限计算单位                                               
    private String product_status;                           //产品状态                                                  
    private String product_status_name;                      //产品状态说明                                                       
    private int open_flag;                                   //开放式/封闭式                                             
    private String open_flag_name;                           //开放式/封闭式说明                                                  
    private String tg_bank_id;                               //托管账户银行id                                              
    private String tg_bank_name;                             //托管账户银行名称                                                
    private String tg_bank_sub_name;                         //托管账户支行名称                                                    
    private String tg_bank_acct;                             //托管账户号                                                
    private String tg_acct_name;                             //托管开户名称                                                
    private int intrust_flag1;                               //单一集合标志                                                 
    private String intrust_type1;                            //项目类型：资金信托、财产信托                                                 
    private int depart_id;                                   //所属部门                                             
    private BigDecimal fact_money;                           //实际发行金额                                              
    private int cooperation_mode;                            //合作模式（主被、被动）                                                    
    private BigDecimal stampdutyrate;                        //印花税率              
    
    public int getProduct_id() {
        return product_id;
    }
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    public String getProduct_code() {
        return product_code;
    }
    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public String getProduct_jc() {
        return product_jc;
    }
    public void setProduct_jc(String product_jc) {
        this.product_jc = product_jc;
    }
    public int getStart_date() {
        return start_date;
    }
    public void setStart_date(int start_date) {
        this.start_date = start_date;
    }
    public int getEnd_date() {
        return end_date;
    }
    public void setEnd_date(int end_date) {
        this.end_date = end_date;
    }
    public int getFact_end_date() {
        return fact_end_date;
    }
    public void setFact_end_date(int fact_end_date) {
        this.fact_end_date = fact_end_date;
    }
    public int getValid_period() {
        return valid_period;
    }
    public void setValid_period(int valid_period) {
        this.valid_period = valid_period;
    }
    public int getPeriod_unit() {
        return period_unit;
    }
    public void setPeriod_unit(int period_unit) {
        this.period_unit = period_unit;
    }
    public String getProduct_status() {
        return product_status;
    }
    public void setProduct_status(String product_status) {
        this.product_status = product_status;
    }
    public String getProduct_status_name() {
        return product_status_name;
    }
    public void setProduct_status_name(String product_status_name) {
        this.product_status_name = product_status_name;
    }
    public int getOpen_flag() {
        return open_flag;
    }
    public void setOpen_flag(int open_flag) {
        this.open_flag = open_flag;
    }
    public String getOpen_flag_name() {
        return open_flag_name;
    }
    public void setOpen_flag_name(String open_flag_name) {
        this.open_flag_name = open_flag_name;
    }
    public String getTg_bank_id() {
        return tg_bank_id;
    }
    public void setTg_bank_id(String tg_bank_id) {
        this.tg_bank_id = tg_bank_id;
    }
    public String getTg_bank_name() {
        return tg_bank_name;
    }
    public void setTg_bank_name(String tg_bank_name) {
        this.tg_bank_name = tg_bank_name;
    }
    public String getTg_bank_sub_name() {
        return tg_bank_sub_name;
    }
    public void setTg_bank_sub_name(String tg_bank_sub_name) {
        this.tg_bank_sub_name = tg_bank_sub_name;
    }
    public String getTg_bank_acct() {
        return tg_bank_acct;
    }
    public void setTg_bank_acct(String tg_bank_acct) {
        this.tg_bank_acct = tg_bank_acct;
    }
    public String getTg_acct_name() {
        return tg_acct_name;
    }
    public void setTg_acct_name(String tg_acct_name) {
        this.tg_acct_name = tg_acct_name;
    }
    public int getIntrust_flag1() {
        return intrust_flag1;
    }
    public void setIntrust_flag1(int intrust_flag1) {
        this.intrust_flag1 = intrust_flag1;
    }
    public String getIntrust_type1() {
        return intrust_type1;
    }
    public void setIntrust_type1(String intrust_type1) {
        this.intrust_type1 = intrust_type1;
    }
    public int getDepart_id() {
        return depart_id;
    }
    public void setDepart_id(int depart_id) {
        this.depart_id = depart_id;
    }
    public BigDecimal getFact_money() {
        return fact_money;
    }
    public void setFact_money(BigDecimal fact_money) {
        this.fact_money = fact_money;
    }
    public int getCooperation_mode() {
        return cooperation_mode;
    }
    public void setCooperation_mode(int cooperation_mode) {
        this.cooperation_mode = cooperation_mode;
    }
    public BigDecimal getStampdutyrate() {
        return stampdutyrate;
    }
    public void setStampdutyrate(BigDecimal stampdutyrate) {
        this.stampdutyrate = stampdutyrate;
    }
}
