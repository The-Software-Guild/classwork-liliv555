/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.userinput;

import java.util.Scanner;

/**
 *
 * @author liliv
 */
public class MiniMadLibs {
    public static void main(String[] args) {
         Scanner inputReader = new Scanner(System.in);
         String noun, adjective, noun2, adjective2, pluralNoun, pluralNoun2, pluralNoun3, verbInf, verbPast;
         int number;
         
        System.out.println("I need a noun: ");
        noun = inputReader.nextLine();
        
        System.out.println("Now an adjective: ");
        adjective = inputReader.nextLine();
        
        System.out.println("Another noun: ");
        noun2 = inputReader.nextLine();
        
        System.out.println("And a number: ");
        number = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("Another adjective: ");
        adjective2 = inputReader.nextLine();
        
        System.out.println("A plural noun: ");
        pluralNoun = inputReader.nextLine();
        
        System.out.println("Another plural noun: ");
        pluralNoun2 = inputReader.nextLine();
        
        System.out.println("One more: ");
        pluralNoun3 = inputReader.nextLine();
        
        System.out.println("A verb (infinitive form): ");
        verbInf = inputReader.nextLine();
        
        System.out.println("Same verb (past participle): ");
        verbPast = inputReader.nextLine();
        
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun + " the " + adjective + " frontier. These are the voyages of the starship " + noun2 + ". Its " + number + "-year mission: to explore strange " + adjective2 + " " + pluralNoun + ", to seek out " + adjective2 + " " + pluralNoun2 + " and " + adjective2 + " " + pluralNoun3 + ", to boldly " + verbInf + " where no one has " + verbPast + " before.");
    }
}
