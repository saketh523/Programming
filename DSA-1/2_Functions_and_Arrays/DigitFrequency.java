import java.util.*;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int rv = 0;
        int temp = 0;
        int count = 0;
        while(n > 0){
            temp = n%10;
            rv = temp;
            if(rv == d){
                count++;
            }
            n = n/10;
        }
        return count;
    }
}