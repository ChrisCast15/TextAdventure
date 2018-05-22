package com.gamedriver.java;

import com.gamedriver.java.utilities.InputHelper;

public class Combat {

    public static void fight(Player player, Enemy enemy) {

        String playerChoice;
        char playChoice;
        int netDamage;
        int chargeUp = 0;

        //checks if enemy is still alive

        while(enemy.getHealth() > 0){

            if (enemy.getHealth() <= 0) {
                System.out.println("The slain enemy is slumped up against a wall");
            } else {
                System.out.println("The " + enemy.getType() + " is getting ready to attack!");
                System.out.println(enemy.toString());
                playerChoice = InputHelper.getInput("What do you want to do? (Attack/Defend)").toLowerCase();
                playChoice = playerChoice.charAt(0);

                //player's turn
                switch (playChoice) {
                    case 'a':
                        System.out.println("You attack the enemy " + enemy.getType() + "!");
                        netDamage = player.getAttack() + chargeUp - enemy.getDefense();
                        if (netDamage > 0) {
                            enemy.setHealth(enemy.getHealth() - netDamage);

                        } else {
                            System.out.println("Your attack could not penetrate the enemy's defenses!" +
                                    "\nTry defending to charge up your attack!");
                        }
                        chargeUp = 0;
                        System.out.println(enemy.toString());
                        System.out.println(player.toStats());
                        break;
                    case 'd':
                        System.out.println("You defend and charge up your attack!");
                        chargeUp += player.getAttack() / 4 + 2;
                        System.out.println("Your attack charge is: " + chargeUp + "!");
                        break;
                    default :
                        System.out.println("That is an invalid input! Your indecisiveness leaves you open to attack!");
                        break;
                }//end switch
                }//enemy has health fight loop
                //enemy attacks
                if (enemy.getHealth() > 0) {
                    System.out.println("The " + enemy.getType() + " attacks!");
                } else {
                    System.out.println("You defeated the " + enemy.getType() + "!");//end enemy attack
                }

        }//combat loop
    }//end fight method
}//end Combat class