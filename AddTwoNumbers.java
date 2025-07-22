import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("The value of number1 is : " + num1);
        int num2 = input.nextInt();
        System.out.println("The value of number2 is : " + num2);
        int num3 = num1 + num2;
        System.out.print("The sum of two numbers is : " + num3);
    }
}
