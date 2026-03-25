import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        double sum=0;
        int count=0;
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>200){
                count++;
            }else{
                count1++;
            }
            sum+=arr[i];
        }
        double avg=sum/(double)n;
        double percentage=(count1/(double)n)*100.0;
        System.out.println("Total Servers : "+n);
        System.out.println("Fastest Response : "+min+"ms");
        System.out.println("Slowest Response : "+max+"ms");
        System.out.println("Average Response : "+String.format("%.2f", avg)+"ms");
        System.out.println("Slow Servers(> 200ms) : "+count);
        System.out.println("Performance Score : "+String.format("%.2f", percentage)+"%");
        sc.close();
        


    }
    
}
