import java.util.Scanner;

public class EmployeeOvertime {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Workinghours=sc.nextInt();
        int attendance=sc.nextInt();
         if (Workinghours > 40 && attendance > 90) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        
        
        }
    
}
