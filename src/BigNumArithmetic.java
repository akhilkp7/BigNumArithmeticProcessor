import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// -------------------------------------------------------------------------
/**
 * The BigNumArithmetic class provides methods to read a file containing postfix
 * expressions, solve each expression, and print the results to the console.
 *
 * @author Akhil
 * @version 21-Jul-2023
 */

//On my honor:
//
//- I have not used source code obtained from another student,
//or any other unauthorized source, either modified or
//unmodified.
//
//- All source code and documentation used in my program is
//either my original work, or was derived by me from the
//source code published in the textbook for this course.
//
//- I have not discussed coding details about this project with
//anyone other than my partner (in the case of a joint
//submission), instructor, ACM/UPE tutors or the TAs assigned
//to this course. I understand that I may discuss the concepts
//of this program with other students, and that another student
//may help me debug my program so long as neither of us writes
//anything during the discussion or modifies any computer file
//during the discussion. I have violated neither the spirit nor
//letter of this restriction.
public class BigNumArithmetic {

    // ----------------------------------------------------------
    /**
     * The main method reads a file containing postfix expressions, solves each
     * expression, and prints the results to the console.
     *
     * @param args
     *            Command line arguments. The first argument should be the
     *            filepath of the file
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Filepath not specified");
            return;
        }
        String filePath = args[0];

        try {
            processFile(filePath);
        }
        catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }


    // ----------------------------------------------------------
    /**
     * Reads a file containing postfix expressions, solves each expression, and
     * prints the results to the console.
     *
     * @param filePath
     *            The filepath of the file containing the postfix expressions to
     *            be solved.
     * @throws IOException
     *             If an I/O error occurs while reading the file.
     */
    public static void processFile(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                SolvePostfixExpression spe = new SolvePostfixExpression(line);
                String ans = spe.solve();
                if (ans.length() == 0) {
                    continue;
                }
                System.out.println(spe.solve());

            }
        }
    }

}
