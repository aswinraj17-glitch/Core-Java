import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Traffic Data : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Traffic Per Lane : ");
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum+=arr[i][j];
            }
            System.out.println("Lane "+(i+1)+": "+sum);
            
        }
         int maxTraffic=0;
        int busiestHour=0;
        for(int j=0;j<col;j++){
            int hourSum=0;
            for(int i=0;i<row;i++){
                hourSum+=arr[i][j];
            }
            if(hourSum>maxTraffic){
                maxTraffic=hourSum;
                busiestHour=j + 1;
            }
        }

        System.out.println();
        System.out.println("Busiest Hour: Hour " + busiestHour + " with " + maxTraffic + " vehicles");

    }
    
}
