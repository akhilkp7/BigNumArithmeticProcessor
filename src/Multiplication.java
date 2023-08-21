// -------------------------------------------------------------------------
/**
 * This class represents a multiplication operation between two large numbers,
 * which are provided as strings.
 * It uses a custom implementation of a singly linked list to store and
 * manipulate the numbers.
 *
 * @author Akhil
 * @version 21-Jul-2023
 */
public class Multiplication {
    private SinglyLinkedList<String> num1 = new SinglyLinkedList<String>();
    private SinglyLinkedList<String> num2 = new SinglyLinkedList<String>();

    // ----------------------------------------------------------
    /**
     * Constructs a Multiplication object with two numeric strings.
     * The constructor converts the input strings to a custom SinglyLinkedList
     * of digits in reverse order.
     * Each string character is inserted as a separate node in the linked list.
     *
     * @param str1
     *            The first number as a string.
     * @param str2
     *            The second number as a string.
     */
    public Multiplication(String str1, String str2) {

        for (int i = str1.length() - 1; i >= 0; i--) {
            num1.insertAtEnd(String.valueOf(str1.charAt(i)));
        }
        for (int i = str2.length() - 1; i >= 0; i--) {
            num2.insertAtEnd(String.valueOf(str2.charAt(i)));
        }

    }


    // ----------------------------------------------------------
    /**
     * Performs the multiplication operation on the two numbers.
     *
     * @return The result of the multiplication as a string.
     */
    public String performMultiplication() {

        SinglyLinkedList<String> largeNum;
        SinglyLinkedList<String> smallNum;
        Add add;

        if (num1.size() > num2.size()) {
            largeNum = num1;
            smallNum = num2;

        }
        else {
            largeNum = num2;
            smallNum = num1;
        }

        String tempResult = "";
        for (int i = 0; i < smallNum.size(); i++) {
            int carry = 0;
            int operand1 = Integer.parseInt(smallNum.getCurrentValue());
            String tempStore = "";
            for (int j = 0; j < i; j++) {
                tempStore = "0" + tempStore;
            }
            for (int k = 0; k < largeNum.size(); k++) {
                int operand2 = Integer.parseInt(largeNum.getCurrentValue());
                int tempMultiply = (operand1 * operand2) + carry;
                carry = tempMultiply / 10;
                tempStore = String.valueOf((tempMultiply % 10)) + tempStore;
                largeNum.moveCurrent();
            }
            while (carry != 0) {
                tempStore = String.valueOf((carry % 10)) + tempStore;
                carry = carry / 10;
            }
            add = new Add(tempStore, tempResult);
            tempResult = add.performAddition();
            smallNum.moveCurrent();
            largeNum.resetCurrent();

        }
        return tempResult;

    }
}
