import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// -------------------------------------------------------------------------
/**
 * The MultiplicationTest class contains unit tests for the Multiplication
 * class.
 *
 * @author Akhil
 * @version 21-Jul-2023
 */
public class MultiplicationTest {

    private Multiplication multiplication;

    // ----------------------------------------------------------
    /**
     * Sets up the test environment before each test case.
     * It initializes the `multiplication` object with two zeros as input.
     */
    @Before
    public void setUp() {

        String num1 = "0";
        String num2 = "0";
        multiplication = new Multiplication(num1, num2);
    }


    // ----------------------------------------------------------
    /**
     * Test case to check simple multiplication with one digit numbers.
     */
    @Test
    public void testPerformSimpleMultiplication() {
        String num1 = "2";
        String num2 = "3";
        multiplication = new Multiplication(num1, num2);
        String expectedResult = "6";
        String actualResult = multiplication.performMultiplication();
        assertEquals(expectedResult, actualResult);
    }


    // ----------------------------------------------------------
    /**
     * Test case to check multiplication with two digit numbers.
     */
    @Test
    public void testPerformMultiplicationWith2DigitNumbers() {
        String num1 = "25";
        String num2 = "25";
        multiplication = new Multiplication(num1, num2);
        String expectedResult = "625";
        String actualResult = multiplication.performMultiplication();
        assertEquals(expectedResult, actualResult);
    }


    // ----------------------------------------------------------
    /**
     * Test case to check multiplication with small numbers.
     */
    @Test
    public void testPerformMultiplicationWithSmallNumbers() {
        String num1 = "321";
        String num2 = "654";
        multiplication = new Multiplication(num1, num2);
        String expectedResult = "209934";
        String actualResult = multiplication.performMultiplication();
        assertEquals(expectedResult, actualResult);
    }


    // ----------------------------------------------------------
    /**
     * Test case to check multiplication with large numbers.
     */
    @Test
    public void testPerformMultiplicationWithLargeNumbers() {
        String num1 = "10203040";
        String num2 = "50607080";
        multiplication = new Multiplication(num1, num2);
        String expectedResult = "516346061523200";
        String actualResult = multiplication.performMultiplication();
        assertEquals(expectedResult, actualResult);
    }


    // ----------------------------------------------------------
    /**
     * Test case to check multiplication with numbers of different sizes.
     */
    @Test
    public void testPerformMultiplicationWithDifferentSizeNumbers() {
        String num1 = "123";
        String num2 = "4567";
        multiplication = new Multiplication(num1, num2);
        String expectedResult = "561741";
        String actualResult = multiplication.performMultiplication();
        assertEquals(expectedResult, actualResult);

    }

}
