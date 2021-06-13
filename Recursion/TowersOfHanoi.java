import java.util.Scanner;

public class TowersOfHanoi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of disks");
        int n = s.nextInt();
        System.out.println("Enter your source tower: ");
        char fromTower = s.next().charAt(0);
        System.out.println("Enter your destination tower: ");
        char toTower = s.next().charAt(0);
        System.out.println("Enter your auxiliary tower: ");
        char auxTower = s.next().charAt(0);

        TowersOfHanoiCall(n, fromTower, toTower, auxTower);
    }

    public static void TowersOfHanoiCall(int n, char fromTower, char toTower, char auxTower){

        if(n==1){
            System.out.println("Move Disk from " + fromTower + " to " + toTower);
            return;
        }
        else{
            TowersOfHanoiCall(n-1, fromTower, auxTower, toTower );

            System.out.println("Move disk from " + fromTower + " to " + toTower);

            TowersOfHanoiCall(n-1, auxTower, toTower, fromTower);
        }
    }
}
