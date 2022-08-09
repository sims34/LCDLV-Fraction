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


}
