
// -------------------------------------------------------------------------
/**
 * Node class used for creating linked list and stack
 *
 * @param <E>
 *            the type of value held by the node
 *
 * @author Akhil
 * @version 21-Jul-2023
 */
public class Node<E> {
    private E value;
    private Node<E> next;

    // ----------------------------------------------------------
    /**
     * Constructs a new Node with the specified value and next node.
     *
     * @param value
     *            the value to be stored in the node
     * @param next
     *            the reference to the next node in the linked list
     */
    Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }


    // ----------------------------------------------------------
    /**
     * Constructs a new Node with the specified next node and a null value.
     *
     * @param next
     *            the reference to the next node in the linked list
     */
    Node(Node<E> next) {
        this.value = null;
        this.next = next;
    }


    // ----------------------------------------------------------
    /**
     * Returns the value stored in this node.
     *
     * @return the value stored in the node
     */
    public E getValue() {
        return value;
    }


    // ----------------------------------------------------------
    /**
     * Sets the value of this node to the specified value.
     *
     * @param value
     *            the new value to be stored in the node
     */
    public void setValue(E value) {
        this.value = value;
    }


    // ----------------------------------------------------------
    /**
     * Returns the reference to the next node in the linked list.
     *
     * @return the reference to the next node
     */
    public Node<E> getNext() {
        return next;
    }


    // ----------------------------------------------------------
    /**
     * Sets the reference to the next node in the linked list.
     *
     * @param next
     *            the new next node in the linked list
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }

}
