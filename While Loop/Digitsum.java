import java.util.Scanner;

public class Digitsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int digit=0;
        System.out.print("Number : ");
        int num=sc.nextInt();
        do{
            digit=num%10;
            sum=sum+digit;
            num=num/10;

        }while(num>0);
        System.out.println("Sum of Digits : "+sum);

    sc.close();

    }
    
}
