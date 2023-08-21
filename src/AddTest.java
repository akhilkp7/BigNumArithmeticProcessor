import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// -------------------------------------------------------------------------
/**
 * The AddTest class is responsible for testing the functionality of the Add
 * class, which performs addition operations on two input strings.
 *
 * @author Akhil
 * @version 21-Jul-2023
 */
public class AddTest {

    private Add add;

    // ----------------------------------------------------------
    /**
     * Sets up the test environment before each test case is executed.
     * Initializes the Add instance with empty strings for the operands.
     */
    @Before
    public void setUp() {

        add = new Add("", "");
    }


    // ----------------------------------------------------------
    /**
     *
     * Tests the performAddition() method of the Add class with various
     * scenarios.
     * It checks if the addition result matches the expected value.
     *
     */
    @Test
    public void testPerformAddition() {

        // Test adding two empty strings
        add = new Add("", "");
        Assert.assertEquals("", add.performAddition());

        // Test adding two positive integers
        add = new Add("567", "890");
        Assert.assertEquals("1457", add.performAddition());

        // Test adding zero to a positive integer
        add = new Add("0", "1234");
        Assert.assertEquals("1234", add.performAddition());

        // Test adding two zeros
        add = new Add("0", "0");
        Assert.assertEquals("0", add.performAddition());

        // Test adding two large positive integers of equal length
        add = new Add("123123123", "321321321");
        Assert.assertEquals("444444444", add.performAddition());

        // Test adding a positive integer with 1
        add = new Add("123", "1");
        Assert.assertEquals("124", add.performAddition());

        // Test to check carry
        add = new Add("1", "99");
        Assert.assertEquals("100", add.performAddition());

        // Test adding an empty string to a positive integer
        add = new Add("", "99");
        Assert.assertEquals("99", add.performAddition());

        // Test adding two positive integers of different lengths
        add = new Add("1234", "19100");
        Assert.assertEquals("20334", add.performAddition());

    }
}
