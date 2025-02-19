
import java.util.Scanner;

public class Q3P05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Enter an integer for today's day of the week (Sunday is 0, Monday is 1, and Saturday is 6): ");
        
        int weekDay = input.nextInt();
        
        if (weekDay > 6 || weekDay < 0) {
            System.out.println("Incorrect value....Please try again and enter an integer 0 through 6: ");
            input.close();
        } 
        else {
            System.out.print("Enter the number of days after today to discover the future day: ");
            int numDays = input.nextInt();
            
            int futureWeekDay = (weekDay + numDays) % 7;
            String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            System.out.println(daysOfWeek[futureWeekDay]);
            
            input.close();
        }
    }
}
