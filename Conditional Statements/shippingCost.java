import java.util.Scanner;

public class shippingCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double packageWeight =sc.nextDouble();
        sc.nextLine();
        String destinationZone =sc.nextLine();
        String shippingSpeed =sc.nextLine();
        String packageSize  =sc.nextLine();

        System.out.println("Package Weight : "+packageWeight+ "lbs");
        System.out.println("Destination Zone : "+destinationZone);
        System.out.println("Shipping Speed : "+shippingSpeed);
        System.out.println("Package Size : "+packageSize);
  
        double baserate=0;
        if(shippingSpeed.equals("Economy")){
            baserate=5;
        }
        else if(shippingSpeed.equals("Standard")){
            baserate=10;
        }
        else if(shippingSpeed.equals("Express")){
            baserate=25;
        }
        else if(shippingSpeed.equals("Overnight")){
            baserate=50;
        }
        double weightsurcharge=0;
        if(packageWeight<15.0){
            weightsurcharge=packageWeight;
        }else{
            weightsurcharge=packageWeight+packageWeight;
        }
        double zoneMultilplier=0;
        if(destinationZone.equals("Local")){
            zoneMultilplier=1.0;
        }
        else if(destinationZone.equals("Regional")){
            zoneMultilplier=1.2;
        }
        else if(destinationZone.equals("National")){
            zoneMultilplier=1.5;
        }
        else if(destinationZone.equals("International")){
            zoneMultilplier=3.0;
        }
       double sizeSurcharge=0;
       if(packageSize.equals("Small")){
        sizeSurcharge=0;
       }
       else if(packageSize.equals("Medium")){
        sizeSurcharge=5;
       }
       else if(packageSize.equals("Large")){
        sizeSurcharge=15;
       }
       else if(packageSize.equals("Oversized")){
        sizeSurcharge=30;
       }
       double basecost=(baserate+weightsurcharge)*zoneMultilplier;
       double totalCost=basecost+sizeSurcharge;
       int deiverytime=0;
       if(shippingSpeed.equals("Economy")){
        if(destinationZone.equals("Local")){
            deiverytime=5;
        }
        else if(destinationZone.equals("Regional")){
            deiverytime=7;
        }
        else if(destinationZone.equals("National")){
            deiverytime=10;
        }
        else if(destinationZone.equals("International")){
            deiverytime=21;
        }
       }
       else if(shippingSpeed.equals("Standard")){
        if(destinationZone.equals("Local")){
            deiverytime=3;
        }
        else if(destinationZone.equals("Regional")){
            deiverytime=5;
        }
        else if(destinationZone.equals("National")){
            deiverytime=7;
        }
        else if(destinationZone.equals("International")){
            deiverytime=14;
        }
       }
       else if(shippingSpeed.equals("Express")){
        if(destinationZone.equals("Local")){
            deiverytime=1;
        }
        else if(destinationZone.equals("Regional")){
            deiverytime=2;
        }
        else if(destinationZone.equals("National")){
            deiverytime=3;
        }
        else if(destinationZone.equals("International")){
            deiverytime=5;
        }
       }
       else if(shippingSpeed.equals("Overnight")){
        if(destinationZone.equals("Local")){
            deiverytime=1;
        }
        else if(destinationZone.equals("Regional")){
            deiverytime=1;
        }
        else if(destinationZone.equals("National")){
            deiverytime=1;
        }
        else if(destinationZone.equals("International")){
            deiverytime=1;
        }
       }
       String serviceLevel="";
       if(shippingSpeed.equals("Express")){
        serviceLevel="Priority";
       }
       else if(shippingSpeed.equals("Economy")){
        serviceLevel="Budget";
       }
       else if(shippingSpeed.equals("Overnight")){
        serviceLevel="Premium";
       }
       else if(shippingSpeed.equals("Standard")){
        serviceLevel="Standard";
       }

       System.out.println("Base Shipping Rate : $"+baserate);
       System.out.println("Weight Surcharge : $"+weightsurcharge);
       System.out.println("Zone Multiplier : "+zoneMultilplier+"x");
       System.out.println("Size Surcharge : $"+sizeSurcharge);
       System.out.println("Total Shipping Cost : $"+totalCost);
       System.out.println("Estimated Delivery : "+deiverytime+ "business days");
       System.out.println("Service Level : "+serviceLevel);
       sc.close();


    }
}
