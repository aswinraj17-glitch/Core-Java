import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // sc.nextLine();
        int total=0;
        int Highest=0;
        int passcount=0;
        int failcount=0;

        for(int i=0;i<n;i++){
            String StudentName=sc.next();
            int score=sc.nextInt();
            total+=score;

            String letterGrade="";
            if(score>=85 && score<=100){
                letterGrade="A";
            }
            else if(score>=70 && score<=84){
                letterGrade="B";
            }
            else if(score>=60 && score<=69){
                letterGrade="C";
            }
            else if(score>=50 && score<=59){
                letterGrade="D";
            }
            else if(score>=0 && score<=49){
                letterGrade="F";
            }

            String status="";
            if(score>=60){
                status="Pass";
                passcount++;
            }else if(score<60){
                status="Fail";
                failcount++;
            }
            
            if(score>Highest){
                Highest=score;

            }
            System.out.println("Student : "+StudentName);
            System.out.println("Score : "+score);
            System.out.println("Letter Grade : "+letterGrade);
            System.out.println("Status : "+status);

            
            


        }
        double average=total/n;
        System.out.println("Total Student : "+n);
        System.out.printf("Class Average : %.2f\n",average);
        System.out.println("Highest Score : "+Highest);
        System.out.println("Student Passed : "+passcount);
        System.out.println("Students Failed : "+failcount);
    }
}
