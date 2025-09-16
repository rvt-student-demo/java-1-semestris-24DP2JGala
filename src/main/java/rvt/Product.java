package rvt;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Produkts (nosaukums):");
        String produkts = reader.nextLine();

        System.out.println("Produktu skaits:");
        int skaits = reader.nextInt();

        System.out.println("Produkta cena:");
        double cena = reader.nextDouble();
        
        System.out.println();
        System.out.println("Produkts:");
        System.out.println(produkts);

        System.out.println("Cena:");
        System.out.println(cena);

        System.out.println("Daudzums:");
        System.out.println(skaits);

        System.out.println("totalPrice:");
        System.out.println(skaits * cena);
    }
}
