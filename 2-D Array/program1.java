import java.util.Scanner;
public class program1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();

            }

        }
        
        System.out.println("Student Avergae : ");
        for(int i=1;i<=row;i++){
            int rowsum=0;
            System.out.print("Student "+i+" : ");
            for(int j=1;i<=col;j++){
                rowsum+=arr[i][j];
                
            }
            System.out.print(rowsum);
        }
   
    }
}