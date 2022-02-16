/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author liliv
 */
public class AllAboutMe {
    public static void main(String[] args) {
        String name, favFood, building;
        int numberOfPets;
        boolean canWhistle;
        
        name = "Lili";
        favFood = "tacos de cochinita pibil";
        numberOfPets = 0;
        building = "apartment";
        canWhistle = false;
        
        System.out.println("Hey, my name is " + name +".");
        System.out.println("I absolutely love " + favFood + ".");
        System.out.println("Sadly I have " + numberOfPets + " pets.");
        System.out.println("I live in an " + building + " in Madrid, Spain.");
        System.out.println("It is " + canWhistle + " I know how to whistle.");
    }
}
