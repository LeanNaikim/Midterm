import java.util.Scanner;

public class ShortDateConverter {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a short date
        System.out.print("input:    ");
        String shortDate = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Split the short date into year, month, and day
        String[] dateParts = shortDate.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        // Convert month number to month name
        String monthName = getMonthName(month);

        // Display the full date representation
        System.out.println("output: " + monthName + " " + day + ", " + year);
    }

    // Helper method to convert month number to month name
    private static String getMonthName(int month) {
        String[] monthNames = {
                "", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        // Check if the month number is valid
        if (month >= 1 && month <= 12) {
            return monthNames[month];
        } else {
            return "Invalid Month";
        }
    }
}
