import java.util.Scanner;

public class railaway {
    public static void main(String[] args) {
         
    Scanner sc=new Scanner(System.in);
    int genpass=sc.nextInt();
    int genfare=sc.nextInt();
    int acPass=sc.nextInt();
    int acFare=sc.nextInt();
    int platform=sc.nextInt();
    int maintanence=sc.nextInt();
    int fuel=sc.nextInt();

    int Netrevenue=(genpass*genfare)+ (acPass*acFare)+platform-maintanence-fuel;
        System.out.println("Net Railway Revenue : "+Netrevenue);
    }
}
