package com.test.suanfa;

public class Test_20200710 {
    public static int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int [][]f=new int[prices.length][3];
        f[0][0]=-prices[0];
        f[0][1]=0;
        f[0][2]=0;
        for(int i=1;i<prices.length;i++){
            f[i][0]= Math.max(f[i-1][2]-prices[i],f[i-1][0]);
            f[i][1]=f[i-1][0]+prices[i];
            f[i][2]=Math.max(f[i-1][2],f[i-1][1]);
        }

        return Math.max(f[prices.length-1][1],f[prices.length-1][2]);
    }

    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{1,2,3,0,2}));
    }

}
