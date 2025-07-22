import java.util.Scanner;

public class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of length: ");
        double Length = input.nextDouble();
        System.out.println("Enter the value of width: ");
        double Width = input.nextDouble();
        double Perimeter = 2*(Length+Width);
        System.out.println("The perimeter of the Rectangle is : " + Perimeter);
    }
}
