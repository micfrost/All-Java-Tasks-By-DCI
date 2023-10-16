package D53_Thread.TestLesson.WaitToNotify;

public class WaitNotifyTest {

    public static void main(String[] args) {
        Message message = new Message("Test Message");
        WaitExample waitThread = new WaitExample("waitThread", message);
        NotifyExample notifyThread = new NotifyExample(message);

        waitThread.start();
        notifyThread.start();
    }
}
