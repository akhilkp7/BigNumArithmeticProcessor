import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// -------------------------------------------------------------------------
/**
 * The ExponentTest class is used to test the functionality of the Exponent
 * class.
 * It contains test methods to verify the correctness of the Exponent class
 * methods.
 *
 * @author Akhil
 * @version 21-Jul-2023
 */
public class ExponentTest {
    private Exponent exponent;

    // ----------------------------------------------------------
    /**
     * Sets up the test environment by initializing the Exponent object with
     * base and exponent values.
     */
    @Before
    public void setUp() {
        exponent = new Exponent("2", "2");
    }


    // ----------------------------------------------------------
    /**
     * Test method to verify the performExpo() method for an even power
     * exponent.
     */
    @Test
    public void testPerformExpoEvenPower() {
        String result = exponent.performExpo();
        Assert.assertEquals("4", result);
    }


    // ----------------------------------------------------------
    /**
     * Test method to verify the performExpo() method for an odd power
     * exponent.
     */
    @Test
    public void testPerformExpoOddPower() {
        exponent = new Exponent("3", "3");
        String result = exponent.performExpo();
        Assert.assertEquals("27", result);
    }


    // ----------------------------------------------------------
    /**
     * Test method to verify the performExpo() method for power 1
     * exponent.
     */
    @Test
    public void testPerformExpoPowerOfOne() {
        exponent = new Exponent("5", "1");
        String result = exponent.performExpo();
        Assert.assertEquals("5", result);
    }


    // ----------------------------------------------------------
    /**
     * Test method to verify the performExpo() method for power 0
     * exponent.
     */
    @Test
    public void testPerformExpoPowerOfZero() {
        exponent = new Exponent("4", "0");
        String result = exponent.performExpo();
        Assert.assertEquals("1", result);
    }
}
