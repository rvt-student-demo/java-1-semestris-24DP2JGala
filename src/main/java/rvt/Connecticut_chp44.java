package rvt;

import java.util.*;

public class Connecticut_chp44 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ex7();

    }

    public static void ex1() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        name = name.trim();
        
        String theName = name.substring(0, name.indexOf(" "));
        String theLastName = name.substring(name.indexOf(" "));

        System.out.println("\n" + theName + theLastName.toUpperCase());

    }

    public static void ex2() {
        System.out.println("Enter a string:");
        String word = scanner.nextLine();
        word = word.trim();  // uzdevums neprasija pielietot šo metodi, bet es to pievienoju no sevīm, lai gadījuma (ja cilvēks kopā ar vārdu ievada liekas atstarpes sākumā vai beigās) programma tās neizdrukātu.

        System.out.println();

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            System.out.println(character);

        }

    }

    public static void ex3() {
        String name;

        while (true) {
            System.out.println("Enter a name:");
            name = scanner.nextLine();
            name = name.trim();  // ja pat ievadīs atstarpi kā vārdu, programma arī beigs savu izpildi.

            if (name.equals("")) break;


            if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham")) {
                System.out.println("Mr. " + name);

            } else if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")) {
                System.out.println("Ms. " + name);

            } else {
                System.out.println(name);
            }

            System.out.println();

        }

    }

    public static void ex4() {
        System.out.print("Enter cook time-> ");
        String cookTime = scanner.nextLine();

        if (cookTime.length() < 2) {
            System.out.print("Your time->  0:0" + cookTime);

        } else {
            String theSeconds = cookTime.substring(cookTime.length() -2);
            String theMinutes = cookTime.substring(0, cookTime.length() -2);

            if (theMinutes.equals("")) {
                theMinutes = "0";
            }

            System.out.println("Your time->  " + theMinutes + ":" + theSeconds);

        }

    }

    public static void ex6() {
        while (true) {
            System.out.println("Enter your password:");
            String password = scanner.nextLine();

            if (password.length() < 7) {
                System.out.println("That password is not acceptable.");
                System.out.println();
                continue;

            }

            boolean UpperCase = !(password.equals(password.toUpperCase()));
            boolean LowerCase = !(password.equals(password.toLowerCase()));
            boolean Digit = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) { // "Charactet.isDigit()" – ieteica mākslīgais intelekts (es neatradu savādāku veidu kā atšķirt ciparus no teksta).
                    Digit = true;

                }

            }

            if (UpperCase == true && LowerCase == true && Digit == true) {
                System.out.println("Acceptable password");
                break;

            } else {
                System.out.println("That password is not acceptable.");
                System.out.println();
                continue;
            }

        }

    }

    public static void ex7() {
        System.out.print("Enter the word -->");
        String word = scanner.nextLine();

        System.out.println(word);
        for (int i = 1; i <= word.length() / 2; i++) {
            
            for (int reizes = 0; reizes < i; reizes++) {
                System.out.print(" ");
            }

            System.out.println(word.substring(i, word.length() -i));

        }

    }

}