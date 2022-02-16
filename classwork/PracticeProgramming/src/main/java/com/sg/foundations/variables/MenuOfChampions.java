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
public class MenuOfChampions {
        public static void main(String[] args) {
        String food1, food2, food3;
        float price1, price2, price3;
        
        food1 = "Greek Salad";
        price1 = 8.00f;
        food2 = "Chopped lamb";
        price2 = 15.00f;
        food3 = "Gulash";
        price3 = 10.50f;
        
        System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.");
        System.out.println("WELCOME TO LILI'S RESTAURANT");
        System.out.println("");
        System.out.println("$" + price1 + " -  " + food1);
        System.out.println("$" + price2 + " - " + food2);
        System.out.println("$" + price3 + " - " + food3);
    }
}
