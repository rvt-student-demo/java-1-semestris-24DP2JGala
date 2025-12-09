package rvt;

public class Statistics {

    private int count;
    private int sum;
    private double average;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
        this.average = 0;

    }

    public void addNumber(int number) {
        this.sum += number;
        this.count += 1;
        
        this.average = (double) sum / count;

    }

    public int getCount() {
        return this.count;

    }

    public int sum() {
        return this.sum;

    }

    public double average() {
        return average;

    }
    
}
