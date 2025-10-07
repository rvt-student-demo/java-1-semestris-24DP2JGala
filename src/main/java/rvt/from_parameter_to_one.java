package rvt;

public class from_parameter_to_one {
    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        for (int i = number; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
