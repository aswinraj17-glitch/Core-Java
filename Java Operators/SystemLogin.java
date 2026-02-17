import java.util.Scanner;

public class SystemLogin {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Username=sc.nextInt();
        int password=sc.nextInt();
        int account=sc.nextInt();

        
        if(Username==1 && password==1){
            if(account==0){
            System.out.println("Success");
            }else{
                System.out.println("Failed");
            }

        }else{
            System.out.println("Failed");
        }
        

        
        
        }
}
