import java.util.Scanner;

public class CelsiustoFahrenheitConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Celsius = input.nextDouble();
        System.out.println("The value of Celsius is : " + Celsius);
        double Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println("The value of Fahrenheit is : " + Fahrenheit + "`F");
    }
}
