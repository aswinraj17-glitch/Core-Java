import java.util.Scanner;

public class SoftwareLicence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userCount =sc.nextInt();
        sc.nextLine();
        String licenseType =sc.nextLine();
        String supportLevel =sc.nextLine();
        int contractYears =sc.nextInt();

        System.out.println("User count : "+userCount);
        System.out.println("License Type : "+licenseType);
        System.out.println("Support Level : "+supportLevel);
        System.out.println("Contract Duration : "+contractYears+"years");

        double basePrice=0;
        if(licenseType.equals("Standard")){
            basePrice=60;
        }
        else if(licenseType.equals("Professional")){
            basePrice=120;
        }
        else if(licenseType.equals("Enterprise")){
            basePrice=200;
        }
        int volumeDiscount=0;
        if(userCount>=1 &&userCount<=50){
            volumeDiscount=0;
        }
        else if(userCount>=51 &&userCount<=200){
            volumeDiscount=15;
        }
        else if(userCount>=201 &&userCount<=500){
            volumeDiscount=20;
        }
        else if(userCount>=501 &&userCount<=1000){
            volumeDiscount=25;
        }
        else if(userCount>1001){
            volumeDiscount=35;
        }
        double supportfee=0;
        if(supportLevel.equals("Basic")){
            supportfee=10;
        }
        else if(supportLevel.equals("Priority")){
            supportfee=30;
        }
        else if(supportLevel.equals("Premium")){
            supportfee=80;
        }

        int multiyear=0;
        if(contractYears==1){
            multiyear=0;
        }
        else if(contractYears==2){
            multiyear=5;
        }
        else if(contractYears==3){
            multiyear=10;
        }
        else if(contractYears==5){
            multiyear=20;
        }

        double discountedbase=basePrice*(1-volumeDiscount/100);
        double annualPerUser=(discountedbase+supportfee)*(1-multiyear/100);
        double totalAnual=annualPerUser*userCount;
        double contractvalue=totalAnual*contractYears;
        String pricingTier="";
        if(userCount<200){
            pricingTier="Small Business";

        }else if(userCount>=200 && userCount<=1000){
            pricingTier="Mid-Market";
        }
        else if(userCount>1000){
            pricingTier="Enterprise";
        }
        System.out.println("Base Price Per User : $"+basePrice);
        System.out.println("Volume Discount : "+volumeDiscount+"%");
        System.out.println("Support Fee Per User : $"+supportfee);
        System.out.println("Multi-Year Discount : "+multiyear+"%");
        System.out.println("Annual Cost Per User : $"+annualPerUser);
        System.out.println("Total Annual Cost : $"+totalAnual);
        System.out.println("Total Contract Value : $"+contractvalue);
        System.out.println("Pricing Tier : "+pricingTier);
        

    }
}
