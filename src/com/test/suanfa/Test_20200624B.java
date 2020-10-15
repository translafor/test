package com.test.suanfa;

public class Test_20200624B {

    public static int reverse(int x) {
        int rev = 0;
        try{
            while (x != 0) {
                int pop = x % 10;
                x /= 10;
                rev = rev * 10 + pop;
            }
        }catch (Exception e){
            return
                    0;
        }

        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(Integer.MIN_VALUE));
    }
}
