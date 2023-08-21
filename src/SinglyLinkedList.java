import java.util.*;

// -------------------------------------------------------------------------
/**
 * A generic singly linked list implementation.
 *
 * @param <E>
 *            The type of elements to be stored in the linked list.
 *
 * @author Akhil
 * @version 21-Jul-2023
 */
public class SinglyLinkedList<E> {

    private int size;
    private Node<E> tail;
    private Node<E> current;
    private Node<E> head;

    // ----------------------------------------------------------
    /**
     * Constructs an empty singly linked list.
     */
    public SinglyLinkedList() {
        current = new Node<E>(null);
        tail = current;
        size = 0;
        head = new Node<E>(current);
    }


    // ----------------------------------------------------------
    /**
     * Returns the size of the linked list.
     *
     * @return The number of elements in the linked list.
     */
    public int size() {
        return size;
    }


    // ----------------------------------------------------------
    /**
     * Moves the current node to the next node in the linked list.
     * If the current node is the tail, no movement will occur.
     */
    public void moveCurrent() {
        if (current != tail) {
            current = current.getNext();
        }
    }


    // ----------------------------------------------------------
    /**
     * Inserts an element at the end of the linked list.
     *
     * @param value
     *            The element to be inserted.
     * @return true indicating successful insertion.
     */
    public boolean insertAtEnd(E value) {
        tail.setNext(new Node<E>(null));
        tail.setValue(value);
        tail = tail.getNext();
        size++;
        return true;
    }


    // ----------------------------------------------------------
    /**
     * Retrieves the value of the element at the current node.
     *
     * @return The value of the current element.
     * @throws NoSuchElementException
     *             if the current node is the tail node.
     */
    public E getCurrentValue() throws NoSuchElementException {
        if (current == tail) {

            throw new NoSuchElementException();
        }
        return current.getValue();
    }


    // ----------------------------------------------------------
    /**
     * Resets the current node to the first node.
     */
    public void resetCurrent() {
        current = head.getNext();
    }
}
