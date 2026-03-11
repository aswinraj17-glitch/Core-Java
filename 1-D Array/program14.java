import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []arr=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double sum=0;
        double max=arr[0];
        int maxindex=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
        

            }
        }
        double avg=sum/n;
        double percentage=avg*0.8;
        for(int i=0;i<n;i++){
            if(arr[i]<percentage){
                count++;
            }
        }
        System.out.println("Total Plots : "+n);
        System.out.println("Total Harvest : "+String.format("%.2f", sum)+" tons");
        System.out.println("Average Yield : "+String.format("%.2f", avg));
        System.out.println("Highest Yield : "+String.format("%.2f", max)+" tons/acre"+" (Plots "+(maxindex+1)+")");
        System.out.println("Underperforming Plots : "+(count));
        System.out.println("Performance Threshold : "+String.format("%.2f", percentage)+" tons/acre");






    }
    
}
