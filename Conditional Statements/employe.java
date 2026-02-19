import java.util.Scanner;

public class employe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int performanceRating = sc.nextInt();
        int yearsOfService = sc.nextInt();
        sc.nextLine(); 
        String departmentType = sc.nextLine();
        double baseSalary = sc.nextDouble();

        double bonusPercentage = 0;
        double bonusAmount = 0;
        String status = "Not Eligible";

        if (performanceRating >= 3) {  
            status = "Eligible";

            if (departmentType.equals("Critical")) {
                if (performanceRating == 5) {
                    bonusPercentage = 25;
                } else if (performanceRating == 4) {
                    bonusPercentage = 20;
                } else {
                    bonusPercentage = 15;
                }
            } else { 
                if (performanceRating == 5) {
                    bonusPercentage = 20;
                } else if (performanceRating == 4) {
                    bonusPercentage = 15;
                } else { 
                    bonusPercentage = 8;
                }
            }
            if (yearsOfService > 10) {
                bonusPercentage += 5;
            }

            bonusAmount = (bonusPercentage / 100) * baseSalary;
        }

        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.println("Department: " + departmentType);
        System.out.println("Bonus Percentage: " + bonusPercentage + "%");
        System.out.println("Bonus Amount: $" + bonusAmount);
        System.out.println("Status: " + status);

        sc.close();
    }
}

