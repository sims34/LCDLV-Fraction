package test;

import main.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SoustractionTest {

    @Test
    void zeroMoinsZero() {
        Fraction result = new Fraction(0).soustraction(new Fraction(0));
        Assertions.assertEquals(new Fraction(0), result);
    }

    @Test
    void zeroMoinsUn() {
        Fraction result = new Fraction(0).soustraction(new Fraction(1));
        Assertions.assertEquals(new Fraction(-1), result);
    }

    @Test
    void zeroMoinsUnTiers() {
        Assertions.assertEquals(new Fraction(-1, 3), new Fraction(0).soustraction(new Fraction(1, 3)));
    }

    @Test
    void unMoinsZero() {
        Fraction result = new Fraction(1).soustraction(new Fraction(0));
        Assertions.assertEquals(new Fraction(1), result);
    }

    @Test
    void moinsUnMoinsUn() {
        Fraction result = new Fraction(-1).soustraction(new Fraction(1));
        Assertions.assertEquals(new Fraction(-2), result);
    }

    @Test
    void moinsUnMoinsMoinsUn() {
        Fraction result = new Fraction(-1).soustraction(new Fraction(-1));
        Assertions.assertEquals(new Fraction(0), result);
    }
}
