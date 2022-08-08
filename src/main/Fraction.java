package main;

public class Fraction {

    private int numerateur;

    public Fraction(int numerateur) {
        this.numerateur = numerateur;
    }

    public Fraction addition(Fraction f1) {
        if (f1.numerateur == 0) {
            return this;
        }
        return f1;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerateur=" + numerateur +
                '}';
    }

    public int getNumerateur() {
        return numerateur;
    }
}
