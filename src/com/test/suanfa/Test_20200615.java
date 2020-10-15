package com.test.suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Test_20200615 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }
        int num=0;
        String temp="";
        int left=0,rignt=0;
        while(left>=0&&left<s.length()&&rignt>=0&&rignt<s.length()){
//            if(rignt==0){
//                temp+=s.indexOf(0);
//            }
//            else {
                if(!temp.contains(String.valueOf(s.charAt(rignt)))){
                    temp+=s.charAt(rignt);
                    rignt++;
                }else{
                    num=temp.length()>num?temp.length():num;
                    int leng=temp.length();
                    temp=temp.substring(1,leng);
//                    temp="";
                    left++;
                    rignt=rignt;
                }
//            }
        }
        num=temp.length()>num?temp.length():num;
//        for(int i=0;i<s.length();i++){
//            if(i==0){
//                temp+=s.indexOf(0);
//            }
//            else {
//                if(s.indexOf(i)!=s.indexOf(i-1)){
//                    temp+=s.indexOf(0);
//                }else{
//                    num=s.length()>num?temp.length():num;
//                }
//            }
//        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aa"));
    }
}
