import java.util.Scanner;
public class RestaurentOrder {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String orderType =sc.nextLine();
        String loyaltyStatus =sc.nextLine();
        double orderValue =sc.nextDouble();
        sc.nextLine();
        String timeSlot =sc.nextLine();
        System.out.println("OrderType : "+orderType);
        System.out.println("Loyalty Status : "+loyaltyStatus);
        System.out.println("Order Value : $"+orderValue);
        System.out.println("Time Slot : "+timeSlot);

        int baseDiscount=0;
        if(loyaltyStatus.equals("Gold")){
            baseDiscount=15;
        }
        else if(loyaltyStatus.equals("Silver")){
            baseDiscount=10;
        }
        else if(loyaltyStatus.equals("Bronze")){
            baseDiscount=5;
        }
        else if(loyaltyStatus.equals("None")){
            baseDiscount=0;
        }

        int timeBased=0;
        if(timeSlot.equals("Peak")){
            timeBased=0;
        }
        else if(timeSlot.equals("Regular")){
            timeBased=0;
        }
        else if(timeSlot.equals("Late Night")){
            timeBased=-5;
        }
        double serviceFee=0.0;
        if(orderType.equals("Delivery")){
            serviceFee=orderValue*0.10;
        }
        else if(orderType.equals("Takeout")){
            serviceFee=orderValue*0.3;
        }
        else if(orderType.equals("Dine-In")){
            serviceFee=orderValue*0;
        }
        int totaldiscount=baseDiscount+timeBased;
        double discountedValue=orderValue*(1-totaldiscount/100);
        double finalAmount=discountedValue+serviceFee;
        String KitchenPriority="";
        if(timeSlot.equals("Peak") && orderType.equals("Delivery")){
            KitchenPriority="High";
        }
        else if(timeSlot.equals("Regular")){
            KitchenPriority="Medium";
        }
        else if(timeSlot.equals("Late-Night")){
            KitchenPriority="Low";
        }
        System.out.println("Base Discount : "+baseDiscount+"%");
        System.out.println("Time-Based Adjustment : "+timeBased+"%");
        System.out.println("Service Fee : $"+serviceFee);
        System.out.println("Final Amount : $"+finalAmount);
        System.out.println("Kitchen priority : "+KitchenPriority);
        int estimatedTime=0;
        if(orderType.equals("Delivery") && KitchenPriority.equals("High")){
            estimatedTime=25;
        }
        else if(orderType.equals("Dine-In") && KitchenPriority.equals("Medium")){
            estimatedTime=20;
        }
        else if(orderType.equals("Take-Out") && KitchenPriority.equals("Low")){
            estimatedTime=15;
        }
        if(orderType.equals("Delivery") && KitchenPriority.equals("High")){
            estimatedTime=30;
        }
        else if(orderType.equals("Dine-In") && KitchenPriority.equals("Medium")){
            estimatedTime=25;
        }
        System.out.println("Estimated Prep Time : "+estimatedTime+ "minutes");




        }

    }

