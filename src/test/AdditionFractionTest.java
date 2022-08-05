package test;

import main.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdditionFractionTest {

    @Test
    void zeroPlusZero() {
        //Given
        Fraction zero = new Fraction(0);
        //When
        Fraction result = zero.addition(zero);
        //Then
        Assertions.assertEquals(zero, result);
    }

    @Test
    void zeroPlusUn() {
        //Given
        Fraction zero = new Fraction(0);
        Fraction un = new Fraction(1);
        //When
        Fraction result = zero.addition(un);
        //Then
        Assertions.assertEquals(un, result);
    }
}
