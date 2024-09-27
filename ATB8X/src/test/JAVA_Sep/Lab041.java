import java.util.Scanner;

public class Lab041 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int fc = sc.nextInt();
        System.out.println("suraface area of the cylinder: ");


        int fc1 = sc.nextInt();
        System.out.println(" height of the cylinder: ");

      //  2πrh+2πr2//surface Area of the Cylinder

        float fc3 = 2*3.142f*fc1*fc + 2*3.142f*fc*fc ;

        System.out.println(fc3);
    }

}
