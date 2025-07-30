import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();
        if(CheckSpringSeason(month, day)){
            System.out.println("Spring Season");
        }
        else{
            System.out.println("Not Spring Season");
        }

    }
    public static boolean CheckSpringSeason(int month,int day){
        if(month == 3 && day == 20 || month == 6 && day == 20){
            return true;
        }
        else{
            return false;
        }
    }
}
