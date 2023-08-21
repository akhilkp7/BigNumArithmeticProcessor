// -------------------------------------------------------------------------
/**
 * The Add class represents an addition operation on two large numbers
 * represented as a LinkedList
 * It takes two numeric strings as input convert them to LinkedList
 * representation and performs addition on them, returning the result as a
 * string.
 *
 * @author Akhil
 * @version 21-Jul-2023
 */
public class Add {
    private SinglyLinkedList<String> num1 = new SinglyLinkedList<String>();
    private SinglyLinkedList<String> num2 = new SinglyLinkedList<String>();
    private SinglyLinkedList<String> ans = new SinglyLinkedList<String>();
    private StringBuilder result;

    // ----------------------------------------------------------
    /**
     * Constructs an Add object with two numeric strings.
     * The constructor converts the input strings to a custom SinglyLinkedList
     * of digits in reverse order.
     * Each string character is inserted as a separate node in the linked list.
     *
     *
     * @param str1
     *            The first numeric string to be added.
     * @param str2
     *            The second numeric string to be added.
     */
    public Add(String str1, String str2) {
        result = new StringBuilder();
        for (int i = str1.length() - 1; i >= 0; i--) {

            num1.insertAtEnd(String.valueOf(str1.charAt(i)));
        }
        for (int i = str2.length() - 1; i >= 0; i--) {

            num2.insertAtEnd(String.valueOf(str2.charAt(i)));
        }
    }


    // ----------------------------------------------------------
    /**
     * Performs addition on the two numeric strings represented by the Add
     * object.
     *
     * @return The sum of the two numeric strings as a string.
     */
    public String performAddition() {
        int length = Math.max(num1.size(), num2.size());
        int carry = 0;
        for (int i = 0; i < length; i++) {
            int digit1 = 0;
            int digit2 = 0;
            try {
                digit1 = Integer.parseInt(num1.getCurrentValue());
                num1.moveCurrent();
            }
            catch (Exception e) {
                e.equals(e);
            }
            try {
                digit2 = Integer.parseInt(num2.getCurrentValue());
                num2.moveCurrent();
            }
            catch (Exception e) {
                e.equals(e);
            }
            int sum = digit1 + digit2 + carry;
            ans.insertAtEnd(String.valueOf(sum % 10));
            carry = sum / 10;
        }

        while (carry != 0) {
            ans.insertAtEnd(String.valueOf(carry % 10));
            carry /= 10;
        }

        for (int i = 0; i < ans.size(); i++) {
            result.insert(0, ans.getCurrentValue());
            ans.moveCurrent();
        }
        return result.toString();
    }
}
