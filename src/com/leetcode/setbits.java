package com.leetcode;
import java.util.Scanner;
public class setbits {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        setBits(n);
    }
    static void setBits(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
    }
}
