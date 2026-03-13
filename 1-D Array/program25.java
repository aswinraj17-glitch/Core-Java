import java.util.Scanner;

public class program25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int maxindex=0;
        int min=arr[0];
        int minindex=0;
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minindex=i;
            }
        }
        double avg=sum/(double)n;
        double threshold=avg*2.0;
        int count=0;
        int k=0;
        int[]arr2=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>threshold){
                count++;
                arr2[k]=i;
                k++;

            }
        }
        System.out.println("Security Events Analyzed : "+n);
        System.out.println("Average Risk Score : "+String.format("%.2f", avg));
        System.out.println("Highest Risk Event : "+max+" (Event "+(maxindex+1)+" )");
        System.out.println("Lowest Risk Event : "+min+" (Event "+(minindex+1)+" )");
        System.out.println("Critical Threats (>200% avg) : "+count);
        System.out.println("Threat Threshold : "+String.format("%.2f", threshold));
        System.out.print("Alert Events : [");
         for(int i=0;i<k;i++){
            System.out.print(arr2[i]+1);
             if(i<k-1){
                System.out.print(", ");
             }
        }
        System.out.print("]");
        sc.close();




    }
    
}
