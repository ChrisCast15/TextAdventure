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

public class Main {

    public static void main(String[] args) {

//      creates an instance of the Player Class
        Player player = new Player();

        Splash.printTitle();

        //Start Story
        System.out.print(" \n \n \n \n"); // adds lines to separate introduction from title

        //lets add a "Press Enter" here to start before we start the story!

//        GameMap gameMap = new GameMap();

        ReadTextFile.printLine("Story.txt");

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

        //Game over Screen
        Splash.printGameOver();
    }

}
