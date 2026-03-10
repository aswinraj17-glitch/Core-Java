import java.util.Scanner;

import javax.script.ScriptContext;

public class program8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int sum=0;
        int count=0;
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]>60){
                count++;

            }else{
                count1+=arr[i];
                
            }
            sum+=arr[i];
        }
        double avg=(double)sum/n;
        double percentage=(double)count1/sum*100.0;
        System.out.println("Total Patients : "+n);
        System.out.println("Longest Wait Time : "+max+" minutes ");
        System.out.println("Average Wait Time : "+String.format("%.2f", avg)+" minutes");
        System.out.println("Patients Waiting > 60 min : "+count);
        System.out.println("Service Level : "+String.format("%.2f", percentage)+"%");






        
    }
    
}
