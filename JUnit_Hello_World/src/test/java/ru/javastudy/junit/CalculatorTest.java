package ru.javastudy.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("");
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("");
        System.out.println("After CalculatorTest.class");
    }

    @Test
    public void testGetSum() throws Exception {
        System.out.println("testGetSum()");
        assertEquals(15, calculator.getSum(7, 8));
    }

    @Test
    public void testGetDivide() throws Exception {
        System.out.println("testGetDivide()");
        assertEquals(20, calculator.getDivide(100, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        System.out.println("divisionWithException()");
        calculator.getDivide(15, 0);
    }

}