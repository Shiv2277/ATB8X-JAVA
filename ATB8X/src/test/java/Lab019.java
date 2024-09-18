public class Lab019 {
    public static void main(String[] args) {

        String browser= "Firefox";

        switch (browser){

            case "chrome":
            System.out.println("execute the chrome browser");
            break;

        case "Firefox":
          System.out.println("execute the firefox browser");
          break;
         case "edge":
          System.out.println("execute the edge browser");
            break;
            default:
                System.out.println("i have no idea");
        }
    }
}
