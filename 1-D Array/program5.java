import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []arr=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double max=arr[0];
        double min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        double diff=max-min;
        double savings=diff/max*100.0;
        System.out.println("Number of Sellers : "+n);
        System.out.println("Lowest Price : $"+String.format("%.2f", min));
        System.out.println("Highest Price : $"+String.format("%.2f", max));
        System.out.println("Price Difference : $"+String.format("%.2f", diff));
        System.out.println("Savings : "+String.format("%.2f", savings)+"%");
    }
    
}
