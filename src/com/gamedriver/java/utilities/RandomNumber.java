package com.gamedriver.java.utilities;

public class RandomNumber {
    //generates a random number
    public static int rNG(int maximum, int minimum) {
        int genNumber = minimum + (int) (Math.random() * (maximum - minimum)); //RNG, outputs 1 - seed

        return genNumber;
    }
}