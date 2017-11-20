package com.enfo.consumerfinance.util;

/**
 * <p>Title: Service</p>
 * <p>Description: </p>
 * <p>Company: 盈丰软件</p> 
 * @author lsw
 * @date 2017年11月20日
 */
public class Service {
    
    private ServiceHeader SERVICE_HEADER; 
    private ServiceBody SERVICE_BODY;
    
    public ServiceHeader getSERVICE_HEADER() {
        return SERVICE_HEADER;
    }
    public void setSERVICE_HEADER(ServiceHeader sERVICE_HEADER) {
        SERVICE_HEADER = sERVICE_HEADER;
    }
    public ServiceBody getSERVICE_BODY() {
        return SERVICE_BODY;
    }
    public void setSERVICE_BODY(ServiceBody sERVICE_BODY) {
        SERVICE_BODY = sERVICE_BODY;
    }
    
    
}
