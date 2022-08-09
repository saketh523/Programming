import java.io.*;
import java.util.*;

public class DiffOfArray{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();

        int[] a1 = new int[n1];

        for(int i = 0; i < a1.length; i++){
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();

        int[] a2 = new int[n2];

        for(int i = 0; i < a2.length; i++){
            a2[i] = scn.nextInt();
        }

        int i = a1.length - 1;
        int j = a2.length - 1;
        int[] diff = new int[n2];

        int k = diff.length - 1;

        int c = 0;
        while(k >= 0){
            int v;

            if(i >= 0){
                v = a1[i];
            } else {
                v = 0;
            }

            if(a2[j] + c >= v){
                diff[k] = a2[j] + c - v;
                c = 0;
            } else {
                diff[k] = a2[j] + c + 10 - v;
                c = -1;
            }

            i--;
            j--;
            k--;
        }

        int idx = 0;
        while(idx < diff.length){
            if(diff[idx] != 0){
                break;
            } else {
                idx++;
            }
        }

        while(idx < diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
    }

}