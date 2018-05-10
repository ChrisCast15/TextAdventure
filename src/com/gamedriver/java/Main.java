/*
    Authors Christian Castillo
    Steven Lemos
    Hai Nguyen
    Co Sci 290


*/

package com.gamedriver.java;

//import com.gamedriver.java.utilities.GameMap;
import com.gamedriver.java.utilities.InputHelper;
import com.gamedriver.java.utilities.ReadTextFile;
import com.gamedriver.java.utilities.SaveGame;
import com.gamedriver.java.utilities.Splash;

/**
 * This is the Main class. our program starts here!
 */

public class Main {

    public static void main(String[] args) {

//      creates an instance of the Player Class
        Player player = new Player();

        /**
         * Creates an instance of the Player class.
         * This is YOU! our protagonist!
         */

        Splash.printTitle();

        /**
         * Our title splash is generated and a few lines are added
         * to separate it from the story
         */

        ReadTextFile.printLine("Story.txt");

        /**
         * This displays our story with the help of a filereader
         * to read our story from a txt file!
         *
         * Next, a receptionist welcomes you and asks a few questions for information about the player
         * They want to know Name, home planet, age, and favorite color!
         */

//      Here is where we start getting the player's information
        player.setName(InputHelper.getInput("\"Hey there! Welcome to Olympus Mons Research base. What is your name?\"  "));

        player.setPlanet(InputHelper.getInput("\"So it's " + player.getName() + "? That's a nice name! You must be the new recruit.\n"
                + "Let me fill out your TAGcard for you. What planet were you born on?\"  "));

        player.setAge(InputHelper.getInt("\"Oh, you're from " + player.getPlanet() + "? I've got a cousin who lives there!"
                + "\nHow old are you in " + player.getPlanet() + " years, " + player.getName() + "?\"  "));

        player.setColor(InputHelper.getInput("\"" + player.getAge() + "? That's about " + (player.getAge() * 7) + " cycles here on Mars.\n"
                + "What's your favorite color?\"  "));

        System.out.println("\"Lucky you, I've got a " + player.getColor() + " labsuit here for you!\"  ");


        SaveGame.save(1, player);

        /**
         * this saves information about the player!
         */

        //Game over Screen
        Splash.printGameOver();
    }

}
