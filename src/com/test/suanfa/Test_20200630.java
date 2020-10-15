package com.test.suanfa;

public class Test_20200630 {
    public int maxArea(int[] height) {
        int left=0,right=(height.length-1);
        int res=0;
        while(right>left){
            res=Math.max(res,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<=height[right]){
                left++;
            }
            else {
                right--;
            }
        }

        return res;
    }
}
