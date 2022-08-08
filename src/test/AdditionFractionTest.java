package test;

import main.Fraction;
import org.junit.Ignore;
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
        Assertions.assertEquals(zero.getNumerateur(), result.getNumerateur());
    }

    @Test
    void zeroPlusUn() {
        //Given
        Fraction zero = new Fraction(0);
        Fraction un = new Fraction(1);
        //When
        Fraction result = zero.addition(un);
        //Then
        Assertions.assertEquals(un.getNumerateur(), result.getNumerateur());
    }

    @Test
    void unPlusZero() {
        //Given
        Fraction zero = new Fraction(0);
        Fraction un = new Fraction(1);
        //When
        Fraction result = un.addition(zero);
        //Then
        Assertions.assertEquals(un.getNumerateur(), result.getNumerateur());
    }

    @Test
    void unPlusUn() {
        //Given
        Fraction un = new Fraction(1);
        //When
        Fraction result = un.addition(un);
        //Then
        Assertions.assertEquals(new Fraction(2).getNumerateur(), result.getNumerateur());
    }

    @Test
    void unPlusDeux() {
        //Given
        Fraction un = new Fraction(1);
        Fraction deux = new Fraction(2);
        //When
        Fraction result = un.addition(deux);
        //Then
        Assertions.assertEquals(new Fraction(3).getNumerateur(), result.getNumerateur());
    }

    @Test
    void deuxPlusUn() {
        //Given
        Fraction un = new Fraction(1);
        Fraction deux = new Fraction(2);
        //When
        Fraction result = deux.addition(un);
        //Then
        Assertions.assertEquals(new Fraction(3).getNumerateur(), result.getNumerateur());
    }
}
