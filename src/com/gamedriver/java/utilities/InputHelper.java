package com.gamedriver.java.utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelper {

    /**
     *
      * @param prompt asks a question
     * @return returns the answer to the question
     */
    public static String getInput(String prompt) {
        System.out.print(prompt + "\n> ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     *
      * @param prompt asks a question
     * @return user's response to the question
     */
    public static int getInt(String prompt) {

        int input;
        try {
            System.out.print(prompt);
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            return input;

            /**
             * when user's response is anything but an int,
             * we will ask one more time
             */
        } catch (InputMismatchException e) {
            System.out.println("Please input an integer!");

            //asks again
            System.out.println(prompt);
            Scanner tryAgain = new Scanner(System.in);
            input = tryAgain.nextInt();
        }
        return input;
    }




}
