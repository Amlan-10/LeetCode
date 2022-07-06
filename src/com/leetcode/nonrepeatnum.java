package com.leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class nonrepeatnum {
    public static int[] singleNumber(int[] nums){
        int ans=0,a=0,b=0;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++) {
            ans = ans ^ nums[i];
        }
        ans = ans & ~(ans-1);
        for(int i=0;i<n;i++)  {
            if((ans & nums[i])!=0)
                a=a^nums[i];
            else
                b=b^nums[i];
        }
        int[] final_ans=new int[2];
        if(a<b){
            final_ans[0]=a;
            final_ans[1]=b;
        }else{
            final_ans[0]=b;
            final_ans[1]=a;
        }
        return final_ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[2*n+2];
        for(int i=0;i<((2*n)+2);i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(singleNumber(arr)));
    }}