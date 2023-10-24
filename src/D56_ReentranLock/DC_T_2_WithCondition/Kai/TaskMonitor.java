package D56_ReentranLock.DC_T_2_WithCondition.Kai;


public class TaskMonitor extends Thread {

    TaskSynchronizationExercise tse = new TaskSynchronizationExercise();

    @Override
    public void run() {
        tse.getTaskLock().lock();
        try {


            while (	tse.getTaskCount() < tse.getCompletedTasks()) {

                try {
                    tse.getTaskCompleted().await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

//		} catch(InterruptedException e) {
//			System.err.println(e);
            System.out.println("Monitor: Completed Tasks: " + tse.getTaskCount() + "successfully.");
        } finally {
            tse.getTaskLock().unlock();
        }
    }

}
