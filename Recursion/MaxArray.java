import java.io.*;
import java.util.*;

public class MaxArray {

    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       
       int n = s.nextInt();
       int[] arr = new int[n];
       
       for(int i=0; i<n; i++){
           arr[i] = s.nextInt();
       }
       int res = maxOfArray(arr, 0);
       
       System.out.println(res);
    }

    public static int maxOfArray(int[] arr, int idx){
        
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int misa = maxOfArray(arr,idx+1);
        
        if(misa > arr[idx]){
            return misa;
        }
        else{
            return arr[idx];
        }
        
    }

}
