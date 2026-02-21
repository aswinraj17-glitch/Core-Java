import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String roomCategory =sc.nextLine();
        String season=sc.nextLine();
        int nightsBooked =sc.nextInt();
        sc.nextLine();
        String loyaltyTier=sc.nextLine();
        System.out.println("Room Category : "+roomCategory);
        System.out.println("Season : "+season);
        System.out.println("Nights Booked : "+nightsBooked);
        System.out.println("Loyalty Tier : "+loyaltyTier);

        double baserate=0;
        if(roomCategory.equals("Standard")){
            baserate=150;
        }
        else if(roomCategory.equals("Deluxe")){
            baserate=300;
        }
        else if(roomCategory.equals("Suite")){
            baserate=500;
        }
        else if(roomCategory.equals("Presidential")){
            baserate=1000;
        }
        double seasonal=0;
        if(season.equals("Off-Peak")){
            seasonal=0.7;
        }
        else if(season.equals("Regular")){
            seasonal=1.0;
        }
        else if(season.equals("Peak")){
            seasonal=1.5;
        }
        else if(season.equals("Holiday")){
            seasonal=2.0;
        }

        int stayDiscount=0;
        if(nightsBooked>=1 && nightsBooked<=4){
            stayDiscount=0;
        }
        else if(nightsBooked>=5 && nightsBooked<=7){
            stayDiscount=5;
        }
        else if(nightsBooked>=8 && nightsBooked<=14){
            stayDiscount=10;
        }
        else if(nightsBooked>15){
            stayDiscount=20;
        }
        int loyaltyDiscount=0;
        if(loyaltyTier.equals("None")){
            loyaltyDiscount=0;
        }
        else if(loyaltyTier.equals("Member")){
            loyaltyDiscount=10;
        }
        else if(loyaltyTier.equals("Gold")){
            loyaltyDiscount=15;
        }
        else if(loyaltyTier.equals("Platinum")){
            loyaltyDiscount=20;
        }
        double seasonalrate=baserate*seasonal;
        double discountedrate=seasonalrate*(1-stayDiscount/100)*(1-loyaltyDiscount/100);
        double totalCost=discountedrate*nightsBooked;

        String upgrades="";
        if(loyaltyTier.equals("Gold") && roomCategory.equals("Deluxe")){
            upgrades="Free Breakfast and spa access";
        }
        else if(loyaltyTier.equals("None") && roomCategory.equals("Standard")){
            upgrades="None";
        }
        else if(loyaltyTier.equals("Platinum") && roomCategory.equals("Presidential")){
            upgrades="Concierge service, airport transfer, and fine dining";
        }
        else if(loyaltyTier.equals("Member") && roomCategory.equals("Suite")){
            upgrades="Free breakfast";
        }
        else if(loyaltyTier.equals("None") && roomCategory.equals("Deluxe")){
            upgrades="None";
        }

        System.out.println("Base Rate Per Night : $"+baserate);
        System.out.println("Seasonal Multiplier : "+seasonal+"x");
        System.out.println("Extended Stay discount : "+stayDiscount+"%");
        System.out.println("Loyalty Discount : "+loyaltyDiscount+"%");
        System.out.println("Nightly Rate : $"+seasonalrate);
        System.out.println("Total Booking Cost : $"+totalCost);
        System.out.println("Complimentary Upgrades : "+upgrades);
        


    }
}
