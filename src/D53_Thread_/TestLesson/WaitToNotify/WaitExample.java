package D53_Thread_.TestLesson.WaitToNotify;

import java.time.Instant;

public class WaitExample extends Thread {
    private Message message;
    private String threadName;

    public WaitExample(String threadName, Message message) {
        this.message = message;
        this.threadName = threadName;
    }

    public void run() {
        synchronized (message) {
            try {

                System.out.println(message.getMessage());
                System.out.println(threadName + " is waiting to ger notified, time is: " + Instant.now());
                message.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

//        anything here s done after the thread wakes up
            System.out.println(threadName + " got notified at time: " + Instant.now());
        }
    }
}
