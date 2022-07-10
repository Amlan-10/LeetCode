package com.leetcode;
import java.util.Scanner;
public class Powersetofstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
         powerset(s,0," ");
    }
    public static void powerset(String S, int i, String cur){
      if(i==S.length()) {
          System.out.println(cur);
          return;
      }
        powerset(S, i + 1, cur + S.charAt(i));
        powerset(S,i+1,cur);
    }
}
