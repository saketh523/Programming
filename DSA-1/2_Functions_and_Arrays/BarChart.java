import java.io.*;
import java.util.*;

public class BarChart{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }

        int max = a[0];
        for(int i = 0; i< a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }

        for(int floor = max; floor >= 1; floor--){
            for(int i = 0; i < a.length; i++){
                if(a[i] >= floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}