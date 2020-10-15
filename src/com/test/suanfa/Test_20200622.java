package com.test.suanfa;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Test_20200622 {
    public static String longestPalindrome(String s) {
        String res="";
        for(int index=0;index<s.length();index++){
            int left=index;
            while(left>=0&&(s.charAt(left)==s.charAt(index))){
                left--;
            }

            int right=index;
            while(right<s.length()&&(s.charAt(right)==s.charAt(index))){
                right++;
            }


            while(left>=0&&right<s.length()&&(s.charAt(left)==s.charAt(right))){
                left--;
                right++;
            }
            if((s.substring(left+1,right).length())>res.length()){
                res=s.substring(left+1,right);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }
}
