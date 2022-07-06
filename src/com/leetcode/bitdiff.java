package com.leetcode;
import java.util.Scanner;
public class bitdiff {
    public static void main(String[] args) {
        int A,B;
        Scanner sc=new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        System.out.println(countBitsFlip(A,B));
    }
    public static int countBitsFlip(int a, int b){
        if(a==b){
            return 0;
        }
        int count=0,ans=0;
        ans=a^b;
        while(ans>0) {
            if((ans&1)==1){
                count++;
            }
            ans = ans >> 1;//ans=ans/2;
        }
        return count;
    }
}



