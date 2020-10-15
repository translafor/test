package com.test.suanfa;

public class Test_20200701 {
    public static String intToRoman(int num) {
        int numsArray[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String strArray[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String res="";
        for(int i=0;i<numsArray.length;i++){
            if(num==0){
                break;
            }
            int req=num/numsArray[i];
            num=num-numsArray[i]*req;
            while(req>0){
                res+=strArray[i];
                req--;
            }


        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }
}
