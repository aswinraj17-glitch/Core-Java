import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int row=sc.nextInt();
        int col=sc.nextInt();
        int brightness = sc.nextInt();
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
        System.out.println("Original Image : ");
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
         System.out.println();
        System.out.println("Adjusted Image:");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int newPixel=arr[i][j]+brightness;
                newPixel = Math.min(255, Math.max(0, newPixel));
                System.out.print(newPixel + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

