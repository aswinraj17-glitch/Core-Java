import java.util.Scanner;

public class mobiledata {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int baseCost=sc.nextInt();
        int extraGB=sc.nextInt();
        int ratePerGB=sc.nextInt();
        int tax=sc.nextInt();

        int extraCost=extraGB*ratePerGB;
        float subtotal=baseCost+extraCost;
        float totalBill=subtotal+(subtotal*tax/100.0f);
        System.out.println("Total Bill = " + totalBill);
    }
}
