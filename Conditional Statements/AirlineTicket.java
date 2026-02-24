import java.util.Scanner;
public class AirlineTicket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bookingClass =sc.nextLine();
        int daysUntilDeparture =sc.nextInt();
        double seatAvailability =sc.nextDouble();
        sc.nextLine();
        String routeType =sc.nextLine();

        System.out.println("Booking Class : "+bookingClass);
        System.out.println("Days Until Departure : "+daysUntilDeparture);
        System.out.println("Seat Availability : "+seatAvailability+"%");
        System.out.println("Route Type : "+routeType);

        double basePrice=0;
        if(bookingClass.equals("Economy")){
            if(routeType.equals("Domestic")){
                basePrice=200;
            }else if(bookingClass.equals("International-Short")){
                basePrice=500;

            }else if(bookingClass.equals("International-Long")){
                basePrice=800;
            }

        }
        else if(bookingClass.equals("Business")){
            if(routeType.equals("Domestic")){
                basePrice=600;
            }else if(bookingClass.equals("International-Short")){
                basePrice=1500;

            }else if(bookingClass.equals("International-Long")){
                basePrice=2500;
            }

        }
        else if(bookingClass.equals("First")){
            if(routeType.equals("Domestic")){
                basePrice=1000;
            }else if(bookingClass.equals("International-Short")){
                basePrice=3000;

            }else if(bookingClass.equals("International-Long")){
                basePrice=5000;
            }

        }
        double demandmultiplier=0;
        String pricingCategory="";
        if(seatAvailability<30 && daysUntilDeparture<14){
            demandmultiplier=1.8;
            pricingCategory="High Demand";

        }else if(seatAvailability<50 && daysUntilDeparture<30){
            demandmultiplier=1.5;
            pricingCategory="High Demand";
        }else if(seatAvailability<60 || daysUntilDeparture >=30 && daysUntilDeparture<=60){
            demandmultiplier=1.0;
            pricingCategory="Moderate";
        }
        else if(seatAvailability>=60 && daysUntilDeparture>60){
            demandmultiplier=0.8;
            pricingCategory="Low Demand";
        }
        double FinalTicketPrice=basePrice*demandmultiplier;
        System.out.println("Base Price: $"+basePrice);
        System.out.println("Demand Multiplier: "+demandmultiplier+"x");
        System.out.println("Final Ticket Price: "+FinalTicketPrice);
        System.out.println("Pricing Category: "+pricingCategory);

        
    
    }
    
}

