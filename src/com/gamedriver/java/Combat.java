package com.gamedriver.java;

import com.gamedriver.java.utilities.InputHelper;
import com.gamedriver.java.utilities.RandomNumber;

import java.util.Random;

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
                try {
                    playerChoice = InputHelper.getInput("What do you want to do? (Attack/Defend)").toLowerCase();
                } catch (StringIndexOutOfBoundsException e) {
                    playerChoice = "invalid";
                }
                playChoice = playerChoice.charAt(0);

                //player's turn
                switch (playChoice) {
                    case 'a':
                        System.out.println("You attack the enemy " + enemy.getType() + "!");
                        netDamage = player.getAttack() + chargeUp - enemy.getDefense();
                        if (netDamage > 0) {
                            System.out.println("You did " + netDamage + " points of damage!\n");
                            if(netDamage <= enemy.getHealth()) {
                                enemy.setHealth(enemy.getHealth() - netDamage);
                            } else{
                                enemy.setHealth(0);
                            }

                        } else {
                            System.out.println("Your attack could not penetrate the enemy's defenses!" +
                                    "\nTry defending to charge up your attack!\n");
                        }
                        chargeUp = 0;
                        System.out.println(enemy.toString());
                        System.out.println(player.toStats());
                        break;
                    case 'd':
                        System.out.println("You defend and charge up your attack!");
                        chargeUp += player.getAttack() / 4 + 2;
                        System.out.println("Your attack charged up " + chargeUp + " extra points!");
                        break;
                    default :
                        System.out.println("That is an invalid input! Your indecisiveness leaves you open to attack!\n");
                        break;
                }//end switch
                }//enemy has health fight loop
                //enemy's turn
                if (enemy.getHealth() > 0) {
                    System.out.println("The " + enemy.getType() + " attacks!");
                    netDamage = enemy.getAttack() - player.getDefense() + RandomNumber.rNG(5, 0);
                    if (netDamage <= 0) {
                        System.out.println("The enemy " + enemy.getType() + "'s attack missed");
                    } else{
                        System.out.println("Enemy " + enemy.getType() + " lands a hit of " + netDamage + "!");
                        if(netDamage <= player.getHealth()) {
                            player.setHealth(player.getHealth() - netDamage);
                        } else{
                            player.setHealth(0);
                            break;
                        }
                        System.out.println(player.toStats());
                    }

                } else {
                    System.out.println("You defeated the " + enemy.getType() + "!");//end enemy attack
                }



        }//combat loop
    }//end fight method
}//end Combat class