package D68_FunctionalProg_Improve.DC_T_2_FP2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoListManager {
    List<Task> tasks;

    public TodoListManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void displayTasks() {
        System.out.println("- - - - - ");
        System.out.println("Todo List:");
        tasks.forEach(System.out::println);
    }

    public List<Task> findTasksByPriority(int priority) {
        return tasks
                .stream()
                .filter(task -> task.getPriority() == priority)
                .collect(Collectors.toList());
    }

    public void markTaskAsCompleted(int taskId) {
        tasks
                .stream()
                .filter(task -> task.getTaskId() == taskId)
                .map(task -> {
                    task.markAsCompleted();
                    return task;
                });
    }

    public void removeTaskFromList(int taskId) {
        tasks.removeIf(task -> task.getTaskId() == taskId);
    }
}
