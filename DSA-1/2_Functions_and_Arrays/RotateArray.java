import java.io.*;
import java.util.*;

public class RotateArray{
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void rotate(int[] arr, int k){

        if(k>=0){
            k = k % arr.length;
            if(k == 0){
                display(arr);
            }
            else {
                while (k > 0) {
                    // This will take care of one rotation in the positive direction
                    for (int i = 0; i < arr.length - 1; i++) {
                        int temp = arr[i];
                        arr[i] = arr[arr.length - 1];
                        arr[arr.length - 1] = temp;
                    }
                    k--;
                }
            }
        }
        else{
            k = arr.length + k;
            while(k>0) {
                // This will take care of one rotation in the negative direction
                for(int i=0; i<arr.length-1;i++) {
                    int temp = arr[i];
                    arr[i] = arr[arr.length - 1];
                    arr[arr.length - 1] = temp;
                }
                k--;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        if(k%a.length!=0){
            display(a);
        }
    }

}