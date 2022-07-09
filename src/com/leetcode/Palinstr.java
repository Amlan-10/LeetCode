package com.leetcode;
import java.util.Scanner;
public class Palinstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(isPalindrome(s));
    }
    static int isPalindrome(String S) {
        int l=0;
        int r= S.length()-1;
        while(l<r){
            if(S.charAt(l) == S.charAt(r)){
                l++;
                r--;
            }
            else if(S.charAt(l)!=S.charAt(r)){
                return 0;
            }}
        return 1;
    }
}
