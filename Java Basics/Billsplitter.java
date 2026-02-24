import java.util.Scanner;
public class Billsplitter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int total=sc.nextInt();
        int service=sc.nextInt();
        int gst=sc.nextInt();
        int people=sc.nextInt();

        double servicep=total*service/100.0;
        double gstp=(total+servicep)*gst/100.0;
         
        double totalamount=total+servicep+gstp;

        double split=totalamount/people;
        System.out.println("Amount Per Person :"+split);

    }
    
}

