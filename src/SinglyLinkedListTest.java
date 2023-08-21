import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

// -------------------------------------------------------------------------
/**
 * The SinglyLinkedListTest class contains unit tests for the SinglyLinkedList
 * class.
 *
 * @author Akhil
 * @version 21-Jul-2023
 */
public class SinglyLinkedListTest {
    private SinglyLinkedList<Integer> linkedList;

    // ----------------------------------------------------------
    /**
     * Sets up the test environment before each test case is executed.
     */
    @Before
    public void setUp() {
        linkedList = new SinglyLinkedList<>();
    }


    // ----------------------------------------------------------
    /**
     * Test case to verify that an empty linked list has size 0.
     */
    @Test
    public void testEmptyLinkedListSize() {
        assertEquals(0, linkedList.size());
    }


    // ----------------------------------------------------------
    /**
     * Test case to verify the movement of the current pointer in the linked
     * list.
     */
    @Test
    public void testMoveCurrent() {
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);

        assertEquals(Integer.valueOf(10), linkedList.getCurrentValue());
        linkedList.moveCurrent();
        assertEquals(Integer.valueOf(20), linkedList.getCurrentValue());

    }


    // ----------------------------------------------------------
    /**
     * Test case to verify the insertion of an element at the end of the linked
     * list.
     */
    @Test
    public void testInsertAtEnd() {

        assertTrue(linkedList.insertAtEnd(20));

    }


    // ----------------------------------------------------------
    /**
     * Test case to verify the retrieval of the current element's value in the
     * linked list.
     */
    @Test
    public void testGetCurrentValue() {
        linkedList.insertAtEnd(10);
        assertEquals(Integer.valueOf(10), linkedList.getCurrentValue());

    }


    // ----------------------------------------------------------
    /**
     * Test case to verify the size of the linked list after inserting elements.
     */
    @Test
    public void testSize() {
        assertEquals(0, linkedList.size());

        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        assertEquals(3, linkedList.size());
    }


    // ----------------------------------------------------------
    /**
     * Test case to verify that the current pointer is reset to the head of the
     * linked list.
     */
    @Test
    public void testResetCurrent() {

        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.resetCurrent();

        assertEquals(Integer.valueOf(1), linkedList.getCurrentValue());
    }

}
