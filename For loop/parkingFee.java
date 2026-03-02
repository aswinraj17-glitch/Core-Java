import java.util.Scanner;

public class parkingFee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        double totalrevenue=0;
        double averagefee=0;
        int peakhourvehicle=0;
        for(int i=1;i<=n;i++){
            String vehicleType=sc.next();
            double hoursPacked=sc.nextDouble();

            double hourlyrate=0;
            if(vehicleType.equals("Car")){
                hourlyrate=3;
            }
            else if(vehicleType.equals("Motorcycle")){
                hourlyrate=2;
            }
            else if(vehicleType.equals("Truck")){
                hourlyrate=5;
            }
            else if(vehicleType.equals("Bus")){
                hourlyrate=7;
            }
            double parkingfee=hoursPacked*hourlyrate;
            int dailycap=0;
            double calculatedfee=hoursPacked*hourlyrate;
            if(vehicleType.equals("Car")){
                dailycap=30;
            }
            else if(vehicleType.equals("Motorcycle")){
                dailycap=20;
            }
            else if(vehicleType.equals("Truck")){
                dailycap=60;
            }
            else if(vehicleType.equals("Bus")){
                dailycap=100;
            }
            String capapplied="";
           if(calculatedfee>dailycap){
            capapplied="Yes";

           }else{
            capapplied="No";
           }
           if(hoursPacked>8){
            peakhourvehicle++;
           }
           totalrevenue+=parkingfee;
           averagefee=totalrevenue/n;
           System.out.println("Vehicle "+i+" : "+vehicleType);
           System.out.println("Hours Parked : "+hoursPacked);
           System.out.println("Hourlt Rate : $"+hourlyrate);
           System.out.println("Parking Fee : $"+parkingfee);
           System.out.println("Cap Applied : "+capapplied);

        }
        System.out.println("Total Vehicles : "+n);
        System.out.println("Total Revenue : $"+totalrevenue);
        System.out.println("Average Fee : $"+String.format("%.2f",averagefee));
        System.out.println("Peak Hour Vehicles (>8 hours) : "+peakhourvehicle);
    }
    
}
