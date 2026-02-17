import java.util.Scanner;

public class AtmWithdraw {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int accBalance=sc.nextInt();
        int Withdraw=sc.nextInt();
        int DailyLimit=sc.nextInt();
        if(Withdraw<=accBalance && Withdraw<=DailyLimit){
            System.out.println("Transaction Approved");

        }else{
            System.out.println("Transaction Denied");

        }
        
        
        }
}
