import java.util.Scanner;

public class movieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String movieFormat=sc.nextLine();
        String showTime=sc.nextLine();
        String seatCategory=sc.nextLine();
        String customerType=sc.nextLine();

        double basePrice=12.0;
        double formatSurcharge=0.0;
        double seatUpgradeFee=0.0;
        int timeAdjustment=0;
        int customerDiscount=0;

        if(movieFormat.equals("2D")) {
            formatSurcharge = 0.0;
        }else if(movieFormat.equals("3D")) {
            formatSurcharge = 5.0;
        } else if(movieFormat.equals("IMAX")) {
            formatSurcharge = 8.0;
        } else if(movieFormat.equals("4DX")) {
            formatSurcharge = 10.0;
        }

        if(seatCategory.equals("Standard")) {
            seatUpgradeFee=0.0;
        } else if(seatCategory.equals("Premium")) {
            seatUpgradeFee=4.0;
        } else if(seatCategory.equals("Recliner")) {
            seatUpgradeFee=7.0;
        }

        if(showTime.equals("Matinee")) {
            timeAdjustment=-30;
        } else if(showTime.equals("Evening")) {
            timeAdjustment=0;
        } else if(showTime.equals("Prime-Time")) {
            timeAdjustment=20;
        } else if(showTime.equals("Late-Night")) {
            timeAdjustment=-20;
        }

        if(customerType.equals("Adult")) {
            customerDiscount=0;
        } else if(customerType.equals("Senior")) {
            customerDiscount=25;
        } else if(customerType.equals("Student")) {
            customerDiscount=15;
        } else if(customerType.equals("Child")) {
            customerDiscount=30;
        }

        double baseWithSurcharges=basePrice+formatSurcharge+seatUpgradeFee;
        double adjustedPrice=baseWithSurcharges*(1+timeAdjustment/100.0);
        double finalPrice=adjustedPrice*(1-customerDiscount/100.0);

        String voucher;
        if(showTime.equals("Matinee") || 
            customerType.equals("Senior") || 
            customerType.equals("Student") || 
            customerType.equals("Child")) {
            voucher="Yes";
        } else {
            voucher="No";
        }

        String pricingCategory;
        if (finalPrice<10) {
            pricingCategory="Value";
        } else if(finalPrice<20) {
            pricingCategory="Standard";
        } else if(finalPrice<30) {
            pricingCategory="Premium";
        } else{
            pricingCategory="Luxury";
        }
        System.out.println("Movie Format: " + movieFormat);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat Category: " + seatCategory);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Base Ticket Price: $" + basePrice);
        System.out.println("Format Surcharge: $" + formatSurcharge);
        System.out.println("Seat Upgrade Fee: $" + seatUpgradeFee);
        System.out.println("Time-Based Adjustment: " + timeAdjustment + "%");
        System.out.println("Customer Discount: " + customerDiscount + "%");
        System.out.printf("Final Ticket Price: $%.2f\n", finalPrice);
        System.out.println("Concession Voucher: " + voucher);
        System.out.println("Pricing Category: " + pricingCategory);

        sc.close();
    }
}