import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int a=1;
        System.out.println("Floyd's Triangle : ");
        for(int i=0;i<=row;i++){
            for(int j=0;j<i;j++){
                System.out.print(a+" ");
                a++;

            }
            System.out.println();
        }
    }
    
}
