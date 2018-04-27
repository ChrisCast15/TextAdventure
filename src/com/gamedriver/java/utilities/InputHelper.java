package com.gamedriver.java.utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelper {

    //asks a prompt and awaits input. returns String object.
    public static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //asks a prompt and waits for input. Returns int data type
    public static int getInt(String prompt) {

        int input = 2;
        try {
            System.out.print(prompt);
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();

//            When an incompatible is input, will ask again
        } catch (InputMismatchException e) {
            System.out.println("Please input an integer!");
            //Recursion
            InputHelper.getInt(prompt);
        }
        return input;
    }




}
