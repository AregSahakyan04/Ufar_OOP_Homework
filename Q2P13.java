import java.util.Scanner;

public class Q2P13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter monthly deposit amount: ");
        double deposit = input.nextDouble();
        
        double monthlyRate = 0.05 / 12;
        double rateFactor = 1 + monthlyRate;
        
        int months = 6;
        double balance = 0;
        
        while (months > 0) {
            balance = (balance + deposit) * rateFactor;
            months--;
        }
        
        System.out.println("At a 5% annual interest rate, you will have $" + balance + " in your savings account after six months.");
    }
}
