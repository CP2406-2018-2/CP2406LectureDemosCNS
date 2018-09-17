package model;

public class Sum {
    private int value;

    public Sum() {
        value = 0;
    }

    public void increment(int amount) {
        value += amount;
    }

    public void reset() {
        value = 0;
    }

    public int getValue() {
        return value;
    }
}
