package rvt;

public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;

    }

    public Counter() {
        this.value = 0;

    }

    public int value() {
        return this.value;

    }

    public void increase() {
        this.value++;

    }

    public void dicrease() {
        this.value--;

    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;

        }

    }

    public void dicrease(int dicreaseBy) {
        if (dicreaseBy > 0) {
            this.value -= dicreaseBy;

        }

    }

}