import java.util.*;
public class npr {
    public static int fact(int x){
        int rv = 1;
        for(int i=1; i<=x; i++){
            rv = rv * i;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int r = scn.nextInt();
        int fact=1;
        int nfact = fact(n);
        int nmrfact = fact(n-r);
        System.out.println(n + "P" + r + " = " + nfact/nmrfact);
    }
}
