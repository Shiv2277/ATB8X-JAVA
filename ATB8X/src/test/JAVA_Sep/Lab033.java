import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

import static java.util.Scanner.*;

public class Lab033 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

      System.out.println("Enter the year : ");
       int year = sc.nextInt();
    //1700
        // sc.close();
      System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
      ?year + "is a leap year" :year + " is not a leap year.");


    }
}
