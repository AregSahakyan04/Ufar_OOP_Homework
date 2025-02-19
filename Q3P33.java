import java.util.*;

public class Q3P33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter weight(Integer) and price(Float) for package 1: ");
        int weightP1 = in.nextInt();
        double p1 = in.nextDouble();
        
        System.out.print("\nEnter weight and price for package 2: ");
        int weightP2 = in.nextInt();
        double p2 = in.nextDouble();
        
        int low = 0, high = 0, lcm = 0;
        String betterPrice = "";
        
        if (weightP1 <= 0 || weightP2 <= 0) {
            System.out.println("Weight must be a positive number. ");
        } 
        else if (p1 <= 0 || p2 <= 0) {
            System.out.println("Price must be a positive number. ");
        } 
        else {
            if (weightP1 > weightP2) {
                low = weightP2;
                high = weightP1;
            } 
            else if (weightP1 < weightP2) {
                low = weightP1;
                high = weightP2;
            } 
            else {
                betterPrice += (p1 < p2 ? "1" : "2");
                System.out.println("Package " + betterPrice + " has a better price.");
                System.exit(0);
            }
            
            lcm = high;
            
            while (lcm % low != 0) {
                lcm += high;
            }
            
            int adjustP1 = lcm / weightP1;
            int adjustP2 = lcm / weightP2;
            double adjustedPrice1 = p1 * adjustP1;
            double adjustedPrice2 = p2 * adjustP2;
            
            betterPrice += adjustedPrice1 < adjustedPrice2 ? "1" : "2";
        }
        
        System.out.println("Package " + betterPrice + " has a better price.");
    }
}
