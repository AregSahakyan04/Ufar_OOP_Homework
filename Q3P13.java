
import java.util.Scanner;

public class Q3P13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("(0-single filer, 1-married jointly or "
                + "qualifying widow(er), 2-married separately, 3-head of " + "household) Enter the filing status: ");
        int status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        double tax = 0;
        int upBound10 = 0, upBound15 = 0, upBound25 = 0, upBound28 = 0, upBound33 = 0;
        if (status == 0) {
            upBound10 = 8350;
            upBound15 = 33950;
            upBound25 = 82250;
            upBound28 = 171550;
            upBound33 = 372950;
        } else if (status == 1) {
            upBound10 = 16700;
            upBound15 = 67900;
            upBound25 = 137050;
            upBound28 = 208850;
            upBound33 = 372950;
        } else if (status == 2) {
            upBound10 = 8350;
            upBound15 = 33950;
            upBound25 = 68525;
            upBound28 = 104425;
            upBound33 = 186475;
        } else if (status == 3) {
            upBound10 = 11950;
            upBound15 = 45500;
            upBound25 = 117450;
            upBound28 = 190200;
            upBound33 = 372950;
        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }
        if (income <= upBound10)
            tax = income * 0.10;
        else if (income <= upBound15)
            tax = upBound10 * 0.10 + (income - upBound10) * 0.15;
        else if (income <= upBound25)
            tax = upBound10 * 0.10 + (upBound15 - upBound10) * 0.15 + (income - upBound15) * 0.25;
        else if (income <= upBound28)
            tax = upBound10 * 0.10 + (upBound15 - upBound10) * 0.15 + (upBound25 - upBound15) * 0.25
                    + (income - upBound25) * 0.28;
        else if (income <= upBound33)
            tax = upBound10 * 0.10 + (upBound15 - upBound10) * 0.15 + (upBound25 - upBound15) * 0.25
                    + (upBound28 - upBound25) * 0.28 + (income - upBound28) * 0.33;
        else
            tax = upBound10 * 0.10 + (upBound15 - upBound10) * 0.15 + (upBound25 - upBound15) * 0.25
                    + (upBound28 - upBound25) * 0.28 + (upBound33 - upBound28) * 0.33 + (income - upBound33) * 0.35;
        input.close();
        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
    }
}
