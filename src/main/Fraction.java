package main;

public class Fraction {

    private int numerateur;

    public Fraction(int numerateur) {
        this.numerateur = numerateur;
    }

    public Fraction addition(Fraction f1) {
        return new Fraction(f1.getNumerateur() + this.getNumerateur());
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
