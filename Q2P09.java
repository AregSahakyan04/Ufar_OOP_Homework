import static java.lang.System.*;
import java.util.Scanner;

public class Q2P09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v0, v1, and t: ");

        double v0, v1, t;
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();
        
        double a = (v1 - v0) / t;
        
        System.out.println("The average acceleration is" + a);
    }
}
