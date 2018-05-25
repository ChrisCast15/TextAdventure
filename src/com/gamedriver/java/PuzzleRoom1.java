package com.gamedriver.java;

import com.gamedriver.java.utilities.Quiz;
import com.gamedriver.java.utilities.RandomNumber;

public class PuzzleRoom1 {

    public static void initiateRoom(Rooms room, Player player){
        if (!room.getPuzzleSolved()) {
            System.out.println(
                    "In the corner, you spot the green glow of a security \n" +
                            "terminal illuminating the wall. Logging in will unlock \n" +
                            "a safe deposit box in the room\n" +
                            "\n" +
                            "The hint is:" +
                            "\n");
        }
        Quiz quiz = new Quiz();

        boolean roomChallengeComplete = false;
        int tries = 3;

        while ((!roomChallengeComplete && tries > 0) && !room.getPuzzleSolved()){
            roomChallengeComplete = quiz.compareResponse(room.getQuizQ(), room.getQuizA());

            tries--;
            if(!roomChallengeComplete && tries > 0) {

                System.out.println("Try again! You have " + tries + " attempts left!");
            }else if(!roomChallengeComplete && tries == 0) {
                    System.out.println("You are locked out of the System!");
            }

        }
        if(roomChallengeComplete){
            int HPHolder = RandomNumber.rNG(10, 1);
            int ATKHolder = RandomNumber.rNG(3, 0);
            int DEFHolder = RandomNumber.rNG(3, 0);
            player.setHealth(player.getHealth() + HPHolder);
            player.setAttack(player.getAttack() + ATKHolder);
            player.setDefense(player.getDefense() + DEFHolder);
            System.out.println("You got these stat boosts!" +
                    "\nHealth +" + HPHolder +
                    "\nAttack +" + ATKHolder +
                    "\nDefense +" + DEFHolder);
            System.out.println("Your new Stats:");
            System.out.println(player.toStats());
            room.setPuzzleSolved(true);

        }




    }
}
