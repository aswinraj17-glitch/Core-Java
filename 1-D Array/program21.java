import java.util.Scanner;

public class program21 {
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
        double threshold=avg*0.8;
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
        System.out.println("Fleet size : "+n);
        System.out.printf("Average Fuel Efficiency : %.2f MPG\n",avg);
        System.out.printf("Most Efficient : %.2f MPG ( Vehicle %d)\n",max,(maxindex+1));
        System.out.printf("Least Efficient : %.2f MPG ( Vehicle %d)\n",min,(minindex+1));
        System.out.println("underperforming Vehicles : "+count);
        System.out.printf("Effeciency Threshold : %.2f MPG\n",threshold);
        System.out.print("Maintenance Priority : [");
        for(int i=0;i<k;i++){
            System.out.print(arr2[i]);
             if(i<k-1){
                System.out.print(", ");
             }
        }
        System.out.print("]");
        

    }
    
}
