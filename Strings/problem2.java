import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Password Analysis:");

        for (int i = 0; i < n; i++) {
            String password = sc.nextLine();

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;
            boolean hasSpecial = false;

            // Check each character
            for (int j = 0; j < password.length(); j++) {
                char ch = password.charAt(j);

                if (Character.isUpperCase(ch))
                    hasUpper = true;
                else if (Character.isLowerCase(ch))
                    hasLower = true;
                else if (Character.isDigit(ch))
                    hasDigit = true;
                else
                    hasSpecial = true;
            }

            String result;

            // Strength checking
            if (hasUpper && hasLower && hasDigit && hasSpecial && password.length() >= 6)
                result = "Strong";
            else
                result = "Weak";

            System.out.println((i + 1) + ". " + password + " - " + result);
            
        }
    }
}
