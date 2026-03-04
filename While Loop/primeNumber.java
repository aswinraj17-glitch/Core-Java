import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int i=1;
        int count=0;

        int n=sc.nextInt();
        int temp=n;
        while(i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==2){
            System.out.println(temp+" is prime ");
        }else{
            System.out.println(temp+" is not prime");
        }
        
    }
    
}
