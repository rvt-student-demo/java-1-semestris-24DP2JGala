package rvt;

import java.util.Scanner;

public class reading_breaking_remembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int number = scanner.nextInt();

        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;

        while (number != -1) {
            sum += number;
            numbers += 1;

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            number = scanner.nextInt();

        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + (double) sum / numbers);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}