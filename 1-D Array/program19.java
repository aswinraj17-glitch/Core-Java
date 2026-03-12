import java.util.Scanner;

public class program19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();  
        }
        int target=sc.nextInt();
        int max=arr[0];
        int maxindex=0;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
            if(arr[i]<target){
                count++;
            }
            

        }

        double avg=(double)sum/(double)n;
        double goal=(double)(n-count)/(double)n*100.0;
        System.out.println("Days Tracked : "+n);
        System.out.println("Total Calories Burned : "+sum);
        System.out.printf("Average Daily Burn : %.2f\n",avg);
        System.out.println("Peak Burn Day : Day "+maxindex+" ("+max+" calories)");
        System.out.println("Days Below Target : "+count);
        System.out.printf("Goal Achievement : %.2f",goal);

    }
    
}
