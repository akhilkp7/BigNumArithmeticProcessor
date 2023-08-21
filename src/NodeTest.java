import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

// -------------------------------------------------------------------------
/**
 * The NodeTest class contains test cases for the Node class, which represents a
 * basic node in a linked list and stack
 *
 * @author Akhil
 * @version 21-Jul-2023
 */
public class NodeTest {

    private Node<Integer> node1;
    private Node<Integer> node2;

    // ----------------------------------------------------------
    /**
     * Sets up the test environment before each test case.
     */
    @Before
    public void setUp() {
        node1 = new Node<>(1, null);
        node2 = new Node<>(2, node1);
    }


    // ----------------------------------------------------------
    /**
     * Test case to verify that the getValue method returns the correct value of
     * the node.
     */
    @Test
    public void testGetValue() {

        assertEquals(Integer.valueOf(1), node1.getValue());
    }


    // ----------------------------------------------------------
    /**
     * Test case to verify that the setValue method sets the value of the node
     * correctly.
     */
    @Test
    public void testSetValue() {

        node1.setValue(2);
        assertEquals(Integer.valueOf(2), node1.getValue());
    }


    // ----------------------------------------------------------
    /**
     * Test case to verify that the getNext method returns the correct reference
     * to the next node.
     */
    @Test
    public void testGetNext() {
        assertEquals(node1, node2.getNext());
    }


    // ----------------------------------------------------------
    /**
     * Test case to verify that the setNext method sets the next node reference
     * correctly.
     */
    @Test
    public void testSetNext() {

        node1.setNext(node2);
        assertEquals(node2, node1.getNext());
    }

}
