import java.util.Scanner;

public class restaurentOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        int totalItems=0;
        double totalsubtotal=0;
        double tax=0;
        double serviceCharge=0;
        double grandTotal=0;
        for(int i=0;i<N;i++){
            String itemName=sc.next();
            double price=sc.nextDouble();
            int quantity=sc.nextInt();
            
            double subtotal=price*quantity;
            totalsubtotal+=subtotal;
            totalItems++; 


            tax=totalsubtotal*0.08;
            serviceCharge=totalsubtotal*0.10;
            grandTotal=totalsubtotal+tax+serviceCharge;

            System.out.println("Item : "+itemName);
            System.out.println("Price : $"+price+" x "+quantity);
            System.out.println("Subtotal : "+subtotal);

        }
        System.out.println("Total Items : "+totalItems);
        System.out.println("Subtotal : $"+totalsubtotal);
        System.out.println("Tax (8%) : "+String.format("%.2f", tax));
        System.out.println("Service Charge (10%): "+String.format("%.1f",serviceCharge));
        System.out.println("Grand Total : $"+String.format("%.2f",grandTotal));
        
    }
}
