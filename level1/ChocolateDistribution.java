import java.util.Scanner;

public class ChocolateDistribution {

    // Method to compute chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;  // Chocolates per child (quotient)
        result[1] = number % divisor;  // Remaining chocolates (remainder)
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Validate input
        if (numberOfChildren == 0) {
            System.out.println("Cannot divide chocolates among 0 children!");
            return;
        }

        // Use method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Output result
        System.out.println("Each child will get " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
