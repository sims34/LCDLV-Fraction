package test;

import main.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class InitialisationFraction {
    @Test
    void denominateurNul() {
        try {
            new Fraction(7,0);
            fail("Le dénominateur ne peut pas être nul");
        } catch (Exception e) {
            Assertions.assertInstanceOf(RuntimeException.class, e);
        }
    }
}
