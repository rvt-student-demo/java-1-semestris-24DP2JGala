package rvt;

import java.util.Scanner;

public class Chapter19 {

    public static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ex7();
        
    }

    public static void ex1() {
        System.out.println("Enter Start:");
        int start = scanner.nextInt();

        System.out.println("Enter End:");
        int end = scanner.nextInt();

        System.out.println();

        while (start != end+1) {
            System.out.println(start);

            start++;
        }
    }

    public static void ex2() {
        System.out.println("Enter N: ");
        int n = scanner.nextInt();

        int sum1 = 0;

        for (int i = 0; i <= n; i++) {
            sum1 += i;
        }

        int sum2 = (n*(n+1))/2;

        System.out.println("Loop Sum = " + sum1);
        System.out.println("Formula Sum = " + sum2);

    }

    public static void ex3_1() {
        System.out.println("Enter N:");
        int n = scanner.nextInt();

        int SumOfSquares1 = 0;

        for (int i = 0; i <= n; i++) {
            SumOfSquares1 += Math.pow(i, 2);
        }

        int SumOfSquares2 = (n*(n+1)*(2*n+1))/6;

        System.out.println("Loop Sum = " + SumOfSquares1);
        System.out.println("Formula Sum = " + SumOfSquares2);

    }

    public static void ex3_2() {
        System.out.println("Enter N:");
        int n = scanner.nextInt();

        int SumOfCubes1 = 0;

        for (int i = 0; i <= n; i++) {
            SumOfCubes1 += Math.pow(i, 3);
        }

        double SumOfCubes2 = Math.pow((n*(n+1)) / 2, 2);

        System.out.println("Loop Sum = " + SumOfCubes1);
        System.out.println("Formula Sum = " + (int) SumOfCubes2);
    }

    public static void ex4() {
        System.out.println("Enter low:");
        int low = scanner.nextInt();

        System.out.println("Enter high:");
        int high = scanner.nextInt();

        int FormulaHigh = (high*(high+1))/2;
        int FormulaLow = (low*(low-1))/2;

        System.out.println("Sum = " + (FormulaHigh - FormulaLow));
    }

    public static void ex5() {
        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        int len = word.length();

        System.out.println();

        for (int i = 0; i < len; i++) {
            System.out.println(word);
        }

    }

    public static void ex6() {
        System.out.println("Enter first word:");
        String word1 = scanner.nextLine();

        System.out.println("Enter second word:");
        String word2 = scanner.nextLine();

        int len1 = word1.length();
        int len2 = word2.length();

        int PunktuSkaits = 30 - (len1 + len2);
        
        System.out.println();
        System.out.print(word1);

        for (int i = PunktuSkaits; i > 0 && i >= 0; i--) {
            System.out.print(".");
        }

        System.out.println(word2);
    }

    public static void ex7() {
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int len = word.length();

        for (int index = 0; index < len; index++) {
            System.out.println(word.charAt(index));
        }
    }
}
