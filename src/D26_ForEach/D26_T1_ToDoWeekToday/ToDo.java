package D26_ForEach.D26_T1_ToDoWeekToday;
import java.lang.*;
import java.util.*;

public class ToDo {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> generalToDoList;

    void createList(String name) {
        Random random = new Random();
        generalToDoList = new ArrayList<>();
        String[] autoTasks = {"Have a coffee break", "Go for a nice walk", "Read a couple pages of a book", "Just go and buy you a pizza"};

//      Creating a To-Do-List
        while (true) {
            System.out.println("Add a task to the list or type \"end\" to finish the list)");
            String somethingToAdd = scanner.nextLine();
            if (somethingToAdd.equals("end")) {
                generalToDoList.add("Nothing from you but you have one nice task from me :)");
                int index = random.nextInt(autoTasks.length);
                String niceTask = autoTasks[index];
                generalToDoList.add(niceTask);
                break;
            } else {
                generalToDoList.add(somethingToAdd);
                int index = random.nextInt(autoTasks.length);
                String niceTask = autoTasks[index];
                generalToDoList.add(niceTask);
            }
        }

//        Printing a List
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Here you go " + name + ". I added also a reward for you.");
        System.out.println("This is your To-Do-List: ");
        for (int i = 0; i < generalToDoList.size(); i++) {
            System.out.println("Task " + (i + 1) + ": " + generalToDoList.get(i));

//            Creating a daily To-Do-List
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Do you want to select tasks only for today? yes/no");
        String wantDaily = scanner.nextLine();

        if (wantDaily.matches("^[y]\\w*")) {
            System.out.print("How much time do you have? (in minutes): ");
            int availableTime = scanner.nextInt();
            int unitAvailableTime = availableTime / 15;
            int neededTime = generalToDoList.size() * 15;
            int UnitTasksToDo = generalToDoList.size();
            if (availableTime >= neededTime) {
                System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - ");
                System.out.println("Hooray! You have enough time to do all " + UnitTasksToDo + " Tasks today");
                System.out.println("Here you go " + name + ". This is your To-Do-List: " + generalToDoList);
            } else {
                System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - ");
                System.out.println("You have enough time to do " + unitAvailableTime + " tasks today");
                for (int i = 0; i < unitAvailableTime; i++) {
                    System.out.println("Task " + (i + 1) + ": " + generalToDoList.get(i));
                }
            }
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Bye, Have fun and see you next time!");
    }
}



