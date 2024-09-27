import java.util.Scanner;

public class Lab046 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number\n");
        int n = sc.nextInt();

        System.out.println("Multiplication of the table");

        for(int i = 1; i <=10; i++)

        {
            System.out.println(n + "X" + i + "="  +(n*i));
        }

    }
}
