package com.test.reflection.getClass;

public class TestGetClass01 {
    public static void main(String[] args) {
        String className="com.test.reflection.getClass.Hero";
        try {
            Class pClass1=Class.forName(className);
            Class pClass2=Hero.class;
            Class pClass3=new Hero().getClass();
            System.out.println(pClass1==pClass2);
            System.out.println(pClass1==pClass3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
