import java.util.Scanner;

public class BankTransaction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        double totalDeposits=0;
        double totalWithdrawl=0;
        double totalTransfer=0;
        double totalPayments=0;
        double netBalance=0;
        for(int i=1;i<=n;i++){
            String transactionType=sc.next();
            double amount=sc.nextDouble();

            String category="";
            if(transactionType.equals("Deposit")){
                category="Credit";
                totalDeposits+=amount;
            }
            else if(transactionType.equals("Withdrawal")){
                category="Debit";
                totalWithdrawl+=amount;
            }
            else if(transactionType.equals("Transfer")){
                category="Debit";
                totalTransfer+=amount;
            }
            else if(transactionType.equals("Payment")){
                category="Debit";
                totalPayments+=amount;
            }
            System.out.println("Transaction "+i+" : "+transactionType);
            System.out.println("Amount : $"+amount);
            System.out.println("Category : "+category);
            
            
            
        }
        netBalance=totalDeposits-(totalWithdrawl+totalTransfer+totalPayments);
        System.out.println("Total Transactions : "+n);
        System.out.println("Total Deposits : $"+totalDeposits);
        System.out.println("Total Withdrawals : $"+totalWithdrawl);
        System.out.println("Total Transfers : $"+totalTransfer);
        System.out.println("Total Payments : $"+totalPayments);
        System.out.println("Net Balance Change : $"+netBalance);
    }
    
}
