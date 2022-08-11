import java.io.*;
import java.util.*;

public class BrokenEconomy{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] a = new int[n];

        for(int i=0; i < a.length; i++){
            a[i] = scn.nextInt();
        }

        int d = scn.nextInt();

        int low = 0;
        int high = a.length - 1;

        int ceil = 0;
        int floor = 0;

        while(low <= high){
            int mid = (low + high)/2;

            if(d < a[mid]){
                high = mid - 1;
                ceil = a[mid];
            }
            else if(d > a[mid]){
                low = mid + 1;
                floor = a[mid];
            }
            else{
                ceil = a[mid];
                floor = a[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }

}