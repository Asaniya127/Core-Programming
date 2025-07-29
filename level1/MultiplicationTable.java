import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step a: Get input number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = input.nextInt();
        int[] table = new int[10]; // Array to store multiplication results from 1 to 10

        // Step b: Store results in the array
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        // Step c: Display the results
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close(); // Good practice to close Scanner
    }
}
