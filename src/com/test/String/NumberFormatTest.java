package com.test.String;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class NumberFormatTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(-100000);
//        NumberFormat currency = NumberFormat.getNumberInstance();
//        currency.setMinimumFractionDigits(0);//设置数的小数部分所允许的最小位数(如果不足后面补0)
//        currency.setMaximumFractionDigits(2);//设置数的小数部分所允许的最大位数(如果超过会四舍五入)
        System.out.println(bigDecimal.negate());
    }
}
