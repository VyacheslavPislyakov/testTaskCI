package ru.javastudy.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void initTest() {
        System.out.println("");
        System.out.println("initTest()");
        calculator = new Calculator();
    }

    @After
    public void afterTest() {
        System.out.println("afterTest()");
        calculator = null;
    }

    @Test
    public void testGetSum() throws Exception {
        System.out.println("testGetSum()");
        assertEquals(15, calculator.getSum(7,8));
    }
}