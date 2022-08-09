package main;

import java.math.BigInteger;

class FractionToolBox {
    static int getPGCD(Fraction f1) {
        return BigInteger.valueOf(f1.getNumerateur()).gcd(BigInteger.valueOf(f1.getDenominateur())).intValue();
    }
}
