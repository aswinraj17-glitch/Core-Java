import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int temp=n;
        int count=0;
        int result=0;
        while(temp>0){
            temp=temp/10;
            count++;

        }
        temp=n;
        while(temp>0){
            int remainder=temp%10;
            int power=1;
            int i=0;
            while(i<count){
                power=power*remainder;
                i++;

            }
            result=result+power;
            temp=temp/10;



        }
        if(result==original){
            System.out.println(original+" is an Armstrong number");
        }else{
            System.out.println(original + " is not an Armstrong number");
        }
        
        
    }
    
}
