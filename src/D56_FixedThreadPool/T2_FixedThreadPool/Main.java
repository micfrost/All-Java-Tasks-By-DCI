package D56_FixedThreadPool.T2_FixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class PrintTask implements Runnable {

    // simulate printing the document by printing a message indicating the document is being printed.
    @Override
    public void run() {
        System.out.println("The document is being printed . . .");
    }
}


public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("DC_T_1_ReantrantLock_Inside program that simulates a simple thread pool with fixed threads for performing tasks related to printing documents.");
        System.out.println();

//        create an ExecutorService using Executors.newFixedThreadPool with a specified number of threads (e.g., 3).
        ExecutorService executorService = Executors.newFixedThreadPool(3);

//        Create an array of PrintTask objects, each representing a document printing task.
        PrintTask[] printTasks = new PrintTask[7];
        for (int i = 0; i < 7; i++) {
            printTasks[i] = new PrintTask();
        }

//        Submit each PrintTask to the ExecutorService for execution.
        for (PrintTask element : printTasks
        ) {
            executorService.submit(element);
        }

//         Shutdown the ExecutorService and wait for all tasks to cmplete
        executorService.shutdown();

//        Allow the program to run for a specified duration (e.g., 6 seconds) to observe the tasks executing in parallel.
        try {
            executorService.awaitTermination(6, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.print("Exception: ");
            e.printStackTrace();
        }
        System.out.println("Tasks are now finished");
    }
}




