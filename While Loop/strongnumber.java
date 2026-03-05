import java.util.Scanner;

public class strongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            int fact=1;
            
            int i=1;
            while(i<=digit){
                fact=fact*i;
                i++;
            }
            sum+=fact;
            n=n/10;
    }
        System.out.println(sum);

        if(temp==sum){
            System.out.println(temp+" is a strong number");
        }else{
            System.out.println(temp+" is not a strong number");
        }
    }
    
}
