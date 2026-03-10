import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []arr=new double[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        int count=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
           
        }
        double average=(double)sum/n;
        double threshold=average*2;
        int []arr1=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]>threshold){
                count++;
                arr1[k]=i;
                k++;
                
            }
        }
        
        System.out.println("Total Transaction : "+n);
        System.out.println("Average Transaction : $"+average);
        System.out.println("Suspicious Transaction : "+count);
        System.out.print("Fraud Alert Indices : [");
        for(int i=0;i<count;i++){
            System.out.print(arr1[i]+ "");
            if(i!= count-1){
            System.out.print(",");
           }
           
        }
        System.out.print("]");


    }
    
}
