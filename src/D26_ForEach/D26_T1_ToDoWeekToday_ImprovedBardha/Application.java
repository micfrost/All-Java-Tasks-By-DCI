package D26_ForEach.D26_T1_ToDoWeekToday_ImprovedBardha;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Application{

/*
IMPROVED VERSION

Changes I made and improvements that I would suggest:

Better separation of code by moving each main step into its own method.
Introduced the run() method to initiate the program flow.
Avoid infinite loops.
Avoid repeated code by using methods for similar logic.

If you have any further question please let me know.
*/

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> generalToDoList;

    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    public void run() {
        greetUser("User");
        createToDoList("User");
    }

    private void greetUser(String name) {
        System.out.println("Hello " + name + ".");
        System.out.println("Welcome to your To-Do List and task selection program.");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - ");
    }

    private void createToDoList(String name) {
        Random random = new Random();
        String[] autoTasks = {"Have a coffee break", "Go for a nice walk", "Read a couple pages of a book", "Just go and buy yourself a pizza"};
        generalToDoList = new ArrayList<>();

        System.out.println("Add tasks to the list. (type \"end\" to finish the list)");
        String taskToAdd = scanner.nextLine();

        while (!taskToAdd.equals("end")) {
            generalToDoList.add(taskToAdd);
            String niceTask = autoTasks[random.nextInt(autoTasks.length)];
            generalToDoList.add(niceTask);

            System.out.println("Add another task or type \"end\":");
            taskToAdd = scanner.nextLine();
        }

        System.out.println("Great, " + name + "! Here's your To-Do List with some rewards:");
        printTasks();

        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Do you want to select tasks only for today? (yes/no)");
        String wantDaily = scanner.nextLine();

        if (wantDaily.matches("^[y]\\w*")) {
            int availableTime = getInput("How much time do you have? (in minutes): ");
            int unitAvailableTime = availableTime / 15;
            int neededTime = generalToDoList.size() * 15;
            int unitTasksToDo = generalToDoList.size();

            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - ");
            if (availableTime >= neededTime) {
                System.out.println("Hooray! You have enough time to do all " + unitTasksToDo + " tasks today");
                printTasks(unitTasksToDo);
            } else {
                System.out.println("You have enough time to do " + unitAvailableTime + " tasks today");
                printTasks(unitAvailableTime);
            }
        } else {
            System.out.println("Bye, have fun and see you next time!");
        }
    }

    private void printTasks(int numTasks) {
        for (int i = 0; i < numTasks; i++) {
            System.out.println("Task " + (i + 1) + ": " + generalToDoList.get(i));
        }
        System.out.println("Bye, have fun and see you next time!");
    }

    private void printTasks() {
        printTasks(generalToDoList.size());
    }

    private int getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
}