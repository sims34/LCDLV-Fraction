package test;

import main.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class DivisionTest {
    @Test
    void unDiviseParUn() {
        Fraction result = new Fraction(1).diviser(new Fraction(1));
        Assertions.assertEquals(new Fraction(1), result);
    }

    @Test
    void unDiviseParUnTiers() {
        Fraction result = new Fraction(1).diviser(new Fraction(1, 3));
        Assertions.assertEquals(new Fraction(3), result);
    }

    @Test
    void troisQuartDiviseParUnDemi() {
        Fraction result = new Fraction(3, 4).diviser(new Fraction(1, 2));
        Assertions.assertEquals(new Fraction(3, 2), result);
    }

    @Test
    void zeroDiviseParUnDemi() {
        Fraction result = new Fraction(0).diviser(new Fraction(1, 2));
        Assertions.assertEquals(new Fraction(0), result);
    }

    @Test
    void UnDemiDiviseParZero() {
        try {
            new Fraction(1, 2).diviser(new Fraction(0));
            fail("On ne peut pas diviser par zero");
        } catch (Exception e) {
            Assertions.assertInstanceOf(ArithmeticException.class, e);
        }
    }
}