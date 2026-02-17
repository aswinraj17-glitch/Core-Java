import java.util.Scanner;

public class DigitSignal {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int SignalValue=sc.nextInt();
        int toggleMask=sc.nextInt();
       
       int value=SignalValue ^ toggleMask;
       System.out.println("Value = "+value);

       
      
}
}
