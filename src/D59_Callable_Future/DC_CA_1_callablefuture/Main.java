package D59_Callable_Future.DC_CA_1_callablefuture;

import java.time.LocalDateTime;
import java.util.concurrent.*;

class Task implements Callable<String> {
    private String name;
    public Task(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println(name + " executed on: " + LocalDateTime.now().toString());
        return "kiss " + name;
    }
}

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<String> future1 = executorService.submit(new Task("Task1"));
        Future<String> future2 = executorService.submit(new Task("Task2"));
        Future<String> future3 = executorService.submit(new Task("Task3"));

//        to a string is only saved the return
        String thread1 = future1.get();
        String thread2 = future2.get();
        String thread3 = future3.get();

        System.out.println("Thread completed: " + thread1);
        System.out.println("Thread completed: " + thread2);
        System.out.println("Thread completed: " + thread3);
        executorService.shutdown();
        executorService.awaitTermination(4,TimeUnit.HOURS);

    }
}
