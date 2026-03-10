import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []arr=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        System.out.println("Total Stores : "+n);

        double max=arr[0];
        double min=arr[0];
        int k=0;
        int l=0;
        double sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                k=i;
            
                
            }
            if(arr[i]<min){
                min=arr[i];
                l=i;
            
            }
            sum+=arr[i];
        }
        double average=sum/n;
        // System.out.println("Total Stores : "+n);
        System.out.println("Highest Sales : $"+String.format("%.2f", max)+" (Store "+(k+1)+")");
        System.out.println("Lowest Sales : $"+String.format("%.2f", min)+" (Store "+(l+1)+") ");
        System.out.println("Total Sales : $"+String.format("%.2f", sum));
        System.out.println("Average Sales : $"+String.format("%.2f", average));

    }
    
}
