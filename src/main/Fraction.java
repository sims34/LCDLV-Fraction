package main;

public class Fraction {


    private int value;

    public Fraction(int value) {

        this.value = value;
    }

    public Fraction addition(Fraction f1) {
        if (f1.value == 0) {
            return this;
        }
        return f1;
    }
}
