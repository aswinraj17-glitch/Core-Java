import java.util.Scanner;

public class TaxiFare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        double totaldistance=0;
        double totalrevenue=0;
        double average=0;
        for(int i=1;i<=n;i++){
            double distanceKM=sc.nextDouble();
            String timeOfDay=sc.next();

            double basefare=3.0;
            double distanceCharge=distanceKM*1.0;
            double timeSurcharge=0;
            if(timeOfDay.equals("Morning")){
                timeSurcharge=0;
            }
            else if(timeOfDay.equals("Afternoon")){
                timeSurcharge=0;
            }
            else if(timeOfDay.equals("Evening")){
                timeSurcharge=3;
            }
            else if(timeOfDay.equals("Night")){
                timeSurcharge=5;
            }
            double totalfare=basefare+distanceCharge+timeSurcharge;
            totaldistance+=distanceKM;
            totalrevenue+=totalfare;
            System.out.println("Ride "+i+" : "+distanceKM+"km");
            System.out.println("Time : "+timeOfDay);
            System.out.println("Base Fare : $"+basefare);
            System.out.println("Distance Charge : $"+distanceCharge);
            System.out.println("Time Surcharge : $"+timeSurcharge);
            System.out.println("Total Fare : $"+totalfare);




        }
        average=totalrevenue/n;
        System.out.println("Total Rides : "+n);
        System.out.println("Total Distance : "+totaldistance+"km");
        System.out.println("Total Revenue : $"+totalrevenue);
        System.out.println("Average Fare : $"+average);
    }
    
}
