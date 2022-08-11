package com.leetcode;
import java.util.*;

public class kthdistinctstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        String[] a = new String[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        System.out.println("Enter the value of k: ");
        k = sc.nextInt();
        System.out.println(kthDistinct(a, k));
    }
    public static String kthDistinct(String[] arr, int k) {

        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else
                map.put(arr[i],1);
        }
        int counter = 1;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if(counter==k && entry.getValue()==1){
                return entry.getKey();
            }
            if(entry.getValue()==1)
                counter++;

        }

        return "\"\"";
    }
}