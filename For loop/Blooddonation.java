import java.util.Scanner;

public class Blooddonation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int eligiblecount=0;
        int rejectedcount=0;

        for(int i=0;i<n;i++){
            String donorName=sc.next();
            int age=sc.nextInt();
            double weight=sc.nextDouble();
            double hemoglobin=sc.nextDouble();
            String status="";
            String reason="";
            if(age>=18 && age<=65){
                if(weight>=50){
                    if(hemoglobin>=12.5){
                        status="Eligible";
                    }
                    else{
                        status="Not Eligible";
                        reason="Hemoglobin below 12.5 g/dL";

                    }
                }
                else{
                    status="Not Eligible";
                    reason="Weight below 50kg";
                }
            }
            else{
                status="Not Eligible";
                reason="age below 18 years";
            }
            
            
            System.out.println("Donor : "+donorName);
            System.out.println("Age : "+age+" years");
            System.out.println("Weight : "+weight+" kg");
            System.out.println("Hemoglobin : "+hemoglobin+" g/dL");
            System.out.println("Status : "+status);
            if(status.equals("Eligible")){
                eligiblecount++;
            }
            else if(status.equals("Not Eligible")){
                rejectedcount++;
                System.out.println("Reason : "+reason);
            }
            
        }
        double eligiblerate=(double)eligiblecount/n*100.0;
        System.out.println("Total Donors : "+n);
        System.out.println("Eligiblle Donors : "+eligiblecount);
        System.out.println("Rejected Donors : "+rejectedcount);
        System.out.println("Eligibility Rate : "+eligiblerate+"%");

    }
}
