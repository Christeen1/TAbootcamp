package com.bootcampexcercise.module10;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator calculator;

    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        calculator = null;
        super.tearDown();
    }

    public void testGetSum() {

        int a = 8;
        int b = 1;

        assertEquals(9, (calculator.getSum(a, b)));
        assertEquals(9, (calculator.getSum(b, a)));

        a = -1;
        b = 9;
        assertEquals(8, (calculator.getSum(a, b)));
        assertEquals(8, (calculator.getSum(b, a)));


        a = -2;
        b = -3;
        assertEquals(-5, (calculator.getSum(a, b)));
        assertEquals(-5, (calculator.getSum(b, a)));
    }

    public void testGetSum1() {
        int a = 8;
        int b = 1;
        int c = 5;

        assertEquals(14, (calculator.getSum(a, b, c)));
        assertEquals(14, (calculator.getSum(a, c, b)));
        assertEquals(14, (calculator.getSum(b, a, c)));
        assertEquals(14, (calculator.getSum(b, c, a)));
        assertEquals(14, (calculator.getSum(c, a, b)));
        assertEquals(14, (calculator.getSum(c, b, a)));

        a = -1;
        b = 9;
        c = 2;
        assertEquals(10, (calculator.getSum(a, b, c)));
        assertEquals(10, (calculator.getSum(a, c, b)));
        assertEquals(10, (calculator.getSum(b, a, c)));
        assertEquals(10, (calculator.getSum(b, c, a)));
        assertEquals(10, (calculator.getSum(c, a, b)));
        assertEquals(10, (calculator.getSum(c, b, a)));

        a = -3;
        b = -2;
        c = 8;

        assertEquals(3, (calculator.getSum(a, b, c)));
        assertEquals(3, (calculator.getSum(a, c, b)));
        assertEquals(3, (calculator.getSum(b, a, c)));
        assertEquals(3, (calculator.getSum(b, c, a)));
        assertEquals(3, (calculator.getSum(c, a, b)));
        assertEquals(3, (calculator.getSum(c, b, a)));

        a = -2;
        b = -3;
        c = -1;
        assertEquals(-6, (calculator.getSum(a, b, c)));
        assertEquals(-6, (calculator.getSum(a, c, b)));
        assertEquals(-6, (calculator.getSum(b, a, c)));
        assertEquals(-6, (calculator.getSum(b, c, a)));
        assertEquals(-6, (calculator.getSum(c, a, b)));
        assertEquals(-6, (calculator.getSum(c, b, a)));
    }

    public void testGetSum4() {

        int a = 8;
        int b = 0;

        assertEquals(8, (calculator.getSum(a, b)));
        assertEquals(8, (calculator.getSum(b, a)));

        a = -1;
        b = 0;
        assertEquals(-1, (calculator.getSum(a, b)));
        assertEquals(-1, (calculator.getSum(b, a)));


        a = 0;
        b = 0;
        assertEquals(0, (calculator.getSum(a, b)));
        assertEquals(0, (calculator.getSum(b, a)));
    }

    public void testGetSum2() {
        int a = 0;
        int b = 1;
        int c = 5;

        assertEquals(6, (calculator.getSum(a, b, c)));
        assertEquals(6, (calculator.getSum(a, c, b)));
        assertEquals(6, (calculator.getSum(b, a, c)));
        assertEquals(6, (calculator.getSum(b, c, a)));
        assertEquals(6, (calculator.getSum(c, a, b)));
        assertEquals(6, (calculator.getSum(c, b, a)));

        a = -1;
        b = 0;
        c = 2;
        assertEquals(1, (calculator.getSum(a, b, c)));
        assertEquals(1, (calculator.getSum(a, c, b)));
        assertEquals(1, (calculator.getSum(b, a, c)));
        assertEquals(1, (calculator.getSum(b, c, a)));
        assertEquals(1, (calculator.getSum(c, a, b)));
        assertEquals(1, (calculator.getSum(c, b, a)));

        a = -3;
        b = -2;
        c = 0;

        assertEquals(-5, (calculator.getSum(a, b, c)));
        assertEquals(-5, (calculator.getSum(a, c, b)));
        assertEquals(-5, (calculator.getSum(b, a, c)));
        assertEquals(-5, (calculator.getSum(b, c, a)));
        assertEquals(-5, (calculator.getSum(c, a, b)));
        assertEquals(-5, (calculator.getSum(c, b, a)));

        a = 0;
        b = 0;
        c = 3;
        assertEquals(3, (calculator.getSum(a, b, c)));
        assertEquals(3, (calculator.getSum(a, c, b)));
        assertEquals(3, (calculator.getSum(b, a, c)));
        assertEquals(3, (calculator.getSum(b, c, a)));
        assertEquals(3, (calculator.getSum(c, a, b)));
        assertEquals(3, (calculator.getSum(c, b, a)));

        a = 0;
        b = 0;
        c = 0;
        assertEquals(3, (calculator.getSum(a, b, c)));
        assertEquals(3, (calculator.getSum(a, c, b)));
        assertEquals(3, (calculator.getSum(b, a, c)));
        assertEquals(3, (calculator.getSum(b, c, a)));
        assertEquals(3, (calculator.getSum(c, a, b)));
        assertEquals(3, (calculator.getSum(c, b, a)));
    }

    public void testGetSubstract() {

        int a = 8;
        int b = 1;

        assertEquals(7, (calculator.getSubstract(a, b)));
        assertEquals(-7, (calculator.getSubstract(b, a)));

        a = 3;
        b = -2;

        assertEquals(5, (calculator.getSubstract(a, b)));
        assertEquals(-5, (calculator.getSubstract(b, a)));

        a = -4;
        b = -9;

        assertEquals(5, (calculator.getSubstract(a, b)));
        assertEquals(-5, (calculator.getSubstract(b, a)));

    }
    public void testGetSubstract2() {

        int a = 0;
        int b = 1;

        assertEquals(1, (calculator.getSubstract(a, b)));
        assertEquals(-1, (calculator.getSubstract(b, a)));

        a = 3;
        b = 0;

        assertEquals(3, (calculator.getSubstract(a, b)));
        assertEquals(-3, (calculator.getSubstract(b, a)));

        a = 0;
        b = -8;

        assertEquals(8, (calculator.getSubstract(a, b)));
        assertEquals(-8, (calculator.getSubstract(b, a)));

        a = 0;
        b = 0;

        assertEquals(0, (calculator.getSubstract(a, b)));
        assertEquals(0, (calculator.getSubstract(b, a)));

    }

    public void testGetDivide() {

        double a = 9;
        double b = 3;

        assertEquals(3.0, (calculator.getDivide(a, b)));
        assertEquals(0.30, (calculator.getDivide(b, a)));

        a = 6;
        b = -2;

        assertEquals(-3.0, (calculator.getDivide(a, b)));
        assertEquals(-0.33, (calculator.getDivide(b, a)));

        a = -8;
        b = -7;

        assertEquals(1.14, (calculator.getDivide(a, b)));
        assertEquals(0.87, (calculator.getDivide(b, a)));

    }

    public void testGetMultiply() {

        double a = 2;
        double b = 4;
        double c = 1;

        assertEquals(8.0, (calculator.getMultiply(a, b, c)));
        assertEquals(8.0, (calculator.getMultiply(a, c, b)));
        assertEquals(8.0, (calculator.getMultiply(b, a, c)));
        assertEquals(8.0, (calculator.getMultiply(b, c, a)));
        assertEquals(8.0, (calculator.getMultiply(c, a, b)));
        assertEquals(8.0, (calculator.getMultiply(c, b, a)));

        a = -5;
        b = 4;
        c = 3;
        assertEquals(-60.0, (calculator.getMultiply(a, b, c)));
        assertEquals(-60.0, (calculator.getMultiply(a, c, b)));
        assertEquals(-60.0, (calculator.getMultiply(b, a, c)));
        assertEquals(-60.0, (calculator.getMultiply(b, c, a)));
        assertEquals(-60.0, (calculator.getMultiply(c, a, b)));
        assertEquals(-60.0, (calculator.getMultiply(c, b, a)));

        a = -3;
        b = -2;
        c = 7;

        assertEquals(42.0, (calculator.getMultiply(a, b, c)));
        assertEquals(42.0, (calculator.getMultiply(a, c, b)));
        assertEquals(42.0, (calculator.getMultiply(b, a, c)));
        assertEquals(42.0, (calculator.getMultiply(b, c, a)));
        assertEquals(42.0, (calculator.getMultiply(c, a, b)));
        assertEquals(42.0, (calculator.getMultiply(c, b, a)));

        a = -4;
        b = -1;
        c = -9;
        assertEquals(-36.0, (calculator.getMultiply(a, b, c)));
        assertEquals(-36.0, (calculator.getMultiply(a, c, b)));
        assertEquals(-36.0, (calculator.getMultiply(b, a, c)));
        assertEquals(-36.0, (calculator.getMultiply(b, c, a)));
        assertEquals(-36.0, (calculator.getMultiply(c, a, b)));
        assertEquals(-36.0, (calculator.getMultiply(c, b, a)));
    }

    // negative tests

    public void testGetDivide1() {

        double a = 0;
        double b = 3;

        assertEquals(0, (calculator.getDivide(a, b)));
        assertEquals(0, (calculator.getDivide(b, a)));

        a = -2;
        b = 0;

        assertEquals(0, (calculator.getDivide(a, b)));
        assertEquals(0, (calculator.getDivide(b, a)));

        a = 0;
        b = 0;

        assertEquals(0, (calculator.getDivide(a, b)));
        assertEquals(0, (calculator.getDivide(b, a)));

    }

    public void testGetMultiply1() {

        double a = 0;
        double b = 4;
        double c = 1;

        assertEquals(0, (calculator.getMultiply(a, b, c)));
        assertEquals(0, (calculator.getMultiply(a, c, b)));
        assertEquals(0, (calculator.getMultiply(b, a, c)));
        assertEquals(0, (calculator.getMultiply(b, c, a)));
        assertEquals(0, (calculator.getMultiply(c, a, b)));
        assertEquals(0, (calculator.getMultiply(c, b, a)));

        a = -5;
        b = 0;
        c = 3;

        assertEquals(0, (calculator.getMultiply(a, b, c)));
        assertEquals(0, (calculator.getMultiply(a, c, b)));
        assertEquals(0, (calculator.getMultiply(b, a, c)));
        assertEquals(0, (calculator.getMultiply(b, c, a)));
        assertEquals(0, (calculator.getMultiply(c, a, b)));
        assertEquals(0, (calculator.getMultiply(c, b, a)));

        a = -3;
        b = -2;
        c = 0;

        assertEquals(0, (calculator.getMultiply(a, b, c)));
        assertEquals(0, (calculator.getMultiply(a, c, b)));
        assertEquals(0, (calculator.getMultiply(b, a, c)));
        assertEquals(0, (calculator.getMultiply(b, c, a)));
        assertEquals(0, (calculator.getMultiply(c, a, b)));
        assertEquals(0, (calculator.getMultiply(c, b, a)));

        a = 0;
        b = 0;
        c = -9;
        assertEquals(0, (calculator.getMultiply(a, b, c)));
        assertEquals(0, (calculator.getMultiply(a, c, b)));
        assertEquals(0, (calculator.getMultiply(b, a, c)));
        assertEquals(0, (calculator.getMultiply(b, c, a)));
        assertEquals(0, (calculator.getMultiply(c, a, b)));
        assertEquals(0, (calculator.getMultiply(c, b, a)));
        a = 0;
        b = 0;
        c = 0;
        assertEquals(0, (calculator.getMultiply(a, b, c)));
        assertEquals(0, (calculator.getMultiply(a, c, b)));
        assertEquals(0, (calculator.getMultiply(b, a, c)));
        assertEquals(0, (calculator.getMultiply(b, c, a)));
        assertEquals(0, (calculator.getMultiply(c, a, b)));
        assertEquals(0, (calculator.getMultiply(c, b, a)));
    }
}


