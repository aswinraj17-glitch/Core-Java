import java.util.Scanner;

public class program17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []arr=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double max=arr[0];
        double min=arr[0];
        double sum=0;
        int count=0;
        int count1=0;
        int k=0;
        int []arr2=new int[n];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]<6.5 || arr[i]>8.5){
                count++;
                arr2[k]=i+1;
                k++;
            }else{
                count1++;
            }
        }
        double avg=sum/n;
        double safety=(double)(n-count)/(double)n*100.0;
        System.out.println("Total Samples : "+n);
        System.out.println("Average pH : "+String.format("%.2f", avg));
        System.out.println("Maximum pH : "+String.format("%.2f", max));
        System.out.println("Minimum pH : "+String.format("%.2f", min));
        System.out.println("Unsafe Samples : "+count);
        System.out.println("Safety Complaince : "+String.format("%.2f", safety)+"%");
        System.out.print("Critical Alerts : [");
         for(int i=0;i<k;i++) {
            System.out.print(arr2[i]);
            if (i<k-1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }
    
}
