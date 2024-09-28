import java.util.Scanner;

public class DaysInMonth64 {

    private static final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = -1;
        int year = -1;

        while (month == -1) {
            System.out.print("Enter the month (full name, abbreviation, or number): ");
            String monthInput = scanner.nextLine();
            month = parseMonth(monthInput);
            if (month == -1) {
                System.out.println("Invalid month. Please try again.");
            }
        }

        while (year == -1) {
            System.out.print("Enter the year (non-negative integer): ");
            String yearInput = scanner.nextLine();
            year = parseYear(yearInput);
            if (year == -1) {
                System.out.println("Invalid year. Please enter a valid non-negative integer.");
            }
        }

        int days = getDaysInMonth(month, year);
        System.out.println("Number of days in " + getMonthName(month) + " " + year + ": " + days);
    }

    public static int parseMonth(String input) {
        input = input.trim().toLowerCase();
        switch (input) {
            case "january": case "jan.": case "jan": case "1": return 1;
            case "february": case "feb.": case "feb": case "2": return 2;
            case "march": case "mar.": case "mar": case "3": return 3;
            case "april": case "apr.": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun.": case "jun": case "6": return 6;
            case "july": case "jul.": case "jul": case "7": return 7;
            case "august": case "aug.": case "aug": case "8": return 8;
            case "september": case "sep.": case "sep": case "9": return 9;
            case "october": case "oct.": case "oct": case "10": return 10;
            case "november": case "nov.": case "nov": case "11": return 11;
            case "december": case "dec.": case "dec": case "12": return 12;
            default: return -1; // Invalid input
        }
    }

    public static int parseYear(String input) {
        try {
            int year = Integer.parseInt(input);
            return year >= 0 ? year : -1;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }
}
