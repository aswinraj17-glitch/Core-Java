import java.util.Scanner;

public class DailyTempature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []arr=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double min=arr[0];
        double max=arr[0];
        double sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            sum+=arr[i];
        } 
        double range= min-max;
        double average=sum/n;
        System.out.println("Number of Reading : "+n);
        System.out.println("Maximum Temperature : "+String.format("%.2f",max)+" °C");
        System.out.println("Minimum Temperature : "+String.format("%.2f", min)+" °C");
        System.out.println("Temperature Range : "+String.format("%.2f", range)+" °C");
        System.out.println("Average Temperature : "+String.format("%.2f", average)+" °C");



    }
    
}
