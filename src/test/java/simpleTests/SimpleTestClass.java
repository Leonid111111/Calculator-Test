package simpleTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class SimpleTestClass {

     Calculator calc = new Calculator();

    @Test
    public void testAddTwoPositiveValues() {
        int actualResult = calc.add(10, 5);
        System.out.println("actual result = " + actualResult);
        assertEquals("10 + 5 must be 15", 15, actualResult);
    }

    @Test
    public void subtraction() {
        int actualResult = calc.subtraction(10, 5);
        System.out.println("actual result = " + actualResult);
        assertEquals("10 - 5 must be 5", 5, actualResult);
    }


    @Test
    public void multiplication() {
        int actualResult = calc.multiplication(10, 5);
        System.out.println("actual result = " + actualResult);
        assertEquals("10 * 5 must be 50", 50, actualResult);
    }

    @Test
    public void division() {
        int actualResult = calc.division(10, 5);
        System.out.println("actual result = " + actualResult);
        assertEquals("10 / 5 must be 2", 2, actualResult);
    }

    @Test
    public void squareRoot() {
        double actualResult = calc.squareRoot(100);
        System.out.println("actual result = " + actualResult);
        assertEquals("10 * 10", 10.00, actualResult);
    }


    @Test
    public void calk1() {
        int actualResult = calc.multiplication(5, 5);
        System.out.println("actual result = " + actualResult);
        assertEquals("5 * 5", 25, actualResult);
    }
    // TODO (*)
    //add tests for new methods (multiply, division, subtraction, square root, x^2)


}
