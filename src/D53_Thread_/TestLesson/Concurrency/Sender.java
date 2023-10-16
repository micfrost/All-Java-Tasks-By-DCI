package D53_Thread_.TestLesson.Concurrency;

public class Sender {
    public void sendMessage(String message) {
        System.out.println("Sending " + message);
        System.out.println(message + " sent");
    }
}
