package main;

import java.math.BigInteger;

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
        return new Fraction(f1.getNumerateur() * this.getDenominateur() + this.getNumerateur() * f1.getDenominateur(), f1.getDenominateur() * this.getDenominateur());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Fraction)) return false;
        Fraction fraction = ((Fraction) o);
        fraction.simplification();
        this.simplification();
        if(getNumerateur() == 0 && fraction.getNumerateur() == 0) return true;
        return this.getNumerateur() == fraction.getNumerateur() &&
                this.getDenominateur() == fraction.getDenominateur();
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

    private void simplification() {
        int pgcd = this.getPGCD();
        this.numerateur = this.getNumerateur() / pgcd;
        this.denominateur = this.getDenominateur() / pgcd;
    }

    private int getPGCD() {
        return BigInteger.valueOf(this.getNumerateur()).gcd(BigInteger.valueOf(this.getDenominateur())).intValue();
    }
}
