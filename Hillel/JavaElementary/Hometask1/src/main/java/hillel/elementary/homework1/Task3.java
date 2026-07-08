/**
 * Task: Calculate Mathematical Expression
 * <p>
 * Description:
 * The program creates three variables: a, b, and c.
 * Any numeric values can be assigned to these variables.
 * The program calculates the result of the expression:
 * |a - b| / (a + b)^3 - sqrt(c)
 * The result is then printed to the console.
 * <p>
 * Example expression:
 * |a - b| / (a + b)^3 - sqrt(c)
 */

package hillel.elementary.homework1;

public class Task3 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;

        double result = evaluateExpression(a, b, c);
        System.out.printf("Result is: %.4f", result);
    }

    public static double evaluateExpression(double a, double b, double c) {
        return Math.abs(a - b) / Math.pow((a + b), 3) - Math.sqrt(c);
    }
}
