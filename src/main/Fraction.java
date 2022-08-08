package main;

import java.math.BigInteger;
import java.util.Objects;

public class Fraction {

    private int numerateur;
    private int denominateur;

    public Fraction(int numerateur) {
        this(numerateur, 1);
    }

    public Fraction(int numerateur, int denominateur) {
        if (denominateur < 0) {
            this.numerateur = -numerateur;
            this.denominateur = - denominateur;
        } else {
            this.numerateur = numerateur;
            this.denominateur = denominateur;
        }
    }

    public Fraction addition(Fraction f1) {
        return new Fraction(f1.getNumerateur() + this.getNumerateur(), f1.getDenominateur());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Fraction)) return false;
        Fraction fraction = Fraction.simplification((Fraction) o);
        Fraction simplifiedThis = Fraction.simplification(this);
        if(getNumerateur() == 0 && fraction.getNumerateur() == 0) return true;
        return simplifiedThis.getNumerateur() == fraction.getNumerateur() &&
                simplifiedThis.getDenominateur() == fraction.getDenominateur();
    }

    @Override
    public String toString() {
        return numerateur + "/" + denominateur;
    }

    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    private static Fraction simplification(Fraction f1) {
        int pgcd = getPGCD(f1);
        return new Fraction((f1.getNumerateur() / pgcd), f1.getDenominateur() / pgcd);
    }

    private static int getPGCD(Fraction f1) {
        return BigInteger.valueOf(f1.getNumerateur()).gcd(BigInteger.valueOf(f1.getDenominateur())).intValue();
    }
}
