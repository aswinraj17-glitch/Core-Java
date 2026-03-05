import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a;
        int d=b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
            
        }
        System.out.println("LCM of "+c+" and "+d+" = "+(c*d/a));

    }
    
}
