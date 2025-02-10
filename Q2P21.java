import java.util.Scanner;

public class Q2P21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = in.nextDouble();
        
        System.out.print("Enter annual interest rate in percentage: ");
        double monthInterestRate = in.nextDouble();
        
        System.out.print("Enter number of years: ");
        double years = in.nextInt();
        
        years *= 12;
        monthInterestRate /= 1200; //Convert from yearly to monthly and from percent to decimal
        
        System.out.println("Accumulated Value is " + investmentAmount * Math.pow(monthInterestRate + 1, years));
        in.close();

    }
}
