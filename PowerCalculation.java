import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = input.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();
        int Power = (int)Math.pow(base,exponent);
        System.out.println("The power of the given base is : " + Power);
    }
}
