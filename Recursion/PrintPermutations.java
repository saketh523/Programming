
// Source: https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-permutations-official/ojquestion

import java.io.*;
import java.util.*;

public class PrintPermutations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();

        printPermutations(str, "");
    }

    public static void printPermutations(String ques, String asf){

        if(ques.length() == 0){
            System.out.println(asf);
            return;
        }

        for(int i=0; i<ques.length(); i++){
            char ch = ques.charAt(i);
            String qlpart = ques.substring(0,i);
            String qrpart = ques.substring(i+1);

            String ros = qlpart + qrpart;
            printPermutations(ros, asf+ch);

        }
    }
}
