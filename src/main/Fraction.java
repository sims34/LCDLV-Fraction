package main;

public class Fraction {

    private int numerateur;
    private int denominateur;

    public Fraction(int numerateur) {
        this.numerateur = numerateur;
    }

    public Fraction(int numerateur, int denominateur) {

        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction addition(Fraction f1) {
        return new Fraction(f1.getNumerateur() + this.getNumerateur(),f1.getDenominateur());
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

    public int getDenominateur() {
        return denominateur;
    }
}
