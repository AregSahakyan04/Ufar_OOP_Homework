import java.util.Scanner;

public class Q2P06 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        
        int Num = input.nextInt();
        System.out.println(DigSum(Num));
    }
  
    private static int DigSum(int i) {
        int Sum = 0;
        while (i > 0) {
            Sum += (i % 10);
            i /= 10;
        }
        return Sum;
    }
}
