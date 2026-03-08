import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        boolean [][]spot=new boolean[row][col];
        int range=sc.nextInt();
        for(int i=1;i<=range;i++){
            int r=sc.nextInt();
            int c=sc.nextInt();
            spot[r][c]=true;

        }
        System.out.println("Parking Lot Grid :");
        for(int i=0;i<row;i++ ){
            for(int j=0;j<col;j++){
                if(spot[i][j]){
                    System.out.print("[0]");
                }else{
                    System.out.print("[]");
                }
            }
            System.out.println();
        }
        int totalspot=row*col;
        int Occupied=range;
        int vacant=totalspot-Occupied;
        double rate=(Occupied/(double)totalspot)*100.0;
        System.out.println();
        System.out.println("Total Spot : "+totalspot);
        System.out.println("Occupied : "+Occupied);
        System.out.println("Vacant : "+vacant);
        System.out.println("Occupancy Rate :"+String.format("%.2f", rate));


    
}
    
}
