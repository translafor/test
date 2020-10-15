package com.test.reflectionA;

import java.lang.reflect.Method;

public class Test002 {

    public static void main(String[] args) {
        try {

            // 里面写自己的类名及路径
            Class<?> c = Class.forName("com.test.reflectionA.Test1");
            Object instance = c.newInstance();
            Method get = instance.getClass().getMethod("test001",Integer.class);
            Object result = get.invoke(instance,3);
            System.out.println(result);
        } catch (Exception e) {
        }
    }
}
