import java.util.Scanner;

public class SeasonExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month name (for example december, january, ..): ");
        String month = scanner.nextLine().trim().toLowerCase();

        String season;
        switch (month) {
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
                season = "Invalid month! Enter valid month name.";
        }

        System.out.println("Season is: " + season);
        scanner.close();
    }
}
