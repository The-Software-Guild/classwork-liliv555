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
public class InABucket {
    public static void main(String[] args) {

        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;
        
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;
        weightOfTeacupPig = 6.0f;
        grainsOfSand = 1454255451;

        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies : ");
        System.out.println(piesEaten);
        System.out.println(walrus + "weighs " + weightOfTeacupPig + " kilos");
        System.out.println("There are " + grainsOfSand + " grains of sand on this beach");
    }
}
