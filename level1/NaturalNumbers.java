import java.util.Scanner;

public class NaturalNumbers {

    // Method to find the sum of n natural numbers using loop
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // add each number to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer (n): ");
        int n = input.nextInt();

        // Check if input is valid
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Call method to calculate sum
            int result = calculateSum(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + result);
        }
    }
}
