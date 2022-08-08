import java.io.*;
import java.util.*;

public class FindElement{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int count = -1;
        for(int i = 0; i < a.length; i++){
            if(d == a[i]){
                count = i;
            }
        }
        if(count == -1){
            System.out.println(-1);
        }
        else{
            System.out.println(count);
        }
    }

}