import java.util.Scanner;

public class Q2P10 {
    public static void main(String[] args) {
        double initialTemp, waterwight, finalTemp, result;

        System.out.println("Enter the weight of the water in Kilograms");
        Scanner input = new Scanner(System.in);
        waterwight = input.nextDouble();
        
        System.out.println("Enter the initial temperature of the water in Celsius");
        Scanner input1 = new Scanner(System.in);
        initialTemp = input1.nextDouble();
        
        System.out.println("Enter the final temperature of the water in Celsius");
        Scanner input2 = new Scanner(System.in);
        finalTemp = input2.nextDouble();

        result = waterwight * (finalTemp - initialTemp) * 4184;
        System.out.println("The energy needed is " + result + " Joules");
    }
}
