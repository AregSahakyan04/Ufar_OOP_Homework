import java.util.Scanner;

public class Q2P14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your weight in pounds: ");
        double weightInpounds = input.nextDouble();
        
        System.out.print("Please enter you height in inches: ");
        
        double heightInInches = input.nextDouble();
        double weightInkilograms = weightInpounds * 0.45359237;
        double heightInmeters = heightInInches * 0.0254;
        double metersFactor = Math.pow(heightInmeters, 2);
        
        System.out.println("Your BMI is: " + weightInkilograms / metersFactor);
        input.close();
    }
}
