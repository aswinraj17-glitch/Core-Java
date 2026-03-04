import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int con1=a;
        int b=1;
        int con2=b;
        int i=2;
        int temp=0;
        System.out.println("Fibonacci Sequence ("+n+" terms ) : ");
        while(n!=0){
               
            System.out.print(a+" ");
            temp=a+b;
            a=b;
            b=temp;
            n--;

           

        }

    }
}
