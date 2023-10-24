package D56_ReentranLock.DC_T_2_WithCondition.Kai;


public class TaskExecutor extends Thread{
	
	TaskSynchronizationExercise tse = new TaskSynchronizationExercise();
	
	@Override
	public void run() {
		
	
		
		for(int i = 0; i < tse.getCompletedTasks(); i++) {
			
			try {
				tse.getTaskLock().lock();
//				int count = tse.getTaskCount();
				tse.setTaskCount(tse.getTaskCount()+1);

                System.out.println("Thread Executor - Completed " + tse.getTaskCount() + " tasks");
				
				if(tse.getTaskCount() == tse.getCompletedTasks()) {
					tse.getTaskCompleted().signal();

				}
			} finally {
				tse.getTaskLock().unlock();
			}
		}
	}

}
