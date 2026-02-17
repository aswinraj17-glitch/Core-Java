import java.util.Scanner;

public class Ecommerce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cartvalue=sc.nextInt();
        System.out.println("Give (0/1) as input :");
        int premiumMember=sc.nextInt();
       

        
        if(cartvalue>999 || premiumMember==1){
            System.out.println("Free Shipping");

        }else{
            System.out.println("shipping chargges applied");
        }
        

        
        
        }
}
