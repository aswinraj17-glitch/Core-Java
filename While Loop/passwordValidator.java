import java.util.Scanner;
public class passwordValidator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String correctpass=sc.nextLine();
        int attempts=0;
        int maxattempts=3;
        boolean login=false;
        while(attempts<maxattempts && !login){
            System.out.println("Enter password:");
            String userattempts=sc.nextLine();
            attempts++;
            if(userattempts.equals(correctpass)){
                System.out.println("Access Granted");
                login=true;
            }
            else{
                if(attempts<maxattempts){
                    System.out.println("Incorrect! Attempts remaining : "+(maxattempts-attempts));
                }

            }

        }
        if(!login){
            System.out.println("Account locked");
        }
        sc.close();
    }
}