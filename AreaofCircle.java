import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pie = 3.14;
        double radius = input.nextDouble();
        System.out.println("Enter the radius of the circle : " + radius);
        //double radius = input.nextDouble();
        double Area = pie*radius*radius;
        System.out.println("The area of the circle is : " + Area);
    }
}
