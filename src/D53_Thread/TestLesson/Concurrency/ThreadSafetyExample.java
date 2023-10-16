package D53_Thread.TestLesson.Concurrency;

public class ThreadSafetyExample extends Thread {

    private String message;
    private Sender sender;

    ThreadSafetyExample(String message, Sender sender) {
        this.message = message;
        this.sender = sender;
    }

    public void run() {
        synchronized (sender) {
            sender.sendMessage(message);
        }
    }
}
