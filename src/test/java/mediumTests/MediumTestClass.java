package mediumTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MediumTestClass {

  public Calculator calc = new Calculator();

  //TODO (**)
  //add tests for new method - average value

  @Test
  public void averageValue() {
    int actualResult = calc.averageValue(10, 5, 6);
    System.out.println("actual result = " + actualResult);
    assertEquals("10 + 5 + 6 / 3 must be 21", 7, actualResult);
  }
  //TODO (**)
  //add tests for new method - even or odd

    @Test
    public void evenOrOdd() {
      boolean actualResult = calc.evenOrOdd(10);
      System.out.println("actual result = " + actualResult);
      assertEquals("10 % 2 Odd ", true, actualResult);
    }
  //TODO (**)
  //add tests for new method - biggest value

      @Test
      public void biggestValue() {
        int actualResult = calc.biggestValue(10, 5);
        System.out.println("actual result = " + actualResult);
        assertEquals("10 biggest", 10, actualResult);
      }
}
