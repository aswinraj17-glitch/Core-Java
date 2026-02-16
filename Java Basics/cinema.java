import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int trevenue=sc.nextInt();
        int srevenue=sc.nextInt();
        int maintanence= sc.nextInt();
        int ebill=sc.nextInt();

        int netprofit=trevenue+srevenue-maintanence-ebill;
        System.out.println("Net Profit : "+netprofit);
    }
    
}
