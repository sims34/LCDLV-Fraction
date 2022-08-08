package main;

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
        Fraction fraction = (Fraction) o;
        if(getNumerateur() == 0 && fraction.getNumerateur() == 0) return true;
        return getNumerateur() == fraction.getNumerateur() &&
                getDenominateur() == fraction.getDenominateur();
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
}
