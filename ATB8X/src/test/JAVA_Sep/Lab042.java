import java.util.Scanner;

public class Lab042 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        float rect1 = sc.nextFloat();

        System.out.println(" length of the recatanglr :");

        int rect2 = sc.nextInt();
        System.out.println(" width of the recatanglr :");

        float fc= rect2 * rect1;

        System.out.println(fc);
    }
}
