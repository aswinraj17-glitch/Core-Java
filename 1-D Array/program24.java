import java.util.Scanner;
public class program24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double total=0;
        double max=arr[0];
        int maxindex=0;
        double min=arr[0];
        int minindex=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minindex=i;
            }
        }
        double avg=total/(double)n;
        double bargainThreshold=avg*0.7;
        double premiumThreshold=avg*1.5;
        int bargainCount=0;
        int premiumCount=0;
        for(int i=0;i<n;i++){
            if(arr[i]<bargainThreshold){
                bargainCount++;
            }
            if(arr[i]>premiumThreshold){
                premiumCount++;
            }
        }

        System.out.println("Total Properties: " + n);
        System.out.println("Portfolio Value: $" + String.format("%.2f", total));
        System.out.println("Average Property Value: $" + String.format("%.2f", avg));
        System.out.println("Most Valuable: $" + String.format("%.2f", max) + " (Property " + (maxindex + 1) + ")");
        System.out.println("Least Valuable: $" + String.format("%.2f", min) + " (Property " + (minindex + 1) + ")");
        System.out.println("Bargain Properties (<70% avg): " + bargainCount);
        System.out.println("Premium Properties (>150% avg): " + premiumCount);

        sc.close();
    }
}