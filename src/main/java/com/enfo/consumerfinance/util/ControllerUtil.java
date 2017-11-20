package com.enfo.consumerfinance.util;

public class ControllerUtil {

    /**
     * 给我一个数值字符串，四舍五入后返回(包含null)
     * 如果不是数值不是null那么会抛出NumberFormatException
     */
    public static String roundAmount(String source) {
        return AmountUtil.roundAmount(source, ConstantUtil.ROUND_DIGIT_TWO).toString();
    }
}
