import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] rainfall = new int[4][7];
        int[] weekly = new int[4];
        int monthly = 0;
        int driestWeek = 0;
        for(int i=0;i<4;i++) {
            for(int j=0;j<7;j++) {
                rainfall[i][j]=sc.nextInt()*10;
            }
        }
        System.out.println("Rainfall Data:");
        for(int i=0;i<4;i++) {
            for(int j=0;j<7;j++) {
                System.out.print(rainfall[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nWeekly Totals:");
        for(int i=0;i<4;i++) {
            weekly[i]=0;
            for(int j=0;j<7;j++) {
                weekly[i]+=rainfall[i][j];
            }

            System.out.println("Week " + (i + 1) + ": " + weekly[i] + " mm");
            monthly+=weekly[i];
        }

        for(int i=1;i<4;i++) {
            if(weekly[i]<weekly[driestWeek]) {
                driestWeek=i;
            }
        }

        System.out.println("\nMonthly Total: " + monthly + " mm");
        System.out.println("Driest Week: Week " + (driestWeek + 1) + " (" + weekly[driestWeek] + " mm)");

        sc.close();
    }
}