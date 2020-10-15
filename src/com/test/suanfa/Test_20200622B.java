package com.test.suanfa;

public class Test_20200622B {
    public static String longestPalindrome(String s){
        int len=s.length();

        if(len<2){
            return s;
        }
        int maxLen=0;
        int left=0;
        boolean [][]dp=new boolean[len][len];
        char[] charArray = s.toCharArray();

        for(int i=0;i<len;i++){
            dp[i][i]=true;
        }
        for(int j=0;j<len;j++){
            for(int i=0;i<j;i++){
                if(j-i<3){
                    dp[i][j]=(charArray[i]==charArray[j]);
                }
                else{
                    dp[i][j]=(charArray[i]==charArray[j])&&dp[i+1][j-1];
                }

                if(dp[i][j]&&(j-i+1)>maxLen){
                    maxLen=j-i+1;
                    left=i;
                }
            }
        }

        return s.substring(left,left+maxLen);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }
}
