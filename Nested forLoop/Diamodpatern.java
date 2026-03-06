import java.util.Scanner;

public class Diamodpatern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int mid=size/2;
        for(int i=0;i<=mid;i++){
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=mid-1;i>=0;i--){
            
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
