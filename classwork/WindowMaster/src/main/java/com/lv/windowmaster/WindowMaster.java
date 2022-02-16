/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lv.windowmaster;
import java.util.Scanner;
/**
 *
 * @author liliv
 */
public class WindowMaster {
    public static void main(String [] args) {
        float height;
        float width;
        
        // user input
        String  stringHeight;
        String  stringWidth;
        
        float area;
        float perimeter;
        float cost;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        area = height * width;
        perimeter = 2 * (height + width);
        cost = ((3.50f * area) + (2.25f * perimeter));
        
        System.out.println("Window height is " + stringHeight);
        System.out.println("Window width is " + stringWidth);
        System.out.println("Window area is " + area);
        System.out.println("Window perimeter is " + perimeter);
        System.out.println("Total Cost is  " + cost);
    }
}
