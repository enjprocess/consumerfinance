package com.enfo.consumerfinance.util;

import java.math.BigDecimal;

public class StringUtil {

    /**
     * 返回null及BigDecimal值
     */
    public static BigDecimal stringToBigDecimal(String source, int defaultValue) {
        
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
    public static BigDecimal stringToBigDecimal(String source) {
        
        if (null == source) {
            return null;
        }
        BigDecimal bd = new BigDecimal(source);
        return bd;
    }
    
    /**
     * 得到一个普通字符串，返回第一个字母大写的字符串
     */
    public static String toUpperFirstLetter(String source) {
        
        if (source == null || source.length() == 0) {
            return source; 
        }
        
        String firstLetter = source.substring(0, 1).toUpperCase();
        
        if (source.length() > 2) {
            String tail = source.substring(1);
            return firstLetter + tail;
        }
        
        return firstLetter;
    }
    
}
