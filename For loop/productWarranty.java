import java.util.Scanner;

public class productWarranty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int activewarranty=0;
        int Expiredsoon=0;
        int expireswarranty=0;
        for(int i=0;i<n;i++){
            String productID=sc.next();
            String productType=sc.next();
            int monthsSince=sc.nextInt();

            int warrantyperiod=0;
            if(productType.equals("Electronics")){
                warrantyperiod=12;
            }
            else if(productType.equals("Appliance")){
                warrantyperiod=24;
            }
            else if(productType.equals("Computer")){
                warrantyperiod=36;
            }
            int remaining=warrantyperiod-monthsSince;

            String status="";
            if(remaining==0){
                status="Expired";
                expireswarranty++;
            }
            else if(remaining>=1 && remaining<=3){
                Expiredsoon++;
                status="Expired Soon";
            }
            else if(remaining>3){
                activewarranty++;
                status="Active";
            }
            System.out.println("Product ID : "+productID);
            System.out.println("Type : "+productType);
            System.out.println("Warranty Period : "+warrantyperiod+" months");
            System.out.println("Months Used : "+monthsSince);
            System.out.println("Remaining : "+remaining+" months");
            System.out.println("Status : "+status);






        }
        System.out.println("Total Products : "+n);
        System.out.println("Active Warranties : "+activewarranty);
        System.out.println("Expiring Soon : "+Expiredsoon);
        System.out.println("Expired Warranties : "+expireswarranty);
    }
    
}
