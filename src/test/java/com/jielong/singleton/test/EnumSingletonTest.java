/**
 * projectName: design-pattern
 * fileName: EnumSingletonTest.java
 * packageName: com.jielong.singleton.test
 * date: 2021-09-20 8:27
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.singleton.test;

import com.jielong.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setData(new Object());

        // 反射
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            Object o = c.newInstance();
            System.out.println(o);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
