import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Lab032 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the side 1 : ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of the side 2 : ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of the side 3 : ");
        double side3 = sc.nextDouble();

        if (side1==side2 && side1==side3 && side2==side3)
        {
            System.out.println("Eualr");
        } else if(side1==side2 || side1==side3|| side2==side3)
        {
            System.out.println("ISO");
        }
        else{
            System.out.println("ScA");
        }

    }
}
