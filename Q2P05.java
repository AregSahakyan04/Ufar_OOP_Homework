import java.util.Scanner;

public class Q2P05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter subtotal and the gratuity rate: ");
        
        double subTotal = input.nextDouble();
        double percentGrat = input.nextDouble();
        double grat = subTotal * (percentGratuity / 100);
        double total = subTotal + gratuity;
        
        System.out.println("The gratuity is: " + grat);
        System.out.println(" and the total including gratuity is: " + total);
    }
}
