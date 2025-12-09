package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                System.out.println();
                break;

            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Books(name, pages, age));

            System.out.println(); // tas ir no sevīm (lai stilistiski padarītu programmu skaistāku)
            
        }

        System.out.print("What information will be printed? ");
        String information = scanner.nextLine();

        if (information.equals("everything")) {
            for (Books x: books) {
                System.out.println(x);

            }

        } else if (information.equals("name")) {
            for (Books x: books) {
                System.out.println(x.getName());

            }

        } else {
            System.out.println("Err."); // šo es pievienoju no sevīm

        }
        
    }

}
