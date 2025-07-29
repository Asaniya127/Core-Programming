import java.util.Scanner;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentAges = new int[10];

        System.out.println("Enter 10 student ages: ");
        for (int i = 0; i < studentAges.length; i++) {
            studentAges[i] = input.nextInt();
        }

        System.out.println("Voting Eligibility:");
        for (int i = 0; i < studentAges.length; i++) {
            if (studentAges[i] < 0) {
                System.out.println("Invalid age  " + (i+1));
            } else if (studentAges[i] >= 18) {
                System.out.println("Student " + (i+1) + " with age " + studentAges[i] + " can vote.");
            } else {
                System.out.println("Student " + (i+1) + " with age " + studentAges[i] + " cannot vote.");
            }
        }

        input.close();
    }
}
