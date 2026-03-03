import java.util.Scanner;

public class GynMembership {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int count=0;
        double totalrenewal=0;
        for(int i=0;i<n;i++){
            String memberName=sc.next();
            String membershipType=sc.next();
            int daysUntilExpiry=sc.nextInt();

            int renewalfees=0;
            if(membershipType.equals("Basic")){
                renewalfees=50;
            }
            else if(membershipType.equals("Premium")){
                renewalfees=100;
            }
            else if(membershipType.equals("VIP")){
                renewalfees=200;
            }

            int discount=0;
            if(daysUntilExpiry>45){
                discount=20;
            }
            else if(daysUntilExpiry>=30 && daysUntilExpiry<=45){
                discount=15;
            }
            else if(daysUntilExpiry>=15 && daysUntilExpiry<=29){
                discount=10;
            }
            else if(daysUntilExpiry<15){
                discount=0;
            }

            String priority="";
            if(daysUntilExpiry<10){
                priority="Urgent";
                count++;
            }
            else if(daysUntilExpiry>=10 && daysUntilExpiry<=30){
                priority="High";
            }
            else if(daysUntilExpiry>30){
                priority="Normal";
            }
            double finalfee=(double)renewalfees*(1-discount/100.0);
            totalrenewal+=finalfee;
            System.out.println("Member : "+memberName);
            System.out.println("Membership : "+membershipType);
            System.out.println("Days Until Expiry : "+daysUntilExpiry);
            System.out.println("Renewal Fee : $"+renewalfees);
            System.out.println("Discount : "+discount+"%");
            System.out.println("Fianl Fee : $"+finalfee);
            System.out.println("Priority : "+priority);





        }
        double average=totalrenewal/n;
        System.out.println("Total Member : "+n);
        System.out.println("Urgent Renewals : "+count);
        System.out.println("Total Renewal Revenue : $"+totalrenewal);
        System.out.println("Average Renewal Fee : "+average);
    }
    
}
