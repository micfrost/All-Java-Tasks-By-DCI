package D68_FunctionalProg_Improve.DC_T_2_FP2;

import java.util.List;
import java.util.Scanner;

public class TodoListApp {
    Scanner scanner = new Scanner(System.in);

    private TodoListManager todoListManager;

    TodoListApp() {
        todoListManager = new TodoListManager();
        todoListManager.addTask(new Task(1, "Complete assignment", 2));
        todoListManager.addTask(new Task(2, "Read a book", 1));
        todoListManager.addTask(new Task(3, "Exercise", 3));
    }

    void userInterface() {
        String choice;
        do {
            displayUIMenu();
            choice = scanner.nextLine();
            switch (choice) {
                case "1" -> displayTodoList();
                case "2" -> addNewTask();
                case "3" -> findTasksPriority();
                case "4" -> markingCompleted();
                case "5" -> removeTask();
                case "6" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!choice.equals("6"));
    }

    private void displayUIMenu() {
        System.out.println("- - - - - ");
        System.out.println("1. Display a Todo List");
        System.out.println("2. Add a new Task");
        System.out.println("3. Find tasks by priority");
        System.out.println("4. Marking a task as completed");
        System.out.println("5. Remove a task from the List.");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private void displayTodoList() {
        todoListManager.displayTasks();
    }

    private void addNewTask() {
        System.out.print("\nEnter task description: ");
        String newDescription = scanner.nextLine();
        System.out.print("Enter task priority: ");
        int newPriority = Integer.valueOf(scanner.nextLine());
        todoListManager.addTask(new Task(todoListManager.tasks.size() + 1, newDescription, newPriority));

        System.out.println("\nUpdated Task List:");
        todoListManager.displayTasks();
    }

    private void findTasksPriority() {
        System.out.print("\nEnter priority to find tasks: ");
        int priorityToFind = Integer.valueOf(scanner.nextLine());

        List<Task> tasksByPriority = todoListManager.findTasksByPriority(priorityToFind);
        System.out.println("Tasks with Priority " + priorityToFind + ":");
        tasksByPriority.forEach(System.out::println);
    }

    private void markingCompleted() {
        System.out.print("\nEnter task ID to mark as completed: ");
        int taskIdToComplete = Integer.valueOf(scanner.nextLine());
        todoListManager.markTaskAsCompleted(taskIdToComplete);

        System.out.println("\nUpdated Task List after marking a task as completed:");
        todoListManager.displayTasks();
    }

    private void removeTask() {
        System.out.print("\nEnter a task ID to remove it from a list: ");
        int taskIdToRemove = Integer.valueOf(scanner.nextLine());
        todoListManager.removeTaskFromList(taskIdToRemove);

        System.out.println("\nUpdated Task List after removing a task:");
        todoListManager.displayTasks();

    }

    private void tryOneMoreTime() {
        System.out.println("- - - - - ");
        System.out.println("Invalid choice. Please enter a valid option.");
    }

    private void exit() {
        System.out.println("- - - - - ");
        System.out.println("Exiting the inventory management system. Goodbye!");
        scanner.close();
    }
}