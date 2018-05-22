package com.gamedriver.java;

import com.gamedriver.java.utilities.Quiz;

public class PuzzleRoom1 {

    public static void initiateRoom(){
        System.out.println(
                "The room is dimly lit, the green glow of a sercurity \n" +
                "terminal illuminating the wall. Logging in will unlock \n" +
                "a safe deposit box in the room\n`" +
                "\n" +
                "The hint is:" +
                "\n");

        Quiz quiz = new Quiz();

        boolean roomChallengeComplete = false;
        int tries = 3;

        while (!roomChallengeComplete && tries > 0){
            roomChallengeComplete = quiz.compareResponse("What is the fastest snake in the world?", "Black Mamba");

            tries--;
            if(!roomChallengeComplete && tries > 0) {

                System.out.println("Try again! You have " + tries + " attempts left!");
            }else if(!roomChallengeComplete && tries == 0) {
                    System.out.println("You are locked out of the System!");
            }

        }




    }
}
