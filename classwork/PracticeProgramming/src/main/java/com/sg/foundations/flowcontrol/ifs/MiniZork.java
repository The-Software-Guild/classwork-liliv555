/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author liliv
 */
public class MiniZork {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("You stick your hand into the mailbox.");
                System.out.println("There is something sticky in it...");
                System.out.println("Take your hand out or touch around? ");
                action = userInput.nextLine();
                
                if (action.equals("take hand out")) {
                    System.out.println("Cingratulations, you saved your hand! Better wash it");
                } else if (action.equals("touch around")) {
                    System.out.println("Oh oh something bit your hand!");
            }
        } } else if (action.equals("go to the house")) { 
            System.out.println("There are some lights on.");
            System.out.println("Ring or go to the backyard?");
            action = userInput.nextLine();
            
            if (action.equals("ring")) {
                    System.out.println("Nice lady answers the door and gives you cookies");
                } else if (action.equals("go to the backyard")) {
                    System.out.println("There is a pool, jump in!");
            }
        }
    }
}
