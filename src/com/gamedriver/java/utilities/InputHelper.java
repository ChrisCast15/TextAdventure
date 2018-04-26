package com.gamedriver.java.utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelper {

    //asks a prompt and awaits input. returns String
    public static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //asks a prompt and waits for input
    public static int getInt(String prompt) {

        int input = 0;
        try {
            System.out.print(prompt);
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Please input an integer!");
            InputHelper.getInt(prompt);
        }
        return input;
    }




}
