// Source: https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/fibonacci-dp-official/ojquestion

package com.company.dynamicprogramming;

import java.io.*;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int fibn = FibMemoized( n, new int[n+1]);
        System.out.println(fibn);
    }

    public static int FibMemoized(int n, int[] qb){
        if(n==0 || n==1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        int fibn =  FibMemoized(n-2, qb) + FibMemoized(n-1, qb);

        qb[n] = fibn;
        return fibn;
    }
}
