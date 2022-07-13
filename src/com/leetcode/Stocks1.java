package com.leetcode;
import java.util.Scanner;
public class Stocks1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println(maxProfit(a));
    }
    public static int maxProfit(int[] prices) {
        int max_profit=0;
        int min_till_now=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min_till_now){
                min_till_now=prices[i];
            }
            // min_till_now=Math.min(prices[i],min_till_now);
            int profit=prices[i]-min_till_now;
            max_profit=Math.max(profit,max_profit);

        }
        return max_profit;
    }
}

