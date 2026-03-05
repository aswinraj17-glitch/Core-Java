import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp1=a;
        int temp2=b;
        int i=1;
        int hcf=1;
        while(i<=a && i<=b){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
            i++;
        }
        System.out.println("HCF of "+temp1+" and "+temp2+" = "+hcf);
    }
    
}
