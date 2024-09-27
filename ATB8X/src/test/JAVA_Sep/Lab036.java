import java.util.Scanner;
import java.util.SortedMap;

public class Lab036 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Teh sc side of the cube: ");
        int b = scan.nextInt();
        System.out.println("Teh sc1 side of the cube: ");
        int c = scan.nextInt();
        System.out.println("Teh sc2 side of the cube: ");
        int d = scan.nextInt();
        System.out.println("Teh sc3 side of the cube: ");
        if(a==b && b==c && c==d){
            System.out.println(" The give box is CUBE");

        }else{
            System.out.println(" its not cube");

        }

    }
}


//Cube programe