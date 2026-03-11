import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int sum=0;
        int maxindex=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
        }
        double avg=(double)sum/n;
        double threshold=avg*0.5;
        int count=0;
        int k=0;
        int []arr2=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]<threshold){
                count++;
                arr2[k]=i+1;
                k++;
            }
        }
        System.out.println("Total Products : "+n);
        System.out.println("Total Units Sold : "+sum);
        System.out.println("Average Monthly Sales : "+String.format("%.2f", avg));
        System.out.println("Best Seller : Product "+maxindex+" ("+max+" units)");
        System.out.println("Slow-Moving Products : "+count);
        System.out.println("Turnover Threshold : "+String.format("%.2f", threshold)+" units");
        System.out.print("Clearance Candidates : [");
        for(int i=0;i<k;i++){
            System.out.print(arr2[i]);
            if(i<k-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        sc.close();
    
    }
    
}
