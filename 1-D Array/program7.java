import java.util.Scanner;

public class manufacturingQuality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int threshold=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int arr1[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]>threshold){
                count++;
                arr1[k]=i;
                k++;
            }
        }
        System.out.println("Production Lines : "+n);
        System.out.println("Acceptable Threshold : "+threshold);
        System.out.println("Lines Exceeding Threshold : "+count);
        System.out.print("Critical Lines : [");
        for(int i=0;i<count;i++){
            System.out.print(arr1[i]+1+ "");
            if(i!= count-1){
            System.out.print(",");
           }
           
        }
        System.out.println("]");
        double complaincerate=(double)(n-count)/n*100.0;
        System.out.println("Compliance Rate : "+String.format("%.2f", complaincerate)+"%");


    }
    
}
