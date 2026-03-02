import java.util.Scanner;

public class OnlineQuiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();   

        int passCount=0;
        int failCount=0;
        int totalScore=0;
        int highestScore=0;

        for (int i=0;i<N;i++) {

            String name=sc.next();
            int correct=sc.nextInt();
            int wrong=sc.nextInt();
            int unattempted=sc.nextInt();
            int score=(correct*4)-(wrong*3);
            if(i==0) {
                highestScore=score;
            } else if(score>highestScore) {
                highestScore=score;
            }
            String result;
            if(score>=32) {
                result="Pass";
                passCount++;
            } else{
                result="Fail";
                failCount++;
            }

            totalScore+=score;
            System.out.println("Student: " + name);
            System.out.println("Correct: " + correct);
            System.out.println("Wrong: " + wrong);
            System.out.println("Unattempted: " + unattempted);
            System.out.println("Score: " + score);
            System.out.println("Result: " + result);
            System.out.println();
        }

        double average=(double)totalScore/N;
        System.out.println("Total Students: " + N);
        System.out.println("Pass Count: " + passCount);
        System.out.println("Fail Count: " + failCount);
        System.out.println("Class Average: " + average);
        System.out.println("Highest Score: " + highestScore);

        sc.close();
    }
}