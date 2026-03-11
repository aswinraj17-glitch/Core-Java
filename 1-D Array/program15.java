import java.util.Scanner;

public class program15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        double sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        
        }
        int max=arr[0];
        int min=arr[0];
        int count=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                max=arr[i];
            }
            if(arr[i]>300){
                count++;
            }
        
        }

        double avg=sum/n;
        double target=(double)count/(double)n*100.0;
        System.out.println("Total Calls : "+n);
        System.out.println("Average Handling Time : "+String.format("%.2f", avg)+" seconds ");
        System.out.println("Shortest Call : "+min+ " seconds");
        System.out.println("Longest Call : "+max+ " seconds");
        System.out.println("Call Exceeding Target (300s) : "+count);
        System.out.println("Target Complaince : "+String.format("%.2f", target)+"%");

    

    }
    
}
