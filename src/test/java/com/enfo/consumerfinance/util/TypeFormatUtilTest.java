package com.enfo.consumerfinance.util;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.enfo.consumerfinance.model.ProductConsumerModel;
import com.google.gson.Gson;

public class TypeFormatUtilTest {

    @Test
    public void testFormatAmountFromModel() throws Exception {
        ProductConsumerModel pc = new ProductConsumerModel();
        
        //准备原始数据
        String sourcePreMoney = "1590000.019";
        String sourceMinMoney = "1590000.011";
        String sourceFactMoney = "1590000.015";
        String sourceTotalMoney = "1590000.0119";
        String sourceTotalAmount = "1590000.0159";
        
        //期望的结果数据
        String expectedPreMoney = "1590000.02";
        String expectedMinMoney = "1590000.01";
        String expectedFactMoney = "1590000.02";
        String expectedTotalMoney = "1590000.01";
        String expectedTotalAmount = "1590000.01";

        pc.setPreMoney(sourcePreMoney);
        pc.setMinMoney(sourceMinMoney);
        pc.setFactMoney(sourceFactMoney);
        pc.setTotalMoney(sourceTotalMoney);
        pc.setTotalAmount(sourceTotalAmount);
        
        TypeFormatUtil.formatAmountFromModel(pc, new String[] {
                        ConstantUtil.PRE_MONEY, ConstantUtil.MIN_MONEY, ConstantUtil.FACT_MONEY, ConstantUtil.TOTAL_MONEY,
                        ConstantUtil.TOTAL_AMOUNT });

        //调用方法后得到的结果
        String preMoney = pc.getPreMoney();
        String minMoney = pc.getMinMoney();
        String factMoney = pc.getFactMoney();
        String totalMoney = pc.getTotalMoney();
        String totalAmount = pc.getTotalAmount();
        
        Assert.assertEquals(expectedPreMoney, preMoney);
        Assert.assertEquals(expectedMinMoney, minMoney);
        Assert.assertEquals(expectedFactMoney, factMoney);
        Assert.assertEquals(expectedTotalMoney, totalMoney);
        Assert.assertEquals(expectedPreMoney, totalAmount);
        
    }
    
}
