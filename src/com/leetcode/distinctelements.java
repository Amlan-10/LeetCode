package com.leetcode;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class distinctelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(distinct(a));
    }
    public static int distinct(int[] a){
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        return s.size();
    }
}
