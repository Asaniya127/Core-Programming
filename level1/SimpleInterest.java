import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Principal = input.nextDouble();
        double Rate = input.nextDouble();
        int Time = input.nextInt();
        double SimpleInterest = calculateSimpleInterest(Principal,Rate,Time);
        System.out.printf("The Simple Interest is " + SimpleInterest + " for Principal " + Principal + " Rate of Interest" + Rate + " and Time " + Time );

    }
    public static double calculateSimpleInterest(double Principal, double Rate, double Time){

        return (Principal * Rate * Time)/100;

    }
}
