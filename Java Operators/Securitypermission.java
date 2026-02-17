import java.util.Scanner;

public class Securitypermission {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int permissionA=sc.nextInt();
        int permissionB=sc.nextInt();
       
       int value=permissionA | permissionB;
       System.out.println("Value = "+value);

       
      
}
}
