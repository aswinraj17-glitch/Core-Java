import java.util.Scanner;

public class movieTicket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        double originalTotal=0;
        double finalTotal=0;
        String groupDiscount="";
        double totalDiscount=0;
        for(int i=0;i<n;i++){

            String seatType=sc.next();
            String customerType=sc.next();

            int customerDiscount=0;
            if(customerType.equals("Adult")){
                customerDiscount=0;
            }
            else if(customerType.equals("Child")){
                customerDiscount=30;
                
            }
            else if(customerType.equals("Senior")){
                customerDiscount=25;
                
            }
               double baseprice=0;
            if(seatType.equals("Regular")){
                baseprice=12;
            }
            else if(seatType.equals("Premium")){
                baseprice=18;
            }
            else if(seatType.equals("Recliner")){
                baseprice=25;
            }
            double finalprice=baseprice*(1-customerDiscount/100.0);
            originalTotal+=baseprice;
            finalTotal+=finalprice;

            System.out.println("Ticket "+ i+" : "+seatType+" - "+customerType);
            System.out.println("Base Price : $"+baseprice);
            System.out.println("Discount : "+customerDiscount+"%");
            System.out.println("Final Price : $"+finalprice);


            
        }
        if(n>=5){
            finalTotal=finalTotal*0.10;
            groupDiscount="Yes";
        }else{
            groupDiscount="No";
        }
        totalDiscount=originalTotal-finalTotal;
        System.out.println("Total Tickets : "+n);
        System.out.println("Original Total : $"+originalTotal);
        System.out.println("Total Discount : $"+String.format("%.1f",totalDiscount));
        System.out.println("Final Total : $"+finalTotal);
        System.out.println("Group Dicount Applied : "+groupDiscount);

    }
    
}
