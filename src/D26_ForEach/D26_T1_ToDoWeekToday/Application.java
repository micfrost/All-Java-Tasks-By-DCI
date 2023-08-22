package D26_ForEach.D26_T1_ToDoWeekToday;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Hello helloInst = new Hello();
        ToDo toDoInst = new ToDo();

        System.out.println("What is your name? ");
        String givenName = scanner.nextLine();

//      Saying Hello
        helloInst.hello(givenName);

//      Create General To-Do-List
        toDoInst.createList(givenName);
    }
}
