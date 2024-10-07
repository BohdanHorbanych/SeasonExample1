import java.util.Scanner;

public class SeasonExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month name (for example december, january, ..) or month number (1-12): ");
        String input = scanner.nextLine().trim();

        String season = getSeason(input);

        System.out.println("The season is: " + season);

        scanner.close();
    }

    private static String getSeason(String input) {
        String season = "";

        try {
            int monthNumber = Integer.parseInt(input);

            if (monthNumber < 1 || monthNumber > 12) {
                return "Invalid number. Enter number between 1 and 12.";
            }

            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    season = "Winter";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Spring";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Summer";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Fall";
                    break;
                default:
                    return "Invalid month number.";
            }
        } catch (NumberFormatException e) {
            String monthName = input.toLowerCase();
            switch (monthName) {
                case "december":
                case "january":
                case "february":
                    season = "Winter";
                    break;
                case "march":
                case "april":
                case "may":
                    season = "Spring";
                    break;
                case "june":
                case "july":
                case "august":
                    season = "Summer";
                    break;
                case "september":
                case "october":
                case "november":
                    season = "Fall";
                    break;
                default:
                    return "Incorrect (name or number), enter correctly";
            }
        }

        return season;
    }
}
