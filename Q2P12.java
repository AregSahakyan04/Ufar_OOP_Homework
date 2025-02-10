import java.util.Scanner;

public class Q2P12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        System.out.print("Enter speed (meters/second) and acceleration (meters/second squared): ");
        
        double speed = input.nextDouble();
        double accel = input.nextDouble();
        a = Math.pow(speed, 2) / (2 * accel);
      
        System.out.println("The length of runway need is: " + a );
    }
}
