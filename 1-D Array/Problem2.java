import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int threshold=sc.nextInt();
        int []arr=new int[n];
       
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]<threshold){
                count++;
            }
        }
         int []arr1=new int[count];
         int k =0;
         for(int i=0;i<n;i++){
            if(arr[i]<threshold){
                arr1[k] = i;
                k++;
            }
        }
        System.out.println("Total Products : "+n);
        System.out.println("Minimum Threshold : "+threshold);
        System.out.println("Low Stock Products : "+count);
        System.out.print("Product indices : [");
        for(int i=0;i<count;i++){  
           System.out.print(arr1[i]+" ");
           if(i!= count-1){
            System.out.print(",");
           }

        }
        System.out.println("]");
        

    }
    
}
