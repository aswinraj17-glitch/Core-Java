import java.util.Scanner;

public class Software {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int hours=sc.nextInt();
    int rate=sc.nextInt();
    int design=sc.nextInt();
    int testing=sc.nextInt();
    int advance=sc.nextInt();

    int projectcost=(hours*rate)+design+testing-advance;
    System.out.println("Total Transport Fee : "+projectcost);
    }
}
