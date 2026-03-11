import java.util.Scanner;

public class program16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        int sum=0;
        int max=arr[0];
        int maxindex=0;
        for(int i=0;i<n;i++) {
            sum += arr[i];
            if(arr[i]>max) {
                max=arr[i];
                maxindex=i;
            }
        }

        int avg=sum/n;
        double threshold=avg*1.5;
        int count=0;
        int[]breakoutDays=new int[n];
        int j=0;
        for(int i=0;i<n;i++) {
            if(arr[i]>threshold) {
                count++;
                breakoutDays[j++]=i+1;
            }
        }
        System.out.println("Trading Days Analyzed: " +n);
        System.out.println("Total Volume: " +sum);
        System.out.println("Average Daily Volume: "+avg);
        System.out.println("Peak Volume Day: Day "+(maxindex+1)+" ("+max+ ")");
        System.out.println("High Volume Days (>150% avg): "+count);

        System.out.print("Breakout Signal Days: [");
        for(int i=0;i<j;i++) {
            System.out.print(breakoutDays[i]);
            if(i<j-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}