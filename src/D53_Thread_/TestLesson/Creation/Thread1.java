package D53_Thread_.TestLesson.Creation;

public class Thread1 implements Runnable  {

    public void run() {
        System.out.println("Thread1 class implements Runnable interface.");
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread t1 = new Thread(thread1);
        t1.start();
    }
}
