public class lab026 {

    public static void main(String[] args) {
        char code= 'B';

        switch (code){
            default :
                System.out.println("Hello");
                break;

            case 'A':
                System.out.println("65");
                break;
        }
    }
}
// it will display the ASCII value since "B" value is not equal to 65 hence the default condition
// will execute .