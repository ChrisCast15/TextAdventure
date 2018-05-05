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

//        BUG: when catch is activated,
//        will only return whatever input
//        was initialized to.
        int input;
        try {
            System.out.print(prompt);
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            return input;

//            When an incompatible is input, will ask again
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
