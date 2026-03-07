import java.util.Scanner;

public class productprice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt();
        int col=sc.nextInt();
        String[] product=new String[row];
        double[][] price=new double[row][col];

        for(int i=0;i<row;i++){
            product[i]=sc.next();
            for(int j=0;j<col;j++){
                price[i][j]=sc.nextDouble();
            }
        }

        System.out.println("Price Comparison Matrix:");
        System.out.print("Product ");
        for(int i=1;i<=col;i++){
            System.out.print("Vendor"+i+" ");
        }
        System.out.println("BestPrice");

        for(int i=0;i<row;i++){
            double min=price[i][0];
            System.out.print(product[i]+" ");
            for(int j=0;j<col;j++){
                System.out.print(price[i][j]+" ");
                if(price[i][j]<min){
                    min=price[i][j];
                }
            }
            System.out.println(String.format("%.2f", min));
        }
    }
}