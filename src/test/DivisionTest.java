package test;

import main.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTest {
    @Test
    void unDiviserParUn() {
        Fraction result = new Fraction(1).diviser(new Fraction(1));
        Assertions.assertEquals(new Fraction(1), result);
    }


}
