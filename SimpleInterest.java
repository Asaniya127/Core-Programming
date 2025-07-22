import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Principal : " );
        int Principal = input.nextInt();
        System.out.println("Enter the value of Time : "  );
        int Time = input.nextInt();
        System.out.println("Enter the value of Rate : "  );
        int Rate = input.nextInt();
        int SI = (Principal*Rate*Time) / 100;
        System.out.println("The simple interest is : " + SI);
    }
}
