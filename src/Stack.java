import java.util.EmptyStackException;

// -------------------------------------------------------------------------
/**
 * A generic stack implementation.
 *
 * @param <E>
 *            the type of elements in the stack.
 *
 * @author Akhil
 * @version 21-Jul-2023
 */
public class Stack<E> {
    private Node<E> top;
    private int size;

    // ----------------------------------------------------------
    /**
     * Constructs an empty stack.
     */
    public Stack() {
        top = null;
        size = 0;
    }


    // ----------------------------------------------------------
    /**
     * Checks whether the stack is empty or not.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return top == null;
    }


    // ----------------------------------------------------------
    /**
     * Returns the number of elements in the stack.
     *
     * @return the size of the stack.
     */
    public int size() {
        return size;
    }


    // ----------------------------------------------------------
    /**
     * Pushes an element onto the top of the stack.
     *
     * @param value
     *            the element to be pushed onto the stack.
     */
    public void push(E value) {
        Node<E> newNode = new Node<>(value, top);
        top = newNode;
        size++;
    }


    // ----------------------------------------------------------
    /**
     * Removes and returns the element from the top of the stack.
     *
     * @return the element removed from the top of the stack.
     * @throws EmptyStackException
     *             if the stack is empty.
     */
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        E poppedValue = top.getValue();
        top = top.getNext();
        size--;

        return poppedValue;
    }


    // ----------------------------------------------------------
    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return the element at the top of the stack.
     * @throws EmptyStackException
     *             if the stack is empty.
     */
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.getValue();
    }
}
