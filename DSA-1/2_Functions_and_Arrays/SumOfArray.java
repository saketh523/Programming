import java.io.*;
import java.util.*;

public class SumOfArray{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] a1 = new int[n1];

        for(int i=0; i<a1.length; i++){
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];

        for(int i=0; i<a2.length; i++){
            a2[i] = scn.nextInt();
        }

        int len = 0;
        int len1 = a1.length;
        int len2 = a2.length;

        if(len1 >= len2){
            len = len1;
        }
        else{
            len = len2;
        }

        int[] sum = new int[len];

        int c = 0;

        int i = len1 - 1;
        int j = len2 - 1;
        int k = sum.length - 1;

        int total = 0;

        for(int m = k; m >= 0; m--){
            total = c;
            if(i >= 0){
                total = total + a1[i];
            }
            if(j >= 0){
                total = total + a2[j];
            }

            c = total/10;
            total = total%10;
            sum[m] = total;

            i--;
            j--;
        }
        for(int val:sum){
            System.out.println(val);
        }
    }

}