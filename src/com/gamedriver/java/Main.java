/*
    Authors Christian Castillo
    Steven Lemos
    Hai Nguyen
    Co Sci 290


*/

package com.gamedriver.java;

import com.gamedriver.java.utilities.*;

/**
 * This is the Main class. our program starts here!
 */

public class Main {


    public static void main(String[] args) {
        Player player = new Player();

        Rooms[][] room = new Rooms[4][4];

        Rooms room00 = new Rooms("Empty room " +
                "\nIt's really dark in here!", new MartianSpider(), "Say Hello", "Hello" );
        room[0][0] = room00;

        Rooms room01 = new Rooms("It's blindingly bright in here!", new Enemy("Rock Monster", 10, 7, 7), "What chemical causes Mar's red surface", "Iron");
        room[0][1] = room01;

        Splash.printTitle();

        ReadTextFile.printLine("src/storytext/Story1.txt");

        //      Here is where we start getting the player's information
        player.setName(InputHelper.getInput("\"Hey there! Welcome to Olympus Mons Research base. What is your name?\"  "));

        player.setPlanet(InputHelper.getInput("\"So it's " + player.getName() + "? That's a nice name! You must be the new recruit.\n"
                + "Let me fill out your TAGcard for you. What planet were you born on?\"  "));

        player.setAge(InputHelper.getInt("\"Oh, you're from " + player.getPlanet() + "? I've got a cousin who lives there!"
                + "\nHow old are you in " + player.getPlanet() + " years, " + player.getName() + "?\"  "));

        player.setColor(InputHelper.getInput("\"" + player.getAge() + "? That's about " + (player.getAge() * 7) + " cycles here on Mars.\n"
                + "What's your favorite color?\"  "));

        System.out.println("\"Lucky you, I've got a " + player.getColor() + " labsuit here for you!\"  ");

        ReadTextFile.printLine("src/storytext/Story2.txt");

        boolean gameWon = false;
        int x = 0;
        int y = 0;
        char direction;
        boolean dirIsValid = false;

        while (!gameWon && player.getHealth() > 0) {

            dirIsValid = false;

            System.out.println(room[x][y].getDescription());
            Combat.fight(player, room[x][y].getEnemy());
            if (player.getHealth() > 0) {
                PuzzleRoom1.initiateRoom(room[x][y], player);
            }
            while(!dirIsValid && player.getHealth() > 0) {
                direction = InputHelper.getInput("Where do you want to go? (North, West, right, down...)").toLowerCase().charAt(0);

                switch (direction) {
                    case 'u':
                    case 'n':
                        if (y == 0) {
                            System.out.println("You cant go that way");
                            break;
                        } else {
                            y--;
                            dirIsValid = true;
                            break;
                        }
                    case 'e':
                        if (x == 3) {
                            System.out.println("You cant go that way");
                            break;
                        } else {
                            x++;
                            dirIsValid = true;
                            break;
                    }case 's':
                        if (y == 3) {
                            System.out.println("You cant go that way");
                            break;
                        } else {
                            y++;
                            dirIsValid = true;
                            break;
                        }
                    case 'w':
                        if (x == 0) {
                            System.out.println("You cant go that way");
                            break;
                        } else {
                            x--;
                            dirIsValid = true;
                            break;
                        }
                    default:
                        System.out.println("That is not a valid input!");
                        break;
                }// end switch
            }//end get direction while loop

        }


        SaveGame.save(1, player);

        //Game over Screen
        Splash.printGameOver();
    }

}
