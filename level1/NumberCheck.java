import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int result = NumberCheck(N);
        System.out.println(result);
    }
    public static int NumberCheck(int N){
        if(N == 0){
            return 0;
        }
        else if(N<0){
            return -1;
        }
        else {
            return 1;
        }
    }
}
