package com.test.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestString {
    public static void main(String[] args)
    {


        List<Integer> ss=new ArrayList<>();

        ss= parseInt( 0, ss);
        System.out.println(ss);
    }


    public static List<Integer> parseInt(int number, List<Integer> intList){
        int i=0;
        while( Math.pow(2,i)<=number) {
            i++;
        }
        i=i-1;
        intList.add((int) Math.pow(2,i));
        if((number-(int) Math.pow(2,i))==0) {
            return intList;
        }
        if((number-(int) Math.pow(2,i))==1){
            intList.add(1);
            return intList;
        }
        else {
            parseInt(number-(int) Math.pow(2,i),intList);
        }
        return intList;
    }
}
