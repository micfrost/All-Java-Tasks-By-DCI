package D25_Arrays.D25_CA_RandomClass;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        // Create an instance of Random class
        Random randomInstance = new Random();

        // Generate random integer in range 0 to 999

        int randomNum1 = randomInstance.nextInt(1000);
        System.out.println(randomNum1);
    }
}
