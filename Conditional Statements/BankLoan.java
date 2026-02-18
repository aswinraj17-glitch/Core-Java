import java.util.Scanner;

public class BankLoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int creditScore = sc.nextInt();
        double annualIncome = sc.nextDouble();
        double debtToIncomeRatio = sc.nextDouble();
        sc.nextLine(); 
        String loanType = sc.nextLine();

        System.out.println("Credit Score: " + creditScore);
        System.out.println("Annual Income: $" + annualIncome);
        System.out.println("Debt-to-Income Ratio: " + debtToIncomeRatio + "%");
        System.out.println("Loan Type: " + loanType);
        if (creditScore >= 300 && creditScore <= 850) {
            if (debtToIncomeRatio >= 0 && debtToIncomeRatio <= 100) {
                if (creditScore >= 750 && debtToIncomeRatio <= 35 && annualIncome >= 50000) {
                    System.out.println("Decision: Approved");
                    double maxLoan = annualIncome * 4;
                    System.out.println("Maximum Loan Amount: $" + maxLoan);
                } else if (creditScore >= 650 && debtToIncomeRatio <= 45) {
                    System.out.println("Decision: Needs Review");
                } else {
                    System.out.println("Decision: Rejected");
                }

            } else {
                System.out.println("Decision: Rejected");
            }

        } else {
            System.out.println("Decision: Rejected");
        }

        sc.close();
    }
}