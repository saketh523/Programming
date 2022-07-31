import java.util.*;

public class Pattern18{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int star = n;
        int ospace = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=ospace; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=star; j++){
                if(i > 1 && i <= n/2 && j >1 && j < star){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }

            }
            if(i <=n/2){
                star = star - 2;
                ospace++;
            }
            else{
                star = star + 2;
                ospace--;
            }
            System.out.println();
        }
    }
}