import java.util.Scanner;

public class parkingFee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String locationZone = sc.nextLine();
        double parkingHours = sc.nextDouble();
        sc.nextLine();
        String vehicleType = sc.nextLine();
        String membershipStatus = sc.nextLine();

        double baseHourlyRate = 5.0;
        int zonePremium = 0;
        double vehicleSurcharge = 0.0;
        int membershipDiscount = 0;
        double dailyCap = Double.MAX_VALUE;
        boolean dailyCapApplied = false;

        if (locationZone.equals("Downtown")) {
            zonePremium = 50;
            dailyCap = 150;
        } 
        else if (locationZone.equals("Business-District")) {
            zonePremium = 30;
            dailyCap = 120;
        } 
        else if (locationZone.equals("Residential")) {
            zonePremium = 0;
            dailyCap = 60;
        } 
        else if (locationZone.equals("Airport")) {
            zonePremium = 100;
            dailyCap = 180;
        }

        if (vehicleType.equals("Motorcycle")) {
            vehicleSurcharge = -2.0;
        } 
        else if (vehicleType.equals("Compact")) {
            vehicleSurcharge = 0.0;
        } 
        else if (vehicleType.equals("Sedan")) {
            vehicleSurcharge = 0.0;
        } 
        else if (vehicleType.equals("SUV")) {
            vehicleSurcharge = 3.0;
        } 
        else if (vehicleType.equals("Oversized")) {
            vehicleSurcharge = 5.0;
        }

        double hourlyRate = (baseHourlyRate * (1 + zonePremium / 100.0)) + vehicleSurcharge;
        double calculatedFee = hourlyRate * parkingHours;

        if (membershipStatus.equals("None")) {
            membershipDiscount = 0;
        } 
        else if (membershipStatus.equals("Monthly")) {
            membershipDiscount = 20;
        } 
        else if (membershipStatus.equals("Annual")) {
            membershipDiscount = 25;
        } 
        else if (membershipStatus.equals("VIP")) {
            membershipDiscount = 30;
        }

        double discountedFee = calculatedFee * (1 - membershipDiscount / 100.0);
        double finalFee = discountedFee;

        if (parkingHours >= 24.0) {
            if (discountedFee > dailyCap) {
                finalFee = dailyCap;
                dailyCapApplied = true;
            }
        }

        String rateCategory;
        if (locationZone.equals("Residential")) {
            rateCategory = "Standard";
        } 
        else if (locationZone.equals("Downtown") || 
                 locationZone.equals("Business-District")) {
            rateCategory = "Premium";
        } 
        else {
            rateCategory = "Luxury";
        }

        System.out.println("Location Zone: " + locationZone);
        System.out.println("Parking Duration: " + parkingHours + " hours");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Membership Status: " + membershipStatus);
        System.out.println("Base Hourly Rate: $" + baseHourlyRate);
        System.out.println("Zone Premium: " + zonePremium + "%");
        System.out.println("Vehicle Size Surcharge: $" + vehicleSurcharge);
        System.out.println("Membership Discount: " + membershipDiscount + "%");
        System.out.println("Total Parking Fee: $" + finalFee);
        System.out.println("Daily Cap Applied: " + (dailyCapApplied ? "Yes" : "No"));
        System.out.println("Rate Category: " + rateCategory);

        sc.close();
    }
}
