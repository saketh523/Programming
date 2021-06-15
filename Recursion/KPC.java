// Source: https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-kpc-official/ojquestion

package com.company.CodingBat;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class KPC {

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    public static ArrayList<String> getKPC(String str) {

        if(str.length() ==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        for(char chcode: codes[ch -48].toCharArray()){
            for(String rstr : rres){
                mres.add(chcode + rstr);
            }
        }
        return mres;
    }

}
