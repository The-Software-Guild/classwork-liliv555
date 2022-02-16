/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author liliv
 */
public class GuessMeMore {
    public static void main(String[] atgs) {
        Scanner input = new Scanner(System.in);
        Random rng = new Random();
        int guess;
        boolean guessed = false;

        int randomNumber = rng.nextInt(100 - -100) + -100;
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        do {
            guess = Integer.parseInt(input.nextLine());
            System.out.println("Your guess: " + guess);

            if (guess == randomNumber) {
                System.out.println("Wow, nice guess! That was it!");
                guessed = true;
            } else if (guess > randomNumber) {
                System.out.println("Ha, nice try - too high! Try again!");
            } else if (guess < randomNumber) {
                System.out.println("Ha, nice try - too low! Try again!");
            }
        } while (!guessed);
    }
}
