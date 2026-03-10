import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int ontime=0;
        int compensation=0;
        int sum=0;
        int max=arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<=15){
                ontime++;

            }
            if(arr[i]>180){
                compensation++;
            }
            
        }
        double avg=(double)sum/n;
        double percentage=(double)ontime/n*100.0;
        System.out.println("Total Flights : "+n);
        System.out.println("Average Delay : "+String.format("%.2f", avg)+" minutes");
        System.out.println("Maximum Delay : "+max+" minutes");
        System.out.println("On-Time Flights : "+ontime);
        System.out.println("Compensation Required : "+compensation);
        System.out.println("On-Time Performance : "+String.format("%.2f", percentage)+"%");
        
    }
    
}
