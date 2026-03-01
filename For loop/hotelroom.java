import java.util.Scanner;

public class hotelroom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double average=0;
        double highest=0;
        int peakDay=0;
        int peakoccupancy=0;
        int fullcapacityDays=0;
        for(int i=0;i<n;i++){
            int day=sc.nextInt();
            int roomsOccupied=sc.nextInt();
            int totalRooms=sc.nextInt();

            double occupancyrate=((double)roomsOccupied/totalRooms)*100;
            String status="";
            if(occupancyrate<60){
                status="Low";

            }
            else if(occupancyrate>=60 && occupancyrate<=79){
                status="Moderate";

            }
            else if(occupancyrate>=80 && occupancyrate<=99){
                status="High";

            }
            else if(occupancyrate==100){
                status="Full";

            }
            average+=occupancyrate;
            if(occupancyrate>highest){
                highest=occupancyrate;
                peakDay=day;
            }
            if(occupancyrate ==100.0){
                fullcapacityDays++;
            }
            System.out.println("Day : "+day);
            System.out.println("Rooms Occupied : "+roomsOccupied);
            System.out.println("Total Rooms : "+totalRooms);
            System.out.println("Occupanccy Rate : "+occupancyrate+"%");
            System.out.println("Status : "+status);

        



        }
        double averageoccupancy=average/n;
        System.out.println("Total Days Analyzed : "+average);
        System.out.println("Average Occupancy Rate : "+averageoccupancy+"%");
        System.out.println("Peak Occupancy Day : "+peakoccupancy);
        System.out.println("Days at Full Capacity : "+fullcapacityDays);
    }
    
}
