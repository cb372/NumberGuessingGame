package com.github.cb372.guessing;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * The most fun game in the world
 *
 * Author: chris
 * Created: 6/2/14
 */
public class Game {

    private static final Random rnd = new Random();

    public void run() throws IOException {
        int number = rnd.nextInt(10);

        // save the chosen number to a file for posterity
        NumberWriter.writeToFile(number);

        System.out.println("Can you guess the number I have chosen?");
        Scanner scanner = new Scanner(System.in);
        while (scanner.nextInt() != number) {
            System.out.println("Wrong! Try again!");
        }
        System.out.println("Correct! Well done!");
    }

}
