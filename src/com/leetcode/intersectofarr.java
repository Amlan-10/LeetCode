package com.leetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class intersectofarr
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        int j = sc.nextInt();
        int[] nums2 = new int[j];
        for (int i = 0; i < j; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
            int i = 0, j = 0, z = 0;
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    nums1[z++] = nums1[i++];
                    j++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                } else if (nums1[i] < nums2[j]) {
                    i++;
                }
            }
            return Arrays.copyOfRange(nums1, 0, z);
        }
    }

