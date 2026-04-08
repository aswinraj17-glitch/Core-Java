import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] emails = new String[n];

        for (int i = 0; i < n; i++) {
            emails[i] = sc.nextLine();
        }

        int validCount = 0;
        int invalidCount = 0;

        System.out.println("Email Validation Results:");

        for (int i = 0; i < n; i++) {
            if (isValidEmail(emails[i])) {
                System.out.println((i + 1) + ". " + emails[i] + " - Valid");
                validCount++;
            } else {
                System.out.println((i + 1) + ". " + emails[i] + " - Invalid");
                invalidCount++;
            }
        }

        System.out.println("Total Valid: " + validCount);
        System.out.println("Total Invalid: " + invalidCount);
        sc.close();
    }

    public static boolean isValidEmail(String email) {
        // Basic email validation using regex
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regex);
    }
}
