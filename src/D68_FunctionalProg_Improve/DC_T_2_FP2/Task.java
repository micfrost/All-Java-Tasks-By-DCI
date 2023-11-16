package D68_FunctionalProg_Improve.DC_T_2_FP2;

public class Task {
    private int taskId;
    private String description;
    private int priority;
    private boolean completed;

    public Task(int taskId, String description, int priority) {
        this.taskId = taskId;
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Task ID: " + taskId + " - Description: " + description +
                " - Priority: " + priority + " - Completed: " + completed;
    }
}
