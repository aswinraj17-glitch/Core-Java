import java.util.Scanner;

public class program7 {
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
        int total=0;
        int max=arr[0][0];
        int maxrow=0,maxcol=0;
        System.out.println();
        System.out.println("Inventory Grid : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                total+=arr[i][j];
                if(arr[i][j]>max){
                    max=arr[i][j];
                    maxrow=i;
                    maxcol=j;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int avg=total/(row*col);
        System.out.println();
        System.out.println("Total Inventory : "+total);
        System.out.println("Max Stock Zone : Row "+maxrow+", Col "+maxcol+" ("+max+" units)");
        System.out.println("Average Stock per Zone : "+avg);

    }
    
}
