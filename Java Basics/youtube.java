import java.util.Scanner;

public class youtube {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    int ads=sc.nextInt();
    int sponser=sc.nextInt();
    int affilitate=sc.nextInt();
    int tax=sc.nextInt();
    int producion=sc.nextInt();

    int income=ads+sponser+affilitate-tax-producion;
    System.out.println("Net Profit : "+income);
    }
    
}
