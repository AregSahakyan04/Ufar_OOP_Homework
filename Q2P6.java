import java.util.Scanner;

public class Q2P6 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        System.out.println(DigSum(num));
    }
  
    private static int DigSum(int i) {
        int sum = 0;
        while (i > 0) {
            sum += (i % 10);
            i /= 10;
        }
        return sum;
    }
}
