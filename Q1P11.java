public class main {
    public static void main(String[] args) {
        int currentPopulation = 312032486;
        int secondsInYear = 365 * 24 * 60 * 60;

        double birthsPerYear = secondsInYear / 7.0;
        double deathsPerYear = secondsInYear / 13.0;
        double immigrantsPerYear = secondsInYear / 45.0;

        double populationChangePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;

        System.out.println("current population: " + currentPopulation);
        for (int year = 1; year <= 5; year++) {
            currentPopulation += populationChangePerYear;
            System.out.println("Year " + year + " population: " + currentPopulation);
        }
    }
}
