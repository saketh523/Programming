import java.io.*;
import java.util.*;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i=0; i < a.length; i++){
            a[i] = scn.nextInt();
        }

        int key = scn.nextInt();

        int low = 0;
        int high = a.length - 1;

        while(low <= high){
            int mid = (low + high)/2;

            if(key == a[mid]){
                System.out.println(mid);
                return;
            }
            else if( key > a[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println(-1);
    }
}