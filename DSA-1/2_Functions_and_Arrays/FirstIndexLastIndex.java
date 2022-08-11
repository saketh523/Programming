import java.io.*;
import java.util.*;

public class FirstIndexLastIndex{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }

        int d = scn.nextInt();
        int lastIndex = -1;
        int firstIndex = -1;

        int low = 0;
        int high = a.length - 1;

        while(low <=high){
            int mid = (low + high)/2;

            if( d < a[mid]){
                high = mid - 1;
            }
            else if( d > a[mid]){
                low = mid + 1;
            }
            else if( d == a[mid]){
                firstIndex = mid;
                high = mid - 1;
            }
        }

        System.out.println(firstIndex);

        low = 0;
        high = a.length - 1;


        while(low <= high){
            int mid = (low + high)/2;

            if(d < a[mid]){
                high = mid - 1;

            }
            else if( d > a[mid]){
                low = mid + 1;
            }

            else if(d == a[mid]){
                lastIndex = mid;
                low = mid + 1;
            }
        }
        System.out.println(lastIndex);
    }
}