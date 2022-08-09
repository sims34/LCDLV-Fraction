package main;

import java.math.BigInteger;

public class FractionToolBox {
    public static int getPGCD(Fraction f1) {
        return BigInteger.valueOf(f1.getNumerateur()).gcd(BigInteger.valueOf(f1.getDenominateur())).intValue();
    }
}
