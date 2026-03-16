import java.util.Scanner;

public class program9 {
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
        System.out.println("Elevation Map : ");
        int max=arr[0][0];
        int min=arr[0][0];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int Elevation=max-min;
        System.out.println("Highest Point: "+max+" m");
        System.out.println("Lowest Point: "+min+" m");
        System.out.println("Elevation Range: "+Elevation+" m");

    }
    
}
