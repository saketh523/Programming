import java.util.*;

public class Pattern14 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();

        for(int i=1; i<=10; i++){
            int res = x*i;
            System.out.println(x + " * "+ i +" = " + res);
        }

    }
}