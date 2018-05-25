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

        Rooms room00 = new Rooms("The Dormitory \nThe Sleeping-pods in this room have been strewn by the Marsquake. Blankets are thrown on the floor" +
                "and a bookshelf is toppled over. In the corner, you can see a tunnel dug up by a Martian Spider.", new MartianSpider(), "Name of the Mars Rover launched in 2011 AD, may have killed a cat.", "Curiosity" );
        room[0][0] = room00;

        Rooms room01 = new Rooms("This is the Sahara Room\n" +
                "This room was built to stave off homesickness. The UV lamps provide warmth and vitamin D\n" +
                "while also tanning the employees. A pile of rocks provide the perfect place to \"sunbathe.\"", new RockMonster(), "What chemical causes Mar's red surface", "Iron");
        room[0][1] = room01;

        Rooms room10 = new Rooms("The Garden\n" +
                "This room provides a welcoming environment for residents from Earth's tropical\n" +
                "tropical climate. Many exotic plants here have adapted to the iron rich \n" +
                "Martian soil.", new SteelVenusFlyTrap(), "How many moons does Mars have?", "Two");
        room[1][0] = room10;

        Rooms room11 = new Rooms("Food Court\n" +
                "This is the cafeteria for employees and guests. Tables are turned over and uneaten\n" +
                "food is thrown on the ground as people scrambled to evacuate. \n\n" +
                "A sign read \"E-PODS SE of here\"", new MartianSpider(), "Which direction " +
                "does Mars rotate about its axis?", "Counterclockwise");
        room[1][1] = room11;

        Rooms room02 = new Rooms("Restroom\n" +
                "A basic unisex lavatory. The mirrors have fallen off the wall and the a burst pipe\n" +
                "spills precious water on the floor", new MartianSpider(), "What is the largest mountain on Mars?", "Olympus Mons");
        room[0][2] = room02;

        Rooms room12 = new Rooms("Debris Strewn Armory\n" +
                "Bullet holes riddle the walls and plasma cartridges pile up on the floor. A guard \n" +
                "is slumped in the corner, begging you to turn around. \"It's still in this room\"", new InfectedSecurityGuard(), "Hows Earth Days on in a Martian Year?", "687");
        room[1][2] = room12;

        Rooms room20 = new Rooms("Comms Room\n" +
                "A room of several comms terminals, with electricity arcing through them. Two \n" +
                "comms technicians are charred by the released energy of the toppled power transformers.",
                new RockMonster(), "What probe did Earth first send to study their Solar System", "Voyager");
        room[2][0] = room20;

        Rooms room03 = new Rooms("Escape Pod Launch Bay\n" +
                "You give a sigh of relief when you enter the room. But relief turns to panic\n" +
                "as you see the last escape pod is occupied by a Face-Cuddler\n" +
                "tightly clamped to the head of a Interplanetary Corps Scientist.", new NoEnemy(), "What is the Greek counterpart of Jupiter's namesake?", "Zeus");
        room[0][3] = room03;

        Rooms room13 = new Rooms("Xenobiology Laboratory\n" +
                "Tall glass cylinder line the walls of the room. The native specimens have spills out\n" +
                "onto the floor and quickly died in the enclosed oxygen-rich environment.\n" +
                "a few are still writhing on broken glass.", new FaceCuddler(), "Largest Canyon on Mars", "Valles Marineris");
        room[1][3] = room13;

        Rooms room21 = new Rooms("Supply Room\n" +
                "A room filled with all manner of cleaning supplies, uniforms, and\n" +
                "toiletries. It seems the security level here is pretty low and no \n" +
                "visible threats in the area. A sign on the wall say \"E-PODS\" with \n" +
                "an arrow underneath pointing right.", new NoEnemy(), "What's the Fourth planet from the Sun", "Mars");
        room[2][1] = room21;

        Rooms room30 = new Rooms("Power Supply Room\n" +
                "You see the Biohazard signs on the door as you enter. The dark room is lit\n" +
                "by a pulsing green glow. A small Earth rodent enters the room and \n" +
                "immediately sizzles. It seems a few of the workers that were present during the\n" +
                "catastrophe survived exposure and melted together. \'HELP\' screams one dripping face\n" +
                "as another warns you to run away. \n\n" +
                "A sign behind the monstrosity read\"IN CASE OF EMERGENCY HEAD SOUTH\"", new GlowingGreenBlob(), "Element with Atomic number 92 that supplies this facility with energy.", "Uranium");
        room[3][0] = room30;

        Rooms room31 = new Rooms("Observatory\n" +
                "The dark room has a domed ceiling, with stars and planets projected onto it.\n" +
                "You find the high power telescope and look through it. In the red sky,  you can see\n" +
                "the contrails of two escape pods meeting together and terminating in a black cloud.\n" +
                "You feel something cold around your ankles...", new BlackSlime(), "Hunter in the night sky with a \"belt\"", "Orion");
        room[3][1] = room31;

        Rooms room23 = new Rooms("Zoo\n" +
                "This Facility houses the successful products of the Xenobiology Laboratory.\n" +
                "The hybrid animals are given small pens and with their cages in disarray, they\n" +
                "are allowed to let their insticts take over. You can see the ripped clothes of\n" +
                "the investors that were touring the campus. ", new SpecimenIronAnklyosaurus(), "What does \"Anklyosaurs\" mean?", "Fused Lizard");
        room[2][3] = room23;

        Rooms room32 = new Rooms("Automated Defenses\n" +
                "The large room is filled with shipping cubes containing security crones. \n" +
                "One of the containers has been breached and the drone has sparks around its CPU.\n\n" +
                "A sign says the Escape Pod is just SOUTH of here.", new Drone(), "Which is larger, Mars or Earth?", "Earth");
        room[3][2] = room32;

        Rooms room22 = new Rooms("Ore Processing Room\n" +
                "A room filled with drilling equipment, bulldozers, and high explosives.\n" +
                "Large processing machines smash and refine the Iron Ore extracted from the\n" +
                "planet. A large eight legged organism crawls out of a large hole in the\n" +
                "center of the room.\n\n" +
                "A sign says \"ESCAPE POD IMMEDIATELY SOUTH EAST OF HERE\".", new MartianSpiderQueen(), "Most abundant molecule in the Martian atmosphere.", "Carbon dioxide");

//


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
                try {
                    direction = InputHelper.getInput("Where do you want to go? (North, West, right, down...)").toLowerCase().charAt(0);
                } catch (StringIndexOutOfBoundsException e) {
                    direction = 'h';
                }

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
                    case 'r':
                    case 'e':
                        if (x == 3) {
                            System.out.println("You cant go that way");
                            break;
                        } else {
                            x++;
                            dirIsValid = true;
                            break;}
                    case 'd':
                    case 's':
                        if (y == 3) {
                            System.out.println("You cant go that way");
                            break;
                        } else {
                            y++;
                            dirIsValid = true;
                            break;
                        }
                    case 'l':
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
