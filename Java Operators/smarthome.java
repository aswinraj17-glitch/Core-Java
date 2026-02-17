import java.util.Scanner;

public class smarthome {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        System.out.println("Give (0/1) as input :");
        int voltage=sc.nextInt();
       

        
        if(units>500 || voltage==1){
            System.out.println("Alert");

        }else{
            System.out.println("Normal");
        }
        

        
        
        }
}
