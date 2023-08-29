package com.aurionpro.model;

import java.util.Scanner;

public class TreasureIslandGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Your mission is to find the treasure.");
        System.out.print("Do you want to go left or right? ");
        String choice1 = scanner.nextLine();
        
        if (choice1.equalsIgnoreCase("left")) {
            System.out.print(" Do you want to swim or wait? ");
            String choice2 = scanner.nextLine();
            
            if (choice2.equalsIgnoreCase("wait")) {
                System.out.print("You find three doors: red, blue, and yellow. Which one do you choose? ");
                String choice3 = scanner.nextLine();
                
                if (choice3.equalsIgnoreCase("red")) {
                    System.out.println("You are burned by fire. Game Over.");
                } else if (choice3.equalsIgnoreCase("blue")) {
                    System.out.println("You are eaten by beasts. Game Over.");
                } else if (choice3.equalsIgnoreCase("yellow")) {
                    System.out.println("Congratulations! You Win!");
                } else {
                    System.out.println("Game Over.");
                }
            } else {
                System.out.println("Attacked by trout. Game Over.");
            }
        } else {
            System.out.println("Fall into a hole. Game Over.");
        }
        
        
    }
}
