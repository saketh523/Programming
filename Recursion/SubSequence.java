
// Source: https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-subsequence-official/ojquestion

import java.io.*;
import java.util.*;

public class SubSequence {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        String str  = s.next();
        ArrayList<String> list = gss(str);
        System.out.println(list);
    }

    public static ArrayList<String> gss(String str) {

        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);

        String ros = str.substring(1);

        ArrayList<String> rres = gss(ros);

        ArrayList<String> ssq = new ArrayList<>();

        for( String rstr : rres){
            ssq.add(""+rstr);
        }
        for( String rstr : rres){
            ssq.add(ch+rstr);
        }


        return ssq;
    }

}
