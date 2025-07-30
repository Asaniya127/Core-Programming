import java.util.Scanner;

public class NumberofHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int numberofHanshakes = NumberofHandshakes(n);
        System.out.println(numberofHanshakes);
    }
    public static int NumberofHandshakes(int n){
        return (n*(n-1))/2;
    }
}
