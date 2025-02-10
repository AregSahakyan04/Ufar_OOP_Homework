public class Q1P12 {
    public static void main(String[] args) {

        double distanceMiles = 24.0;
        double timeHours = 1.0;
        double timeMinutes = 40.0;
        double timeSeconds = 35.0;
        double milesToKilometers = 1.6;

        double distanceKilometers = distanceMiles * milesToKilometers;

        double totalTimeHours = timeHours + (timeMinutes / 60.0) + (timeSeconds / 3600.0);

        double averageSpeedKmPerHour = distanceKilometers / totalTimeHours;

        System.out.println(averageSpeedKmPerHour);
    }
}
