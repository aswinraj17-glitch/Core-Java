import java.util.Scanner;

public class timeTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        String timetable[][]=new String[row][col];
        String [] day = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                timetable[i][j]=sc.next();
            
            }
        }
        for(int i=0;i<row;i++){
            if(i==0){
                System.out.println("Class Time Table : ");
                System.out.print("Day ");
                for(int k=1;k<=col;k++){
                    System.out.print("Period"+k+" ");
                }
                System.out.println();
            }
            System.out.print(day[i]+" ");
            for(int j=0;j<col;j++){
                System.out.print(timetable[i][j]+" ");
            }
            System.out.println();
        }

    }
}