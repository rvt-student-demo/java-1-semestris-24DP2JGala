package rvt;

public class MainProgram {
    public static void main(String[] args) {

        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        counter1.increase(); // 10 + 1 = 10
        counter1.dicrease(); // 11 -1 = 10

        System.out.println(counter1.value()); // izvada 10

        counter2.increase(2); // 0 + 2 = 2
        counter2.dicrease(1); // 2 - 1 = 1

        System.out.println(counter2.value()); // izvada 1
        
    }

}
