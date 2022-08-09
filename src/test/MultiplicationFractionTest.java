package test;

import main.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationFractionTest {

    @Test
    void zeroParZero() {
        Fraction result = new Fraction(0).multiplier(new Fraction(0));
        Assertions.assertEquals(new Fraction(0), result);
    }

    @Test
    void zeroParUn() {
        Fraction result = new Fraction(0).multiplier(new Fraction(1));
        Assertions.assertEquals(new Fraction(0), result);
    }

    @Test
    void UnParZero() {
        Fraction result = new Fraction(1).multiplier(new Fraction(0));
        Assertions.assertEquals(new Fraction(0), result);
    }

    @Test
    void unParUn() {
        Fraction result = new Fraction(1).multiplier(new Fraction(1));
        Assertions.assertEquals(new Fraction(1), result);
    }

    @Test
    void zeroParUnTier() {
        Fraction result = new Fraction(0).multiplier(new Fraction(1, 3));
        Assertions.assertEquals(new Fraction(0), result);
    }

}
