import java.util.Scanner;
public class DayFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String today ="";
        String futureDay = "" ;

        System.out.println("Enter the number of Day today (0-6)");
        int numToday = sc.nextInt();

        if(numToday <= 6 && numToday >= 0){

            System.out.println("Enter the number of Days elapsed from today");
            int elapsedDays = sc.nextInt();

            switch(numToday) {
                case 1:
                    today = "Monday";
                    break;
                case 2:
                    today = "Tuesday";
                    break;
                case 3:
                    today = "Wednesday";
                    break;
                case 4:
                    today = "Thursday";
                    break;
                case 5:
                    today = "Friday";
                    break;
                case 6:
                    today = "Saturday";
                    break;
                case 0:
                    today = "Sunday";
                    break;
            }

            int numFuture = (numToday + elapsedDays) % 7;

            switch(numFuture) {
                case 1:
                    futureDay = "Monday";
                    break;
                case 2:
                    futureDay = "Tuesday";
                    break;
                case 3:
                    futureDay = "Wednesday";
                    break;
                case 4:
                    futureDay = "Thursday";
                    break;
                case 5:
                    futureDay = "Friday";
                    break;
                case 6:
                    futureDay = "Saturday";
                    break;
                case 0:
                    futureDay = "Sunday";
                    break;
            }

            System.out.println("Today is " + today + " and the future day is " + futureDay);

        }else
            System.out.println("You have entered invalid value of day");


    }
}
