package com.leetcode;
import java.util.Scanner;
public class minimumoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(minimumOperations(a));
    }
    public static int minimumOperations(int[] nums) {
        int min=nums[0];
        int c=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min && nums[i]!=0){
                min=nums[i];
            }
            if(nums[i]==0){
                k++;
        }
            while(nums[i]!=0){
            nums[i]=nums[i]-min;}
        }
        if(k==nums.length-1)
            return c;
        else
            return -1;
    }
}


