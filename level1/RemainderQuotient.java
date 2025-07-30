import java.util.Scanner;

public class RemainderQuotient {

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // result[0] = quotient, result[1] = remainder
        result[0] = number / divisor;     // Quotient
        result[1] = number % divisor;     // Remainder
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take two integer inputs
        System.out.print("Enter the numerator (number): ");
        int number = input.nextInt();

        System.out.print("Enter the denominator (divisor): ");
        int divisor = input.nextInt();

        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }

        // Get the quotient and remainder
        int[] output = findRemainderAndQuotient(number, divisor);

        // Print the results
        System.out.println("Quotient: " + output[0]);
        System.out.println("Remainder: " + output[1]);
    }
}
