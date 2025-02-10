import java.util.Scanner;

public class Q2P11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years to display the population: ");

        int NumYear = input.nextInt();
        double SecYear = 365 * 24 * 60 * 60;
        int Population = 312_032_486;
        
        int births = (int) SecYear / 7;
        int deaths = (int) SecYear / 13;
        int immigrantr = (int) SecYear / 45;
        
        for (int i = 1; i <= NumYear; i++) {
            Population += births + immigrant - deaths;
        }
        
        System.out.println("The population in " + numYear + " is " + Population);
    }
}
