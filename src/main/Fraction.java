package main;

public class Fraction {

    private int numerateur;
    private int denominateur;

    public Fraction(int numerateur) {
        this(numerateur, 1);
    }

    public Fraction(int numerateur, int denominateur) {
        if (denominateur == 0) throw new RuntimeException("Dénominateur ne peut pas être nul");
        this.numerateur = numerateur;
        this.denominateur = denominateur;
        this.simplification();
    }

    public Fraction addition(Fraction f1) {
        return new Fraction(f1.getNumerateur() * this.getDenominateur() + this.getNumerateur() * f1.getDenominateur(), f1.getDenominateur() * this.getDenominateur());
    }

    private int determineSign(){
        if (this.getNumerateur() * this.getDenominateur() >= 0) return 1;
        else return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Fraction)) return false;
        Fraction fraction = ((Fraction) o);
        if(getNumerateur() == 0 && fraction.getNumerateur() == 0) return true;
        return this.getNumerateur() == fraction.getNumerateur() &&
                this.getDenominateur() == fraction.getDenominateur();
    }

    @Override
    public String toString() {
        return numerateur + "/" + denominateur;
    }

    int getNumerateur() {
        return numerateur;
    }

    int getDenominateur() {
        return denominateur;
    }

    private void simplification() {
        int pgcd = FractionToolBox.getPGCD(this);
        this.numerateur = this.determineSign() * Math.abs(this.getNumerateur()) / pgcd;
        this.denominateur = Math.abs(this.getDenominateur()) / pgcd;
    }

    public Fraction multiplier(Fraction fraction) {
        return new Fraction(0);
    }
}
