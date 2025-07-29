import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step b: Declare array and read values
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the height (in cm or meters) of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i]; // Step c: Add to sum
        }

        // Step d: Calculate mean
        double mean = sum / 11.0;

        // Print the result
        System.out.println("\nThe mean height of the football team is: " + mean);

        input.close(); // Best practice
    }
}
