package com.leetcode;
import java.util.Scanner;
public class maxsumsubarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(subarray(nums));
    }
    public static int subarray(int[] nums){
        int max=Integer.MIN_VALUE;
        int cur_sum=0;
        for(int i=0;i<nums.length;i++){
            cur_sum=cur_sum+nums[i];
            if(max<cur_sum){
                max=cur_sum;
            }
            else if(cur_sum<0){
                cur_sum=0;
            }
        }
        return max;
    }
}

