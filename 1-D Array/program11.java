import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []quality=new double[n];
        double []price=new double[n];
        double []empty=new double[n];
        for(int i=0;i<n;i++){
            quality[i]=sc.nextDouble();

        }
        for(int i=0;i<n;i++){
            price[i]=sc.nextDouble();
        }
        double max=-1;
        double min=Double.MAX_VALUE;
        int minindex=0;
        int maxindex=0;
        double total=0;
        for(int i=0;i<n;i++){
            empty[i] = quality[i] * price[i];
            total+=empty[i];
            if(empty[i]>max){
                max=empty[i];
                maxindex=i;
            }
            if(empty[i]<min){
                min=empty[i];
                minindex=i;
            }


           
        }
       System.out.println("Number of Assets : "+n);
       System.out.println("Total Portfolio Value : $"+total);
       System.out.println("Most Valuable Asset : Asset "+(maxindex+1)+" ($"+String.format("%.2f", max)+")");
       System.out.println("Least Valuable Asset : Asset "+(minindex+1)+" ($"+String.format("%.2f", min)+")");
        sc.close();

    


    }
    
}
