import java.util.Scanner;
public class Fuelcost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int mileage=sc.nextInt();
        int fuelPrice=sc.nextInt();
        int tollCharge=sc.nextInt();

        int fuelNeeded=distance/mileage;
        int fuelcost=fuelNeeded*fuelPrice;
        int total=fuelcost+tollCharge;
        System.out.println("Total Trip Cost : "+total);

    }
    
}
