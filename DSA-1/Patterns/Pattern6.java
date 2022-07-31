import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int star = (n+1)/2;
        int space = 1;

        for(int i = 1; i<=n; i++){
            if(i<(n+1)/2){
                for(int j=1; j<=star; j++){
                    System.out.print("*\t");
                }
                for(int k=1; k<=space; k++){
                    System.out.print("\t");
                }
                for(int l=1; l<=star; l++){
                    System.out.print("*\t");
                }
                star--;
                space = space + 2;
            }
            else{
                for(int j=1; j<=star; j++){
                    System.out.print("*\t");
                }
                for(int k=1; k<=space; k++){
                    System.out.print("\t");
                }
                for(int l=1; l<=star; l++){
                    System.out.print("*\t");
                }
                star++;
                space = space - 2;
            }
        System.out.println();
        }

    }
}