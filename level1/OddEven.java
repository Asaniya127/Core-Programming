import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<1){
            System.out.println("Invalid Input");
            return;
        }
        int[] numbers = new int[n];
        int size = (n/2)+1;
        int[] even = new int[size];
        int[] odd = new int[size];
        int Evenindex = 0;
        int oddindex = 0;
        for (int i = 1; i <= n; i++) {
            if (i%2==0){
                even[Evenindex] = i;
                Evenindex++;
            }else{
                odd[oddindex] = i;
                oddindex++;
            }
        }
        System.out.print("Even Numbers : ");
        for(int i=0;i<Evenindex;i++){
            System.out.print(even[i]+" ");
        }
        System.out.print("\nOdd Numbers : ");
        for(int i=0;i<oddindex;i++){
            System.out.print(odd[i]+" ");
        }
    }

}
