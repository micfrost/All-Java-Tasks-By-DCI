package D53_GoupProject;

import java.util.Scanner;

public class Application {
    private AirbnbChatBot chatBot;

    public Application(AirbnbChatBot chatBot) {
        this.chatBot = chatBot;
    }

    Scanner scanner = new Scanner(System.in);
    
     void userInterface() {
        this.chatBot = new AirbnbChatBot();
    }


    


    
    
    
    


    public void start() {
        // Step 2: Customer Greetings and Introduction
        System.out.println("Welcome to Airbnb Customer Support. How can I help you?");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Step 5: User Input
            System.out.print("You: ");
            String userQuery = scanner.nextLine();

            // Step 6: Exit
            if (userQuery.equalsIgnoreCase("exit")) {
                System.out.println("Chat Bot: Thank you for using Airbnb support. Have a great day!");
                break;
            }

            // Step 3: Responding to Customer Queries
            String response = chatBot.respondToQuery(userQuery);
            System.out.println("Chat Bot: " + response);
        }

        scanner.close();
    }


}
