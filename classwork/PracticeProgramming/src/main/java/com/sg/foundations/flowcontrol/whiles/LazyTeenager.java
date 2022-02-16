/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;
import java.util.Random;
/**
 *
 * @author liliv
 */
public class LazyTeenager {
    public static void main(String[] args) {
        int timesTold = 0;
        int counter = 9;
        boolean didClean = false;
        Random number = new Random();
        do {
            timesTold ++;
            if (timesTold == 8) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            };
            System.out.println("Clean your room!! (x" + timesTold + ")");
            int possibility = number.nextInt(10);
            if (possibility >= counter) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                didClean = true;
            } else {
                counter --;
            }
        } while (!didClean);
    }
}
