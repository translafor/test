package com.test.reflection.field;

import java.lang.reflect.Field;

public class TestReflection {
    public static void main(String[] args) {
        Hero h =new Hero();
        //使用传统方式修改name的值为garen
        h.setName("garen");
        System.out.println(h.getName());
        try {
            //获取类Hero的名字叫做name的字段
            Field f1= h.getClass().getDeclaredField("name");

            f1.setAccessible(true);
            //修改这个字段的值
            f1.set(h, "teemo");
            //打印被修改后的值
            System.out.println(h.getName());

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
