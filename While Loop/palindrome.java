import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int digit=0;
        int rev=0;
        while(n>0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;

        }
        if(rev==original){
            System.out.println(original+ " is a palindrome");

        }else{
            System.out.println(original+ " is not a palindrome");
        }
    }
    
}
