package D19_Objects.D19_T1_Greetings;

public class Application {
    public static void main(String[] args) {

        GreetingMessage msg1 = new GreetingMessage();
        msg1.userName = "Thomas";

        msg1.greet();
    }
}
