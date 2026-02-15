import java.util.Scanner;
public class scholarship {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tfee=sc.nextInt();
        int scholarship=sc.nextInt();
        int eFee= sc.nextInt();
        int lfee=sc.nextInt();

        int discount=tfee*scholarship/100;

        int finall=tfee-discount+eFee+lfee;
        System.out.println("Final payable fee : "+finall);
    }
    
}
