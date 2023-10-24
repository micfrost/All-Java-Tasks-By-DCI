package D56_FixedThreadPool.T1_FixedThreadPool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class TaskProcessor implements Runnable{


    private int number;

    public TaskProcessor(int number) {
        this.number = number;
    }

    @Override
    public void run() {
            long fact = 1L;
            for (int i = 2; i <= number; i++) {
                fact = fact * i;
            }
            System.out.println("Executed thanks to: " + Thread.currentThread().getName() + "\t\tFactorial for " + number + " is: " + fact + ".");
        }

    }


public class Main {


    public static void main(String[] args) {

//        create an ExecutorService using Executors.newFixedThreadPool with a specified number of threads (e.g., 4).
        ExecutorService executorService =  Executors.newFixedThreadPool(4);

//Create an array of TaskProcessor objects, each with a different number as input (e.g., 5, 6, 7, and 8).
        int numOfTasks=7;
        TaskProcessor[] taskProcessors = new TaskProcessor[numOfTasks];
        for (int i=0;i<numOfTasks;i++) {
            taskProcessors[i] = new TaskProcessor(i+5);
        }

//        Submit each TaskProcessor to the ExecutorService for execution.
        for(TaskProcessor task : taskProcessors) {
            executorService.submit(task);

        }

//        Wait for all tasks to complete by calling shutdown() and awaitTermination() on the ExecutorService.
        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            System.out.print("Exception: ");
            e.printStackTrace();
        }
        System.out.println("Tasks are now finished");
    }

}
