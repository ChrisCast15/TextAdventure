package com.gamedriver.java;

import com.gamedriver.java.utilities.Quiz;

public class PuzzleRoom1 {

    public static void description(){
        System.out.println(
                "The room is dimly lit, the green glow of a sercurity" +
                "terminal illuminating the wall. Logging in will unlock" +
                "a safe deposit box in the room" +
                "\n" +
                "The hint is:" +
                "\n");

        Quiz quiz = new Quiz();

        boolean roomChallengeComplete = false;

        while (!roomChallengeComplete){
            roomChallengeComplete = quiz.compareResponse("What is the fastest snake in the world?", "Black Mamba");
            if(!roomChallengeComplete) System.out.println("Try again!");
        }




    }
}
