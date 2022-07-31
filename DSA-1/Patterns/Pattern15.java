import java.util.*;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int sp = n/2;
        int star = 1;
        int count = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<= sp; j++){
                System.out.print("\t");
            }
            int cval = count;
            for(int k=1; k<=star; k++){
                System.out.print(cval+"\t");
                if(k <= star/2){
                    cval++;
                }
                else{
                    cval--;
                }
            }
            if(i <= n/2){
                sp--;
                star = star + 2;
                count++;
            }
            else{
                count--;
                sp++;
                star = star - 2;
            }
            System.out.println();
        }
    }
}