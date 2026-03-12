import java.util.Scanner;
public class program23 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int total=0;
        int max=arr[0];
        int maxindex=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
        }
        double avg=total/(double)n;
        double threshold=avg*0.9;
        int count=0;
        int arr2[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]<threshold){
                count++;
                arr2[k]=i;
                k++;
            }
        }
        System.out.println("Production Lines: " + n);
        System.out.println("Total Output: " +total+ " units");
        System.out.println("Average Output: " + String.format("%.2f", avg) + " units/hour");
        System.out.println("Top Producer: Line " + (maxindex + 1) + " (" + max + " units)");
        System.out.println("Underperforming Lines: " + count);
        System.out.println("Performance Threshold: " + String.format("%.2f", threshold) + " units");

        System.out.print("Priority Lines: [");
        for(int i = 0; i < k; i++){
            System.out.print(arr2[i] + 1);
            if(i < k - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

        sc.close();
    }
}
    

