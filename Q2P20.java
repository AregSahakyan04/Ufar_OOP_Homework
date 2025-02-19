import java.util.Scanner;

public class Q2P20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate: (e.g., 3 for 3%): ");
        
        double balance = input.nextDouble();
        double rate = input.nextDouble();
        double interest = balance * (rate / 1200);
        double roundedInterest = Math.round(interest * 100000) / 100000.0;
        
        System.out.println("The interest rate is: " + roundedInterest);
        
        input.close();
    }
}
