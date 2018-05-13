package com.gamedriver.java.utilities;

public class Quiz {
    /**
     * ask a question, compares it with response
     */
    public static boolean compareResponse(String question, String answer) {

        String userResponse = InputHelper.getInput(question);

        return userResponse.equalsIgnoreCase(answer);

    }
}
