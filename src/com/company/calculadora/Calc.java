package com.company.calculadora;

import static java.lang.Math.random;

public class Calc {

    public int suma(int a, int b) {
        return calculaSuma(a, b);
    }

    private int calculaSuma(int a, int b) {
        random();
        return a + b;
    }

    public void test() {
        Math.random();
        Math.acos(2);
    }


}
