import java.util.Scanner;

public class gym {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int basesalary=sc.nextInt();
        int sessions=sc.nextInt();
        int pay= sc.nextInt();
        int bonus=sc.nextInt();
        int maintanence=sc.nextInt();

        int salary=basesalary+(sessions*pay)+bonus-maintanence;
        System.out.println("Final Salary : "+salary);
    }
    
}
