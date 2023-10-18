package D53_GoupProject;

import java.util.HashMap;
import java.util.Map;


public class AirbnbChatBot {
    private Map<String, String> answers;

    public AirbnbChatBot() {
        // Initialize predefined responses
        answers = new HashMap<>();
        answers.put("booking", "For booking assistance, please visit our website or contact our support team at support@airbnb.com.");
        answers.put("listing", "To get information about a specific listing, please provide the listing ID or location details.");
        answers.put("cancel", "To cancel a booking, log in to your Airbnb account and go to the booking details.");
    }

    public String respondToQuery(String searchedWord) {
        // Determine the answersKey based on the searchedWord
        String answersKey;
        if (searchedWord.toLowerCase().contains("booking")) {
            answersKey = "booking";
        } else if (searchedWord.toLowerCase().contains("listing")) {
            answersKey = "listing";
        } else if (searchedWord.toLowerCase().contains("cancel")) {
            answersKey = "cancel";
        } else {
            answersKey = null;
        }

        return answers.getOrDefault(answersKey, "I'm sorry, I can't assist with that.");
    }
}

