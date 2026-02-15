import java.util.Scanner;
public class grocery {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sales=sc.nextInt();
        int discountamnt=sc.nextInt();
        int gstamnt=sc.nextInt();

        double discount=sales*discountamnt/100.0;
        double finaldiscountamount=sales-discount;

        double gst=finaldiscountamount*gstamnt/100.0;
        double finalgstamount=finaldiscountamount+gst;



        System.out.println("Final revenue = "+ finalgstamount);

        
    }
}