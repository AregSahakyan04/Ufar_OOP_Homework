import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter length and radius: ");
        float length = input.nextFloat();
        float radius = input.nextFloat();
        
        double area =  radius * radius * 3.14;
        double volume = area * length;
        
        System.out.println("Area = " + area + "\n" + "Vulume = " + volume);
    }
}
