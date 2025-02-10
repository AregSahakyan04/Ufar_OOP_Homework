import java.util.Scanner;

public class Q2P4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value of pounds: ");
        
        double lb = input.nextDouble();
        double kg = lb * 0.454;
        
        System.out.println(lb + " pounds is equal to " + kg + " kilograms");
    }
}
