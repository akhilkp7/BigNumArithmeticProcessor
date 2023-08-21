import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

// -------------------------------------------------------------------------
/**
 * The StackTest class contains unit tests for the Stack class.
 *
 * @author Akhil
 * @version 21-Jul-2023
 */
public class StackTest {

    private Stack<Integer> stack;

    // ----------------------------------------------------------
    /**
     * Sets up the test environment by creating a new Stack instance before each
     * test case.
     */
    @Before
    public void setUp() {
        stack = new Stack<>();
    }


    // ----------------------------------------------------------
    /**
     * It verifies that peek returns the top element of the stack without
     * removing it, and the size remains unchanged.
     */
    @Test
    public void testPeek() {
        stack.push(1);
        stack.push(2);

        assertEquals(Integer.valueOf(2), stack.peek());
        assertEquals(2, stack.size());
    }


    // ----------------------------------------------------------
    /**
     * It checks that the stack is empty after initialization, and it becomes
     * non empty after pushing an element.
     *
     * After popping the element, it should become empty again.
     */
    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }


    // ----------------------------------------------------------
    /**
     * It verifies that the size of the stack is initially 0, and it reflects
     * the correct size after pushing and popping elements.
     */
    @Test
    public void testSize() {
        assertEquals(0, stack.size());

        stack.push(0);
        stack.push(1);
        stack.push(2);
        assertEquals(3, stack.size());

        stack.pop();
        assertEquals(2, stack.size());
    }


    // ----------------------------------------------------------
    /**
     * It checks the behavior of push and pop operations and ensures the stack's
     * size changes accordingly.
     */
    @Test
    public void testPushAndPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.size());

        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());

        assertTrue(stack.isEmpty());
    }

}
