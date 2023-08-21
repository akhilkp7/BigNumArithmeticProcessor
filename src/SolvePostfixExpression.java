// -------------------------------------------------------------------------
/**
 * The SolvePostfixExpression class takes a postfix expression as input and
 * evaluates it to obtain the result.
 *
 * @author Akhil
 * @version 21-Jul-2023
 */
public class SolvePostfixExpression {
    private String expression;

    // ----------------------------------------------------------
    /**
     * Constructs a SolvePostfixExpression object with the specified postfix
     * expression.
     *
     * @param expression
     *            The postfix expression to be solved.
     */
    public SolvePostfixExpression(String expression) {
        this.expression = expression.replaceAll("\\s+", " ").trim();
    }


    // ----------------------------------------------------------
    /**
     * Formats the input string.
     *
     * @param input
     *            The input string to be formatted.
     * @return The formatted string.
     */
    private String formatString(String input) {
        String cleanedString = input.replaceAll("^0+(?!$)", "");
        cleanedString = cleanedString.trim();
        return cleanedString;
    }


    // ----------------------------------------------------------
    /**
     * Solves the postfix expression and returns the result.
     *
     * @return The result of the postfix expression evaluation.
     */
    public String solve() {
        if (expression.length() == 0) {
            return "";
        }

        StringBuilder cleanString = new StringBuilder();
        String ans = "";

        try {
            Stack<String> stack = new Stack<>();
            String[] parsedStr = expression.split("\\s+");

            for (int i = 0; i < parsedStr.length; i++) {
                cleanString.append(formatString(parsedStr[i])).append(" ");
            }

            for (int i = 0; i < parsedStr.length; i++) {
                String currentToken = parsedStr[i];
                if (currentToken.equals("+")) {
                    String op2 = stack.pop();
                    String op1 = stack.pop();

                    Add add = new Add(op1, op2);
                    String addResult = add.performAddition();
                    stack.push(addResult);
                }
                else if (currentToken.equals("*")) {
                    String op2 = stack.pop();
                    String op1 = stack.pop();

                    Multiplication mul = new Multiplication(op1, op2);
                    String multiplyResult = mul.performMultiplication();
                    stack.push(multiplyResult);
                }
                else if (currentToken.equals("^")) {
                    String op2 = stack.pop();
                    String op1 = stack.pop();

                    Exponent exp = new Exponent(op1, op2);
                    String result = exp.performExpo();
                    stack.push(result);
                }
                else {
                    stack.push(currentToken);
                }
            }

            if (stack.size() == 1) {
                ans = formatString(stack.pop());
            }
        }
        catch (Exception e) {

            e.equals(e);
        }

        return cleanString.toString() + "= " + ans;

    }

}
