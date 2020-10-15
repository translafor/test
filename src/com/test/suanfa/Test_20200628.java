package com.test.suanfa;

public class Test_20200628 {
    public static int myAtoi(String str) {
        if(str.length()==0){
            return 0;
        }

        StringBuilder ss=new StringBuilder("");
        int j=0;
        while (j<str.length()&&str.charAt(j)==' '){
            j++;
        }
        for(int i=j;i<str.length();i++){
            if(i==j&&str.charAt(i)=='+'){
                continue;
            }
            if(i==j&&str.charAt(i)=='-'){
                ss.append(str.charAt(i));
                continue;
            }
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                ss.append(str.charAt(i));
                continue;
            }
            break;
        }

        if(ss.toString().equals("")){
            return 0;
        }

        try{
            long s=Long.valueOf(ss.toString());
            if(s>=0){
                return (int)Math.min(Integer.MAX_VALUE,s);
            }
            else{
                return (int)Math.max(Integer.MIN_VALUE,s);
            }
        }catch (Exception e){
            return 0;
        }


    }

    public static void main(String[] args) {
        System.out.println(myAtoi("20000000000000000000"));
    }
}
