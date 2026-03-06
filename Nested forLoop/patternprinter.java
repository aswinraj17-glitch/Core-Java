import java.util.Scanner;

public class patternprinter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("star")){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }else if(s.equals("number")){
             for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println(" ");
            }

        }
    }
    
}
