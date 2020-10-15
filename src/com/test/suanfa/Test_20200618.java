package com.test.suanfa;

public class Test_20200618 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num[]=new int[nums1.length+nums2.length];
        if((nums1.length+nums2.length)%2==1){
            int i=0,j=0,k=0;
            while(i<nums1.length||j<nums2.length){


                if(i>=nums1.length){
                    num[k]=nums2[j];
                    if((nums1.length+nums2.length-1)/2==k){
                        return (double)num[k];
                    }
                    j++;
                    k++;
                    continue;
                }

                if(j>=nums2.length){
                    num[k]=nums1[i];
                    if((nums1.length+nums2.length-1)/2==k){
                        return (double)num[k];
                    }
                    i++;
                    k++;
                    continue;
                }

                if(nums1[i]<nums2[j]){
                    num[k]=nums1[i];
                    if((nums1.length+nums2.length-1)/2==k){
                        return (double)num[k];
                    }
                    i++;
                    k++;
continue;
                }
                else{
                    num[k]=nums2[j];
                    if((nums1.length+nums2.length-1)/2==k){
                        return (double)num[k];
                    }
                    j++;
                    k++;
continue;
                }
            }
        }
        else{
            int i=0,j=0,k=0;
            while(i<nums1.length||j<nums2.length){
                if(i>=nums1.length){
                    num[k]=nums2[j];
                    if((nums1.length+nums2.length)/2==k){
                        return (double)(num[k]+num[k-1])/2;
                    }
                    j++;
                    k++;
                    continue;
                }

                if(j>=nums2.length){
                    num[k]=nums1[i];
                    if((nums1.length+nums2.length)/2==k){
                        return (double)(num[k]+num[k-1])/2;
                    }
                    i++;
                    k++;
                    continue;
                }


                if(nums1[i]<nums2[j]){
                    num[k]=nums1[i];
                    if((nums1.length+nums2.length)/2==k){
                        return (double)(num[k]+num[k-1])/2;
                    }
                    i++;
                    k++;
                    continue;
                }
                else{
                    num[k]=nums2[j];
                    if((nums1.length+nums2.length)/2==k){
                        return (double)(num[k]+num[k-1])/2;
                    }
                    j++;
                    k++;
    continue;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2};
        int nums2[] = {};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
