package com.leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class mergedarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] nums1=new int[m+n];
        int[] nums2=new int[n];
        for(int i=0;i<m+n;i++){
            nums1[i]= sc.nextInt();
        }for(int i=0;i<n;i++){
            nums2[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(merge(m,n,nums1,nums2)));
    }
    public static int[] merge(int m, int n,int[] nums1,int[] nums2) {
        int p1=m-1,p2=n-1,i=m+n-1;
        while(p2>=0){
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[i--]=nums1[p1--];
            }
            else
            {
                nums1[i--]=nums2[p2--];
            }
        }
        return nums1;
    }
}
