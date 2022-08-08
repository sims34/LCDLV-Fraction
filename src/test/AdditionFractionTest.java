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

    @Test
    void unPlusZero() {
        //Given
        Fraction zero = new Fraction(0);
        Fraction un = new Fraction(1);
        //When
        Fraction result = un.addition(zero);
        //Then
        Assertions.assertEquals(un, result);
    }

    @Test
    void unPlusUn() {
        //Given
        Fraction un = new Fraction(1);
        //When
        Fraction result = un.addition(un);
        //Then
        Assertions.assertEquals(new Fraction(2), result);
    }

    @Test
    void unPlusDeux() {
        //Given
        Fraction un = new Fraction(1);
        Fraction deux = new Fraction(2);
        //When
        Fraction result = un.addition(deux);
        //Then
        Assertions.assertEquals(new Fraction(3), result);
    }

    @Test
    void deuxPlusUn() {
        //Given
        Fraction un = new Fraction(1);
        Fraction deux = new Fraction(2);
        //When
        Fraction result = deux.addition(un);
        //Then
        Assertions.assertEquals(new Fraction(3), result);
    }

    @Test
    void sommeFractionMemeDenominateur() {
        Fraction f1 = new Fraction(3,4);
        Fraction f2 = new Fraction(2,4);

        Fraction result = f1.addition(f2);

        Assertions.assertEquals(new Fraction(5, 4), result);
    }

    @Test
    void sommeDenominateurDifferent() {
        Fraction result = new Fraction(2, 3).addition(new Fraction(3, 2));
        Assertions.assertEquals(new Fraction(13, 6), result);
    }

    @Test
    void sommeDenominateurDifferentAvecSimplification() {
        Fraction result = new Fraction(1, 3).addition(new Fraction(1, 6));
        Assertions.assertEquals(new Fraction(1, 2), result);
    }
    @Test
    void sommeAvecNegatif() {
        Fraction result = new Fraction(-2, 3).addition(new Fraction(4, 7));
        Assertions.assertEquals(new Fraction(-2, 21), result);
    }
    @Test
    void sommeAvecDeuxNegatif() {
        Fraction result = new Fraction(-2, 3).addition(new Fraction(-4, 7));
        Assertions.assertEquals(new Fraction(-26, 21), result);
    }

}
