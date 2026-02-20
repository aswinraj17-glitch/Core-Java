import java.util.Scanner;

public class VehicleInsurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int driverAge =sc.nextInt();
        sc.nextLine();
        String vehicleType =sc.nextLine();
        String drivingRecord =sc.nextLine();
        String coverageLevel =sc.nextLine();

        System.out.println("Driver Age : "+driverAge);
        System.out.println("Vehicle Type : "+vehicleType);
        System.out.println("Driving Record : "+drivingRecord);
        System.out.println("Coverage Level : "+coverageLevel);
        
        double basePremium=0;
        if(coverageLevel.equals("Basic")){
            basePremium=500;
        }
        else if(coverageLevel.equals("Standard")){
            basePremium=800;
        }
        else if(coverageLevel.equals("Comprehensive")){
            basePremium=1500;
        }

        double agefactor=0;
        if(driverAge>=16 && driverAge<=21){
            agefactor=1.8;
        }
        else if(driverAge>=22 && driverAge<=25){
            agefactor=1.5;
        }
        else if(driverAge>=26 && driverAge<=40){
            agefactor=1.0;
        }
        else if(driverAge>=41 && driverAge<=60){
            agefactor=0.9;
        }
        else if(driverAge>60){
            agefactor=1.1;
        }

        double vehiclerisk=0;
        if(vehicleType.equals("Sedan")){
            vehiclerisk=1.0;
        }
        else if(vehicleType.equals("SUV")){
            vehiclerisk=1.2;
        }
        else if(vehicleType.equals("Sports")){
            vehiclerisk=1.5;
        }
        else if(vehicleType.equals("Truck")){
            vehiclerisk=1.1;
        }

        int recordadjustment=0;
        if(drivingRecord.equals("Clean")){
            recordadjustment=-10;
        }
        else if(drivingRecord.equals("Minor-Violations")){
            recordadjustment=25;
        }
        else if(drivingRecord.equals("Major-Violations")){
            recordadjustment=50;
        }
        double adjustedPremium=basePremium*agefactor*vehiclerisk;
        double finalPremium=adjustedPremium*(1+recordadjustment/100);
        double monthlyPremium=finalPremium/12;
        String riskCategory;
        if(finalPremium<800) {
            riskCategory="Low";
        } 
        else if(finalPremium<2000) {
            riskCategory="Medium";
        } 
        else if(finalPremium<4000) {
            riskCategory="High";
        } 
        else{
            riskCategory="Very High";
        }
        System.out.println("Base Premium : "+basePremium);
        System.out.println("Age Factor : "+agefactor+"x");
        System.out.println("Vehicle Risk Factor : "+vehiclerisk+"x");
        System.out.println("Record Adjustment : "+recordadjustment+"%");
        System.out.printf("Monthly Premium : %.1f\n",monthlyPremium);
        System.out.printf("Annual Premium : %.1f\n",finalPremium);
        System.out.println("Risk Category: " + riskCategory);



    }
}
