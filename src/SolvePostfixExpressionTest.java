import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

// -------------------------------------------------------------------------
/**
 * The SolvePostfixExpressionTest class contains unit tests for the
 * SolvePostfixExpression class.
 *
 * @author Akhil
 * @version 21-Jul-2023
 */
public class SolvePostfixExpressionTest {

    private SolvePostfixExpression solver;

    // ----------------------------------------------------------
    /**
     * Sets up the test environment before each test method.
     * Instantiates the SolvePostfixExpression object with an empty expression.
     */
    @Before
    public void setUp() {

        solver = new SolvePostfixExpression("");
    }


    // ----------------------------------------------------------
    /**
     * Tests an empty postfix expression.
     */
    @Test
    public void testEmptyExpression() {
        solver = new SolvePostfixExpression("");
        assertEquals("", solver.solve());
    }


    // ----------------------------------------------------------
    /**
     * Tests a simple addition operation in the postfix expression.
     */
    @Test
    public void testSimpleAddition() {
        solver = new SolvePostfixExpression("3 4 +");
        assertEquals("3 4 + = 7", solver.solve());
    }


    // ----------------------------------------------------------
    /**
     * Tests a postfix expression with trailing spaces.
     */
    @Test
    public void testExpressionWithTrailingSpaces() {
        solver = new SolvePostfixExpression("5 6 7 + +  ");
        assertEquals("5 6 7 + + = 18", solver.solve());
    }


    // ----------------------------------------------------------
    /**
     * Tests a multiplication operation in the postfix expression.
     */
    @Test
    public void testMultiplication() {
        solver = new SolvePostfixExpression("3 5 *");
        String result = solver.solve();
        assertEquals("3 5 * = 15", result);
    }


    // ----------------------------------------------------------
    /**
     * Tests an exponentiation operation in the postfix expression.
     */
    @Test
    public void testExponentiation() {
        solver = new SolvePostfixExpression("2 3 ^");
        String result = solver.solve();
        assertEquals("2 3 ^ = 8", result);
    }


    // ----------------------------------------------------------
    /**
     * Tests complex postfix expressions.
     */
    @Test
    public void testComplexExpression() {
        solver = new SolvePostfixExpression(
            "000000056669777     99999911111 + 352324012 + "
                + "03 ^          555557778 *");
        String result = solver.solve();
        assertEquals("56669777 99999911111 + 352324012 + 3 ^ 555557778 * = "
            + "562400792227677956625810678708149922000000", result);

        solver = new SolvePostfixExpression(
            "99999999 990001 * 01119111 55565    33333 + * +  "
                + "88888888              +");
        String result1 = solver.solve();
        assertEquals("99999999 990001 * 1119111 55565 33333 + * + "
            + "88888888 + = 99099674628565", result1);

        solver = new SolvePostfixExpression(
            "123456789 1111111111 * 111119 2111111 9111111 * + *  1 ^");
        String result2 = solver.solve();
        assertEquals(
            "123456789 1111111111 * 111119 2111111 9111111 * + * 1 ^ = "
                + "2638486500477638652325851269760", result2);

        solver = new SolvePostfixExpression("9 1 +     5 *     00000000 +");
        String result3 = solver.solve();
        assertEquals("9 1 + 5 * 0 + = 50", result3);

        solver = new SolvePostfixExpression("999999999  0 *");
        String result4 = solver.solve();
        assertEquals("999999999 0 * = 0", result4);

        solver = new SolvePostfixExpression("9 0 ^");
        String result5 = solver.solve();
        assertEquals("9 0 ^ = 1", result5);

        solver = new SolvePostfixExpression(
            " 5555555 333333 5454353 999999 666666 01 ^ * * +");
        String result6 = solver.solve();
        assertEquals("5555555 333333 5454353 999999 666666 1 ^ * * + = ",
            result6);

        solver = new SolvePostfixExpression(" 3432 3333 9999 + * ^ * * 6666 +");
        String result7 = solver.solve();
        assertEquals("3432 3333 9999 + * ^ * * 6666 + = ", result7);

    }

}
