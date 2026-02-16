import java.util.Scanner;

public class schoolbus {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int distance=sc.nextInt();
    int rate=sc.nextInt();
    int maintanence=sc.nextInt();
    int allow=sc.nextInt();
    int subsidy=sc.nextInt();

    int total=(distance*rate)+maintanence+allow-subsidy;
    System.out.println("Total Transport Fee : "+total);
    }
 
    
}
