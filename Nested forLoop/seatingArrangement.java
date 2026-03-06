import java.util.Scanner;

public class seatingArrangement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Seating Arrangements : ");
        for(int i=1;i<=a;i++){
            for(int j=1;j<=1;j++){
                System.out.print("Row "+i +" : ");
            }
            
            for(int k=1;k<=b;k++){
                System.out.print("Seat- "+k+" ");
            

            }
        
            System.out.println();
        }

    }
    
}
