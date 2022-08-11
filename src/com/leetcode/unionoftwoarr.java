package com.leetcode;
import java.util.*;
import java.util.Scanner;

public class unionoftwoarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r;
        System.out.println("Enter the size of the first array: ");
        n = sc.nextInt();
        System.out.println("Enter the size of the second array: ");
        r = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[r];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < r; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(union(a,b));
    }
    public static int union(int[] a,int[] b){
        Set<Integer> s=new HashSet<>(a.length+b.length);
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            s.add(b[j]);
        }
        return s.size();
    }
}
