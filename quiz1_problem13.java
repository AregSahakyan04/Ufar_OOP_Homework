public class Main {
    public static void main(String[] args) {

        double a = 3.4;
        double b = 50.2;
        double e = 44.5;
        double c = 2.1;
        double d = 0.55;
        double f = 5.9;

        double denominator = (a * d) - (b * c);

        if (denominator != 0) {
            
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;

            System.out.printf("The value of x is: " + x);
            System.out.printf("The value of y is: " + y);
        } 
        else {
            System.out.println("There is no solution");
        }
    }
}
