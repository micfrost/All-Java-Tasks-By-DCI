package D56_ReentranLock.DC_T_2_WithCondition.Kai;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TaskSynchronizationExercise {
	
	private int taskCount = 0;
	private int completedTasks = 10;
	
	private Lock taskLock = new ReentrantLock();
	private Condition taskCompleted = taskLock.newCondition();
	
	public static void main(String[] args) {
		
		
		
		TaskExecutor executor = new TaskExecutor();
		TaskMonitor monitor = new TaskMonitor();
		
		executor.start();
		monitor.start();
	}
	
	// Getters and setters: 

	public int getTaskCount() {
		return taskCount;
	}

	public void setTaskCount(int taskCount) {
		this.taskCount = taskCount;
	}

	public int getCompletedTasks() {
		return completedTasks;
	}

	public void setCompletedTasks(int completedTasks) {
		this.completedTasks = completedTasks;
	}

	public Lock getTaskLock() {
		return taskLock;
	}

	public void setTaskLock(Lock taskLock) {
		this.taskLock = taskLock;
	}

	public Condition getTaskCompleted() {
		return taskCompleted;
	}

	public void setTaskCompleted(Condition taskCompleted) {
		this.taskCompleted = taskCompleted;
	}
	

}
