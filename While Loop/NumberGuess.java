import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int secretNumber=sc.nextInt();
        boolean flag=true;
        int correctattempt=0;
        while(true){
            System.out.print("Guess the number(1100) : ");
            int num=sc.nextInt();
            if(num==secretNumber){
                correctattempt++;
                flag=false;
                break;
            }else{
                flag=true;
                if(num>secretNumber){
                    System.out.println("Too high!!");
                }
                else if(num<secretNumber){
                    System.out.println("Too low!!");
                }
            }

            

        }
        System.out.println("Correct Attempt : "+correctattempt);
    }
    
}
