package rvt;

import java.util.Scanner;

public class Grades_and_points {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Uzraksti savu atzimi: ");
        int punkti = Integer.valueOf(scanner.nextLine());

        if (punkti < 0) {
            System.out.println("impossible!");
        } else if (punkti <= 49) {
            System.out.println("failed");
        } else if (punkti <= 59) {
            System.out.println("1");
        } else if (punkti <= 69) {
            System.out.println("2");
        } else if (punkti <= 79) {
            System.out.println("3");
        } else if (punkti <= 89) {
            System.out.println("4");
        } else if (punkti <= 100) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }
    }
}