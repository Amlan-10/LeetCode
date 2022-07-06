package com.leetcode;
import java.util.Scanner;
import java.util.Arrays;
public class equal_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        long[]a=new long[n+1];
        long[]b=new long[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
            b[i]=sc.nextLong();
        }
        int val=(check(a,b,n))?1:0;
        System.out.println(val);
    }
    public static boolean check(long A[],long B[],int N){
        Arrays.sort(A);
        Arrays.sort(B);
        return Arrays.equals(A,B);
    }
}


