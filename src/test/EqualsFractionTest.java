package test;

import main.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EqualsFractionTest {

    @Test
    void unEgaleUn(){
        Assertions.assertEquals(new Fraction(1), new Fraction(1));
    }
}
