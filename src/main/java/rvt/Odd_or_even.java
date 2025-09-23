package rvt;

import java.util.Scanner;

public class Odd_or_even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int skaitlis = Integer.valueOf(scanner.nextLine());

        if (skaitlis % 2 == 0) {
            System.out.println("Number " + skaitlis + " is even.");
        } else {
            System.out.println("Number " + skaitlis + " is odd.");
        }
    }
}
