public class Lab017 {
    public static void main(String[] args) {
        String str = "shivtej";

        int vCount = 0, cCount = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                ;

            {
                vCount++;
            }

             if (str.charAt(i) >= 'a' && str.charAt(i)<='z') {


                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}
