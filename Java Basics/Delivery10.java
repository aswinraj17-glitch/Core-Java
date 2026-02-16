import java.util.Scanner;
public class Delivery10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int del=sc.nextInt();
        int pay=sc.nextInt();
        int incent=sc.nextInt();
        int fuel=sc.nextInt();

        int driver=(del*pay)+incent-fuel;
        System.out.println("Driver Earning : "+driver);

    }
    
}
