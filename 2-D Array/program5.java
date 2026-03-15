import java.util.Scanner;

public class program5 {
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
        System.out.println("Temperature Grid : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int max=arr[0][0];
        int min=arr[0][0];
        int maxrow=0;
        int maxcol=0;
        int minrow=0;
        int mincol=0;
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                    maxrow=i;
                    maxcol=j;
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                    minrow=i;
                    mincol=j;
                }
                sum+=arr[i][j];

                
            }

        }
        int avg=sum/(row*col);
        System.out.println(sum);
        System.out.println("Maximum Temperature : "+max+"°C"+" at position ("+maxrow+","+maxcol+")");
        System.out.println("Minimum Temperature : "+min+"°C"+" at position ("+minrow+","+mincol+")");
        System.out.println("Average Temperature : "+avg+"°C");






    }
    
}
