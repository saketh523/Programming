import java.io.*;
import java.util.*;

public class InvertedBarChart {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] a = new int[n];

        for(int i = 0; i< a.length; i++){
            a[i] = scn.nextInt();
        }

        int max = a[0];
        for(int i = 0; i< a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }

        for (int i = 0; i < max; i++) {
            for (int val : a) {
                if (i < val) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }

}