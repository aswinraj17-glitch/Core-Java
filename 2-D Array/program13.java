import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] seat=new int[r][c];
        int totalOccupied = 0;

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                seat[i][j]=sc.nextInt();
                if(seat[i][j]==1) {
                    totalOccupied++;
                }
            }
        }

        System.out.println("Seating Map:");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(seat[i][j] + " ");
            }
            System.out.println();
        }

        int totalSeats=r*c;
        int occupancyRate=(totalOccupied * 10000)/totalSeats;

        System.out.println("\nTotal Occupied: " + totalOccupied);
        System.out.println("Occupancy Rate: " + occupancyRate + "%");

        System.out.print("Empty Rows: [");

        boolean first = true;

        for(int i=0;i<r;i++) {
            int sum=0;
            for(int j=0;j<c;j++) {
                sum+=seat[i][j];
            }

            if(sum==0) {
                if(!first) {
                    System.out.print(", ");
                }
                System.out.print(i + 1);
                first=false;
            }
        }
        System.out.println("]");
        
    }
}
