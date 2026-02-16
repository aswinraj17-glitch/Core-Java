import java.util.Scanner;

public class CarRnt {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    int days=sc.nextInt();
    int rent=sc.nextInt();
    int late=sc.nextInt();
    int fuel=sc.nextInt();
    int maintanence=sc.nextInt();

    int profit=(days*rent)+late-fuel-maintanence;
    System.out.println("Net Profit : "+profit);
    }
}
