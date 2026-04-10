import java.util.Scanner;
public class Problem1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []arr=new double[n];
        double average=0;
        double sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            sum+=arr[i];
            
        }
        average=sum/n;

        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>average){
                count++;
            }
        }
        double percentage=(double)count/n*100.0;
        System.out.println("Total Employees : "+n);
        System.out.println("Average Salary : "+String.format("%.2f", average));
        System.out.println("Employees Above Average : "+count);
        System.out.println("Percentage : "+String.format("%.2f", percentage)+"%");
        
    }

}
