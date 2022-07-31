import java.util.*;
public class Pattern9{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space1 = 0;
        int space2 = (n+1)/2;
        int star = 1;
        for(int i = 1; i<=n; i++){
            if(i < (n+1)/2){
                for(int j=1; j<=space1; j++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for(int k=1; k<=space2; k++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
                space1++;
                space2 = space2 -2;
            }
            else if(i == (n+1)/2){
                for(int l=1; l<=space1; l++){
                    System.out.print("\t");
                }
                System.out.print("*");
                space2 = 0;
                space2--;
            }
            else{
                space1--;
                space2 = space2 + 2;
                for(int m=1; m<=space1; m++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for(int o=1; o<=space2; o++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
