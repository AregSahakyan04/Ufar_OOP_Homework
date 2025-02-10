import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the feet: ");
        
        double feet = input.nextDouble();
        double meter = feet * 0.305;
        
        System.out.println(feet + " is equal to " + meter + " meter");
    }
}
