package rvt;

import java.util.Scanner;
import java.util.Random;

public class Spele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int result = random.nextInt(4) + 1;

        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");

        System.out.println("Enter a guess:");

        for (int i = 0; i < 3; i++) {

            int number = Integer.valueOf(scanner.nextLine());

            if (number == result) {
                System.out.println("RIGHT!");
                System.out.println("You have won the game.");
                break;

            } else {
                System.out.println("wrong");

            } 

            if (i == 2) {
                System.out.println("The correct number was: " + result);
                System.out.println("You have lost the game.");
            }
        }


    }
}
