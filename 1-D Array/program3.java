import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int max=arr[0];
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            sum+=arr[i];

        }
        int min=arr[0];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<40){
                count++;
                if(arr[i]<min){
                    min=arr[i];
                }
            }
        }
        System.out.println("Total Students : "+n);
        System.out.println("Highest Score : "+max);
        System.out.println("Lowest Score : "+min);
        System.out.println("Failed Student : "+count);
        double percentage=(double)(n-count)/n*100.0;
        System.out.println("Pass Percentage : "+String.format("%.2f",percentage)+"%");
        
        
    
    }
    
}
