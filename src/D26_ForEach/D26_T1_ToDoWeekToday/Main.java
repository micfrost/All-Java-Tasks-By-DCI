package D26_ForEach.D26_T1_ToDoWeekToday;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Hello helloInst = new Hello();
        ToDo toDoInst = new ToDo();

        System.out.println("What is your name? ");
        String givenName = scanner.nextLine();

//      1. Saying Hello
        helloInst.hello(givenName);



//      2. Create General To-Do-List
        toDoInst.createList(givenName);

//      3. Create Daily To-Do-List


//        How much time does it take (time in minutes)
//        Do you want to add something else to be done?
//        yes Yes YES Y y - repeat (REGEX)
//        anything else - break
//        how much time do you have today for todolist
//        if timeAvailable give a task for today (for each)
//        else no time for more tasks today. Leave it in GeneralToDo






    }
}
