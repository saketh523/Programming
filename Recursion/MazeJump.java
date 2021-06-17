// Source: https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-maze-path-with-jumps-official/ojquestion

import java.io.*;
import java.util.*;

public class MazeJump {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        ArrayList<String> paths = getMazeJumps(1, 1, n, m);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazeJumps(int sr, int sc, int dr, int dc){

        // base condition

        if(sr==dr && sc==dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> paths = new ArrayList<>();

        // horizontal paths

        for(int ms=1; ms <= dc-sc; ms++) {
            ArrayList<String> hpaths = getMazeJumps(sr, sc + ms, dr, dc);
            for (String s : hpaths) {
                paths.add("h" + ms + s);
            }
        }

        // vertical paths

        for(int ms=1; ms <= dr-sr; ms++){
            ArrayList<String> vpaths = getMazeJumps(sr+ms,sc, dr, dc);
            for(String s: vpaths){
                paths.add("v"+ms+s);
            }
        }

        // diagonal paths

        for(int ms=1; ms <= dc-sc && ms <= dr-sr; ms++){
            ArrayList<String> dpaths = getMazeJumps(sr+ms,sc+ms, dr, dc);
            for(String s: dpaths){
                paths.add("d"+ms+s);
            }
        }

        return paths;
    }
}
