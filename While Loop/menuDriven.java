import java.util.Scanner;

public class menuDriven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0;
       
             boolean flag = true;
        do{
            System.out.println("Calculator Menu : ");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");
            System.out.print("Choice : ");
            int choice=sc.nextInt();
            if(choice != 5){
            System.out.print("Enter two number : ");
             a=sc.nextInt();
             b=sc.nextInt();
            }
            if(choice<0 && choice>5){
                System.out.println("Invalid choice");
            }
                int result=0;
            switch (choice) {
                case 5 :
                    System.out.println("Goodbye!");
                    flag = false;
                    break;
                
                case 1:
                    result=a+b;
                    
                    break;
                case 2:
                    result=a-b;
                    
                    break;
                case 3:
                    result=a*b;
                    break;
                case 4:
                    result=a/b;
                    break;
                
            }
               System.out.println("Result : "+result);     
        }while(flag);
        
    }
    
}
