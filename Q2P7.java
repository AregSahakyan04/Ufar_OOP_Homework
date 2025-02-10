import java.util.Scanner;

public class Q2P7 {
    public static void main(String[] args) {
        final int MinInHour = 60;
        final int HourInDay = 24;
        final int DayInYear = 365;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        
        int NumMin = input.nextInt();
        int NumYear = NumMin / MinInHour / HourInDay / DayInYear;
        int NumDay = NumMin / MinInHour / HourInDay % DayInYear;
        
        System.out.println(NumMin + " minutes is equal to " + NumYear + " years and " + NumDay + " days");
    }
}
