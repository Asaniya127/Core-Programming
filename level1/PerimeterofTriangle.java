import java.util.Scanner;

public class PerimeterofTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        int Rounds = calculateRounds(side1, side2, side3);
        System.out.println("Rounds: " + Rounds);

    }
    public static int calculateRounds(int side1,int side2,int side3){
        int perimeter = side1 + side2 + side3;
        int distance = 5000;
        int Rounds = distance/perimeter;
        return Rounds;
    }
}
