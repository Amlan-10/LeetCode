package com.leetcode;
import java.util.Scanner;
public class Stocks2 {
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
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]<prices[i]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}
