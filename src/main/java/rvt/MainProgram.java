package rvt;

public class MainProgram {
    public static void main(String[] args) {

        Box smallBox = new Box(2, 3, 4);
        Box bigBox = new Box(3, 4, 5);

        System.out.println("Vai smallBox ielidis bigBox? => " + smallBox.nests(bigBox));
        System.out.println("Vai bigBox ielidis smallBox? => " + bigBox.nests(smallBox));

        Box copyBox = new Box(smallBox);
        System.out.println("\nVai copyBox ielidis bigBox? => " + copyBox.nests(bigBox));
        System.out.println("Vai copyBox ielidis smallBox? => " + copyBox.nests(smallBox) + ", jo tie ir vienada izmera");
        
    }

}
