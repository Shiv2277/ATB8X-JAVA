import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab037 {
    public static void main(String[] args) {

       // 2(l+w)


        Scanner sc=new Scanner(System.in);
        int width= sc.nextInt();

        System.out.println("Perimeter of the width: ");


        int length= sc.nextInt();
        System.out.println("length of the perimeter: ");

        float s= 2*(length+width);
        System.out.println(s);

    }
}
