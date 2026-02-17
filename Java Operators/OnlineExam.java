import java.util.Scanner;
public class OnlineExam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int theory=sc.nextInt();
        int practical=sc.nextInt();
        int total=theory+practical;
        double average=total/2.0;
        System.out.println("Average = "+average);

        if(theory>=50 && practical>=50){
            if(average>=60){
                System.err.println("PASS");
            }else{
                System.out.println("FAIL");
            }
        }
        else{
            System.out.println("FAIL");
        }
        }


        
    }
    

