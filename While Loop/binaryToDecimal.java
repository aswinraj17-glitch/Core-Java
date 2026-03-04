import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Binary : ");
        int binary=sc.nextInt();
        int decimal=0;
        int power=0;
        while(binary>0){
            int digit=binary%10;
            decimal=decimal+digit*(int)Math.pow(2,power);
            binary=binary/10;
            power++;
        }
        System.out.println("Decimal : "+decimal);

    }
    
}
