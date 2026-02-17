import java.util.Scanner;

public class CreditCard {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int creditLmit=sc.nextInt();
        int purchase=sc.nextInt();
        int card=sc.nextInt();

        
        if(purchase<=creditLmit && card==0){
            System.out.println("Approved");

        }else{
            System.out.println("Declined");
        }
        

        
        
        }
}
