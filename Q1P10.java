public class main {
    public static void main(String[] args) {

        double distanceKilometers = 14.0;
        double timeMinutes = 45.0;
        double timeSeconds = 30.0;
        double kilometersToMiles = 1.6;

        double distanceMiles = distanceKilometers / kilometersToMiles;

        double timeHours = (timeMinutes + timeSeconds / 60.0) / 60.0;

        double averageSpeed = distanceMiles / timeHours;

        System.out.println(averageSpeed);
    }
}
