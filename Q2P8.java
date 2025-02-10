import java.util.Scanner;

public class Q2P8 {
    public static void main(String[] arsg) {
        System.out.print("To display the time, enter the time zone: ");
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        
        long totalMls = System.currentTimeMillis();
        long totalSec = totalMls / 1000;
        long currentSec = totalSec % 60;
        long totalMin = totalSec / 60;
        long currentMin = totalMin % 60;
        long totalHours = totalMin / 60;
        long currentHour = totalHours % 24;
        
        currentHour += a;

        System.out.println("Your current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond);
    }
}
