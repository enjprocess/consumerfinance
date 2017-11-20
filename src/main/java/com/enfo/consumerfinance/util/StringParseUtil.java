package com.enfo.consumerfinance.util;

import java.math.BigDecimal;

public class StringParseUtil {

    /**
     * 返回null及BigDecimal值
     */
    public static BigDecimal StringToBigDecimal(String source, int defaultValue) {
        
        if (null == source) {
            return null;
        }
        BigDecimal bd = null;
        try {
            bd = new BigDecimal(source);
            
        } catch(NumberFormatException nfe) {
            bd = new BigDecimal(defaultValue);
        } 
        return bd;
    }
    

    /**
     * 返回null及BigDecimal值
     */
    public static BigDecimal StringToBigDecimal(String source) {
        
        if (null == source) {
            return null;
        }
        BigDecimal bd = new BigDecimal(source);
        return bd;
    }
    
}
