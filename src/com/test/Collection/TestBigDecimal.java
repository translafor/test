package com.test.Collection;

import java.math.BigDecimal;

public class TestBigDecimal {
    public static void main(String[] args) {
        BigDecimal b1=new BigDecimal("1");
        BigDecimal b2=new BigDecimal("7");
        BigDecimal b3=new BigDecimal("7");
        System.out.println(b2.subtract(b1));
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b2.compareTo(b1));
        System.out.println(b1.compareTo(b2));
        System.out.println(b3.compareTo(b2));
    }
}
