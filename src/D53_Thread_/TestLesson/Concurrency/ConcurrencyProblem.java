package D53_Thread_.TestLesson.Concurrency;

public class ConcurrencyProblem {
    public static void main(String[] args) {

        Sender sender = new Sender();

        ThreadSafetyExample thread1 = new ThreadSafetyExample("Hi", sender);
        ThreadSafetyExample thread2 = new ThreadSafetyExample("Bye", sender);

        thread1.start();
        thread2.start();
    }
}
