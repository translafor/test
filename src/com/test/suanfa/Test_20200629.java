package com.test.suanfa;

public class Test_20200629 {
    public static boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x<0){
            return false;
        }
        int spx_root=getBig(x);
        int num_root=x;
        int num=0;
        while(x>0){
            int spx=getBig(x);
            int x1=x/(int)Math.pow(10,spx);
            num=num+(int)Math.pow(10,spx_root-spx)*x1;
            x=x%(int)Math.pow(10,spx);
        }

        if(num_root==num)
            return true;
        else
            return false;
    }

    private static int getBig(int num){
        int spx=0;
        long x=10;
        while(num>=x){
            x=x*10;
            spx++;
        }
        return spx;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(1410110141));
    }
}
