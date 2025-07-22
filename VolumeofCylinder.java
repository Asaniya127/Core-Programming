import java.util.Scanner;

public class VolumeofCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.println("The value of radius is : " + radius);
        double height = input.nextDouble();
        System.out.println("The value of height is : " + height);
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.print("The volume of the cylinder is : " + volume);
    }
}
