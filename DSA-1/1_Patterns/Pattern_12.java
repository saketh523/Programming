import java.util.*;

public class Pattern12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        for(int i=1; i<=n; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(fib1 +"\t");
                int fibn = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibn;
            }
            System.out.println();
        }
    }
}