import java.util.Scanner;

public class TrigonometryCalculator {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert degrees to radians

        double[] result = new double[3];
        result[0] = Math.sin(radians);   // Sine
        result[1] = Math.cos(radians);   // Cosine
        result[2] = Math.tan(radians);   // Tangent

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input angle
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        // Calculate trig functions
        double[] trigValues = calculateTrigonometricFunctions(angle);

        // Print results
        System.out.printf("Sine(%.2f°) = %.4f%n", angle, trigValues[0]);
        System.out.printf("Cosine(%.2f°) = %.4f%n", angle, trigValues[1]);
        System.out.printf("Tangent(%.2f°) = %.4f%n", angle, trigValues[2]);
    }
}
