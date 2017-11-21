package com.enfo.consumerfinance.controller.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.enfo.consumerfinance.util.StringUtil;

public class ReflectTest {

    private ReflectTest() {};
    
    public static void main(String[] args) throws Exception {
    
       /* Class cls = ReflectTest.class;
        
        Constructor<Class<?>> constructor = cls.getDeclaredConstructor(new Class[]{});
        
        constructor.setAccessible(true);
        
        System.out.println(constructor.getName());
        System.out.println(constructor.getModifiers());
        
        //有些对象的可见性是不能够改变的，当这种对象设置Accessible的时候，那么就抛出SecurityException
        */  
        
        
   /*     Father f = new Father();
        f.setAge(18);
        f.setName("God bless you");
        
        Class cls = Father.class;
        
        Field field = cls.getDeclaredField("age");
        
        field.setAccessible(true);
        
        Object obj = field.get(f);
        
        System.out.println(obj);
        */
    
        
        Father f = new Father();
        f.setAge(18);
        Class<Father> cls = Father.class;
        
        //System.out.println("get" + StringUtil.toUpperFirstLetter("age"));
        
        Method method = cls.getMethod("get" + StringUtil.toUpperFirstLetter("name"), new Class[]{});
        
        Object object = method.invoke(f, new Object[]{});
        System.out.println(object);
        
    }
    
}
