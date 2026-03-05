import java.util.Scanner;

public class decimaltoBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Decimal : ");
        int num=sc.nextInt();
        int binary=0;
        int mul=1;
        while(num>0){
            int rem=num%2;
            binary=binary+rem*mul;
            num=num/2;
            mul=mul*10;
        
            
        }
        System.out.println("Binary : "+binary);
    }
    
}
