package D53_GoupProject;

import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);
    private AirbnbChatBot chatBot;

    public Application() {
        chatBot = new AirbnbChatBot();
    }

    void userInterface() {
        System.out.println("- - - ");
        System.out.println("AIRBNB");
        System.out.println("Welcome to Airbnb Customer Support. How can I help you?");

        String chosenOption;

        do {

            System.out.println("Topics: ");
            System.out.println("1. Help with booking process.");
            System.out.println("2. Details about our listing.");
            System.out.println("3. Information about canceling a booking.");
            System.out.println("4. Other topic.");
            System.out.println("5. Exit");
            System.out.println("- - - - - ");
            System.out.print("Enter selected option: ");
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "1" -> answerHelp();
                case "2" -> answerListing();
                case "3" -> answerCancel();
                case "4" -> answerOpen();
                case "5" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("5"));
    }

    void answerHelp(){

    }

    void answerListing(){}

    void answerCancel(){}

    void answerOpen(){

        System.out.print("Ask me anything else: ");
        String userQuery = scanner.nextLine();

        String response = chatBot.respondToQuery(userQuery);
        System.out.println("Chat Bot: " + response);
    }

    private void exit() {
        System.out.println("- - - - - ");
        System.out.println("Chat Bot: Thank you for using Airbnb support. Have a great day!");
        System.out.println("The program was closed successfully.");
    }
    private void tryOneMoreTime() {
        System.out.println("- - - - - ");
        System.out.println("Try one more time.");
    }



}
