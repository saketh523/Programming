import java.util.*;
public class Pattern7{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val=0,i,spaces;
        for(i=1;i<=n;i++){
            for(spaces=0;spaces<val;spaces++){
                System.out.print("\t");
            }
            val++;
            System.out.print("*");
            System.out.print("\n");

        }
    }
}