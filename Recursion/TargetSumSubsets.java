// Source: https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/target-sum-subsets-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        int tar = s.nextInt();

        printTargetSumSubsets(arr,0,"",0, 60);
    }

    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar){
      
 
        if(idx == arr.length){ 
            if(sos == tar){
                set = set + ".";
                System.out.println(set);
            }
            return;
        }

        printTargetSumSubsets(arr, idx+1, set + arr[idx] + ", ", sos+arr[idx], tar);

        printTargetSumSubsets(arr, idx+1, set, sos, tar);


    }

}
