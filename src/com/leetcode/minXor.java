package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class minXor{
    public static int findMinXor(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int min_xor = A[0] ^ A[1];
        for (int i = 2; i < n; i++) {
            min_xor = Math.min(min_xor, A[i] ^ A[i - 1]);
        }
        return min_xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(findMinXor(A));
    }
}