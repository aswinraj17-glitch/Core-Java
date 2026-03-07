import java.util.Scanner;

public class ExamSeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int num=sc.nextInt();
        System.out.println("Exam Seating Plan : ");
        int count=1;
        for(int i=0;i<=row;i++){
            for(int j=0;j<column;j++){
                if((i+j)%2==0 && count<=num ){
                    System.out.print("S00"+count+" ");
                    count++;
                }else{
                    System.out.print("---");
                }
               
            }
            System.out.println();
        }
        int total=row*column;
        System.out.println();
        System.out.println("Total seats : "+total);
        System.out.println("Occupied Seats : "+num);
        System.out.println("Empty Seats : "+(total-num));


    }
    
}
