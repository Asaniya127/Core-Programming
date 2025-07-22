import java.util.Scanner;

public class ConvertKilometertoMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Kilometers: ");
        int Kilometers = input.nextInt();
        double Miles = Kilometers*(0.621371);
        System.out.println("The miles of the given Kilometers is : " + Miles);
    }
}
