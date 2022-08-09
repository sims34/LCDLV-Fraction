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
}
