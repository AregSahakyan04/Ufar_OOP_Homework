public class Main {
    public static void main(String[] args) {
        // First approximation
        double pi1 = 4.0 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
        
        // Second approximation
        double pi2 = 4.0 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
        
        // Print results
        System.out.println("First approximation of π: " + pi1);
        System.out.println("Second approximation of π: " + pi2);
    }
}
