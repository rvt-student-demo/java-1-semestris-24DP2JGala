package rvt;

import java.util.Scanner;

public class Detalas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int BoltPrice1 = 5;
        final int BoltPrice2 = 3;
        final int BoltPrice3 = 1;

        System.out.print("Skruvju skaits: ");
        int skruves = scanner.nextInt();

        System.out.print("Uzgrieznu skaits: ");
        int uzgriezni = scanner.nextInt();

        System.out.print("Paplaksnu skaits: ");
        int paplaksnes = scanner.nextInt();

        System.out.println();

        int kopeja_cena = skruves * BoltPrice1 + uzgriezni * BoltPrice2 + paplaksnes * BoltPrice3;

        if (skruves > uzgriezni) {
            System.out.println("Parbaudi pasutijumu: par maz uzgieznu");
        }
        
        if (skruves < uzgriezni) {
            System.out.println("Parbaudi pasutijumu: par maz skruvju");
        }
        
        if (paplaksnes < skruves*2) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
        } 
        
        if (paplaksnes > skruves*2) {
            System.out.println("Parpaudi pasutijumu: par daudz paplaksnu");
        }

        else {
            System.out.println("Pasutijums ir kartiba.");
        }

        System.out.println();
        System.out.println("Kopeja cena " + kopeja_cena);

    }
}