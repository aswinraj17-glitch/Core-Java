import java.util.Scanner;

public class SmartElectricity {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int connectionValue=sc.nextInt();
        int applianceMask=sc.nextInt();
       
       int value=connectionValue & applianceMask;
       if(value!=0){
           System.out.println("Active");

       }else{
        System.out.println("Inactive");
       }

       
      
}
}
