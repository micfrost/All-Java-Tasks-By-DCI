package D55_Concurrent.E1_ThreadPool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Tasks implements Runnable{

    private int id;

    public Tasks(int id) {
        this.id=id;
    }

    @Override
    public void run() {
        System.out.println("Task " + id + ": started . . .\t" + Thread.currentThread().getName());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Oh no: "+e);
        }

        System.out.println("Task " + id + ": is finished.\t" + Thread.currentThread().getName());
    }
}


public class Calculations {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=1; i<10;i++) {
            executorService.submit(new Tasks(i));
        }

        executorService.shutdown();
        System.out.println("Task are now submitted.");

        try {
//            it waits 1 hour to be sure that all tasks are finished,
//            if tasks are finished faster than it is terminated without waitng one horur.
            executorService.awaitTermination(1,TimeUnit.HOURS);
        } catch (InterruptedException e) {
            System.out.println("Oh no: " + e);
        }

        System.out.println("Tasks are now finished");

    }

}
