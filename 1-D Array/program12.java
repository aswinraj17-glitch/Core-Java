import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []arr=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double limit=sc.nextDouble();
        double total=0;
        double max=arr[0];
        int maxindexx=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                maxindexx=i;
            }

        }
        double avg=total/n;
        System.out.println("Hours Monitored : "+n);
        System.out.println("Total Daily Consumption : "+String.format("%.2f", total)+" kWh");
        System.out.println("Peak Hour : Hour "+(maxindexx+1)+" ("+String.format("%.2f", max)+" kWh)");
        System.out.println("Average Hourly : "+String.format("%.2f", avg)+ " kWh");
        System.out.println("Daily Limit : "+limit+" kWh");
        double diff=total-limit;
        if(total<limit){
            System.out.println("Status : Within Limit");
        }else{
            System.out.println("Status : Exceeded by "+String.format("%.2f", diff)+" kWh");
        }
        
        

    }
    
}
