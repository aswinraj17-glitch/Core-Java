import java.util.Scanner;

public class GymMembershipCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String membershipTier=sc.nextLine();
        int contractMonths=sc.nextInt();
        sc.nextLine(); 
        String accessLevel=sc.nextLine();
        String addOns=sc.nextLine();
        double baseFee=0;
        int discountPercent=0;
        double accessFee=0;
        double addOnFee=0;

        if(membershipTier.equals("Basic")) {
            baseFee=40;
        } else if(membershipTier.equals("Premium")) {
            baseFee=80;
        } else if(membershipTier.equals("Elite")) {
            baseFee=120;
        } else if(membershipTier.equals("VIP")) {
            baseFee=150;
        }

        if(contractMonths==1) {
            discountPercent=0;
        } else if(contractMonths==6) {
            discountPercent=10;
        } else if(contractMonths==12) {
            discountPercent=15;
        } else if(contractMonths==24) {
            discountPercent=25;
        }

        if(accessLevel.equals("Single-Location")) {
            accessFee=0;
        } else if(accessLevel.equals("Regional")) {
            accessFee=20;
        } else if(accessLevel.equals("Nationwide")) {
            accessFee=50;
        }

        if(addOns.equals("None")) {
            addOnFee=0;
        } else if(addOns.equals("Personal-Training")) {
            addOnFee=100;
        } else if(addOns.equals("Classes")) {
            addOnFee=50;
        } else if(addOns.equals("Full-Package")) {
            addOnFee=200;
        }

        double discountedBase=baseFee*(1-discountPercent/100.0);
        double monthlyTotal=discountedBase+accessFee+addOnFee;
        double contractTotal=monthlyTotal*contractMonths;

        double originalMonthly=baseFee+accessFee+addOnFee;
        double savings=(originalMonthly*contractMonths)-contractTotal;
        
        String category;
        if(monthlyTotal<=50) {
            category="Budget";
        } else if(monthlyTotal<=120) {
            category="Standard";
        } else if(monthlyTotal<=200) {
            category="Premium";
        } else{
            category="Luxury";
        }


        System.out.println("Membership Tier: " + membershipTier);
        System.out.println("Contract Length: " + contractMonths + " months");
        System.out.println("Access Level: " + accessLevel);
        System.out.println("Add-Ons: " + addOns);
        System.out.println("Base Monthly Fee: $" + baseFee);
        System.out.println("Contract Discount: " + discountPercent + "%");
        System.out.println("Access Fee: $" + accessFee);
        System.out.println("Add-On Fee: $" + addOnFee);
        System.out.println("Monthly Total: $" + monthlyTotal);
        System.out.println("Contract Total: $" + contractTotal);
        System.out.println("Savings vs Month-to-Month: $" + savings);
        System.out.println("Membership Category: " + category);

        sc.close();
    }
}