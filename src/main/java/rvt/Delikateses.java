package rvt;

import java.util.Scanner;

public class Delikateses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double piegade = 0;

        System.out.print("Ievadi preci: ");
        String prece = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine());

        System.out.print("Ekspress piegāde (0==nē; 1==jā): ");
        int eksp_piegade = Integer.valueOf(scanner.nextLine());

        System.out.println();
        System.out.println();
        System.out.println();

        if (cena < 10) {
            piegade += 2;
        }

        if (eksp_piegade == 1) {
            piegade += 3;
        }

        System.out.println("Rēķins:");
        System.out.println("  " + prece + "  " + cena);
        System.out.println("  piegāde:   " + piegade);
        System.out.println("  kopā:      " + (cena + piegade));
    }
}
