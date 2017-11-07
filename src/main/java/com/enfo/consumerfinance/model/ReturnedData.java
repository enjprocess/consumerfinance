package com.enfo.consumerfinance.model;

public class ReturnedData {

    private boolean status;
    
    private Integer code;
    
    private String desc;

    public ReturnedData() {
    }

    public ReturnedData(boolean status, Integer code, String desc) {
        super();
        this.status = status;
        this.code = code;
        this.desc = desc;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
}
