package rvt;
import java.util.*;

public class JMArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);
        
        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
        
    }

    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) break;

            list.add(number);
        }

        System.out.print("From where? ");
        int fromWhere = Integer.valueOf(scanner.nextLine());

        System.out.print("To where? ");
        int toWhere = Integer.valueOf(scanner.nextLine());

        for (int i = fromWhere; i <= toWhere; i++) {
            System.out.println(list.get(i));
        }

    }

    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) break;

            list.add(text);

        }

        System.out.println("In total: " + list.size());

    }

    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) break;

            list.add(text);

        }

        System.out.print("Search for? ");
        String search = scanner.nextLine();

        boolean found = list.contains(search);

        if (found) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
    }

    public static void removeLast(ArrayList<String> x) {
        x.remove(x.size() -1);
    }
}