public class Lab023 {
    public static void main(String[] args) {

        int itemcode=006;
        switch (itemcode){
            case 001,003,004:
                System.out.println("All of them are the electronic gadgets");
                break;
            case 002,007,006:
                System.out.println("Hello");
                break;
            default:
                System.out.println("No data");
                break;
        }
    }
}
