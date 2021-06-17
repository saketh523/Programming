
// Source: https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-subsequence-official/ojquestion

import java.io.*;
import java.util.*;

public class SubSequencePrint {

    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);
        
        String str = s.next();
        
        printSS(str, "");

    }

    public static void printSS(String str, String ans) {
        
        if(str.length() ==0){
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);
        
        String roq = str.substring(1);
        
        printSS(roq, ans + ch);
        printSS(roq, ans + "");

    }

}
