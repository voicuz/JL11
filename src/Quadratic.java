/*
// Find a solution to a quadratic equation.
class Quadratic {
    public static void main(String[] args) {

        // a, b and c represent the coefficients in the
        // quadratic equation: ax2 + bx + c = 0.
        double a, b, c, x;

        // Solve 4x2 + x - 3 = 0 for x.
        a = 4;
        b = 1;
        c = -1;

        // Find first solution.
        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c) / (2 * a));
        System.out.println("First solution: " + x);

        x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c) / (2 * a));
        System.out.println("Second solution: " + x);
    }
}


 */

// Use static import to bring sqrt() and pow() into view.
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.System.out;

class Quadratic {
    public static void main(String[] args) {

        // a, b and c represent the coefficients in the
        // quadratic equation: ax2 + bx + c = 0.
        double a, b, c, x;

        // Solve 4x2 + x - 3 = 0 for x.
        a = 4;
        b = 1;
        c = -1;

        // Find first solution.
        x = (-b + sqrt(Math.pow(b, 2) - 4 * a * c) / (2 * a));
        out.println("First solution: " + x);

        x = (-b - sqrt(Math.pow(b, 2) - 4 * a * c) / (2 * a));
        out.println("Second solution: " + x);
    }
}