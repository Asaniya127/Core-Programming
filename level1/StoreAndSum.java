import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        System.out.println("Enter the numbers : ");
        while(true){
            double entry = sc.nextDouble();
            if(entry <= 0){
                break;
            }
            if(index == 10){
                break;
            }
            numbers[index] = entry;
            index++;
        }
        for(int i = 0; i < numbers.length; i++){
            total+=numbers[i];
        }
        System.out.println("The sum is " + total);

    }
}
