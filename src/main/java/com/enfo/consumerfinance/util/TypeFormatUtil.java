package com.enfo.consumerfinance.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;

import com.enfo.consumerfinance.model.ProductConsumerModel;

/**
 * <p>
 * Title: TypeFormatUtil
 * </p>
 * <p>
 * Description: 类型格式化
 * </p>
 * <p>
 * Company: 盈丰软件
 * </p>
 * 
 * @author lsw
 * @date 2017年11月21日
 */
public class TypeFormatUtil {

    /**
     * 接受一个javabean对象，然后根据传递过来fieldName，对该model中的对应的字段值进行金额格式化(四舍五入)
     * 
     * @throws SecurityException
     * @throws NoSuchFieldException
     */
    public static void formatAmountFromModel(ProductConsumerModel pcm,
            String[] fields) throws Exception {

        Class<? extends ProductConsumerModel> cls = pcm.getClass();
        if (pcm == null || fields == null) {
            return;
        }

        for (String field : fields) {
            Method method = cls.getMethod(
                    "get" + StringUtil.toUpperFirstLetter(field),
                    new Class[] {});
            String fieldValue = (String) method.invoke(pcm, new Object[] {});

            // 如果值是null就不处理
            if (null != fieldValue) {
                BigDecimal bd = AmountUtil.roundAmount(new BigDecimal(
                        fieldValue), ConstantUtil.ROUND_DIGIT_TWO);
                
                //获得set方法
                Method m = cls.getMethod(
                        "set" + StringUtil.toUpperFirstLetter(field),
                        new Class[] {String.class});
                
                m.invoke(pcm, new Object[]{bd.toString()});
                
            }

        }

    }
}
