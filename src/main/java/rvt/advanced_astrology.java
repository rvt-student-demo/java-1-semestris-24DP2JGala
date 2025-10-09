package rvt;

public class advanced_astrology {
    public static void main(String[] args) {
        christmasTree(10);
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }

        System.out.println();
    }

    public static void printTriangle(int size) {
        for (int i = 0; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for (int i = 0; i <= height; i++ ) {

            printSpaces(height - i);
            printStars(i*2 - 1);
        }

        for (int i = 0; i != 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }

        System.out.println();
    }
}
