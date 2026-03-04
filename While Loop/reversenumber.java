import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rev=0;
        int digit=0;
        int num=sc.nextInt();
        int temp=num;;
        while(num>0){
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;

        }
        System.out.println("Original : "+temp);
        System.out.println("Reversed : "+rev);
    }
    
}
