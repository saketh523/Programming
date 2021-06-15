import java.io.*;
import java.util.*;

public class LastIndexArray {

    public static void main(String[] args) throws Exception {

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0; i< arr.length; i++){
                arr[i] = s.nextInt();
            }
            int x = s.nextInt();

           int fi = lastIndex( arr, 0, x);
           System.out.println(fi);

        }

        public static int lastIndex(int[] arr, int index, int x) {

            if(index == arr.length){
                return -1;
            }

            int lisa = lastIndex(arr, index+1, x);

            if(lisa == -1){
                if(arr[index] ==x){
                    return index;
                }
                else{
                    return -1;
                }
            }
            else{
                return lisa;
            }

        }
}
