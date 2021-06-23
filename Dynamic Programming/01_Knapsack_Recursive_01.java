package com.company.dynamicprogramming;

import java.io.*;
import java.util.*;

public class Knapsack_Recursive_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] wt  = new int[n];
        for(int i =0; i< n; i++){
            wt[i] = s.nextInt();
        }
        int[] val = new int[n];
        for(int i =0; i< n; i++){
            val[i] = s.nextInt();
        }
        int W = s.nextInt();

        int max_profit = knapsack(wt,val,W,n);
        System.out.println(max_profit);
    }

    public static int knapsack(int[] wt, int[] val, int W, int n){
        // base condition
        if(n==0 || W==0){
            return 0;
        }

        // Recursive call
        int max_profit = 0;
        if(wt[n-1] <= W){
            max_profit = max(val[n-1] + knapsack(wt, val, W-wt[n-1],n-1), knapsack(wt,val,W,n-1));
        }

        else if(wt[n-1] > W){
            max_profit = knapsack(wt,val,W,n-1);
        }
        return max_profit;
    }

    public static int max(int a, int b){
        return b>a ? b: a;
    }
}
