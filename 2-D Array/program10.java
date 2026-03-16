import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int reps=sc.nextInt();
        int territories=sc.nextInt();

        int[][] sales=new int[reps][territories];
        for(int i=0;i<reps;i++){
            for(int j=0;j<territories;j++) {
                sales[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sales Matrix:");
        for(int i=0;i<reps;i++) {
            for(int j=0;j<territories;j++) {
                System.out.print(sales[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nRepresentative Totals:");
        for(int i=0;i<reps;i++) {
            int sum=0;
            for(int j=0;j<territories;j++) {
                sum+=sales[i][j];
            }
            System.out.println("Rep " + (i + 1) + ": " + sum);
        }
        System.out.println("\nTerritory Totals:");
        for(int j=0;j<territories;j++) {
            int sum=0;
            for(int i=0;i<reps;i++) {
                sum+=sales[i][j];
            }
            System.out.println("Territory " + (j + 1) + ": " + sum);

        }
        sc.close();
    }
}