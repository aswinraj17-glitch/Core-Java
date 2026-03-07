import java.util.Scanner;

public class StudentAttendance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int perfectAtt=0;
        System.out.println("Attendnce Matrix : ");
        for(int i=0;i<a;i++){
            if(i==0){
                System.out.print("Student ");
                for(int k=1;k<=b;k++){
                    System.out.print(" Day"+k+" ");
                }
                System.out.println(" Attendance%");
            }
            int count=0;
           
            String name=sc.next();
            System.out.print(name+" ");
            for(int c=0;c<b;c++){
                char std=sc.next().charAt(0);
                System.out.print(std+" ");
                if(std=='P'){
                    count++;
                }
            }
            double percentage=(double)count/b*100.0;
            if(percentage==100.0){
                perfectAtt++;

            }
            System.out.printf("%.2f\n",percentage,"%");
            
            
            

        }
        System.out.println();
        System.out.println("Perfect Attendance : " +perfectAtt+" students ");
        System.out.println();
    }
    
}
