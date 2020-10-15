package com.test.suanfa;

public class Test_20200624 {

    public static int reverse(int x) {
        if(x==0){
            return 0;
        }
        String s=String.valueOf(x);
        boolean isFront=true;
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='-'){
                sb.insert(0,s.charAt(i));
                continue;
            }
            if(isFront&&s.charAt(i)=='0'){
                continue;
            }
            else{
                isFront=false;
                sb.append(s.charAt(i));
            }
        }

        long rs=Long.valueOf(sb.toString());
        if(rs>Integer.MAX_VALUE||rs<Integer.MIN_VALUE){
            return 0;
        }else{
            return (int)rs;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(Integer.MAX_VALUE));
    }
}
