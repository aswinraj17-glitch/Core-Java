import java.util.Scanner;

public class program22 {
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
        double min=arr[0];
        int minindex=0;

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
        int []arr2=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]>threshold){
                count++;
                arr2[k]=i;
                k++;
            }
        }
        System.out.println("Total Posts : "+n);
        System.out.println("Average Engagement : "+String.format("%.2f", avg)+"%");
        System.out.println("Peak Engagement : "+String.format("%.2f", max)+"% (Post "+(maxindex+1)+")");
        System.out.println("Lowest Engagement : "+String.format("%.2f", min)+"% (Post "+(minindex+1)+")");
        System.out.println("Viral Posts (>200% avg) : "+count);
        System.out.println("Viral Threshold : "+String.format("%.2f", threshold)+"%");
        System.out.print("Top Performers : [");
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
