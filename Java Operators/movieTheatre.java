import java.util.Scanner;

public class movieTheatre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("Give (0/1) as input :");
        int idProof=sc.nextInt();
       

        
        if(age>=18 && idProof==1){
            System.out.println("Allowed");

        }else{
            System.out.println("Denied");
        }
        

        
        
        }
}
