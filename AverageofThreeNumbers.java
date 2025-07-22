import java.util.Scanner;

public class AverageofThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();
        System.out.print("Enter number3: ");
        int number3 = input.nextInt();
        double Average = (number1+number2+number3)/3;
        System.out.println("The average of the given numbers is : " + Average);
    }
}
