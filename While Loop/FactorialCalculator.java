import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int temp=0;
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            fact=fact*i;
            i++;

        }
        System.out.println("Factorial of "+num+" = "+fact);
        
        }
    }
    

