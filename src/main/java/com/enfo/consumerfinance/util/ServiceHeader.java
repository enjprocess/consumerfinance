package com.enfo.consumerfinance.util;

/**
 * <p>Title: ServiceHeader</p>
 * <p>Description: </p>
 * <p>Company: 盈丰软件</p> 
 * @author lsw
 * @date 2017年11月20日
 */
public class ServiceHeader {

    private String SERVICE_ID;
    private String ORG;
    private String CHANNEL_ID;
    private String ACQ_ID;
    private String SUB_TERMINAL_TYPE;
    private String SERVICESN;
    private String REQUEST_TIME;
    private String VERSION_ID;
    
    public String getSERVICE_ID() {
        return SERVICE_ID;
    }
    public void setSERVICE_ID(String sERVICE_ID) {
        SERVICE_ID = sERVICE_ID;
    }
    public String getORG() {
        return ORG;
    }
    public void setORG(String oRG) {
        ORG = oRG;
    }
    public String getCHANNEL_ID() {
        return CHANNEL_ID;
    }
    public void setCHANNEL_ID(String cHANNEL_ID) {
        CHANNEL_ID = cHANNEL_ID;
    }
    public String getACQ_ID() {
        return ACQ_ID;
    }
    public void setACQ_ID(String aCQ_ID) {
        ACQ_ID = aCQ_ID;
    }
    public String getSUB_TERMINAL_TYPE() {
        return SUB_TERMINAL_TYPE;
    }
    public void setSUB_TERMINAL_TYPE(String sUB_TERMINAL_TYPE) {
        SUB_TERMINAL_TYPE = sUB_TERMINAL_TYPE;
    }
    public String getSERVICESN() {
        return SERVICESN;
    }
    public void setSERVICESN(String sERVICESN) {
        SERVICESN = sERVICESN;
    }
    public String getREQUEST_TIME() {
        return REQUEST_TIME;
    }
    public void setREQUEST_TIME(String rEQUEST_TIME) {
        REQUEST_TIME = rEQUEST_TIME;
    }
    public String getVERSION_ID() {
        return VERSION_ID;
    }
    public void setVERSION_ID(String vERSION_ID) {
        VERSION_ID = vERSION_ID;
    }
}
