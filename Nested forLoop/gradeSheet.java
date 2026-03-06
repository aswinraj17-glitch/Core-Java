import java.util.Scanner;

public class gradeSheet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row =sc.nextInt();
        int column=sc.nextInt();
        for(int i=1;i<=row;i++){
            if(i==1){
                System.out.println("\nGrade Sheet : ");
                System.out.print("Student ");
                for(int k=1;k<=column;k++){
                    System.out.print("sub"+k+" ");
                }
                System.out.print(" Average \n");
                
            }
            
            String s=sc.next();
            System.out.print(s+" ");
            int sum=0;
            for(int j=1;j<=column;j++){
                int score=sc.nextInt();
                sum+=score;
                System.out.print(score+ " ");
                
            }
            double avg=(double) sum/column;
            System.out.printf("%.2f\n",avg);
        

        }
        


    }
    
}
