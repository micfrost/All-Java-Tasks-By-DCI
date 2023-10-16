package D53_Thread.TestLesson.Concurrency;

public class Sender {
    public void sendMessage(String message) {
        System.out.println("Sending " + message);
        System.out.println(message + " sent");
    }
}
