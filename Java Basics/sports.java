import java.util.Scanner;

public class sports {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int registration =sc.nextInt();
        int broadcatst =sc.nextInt();
        int sponser=sc.nextInt();
        int prize=sc.nextInt();
        int rent=sc.nextInt();
        int advertising=sc.nextInt();

        int remainingFund=registration+broadcatst+sponser-prize-rent-advertising;
        System.out.println("Remaining Tournament Fund : "+remainingFund);

        
    }
}
