import java.util.Scanner;

public class sumOfEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int b=sc.nextInt();
        int sum=0;
        while(a<=b){
            if(a%2==0){
                sum+=a;
            }
            
            a++;
        }
        System.out.println("Sum of even numbers from "+temp+" to "+b+" : "+sum);

    }
    
}
