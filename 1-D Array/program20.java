import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();       
         }
         int sum=0;
         int max=arr[0];
         int maxindex=0;
         int min=arr[0];
         int minindex=0;
         int count=0;
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
            if(arr[i]<60){
                count++;
            }

         }
         double avg=(double)sum/(double)n;
         double sucessrate=(double)(n-count)/(double)n*100.0;
         System.out.println("Total Students : "+n);
         System.out.printf("Average Completion : %.2f%%\n",avg );
         System.out.println("Highest Completion : "+max+"%"+" (Student "+(maxindex+1)+")");
         System.out.println("Lowest Completion : "+min+"%"+" (Student "+(minindex+1)+")");
         System.out.println("At-Risk Student (<60%) : "+count);
         System.out.printf("Success Rate : %.2f%%\n",sucessrate);

    }
    
}
