package test;

import main.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EqualsFractionTest {

    @Test
    void memeDenominateur(){
        Assertions.assertEquals(new Fraction(1), new Fraction(1));
        Assertions.assertEquals(new Fraction(1,3), new Fraction(1,3));
        Assertions.assertEquals(new Fraction(3,4), new Fraction(3,4));
    }
}
