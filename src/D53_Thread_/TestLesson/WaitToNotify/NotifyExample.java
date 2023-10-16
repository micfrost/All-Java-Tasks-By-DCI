package D53_Thread_.TestLesson.WaitToNotify;

public class NotifyExample extends Thread {
    private Message message;


    NotifyExample(Message message) {
        this.message = message;
    }

    public void run() {
        try {
            Thread.sleep(1000);
            synchronized (message) {
                message.notify();
            }

        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
