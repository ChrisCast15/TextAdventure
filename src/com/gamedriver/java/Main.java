/*
    Authors Christian Castillo
    Co Sci 290


*/

package com.gamedriver.java;

import com.gamedriver.java.utilities.SaveGame;
import com.gamedriver.java.utilities.Splash;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variables with blank placeholders

        Player player = new Player();
        String color;
        int age;
        //int RngSlot = 10; //used for player influenced RNG
        //int PIRng = 1 + (int) (Math.random() * (RngSlot - 1)); //PLayer Influenced RNG
        //int RNG = 1 + (int) (Math.random() * (25 - 1)); //RNG, outputs 1 - 25


        //allowing user input
        Scanner input = new Scanner(System.in);

        Splash splash = new Splash();
        splash.printTitle();

        //Start Story
        System.out.print(" \n \n \n \n"); // adds lines to seperate introduction from title

        System.out.print("You have left your homeworld to go to Mars, one of the few planets \n"
                + "offering steady employment in this solar system.\n"
                + "You've taken on a job offer from the first, and so far only\n"
                + "corporation on martian soil. Interplanetary Corps has had a monopoly\n"
                + "on martian mineral rights since they were the first to succesfully"
                + "colonize the iron-rich lands.\n"
                + "Your interplanetary shuttle has just touched down and you make your \n"
                + "way to the reception desk. The person behind the elegant steel desk \n"
                + "greets you.\n");
        //User is asked a set of questions
        System.out.println("\"Hey there! Welcome to Olympus Mons Research base. What is your name?\"");
        player.setName(input.nextLine());

        System.out.println("\"So it's " + player.getName() + "? That's a nice name! You must be the new recruit.\n"
                + "Let me fill out your TAGcard for you. What planet were you born on?\"");
        player.setPlanet(input.nextLine());

        System.out.println("\"Oh, you're from " + player.getPlanet() + "? I've got a cousin who lives there!"
                + "\nHow old are you in " + player.getPlanet() + " years, " + player.getName() + "?\"");
        age = input.nextInt();

        System.out.println("\"" + age + "? That's about " + (age * 7) + " cycles here on Mars.\n"
                + "What's your favorite color?\"");
        color = input.next();
        System.out.println("\"Lucky you, I've got a " + color + " labsuit here for you!\"");

        //RNG Event
    /*
    System.out.println("How many plasma rounds do you want to shoot at the Wall Crawler?");
    RngSlot = input.nextInt();
    if(RNG > 18){
      System.out.print("You were attacked and killed before you can fire a single round.\n"
                      + "GAME OVER");
        }
    else{
      if(PIRng > (RngSlot / 3)){
        System.out.print("You killed the beast!\n");
      }
      else{
        System.out.print("You wounded the animal. Its angrier than ever! RUN!!!");
      }
    }
  // end of RNG event
  */

        //fight spider
        int playerHealth = 100;
        Spider[] spider = new Spider[2];
        Spider spider1 = new Spider();
        spider[0] = spider1;
        System.out.println("Spider health: " + spider[0].getHealth());

        //get spider health from class

        SaveGame save = new SaveGame();
        save.save(1, player);

        //Game over Screen
        splash.printGameOver();
    }



}
