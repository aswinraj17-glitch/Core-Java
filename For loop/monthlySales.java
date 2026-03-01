import java.util.Scanner;
public class monthlySales {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double highest=0;
        // double totalSales=0;
        int totalSalesrep=0;
        // double totalcommission=0;
        double totalsales=0;
        double totalcomission=0;
        String topPerformer="";
        for(int i=0;i<n;i++){
            String repName=sc.next();
            
            double salesAmount=sc.nextDouble();

            int commissionrate=0;
            if(salesAmount>=0 && salesAmount<=40000){
                commissionrate=5;
            }
            else if(salesAmount>=40001 && salesAmount<=80000){
                commissionrate=8;
            }
            else if(salesAmount>=80001 && salesAmount<=100000){
                commissionrate=10;
            }
            else if(salesAmount>=100001 && salesAmount<=150000){
                commissionrate=12;
            }
            else if(salesAmount>150000){
                commissionrate=15;
            }
            double commission=0;
            commission=salesAmount*(commissionrate/100.0);
            double bonus=0;
            if(salesAmount>=100000){
                bonus=2000;
            }
            else if(salesAmount>=150000){
                bonus=3000;
            }
            double totalpayot=commission+bonus;
            if(salesAmount>highest){
                highest=salesAmount;
                topPerformer=repName;
            }
            totalsales=totalsales+salesAmount;
            totalcomission=totalcomission+commission;
        
            System.out.println("Sales Rep : "+repName);
            System.out.println("Sales Amount : $"+salesAmount);
            System.out.println("Commission Rate : "+commissionrate+"%");
            System.out.println("Commission Earned : $"+commission);
            System.out.println("Bonus : $"+bonus);
            System.out.println("Total Payout : "+totalpayot);
            

        }
        System.out.println("Total Sales Reps : "+totalSalesrep);
        System.out.println("Total Sales : $"+totalsales);
        System.out.println("Total Commission : $"+totalcomission);
        System.out.println("Top Performer : "+topPerformer);
    }
    
}
