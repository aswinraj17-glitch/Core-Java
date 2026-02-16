import java.util.Scanner;
public class Hospital9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        int finalbill=(a*b)+c+d-e;
        System.out.println("Payable Amount : "+finalbill);


    }
    
}
