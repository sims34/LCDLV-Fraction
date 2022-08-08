package test;

import main.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EqualsFractionTest {

    @Test
    void memeDenominateur() {
        Assertions.assertEquals(new Fraction(1), new Fraction(1));
        Assertions.assertEquals(new Fraction(1, 3), new Fraction(1, 3));
        Assertions.assertEquals(new Fraction(3, 4), new Fraction(3, 4));
    }

    @Test
    void numerateurZero() {
        Assertions.assertEquals(new Fraction(0, 7), new Fraction(0, 4));
    }

    @Test
    void gestionNegatif() {
        Assertions.assertEquals(new Fraction(-2, 3),
                new Fraction(2, -3));
        Assertions.assertEquals(new Fraction(1, -4 ),
                new Fraction(-1, 4));
        Assertions.assertEquals(new Fraction(-1, -4 ),
                new Fraction(1, 4));
    }

}
