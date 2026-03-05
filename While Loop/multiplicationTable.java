import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int mul=1;
        boolean flag = true;
        do{
            int i=1;
            while(i<=r){
                mul=n*i;
                i++;
                System.out.println(n+" x "+(i-1)+" = "+mul);


            }
            flag=false;

        }while(flag);
    }
}
