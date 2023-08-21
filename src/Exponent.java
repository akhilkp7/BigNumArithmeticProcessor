// -------------------------------------------------------------------------
/**
 * The Exponent class calculates the result of raising a number to a given
 * power.
 * It performs the exponentiation operation using repeated squaring algorithm
 * for efficiency.
 *
 * @author Akhil
 * @version 21-Jul-2023
 */
public class Exponent {
    private String power;
    private String number;

    // ----------------------------------------------------------
    /**
     * Constructs an Exponent object with the specified number and power.
     *
     * @param number
     *            The base number to be raised to the power.
     * @param power
     *            The power to which the number will be raised.
     */
    public Exponent(String number, String power) {
        this.power = power;
        this.number = number;
    }


    // ----------------------------------------------------------
    /**
     *
     * Calculates the result of raising the base number to the given power.
     *
     * @return The result of raising the number to the power.
     */
    public String performExpo() {
        int powerAsInt = Integer.parseInt(power);

        String multiplicationHolder = "1";

        // If the power is even, In the repeated squaring algorithm, we first
        // calculate the square of the base number, and then iteratively square
        // the result to achieve exponentiation efficiently.
        if (powerAsInt % 2 == 0) {

            Multiplication mul = new Multiplication(number, number);
            number = mul.performMultiplication();
            for (int i = 0; i < powerAsInt / 2; i++) {
                Multiplication mulLoop = new Multiplication(
                    multiplicationHolder, number);
                multiplicationHolder = mulLoop.performMultiplication();
            }

        }

        // If the power is odd, we first calculate the square of the base
        // number, and then iteratively square the result to achieve
        // exponentiation efficiently.
        // Since the power is odd, we need to account for an extra
        // multiplication at the end.
        else {
            String numberForFinalMultiply = number;
            Multiplication mulOdd = new Multiplication(number, number);
            number = mulOdd.performMultiplication();

            for (int i = 0; i < (powerAsInt - 1) / 2; i++) {
                Multiplication mulOddLoop = new Multiplication(
                    multiplicationHolder, number);
                multiplicationHolder = mulOddLoop.performMultiplication();
            }
            Multiplication finalMul = new Multiplication(multiplicationHolder,
                numberForFinalMultiply);
            multiplicationHolder = finalMul.performMultiplication();
        }
        return multiplicationHolder;
    }
}
