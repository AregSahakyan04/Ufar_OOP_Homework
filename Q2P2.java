import java.util.Scanner;

public class Q2P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the celsius: ");
        double celsius = input.nextDouble();
        
        double farenheit = (9.0/5) * celsius + 32;
        
        System.out.println(celsius + " in Farenheit is equal to " + farenheit);
    }
}
