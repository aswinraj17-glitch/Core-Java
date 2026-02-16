import java.util.Scanner;

public class BookPublish {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
    int copies=sc.nextInt();
    int cost=sc.nextInt();
    int editting=sc.nextInt();
    int design=sc.nextInt();
    int commission=sc.nextInt();   
    int marketing=sc.nextInt(); 

    int profit=(copies*cost)+editting+design-commission-marketing
    ;
    System.out.println("Publishing profit : "+profit);
    }
    
}
