import java.util.Scanner;

public class atmWithdrawal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int amount=0;
         boolean flag=true;
         int diff=0;
         System.out.print("Balance : ");
         int balance=sc.nextInt();
        do{
            System.out.print("Enter Withdrawl amount : ");
            int withdrawal =sc.nextInt();
            if(withdrawal>balance){
                System.out.println("Insufficient funds! Try again");
            }
            else if(withdrawal<200){
                System.out.println("Invalid amount! Try again");

            }
            else{
                if(withdrawal<=balance){
                    diff=balance-withdrawal;
                    System.out.println("Withdrawal sucessful! Remaining Balance : "+diff);
                    flag=false;
                    break;

                }
            }

            
        }while(true);


        

    }
    
}
