

public class Q3P04 {
    public static void main(String[] args) {
        System.out.println("Welcome :)! To the random month generator!");
        int randomMonth = (int) (1 + Math.random() * 12);
        String monthName = "";
        
        switch (randomMonth) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "Feburary";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        System.out.println("The program generated: " + randomMonth + " for " + monthName);
    }
}
