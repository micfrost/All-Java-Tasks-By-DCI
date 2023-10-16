package D53_Thread.TestLesson.Creation;

public class Thread2 extends Thread {

    public void run() {
        System.out.println("Thread2 class extends Thread class");
    }

    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();
        thread2.start();
    }

}
