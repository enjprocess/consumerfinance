package com.enfo.consumerfinance.util;

import java.math.BigDecimal;
import java.math.MathContext;

public class AmountUtil {

    

    /**
     * 对金钱进行四舍五入
     */
    public static BigDecimal roundAmount(BigDecimal sourceAmount, int DecimalDigits) {
        if(null == sourceAmount) {
            return null;
        }
        
        return sourceAmount.setScale(DecimalDigits, BigDecimal.ROUND_HALF_UP);
    }
    
    /**
     * 对金钱进行四舍五入
     */
    public static BigDecimal roundAmount(String sourceAmount, int DecimalDigits) {
        
        if(null == sourceAmount) {
            return null;
        }
        
        BigDecimal bd = StringUtil.stringToBigDecimal(sourceAmount);
        
        return bd.setScale(DecimalDigits, BigDecimal.ROUND_HALF_UP);
    }
    
    
   
}
