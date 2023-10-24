package D56_ReentranLock.DC_T_2_CH_;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TaskSynchronizationExercise {
    private static int taskCount = 0;
    private static final int requiredTaskCount = 10;
    private static ReentrantLock taskLock = new ReentrantLock();
    private static Condition taskCompleted = taskLock.newCondition();

    public static void main(String[] args) {
        TaskExecutor[] executors = new TaskExecutor[50]; // Create 5 task executor threads
        TaskMonitor monitor = new TaskMonitor();

        // Start the task monitor
        monitor.start();

        // Start the task executor threads
        for (int i = 0; i < executors.length; i++) {
            executors[i] = new TaskExecutor();
            executors[i].start();
        }



        // Wait for all threads to finish
        try {
            for (TaskExecutor executor : executors) {
                executor.join();
            }
            monitor.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All required tasks have been completed.");
    }

    static class TaskExecutor extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 2; i++) { // Simulate the execution of 2 tasks
                taskLock.lock();
                try {
                    taskCount++;
                    System.out.println("Task executed by Thread " + getId() + ". Total tasks: " + taskCount);
                    if (taskCount >= requiredTaskCount) {
                        taskCompleted.signal(); // Signal that the required tasks are completed
                    }
                } finally {
                    taskLock.unlock();
                }
            }
        }
    }

    static class TaskMonitor extends Thread {
        @Override
        public void run() {
            taskLock.lock();
            try {
                while (taskCount < requiredTaskCount) {
                    taskCompleted.await(); // Wait until the required tasks are completed
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                taskLock.unlock();
            }
            System.out.println("Required tasks have been completed!");
        }
    }
}
