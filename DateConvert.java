import java.util.Scanner;

public class DateConvert {
    public  void DateConvertion(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a short date in the format YYYY-MM-DD: ");
        String shortDate = scanner.nextLine();

        String[] parts = shortDate.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        String monthName = getMonthName(month);
        String fullDate = monthName + " " + day + ", " + year;

        System.out.println(fullDate);

        scanner.close();
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1];
    }
}