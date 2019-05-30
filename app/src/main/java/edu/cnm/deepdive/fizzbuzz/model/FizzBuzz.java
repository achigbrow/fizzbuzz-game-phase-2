package edu.cnm.deepdive.fizzbuzz.model;

/**
 * Includes several public methods and constants for computing FizzBuzz values.
 * <p>This <code>class</code> includes <code>static</code> methods that take <code>int</code>
 * parameters and return <code>boolean</code> or {@link String} results, indicating whether the specified
 * values are divisible by 3 (Fizz), 5 (Buzz), or 3 and 5 (FizzBuzz).</p>
 *
 * @author Alana Chigbrow
 * @version 1.0.0
 */
public class FizzBuzz {

  private FizzBuzz() {}
  /**
   * {@link String} value indicating a number divisible by 3.
   */
  public static final String FIZZ = "Fizz";

  /** {@link String} value indicating a number divisible by 5. */
  public static final String BUZZ = "Buzz";

  /**
   * Computes and returns "Fizz", "Buzz", or a {@link String} representation of <code>value</code>,
   * depending on whether <code>value</code> is divisible by 3, 5, or both.
   *
   * @param value Integer value to be tested for divisibility by 3 and 5.
   * @return "Fizz", "Buzz", "FizzBuzz", or value as a {@link String}.
   */
  public static String fizzBuzzValue(int value) {
    if (value <= 0) {
      throw new IllegalArgumentException();
    }
    String result = "";
    if (isFizz(value)) {
      result += FIZZ;
    }
    if (isBuzz(value)) {
      result += BUZZ;
    }
    if (result.isEmpty()) {
      result += value;
    }
    return result;
  }

  /**
   * <code>boolean</code> test to determine if <code>value</code> is divisible by 3.
   *
   * @param value Integer value to be divided by 3.
   * @return "Fizz" or {@link String} representation of <code>value</code>.
   */
  public static boolean isFizz(int value) {
    return value % 3 == 0;
  }

  /**
   * <code>boolean</code> test to determine if <code>value</code> is divisible by 5.
   * @param value Integer value to be divided by 5.
   * @return "Buzz" or {@link String} representation of <code>value</code>.
   */
  public static boolean isBuzz(int value) {
    return value % 5 == 0;
  }
}
