import java.util.*;
public class Pattern7{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val=0,i,spaces;
        for(i=1;i<=n;i++){
            for(int j=1; j<=n; j++){
                if(i==j){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}