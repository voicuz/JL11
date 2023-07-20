import java.io.*;

/**
 * This class demonstrates documentation comments.
 * @author Voicu Z.
 * @version 1.0
 */

public class SquareNum {
    /**
     * This method returns the square of num.
     * This is a multiline description. You can use
     * as many lines as you like.
     * @param num The value to be squared.
     * @return num squared.
     */
    public double square(double num) {
        return num * num;
    }

    /**
     * This method inputs a number from the user.
     * @return The number input as a double.
     * @throws IOException On input error.
     * @see IOException
     */
    public double getNumber() throws IOException {
        // create a BufferedReader using System.in
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader inData = new BufferedReader(isr);
        String str;

        str = inData.readLine();
        return (Double.valueOf(str));
    }

    /**
     * This method demonstrates square().
     * @param args Unused.
     * @throws IOException On input error.
     * @see IOException
     */
    public static void main(String[] args)
        throws IOException {
        SquareNum ob = new SquareNum();
        double val;

        System.out.println("Enter value to be squared: ");
        val = ob.getNumber();
        val = ob.square(val);

        System.out.println("Square value is: " + val);
    }
}
