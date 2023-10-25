package D56_ReentranLock.DC_T_2_WithCondition.DC_T_2_Noo;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TaskSynchronizationExercise {

    private int taskCount = 0;  // integer variable that keeps track of the number of completed tasks.
    private final int requiredTasks = 10;//integer constant that specifies the total number of tasks that need to be completed (set to 10).
    private final ReentrantLock taskLock = new ReentrantLock();//ReentrantLock instance used for synchronization.

    //Condition instance associated with the taskLock. It will be used to signal and await task completion.
    private final Condition taskCompleted = taskLock.newCondition();

    public static void main(String[] args) {
        TaskSynchronizationExercise exercise = new
                TaskSynchronizationExercise();
        TaskExecutor taskExecutor = exercise.new TaskExecutor();
        TaskMonitor taskMonitor = exercise.new TaskMonitor();

        //These lines start the TaskExecutor and TaskMonitor threads,
        // initiating the execution of the tasks and monitoring of their completion.
        taskExecutor.start();
        taskMonitor.start();
    }
    class TaskExecutor extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                //The taskLock is locked by this thread.
                taskLock.lock();
                try {
                    taskCount++;//The taskCount is incremented to represent the completion of a task.
                    System.out.println("Task " + taskCount + " is completed.");

                    //The signal method is called on the taskCompleted condition,
                    // which notifies the TaskMonitor thread that a task has been completed.
                    taskCompleted.signal();
                } finally {
                    taskLock.unlock();// the taskLock is unlocked to release the lock whether or not an exception occurs.
                }
            }
        }
    }
    class TaskMonitor extends Thread {
        @Override
        public void run() {
            //The taskLock is locked to ensure exclusive access to the shared variables and conditions.
            taskLock.lock();
            try {
                //A while loop is used to check whether
                // the number of completed tasks is less than the total required tasks.
                while (taskCount < 10) {
                    try {
                        //The await method is called on the taskCompleted condition,
                        // which makes the TaskMonitor thread wait until it is signaled by the TaskExecutor thread.
                        taskCompleted.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Monitor: Required 10 tasks are completed!");
            } finally {
                //the taskLock is unlocked to release the lock
                taskLock.unlock();
            }
        }
    }
}

