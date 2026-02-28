import java.util.Scanner;

public class InventoryStock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int lowStock=0;
        int criticalitems=0;
        double totalrecordQuantity=0;
        for(int i=0;i<n;i++){
            String productName=sc.next();
            int currentStock=sc.nextInt();
            int minimumStock=sc.nextInt();
            String status="";
            if(currentStock>=minimumStock){
                status="Adequate";
            }
            else if(currentStock<minimumStock && currentStock>=minimumStock/2){
                status="Low Stock";
            }
            else if(currentStock<minimumStock/2){
                status="Critical";

            }
            double recordQuantity=0;
            if(status.equals("Adequate")){
                recordQuantity=0;
            }
            else if(status.equals("Low Stock")){
                recordQuantity=(minimumStock-currentStock)+minimumStock/2;
                lowStock++;
            }
            else if(status.equals("Critical")){
                recordQuantity=(minimumStock-currentStock)+minimumStock*1.5;
                criticalitems++;
                
            }
            totalrecordQuantity+=recordQuantity;
            System.out.println("Product : "+productName);
            System.out.println("Current Stock : "+currentStock);
            System.out.println("Minimum Stock : "+minimumStock);
            System.out.println("Status : "+status);
            System.out.println("Recorded Quantity : "+recordQuantity);
        }
        System.out.println("Total Products : "+n);
        System.out.println("Low Stock Items : "+lowStock);
        System.out.println("Critical Items : "+criticalitems);
        System.out.println("Total Recorder Quantity : "+totalrecordQuantity);
    }
    
}
