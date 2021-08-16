package hardTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HardTestClass {

  Calculator calc = new Calculator();

  @Test
  public void addAll() {
    int actualResult = calc.addAll(10, 5, 5, 5);
    System.out.println("actual result = " + actualResult);
    assertEquals("10 + 5 + 5 + 5 must be 25", 25, actualResult);
  }

  //TODO (**)
  //add tests for new method - addition with multiple parameters


  @Test
  public void devByZero() {
    int actualResult = calc.devByZero(10, 0);
    System.out.println("actual result = " + actualResult);
    assertEquals("10 * 0", -100, actualResult);
  }


  //TODO (**)
  //add tests for new method - divide by zero case

}
