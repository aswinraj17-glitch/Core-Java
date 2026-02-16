import java.util.Scanner;

public class agriculture {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int yield=sc.nextInt();
        int acres=sc.nextInt();
        int extrayield= sc.nextInt();
        int damagedcrops=sc.nextInt();

        int finalyield=(yield*acres)+extrayield-damagedcrops;
        System.out.println("Net Profit : "+finalyield);
    }
    
}
