package com.quiz;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    private static void displayQuestionAndAnswer(Locale locale) {
        ResourceBundle quiz = ResourceBundle.getBundle("com.quiz/quiz", locale);

        String question = quiz.getString("Q1.question");
        String answer = quiz.getString("Q1.answer");

        System.out.println(question);
        System.out.println(answer);
        System.out.println();
    }

    public static void main(String[] args) {
        Locale englishQuiz = new Locale("en", "US");
        Locale spanishQuiz = new Locale("es", "ES");
        Locale germanQuiz = new Locale("ge", "GE");


        displayQuestionAndAnswer(englishQuiz);
        displayQuestionAndAnswer(spanishQuiz);
        displayQuestionAndAnswer(germanQuiz);
    }
}