package D57_Semaphore.DC_CA_2_Messages;

import java.util.concurrent.Semaphore;

public class Messages {
    private int messages = 0;

    //    creating a private instance here
    private static Messages value = new Messages();


    private Semaphore semaphore = new Semaphore(20);

    //    ii is to make the constructor private
//    (encapsulation of constructor)
    private Messages() {

    }

    //    in order to have access to a value of Massage
//    it is static to be able to call it from other class
    public static Messages getValue() {
        return value;
    }

    public void send() {
//        decrease a number of available Semaphores
//        It is like lock in ReentrantLock
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        executing the method sendMSG
//        try with finally release in order to avoid deadlock
        try {
            sendMsg();
        } finally {
            semaphore.release();
        }

    }


    public void sendMsg() {

        synchronized (this) {
            messages++;
            System.out.println(Thread.currentThread().getName() + ". \tCurrent messages after ++ : " + messages);

        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (this) {
            messages--;
            System.out.println(Thread.currentThread().getName() + ". \tCurrent messages after -- : " + messages);
        }
    }
}
