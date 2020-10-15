package com.test.spring.Builder;

public class Test {
    public static void main(String[] args) {
        TestBuilder TestBuilder=new TestBuilder.Builder().setAge(5).setEmail("email").build();
        System.out.println(TestBuilder);
    }
}
