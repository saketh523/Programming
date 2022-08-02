import java.util.*;

public class AnyBaseToAnyBase{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2= scn.nextInt();
        int d = getValue(n, b1, b2);
        System.out.println(d);
    }

    public static int getValue(int n, int b1, int b2){
        int d1 = getValueIndecimal(n, b1);
        int d2 = getValueInBase(d1, b2);
        return d2;
    }

    public static int getValueInBase(int n, int b){
        int rv = 0;
        int p = 1;

        while(n>0){
            int dig = n%b;
            n = n/b;

            rv = rv + dig * p;
            p = p * 10;
        }

        return rv;

    }

    public static int getValueIndecimal(int n, int b){
        int rv = 0;
        int p = 1;

        while(n > 0)
        {
            int dig = n%10;
            n = n/10;

            rv = rv + dig*(p);
            p = p * b;

        }
        return rv;
    }

}