import java.util.Scanner;
public class EmployeSalary {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        double totalpayroll=0;
        for(int i=0;i<n;i++){
            String empName=sc.next();
            double basesalary=sc.nextDouble();
            int performanceRating=sc.nextInt();

            int increment=0;
            if(performanceRating==5){
                increment=15;
            }
            else if(performanceRating==4){
                increment=10;

            }
            else if(performanceRating==3){
                increment=5;

            }
            else if(performanceRating==2){
                increment=2;

            }
            else if(performanceRating==1){
                increment=0;

            }else{
                increment=0;
            }

            double finalSalary=basesalary*(1+increment/100.0);
            totalpayroll+=finalSalary;

            System.out.println("Employee : "+empName);
            System.out.println("Base Salary : $"+String.format("%.1f",basesalary));
            System.out.println("Performance Rating : "+performanceRating);
            System.out.println("Increment : "+performanceRating+"%");
            System.out.println("Final Salary : $"+String.format("%.1f",finalSalary));
            
            
        }
        double average=0;
        average=totalpayroll/n;
        System.out.println("Total Employee : "+n);
        System.out.println("Total Payroll : "+String.format("%.1f",totalpayroll));
        System.out.println("Average salary : $"+ String.format("%.1f", average));


    }
}