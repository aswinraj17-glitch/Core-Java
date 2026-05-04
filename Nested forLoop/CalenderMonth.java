import java.util.Scanner;

public class CalenderMonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int range=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Calender Grid : ");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        String month="";
        if(n==1){
            month="  ";
        }
        else if(n==2){
            month="   ";
        }
        else if(n==3){
            month="   ";
        }
        else if(n==4){
            month="   ";
        }
        else if(n==5){
            month="   ";
        }
        else if(n==6){
            month="   ";
        }
        else if(n==7){
            month="  ";
        }
        int count=0;
        for(int i=1;;i++){
            for(int j=1;j<=7;j++){
                if(i==1 && j<n){
                        System.out.print(month);
                }
                else{
                    count++;
                    System.out.print(count+" ");

                }
                if(count==range){
                    break;
                }

            }
            if(count==range){
                    break;
                }
            
            System.out.println(" ");
        }

       sc.close();
    }
    
}
