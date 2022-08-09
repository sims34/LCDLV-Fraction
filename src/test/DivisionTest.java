package test;

import main.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivisionTest {
    @Test
    void unDiviserParUn() {
        Fraction result = new Fraction(1).diviser(new Fraction(1));
        Assertions.assertEquals(new Fraction(1), result);
    }

    @Test
    void unDiviserParUnTiers() {
        Fraction result = new Fraction(1).diviser(new Fraction(1, 3));
        Assertions.assertEquals(new Fraction(3), result);
    }

    @Test
    void troisQuartDiviserParUnDemi() {
        Fraction result = new Fraction(3, 4).diviser(new Fraction(1, 2));
        Assertions.assertEquals(new Fraction(3, 2), result);
    }
}