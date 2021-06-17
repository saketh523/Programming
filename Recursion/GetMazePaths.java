// Source: https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-maze-paths-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        ArrayList<String> res = getMazePaths(1,1, n, m);
        System.out.println(res);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){

        if(sr==dr && sc==dc){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        ArrayList<String> hway = new ArrayList<>();
        ArrayList<String> vway = new ArrayList<>();

         if(sc < dc){
            hway =  getMazePaths(sr, sc+1, dr, dc);
         }
         if( sr < dr){
             vway = getMazePaths(sr+1, sc, dr, dc);
         }


        ArrayList<String> res = new ArrayList<>();

        for(String path: hway){
            res.add("h"+path);
        }

        for(String path: vway){
            res.add("v"+path);
        }

        return res;
    }

}
