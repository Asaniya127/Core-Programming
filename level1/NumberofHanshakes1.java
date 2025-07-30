import java.util.Scanner;

public class NumberofHanshakes1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int numberofHanshakes = (N*(N-1)/2);
        System.out.println(numberofHanshakes);
    }
}
