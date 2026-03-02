import java.util.Scanner;

public class LibraryBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        double totalfines=0;
        int bookoverdue=0;
        double average=0;


        for(int i=1;i<=n;i++){
            String booktype=sc.next();
            int dayslate=sc.nextInt();

            double dailyfinerate=0;
            if(booktype.equals("Regular")){
                dailyfinerate=0.50;
            }
            else if(booktype.equals("Reference")){
                dailyfinerate=1.00;
            }
            else if(booktype.equals("Magazine")){
                dailyfinerate=0.25;
            }

            double calculatedfine=0;
            calculatedfine=dayslate*dailyfinerate;

            int maximumfincaps=0;
            if(booktype.equals("Regular")){
                maximumfincaps=10;
            }
            else if(booktype.equals("Reference")){
                maximumfincaps=20;
            }
            else if(booktype.equals("Magazine")){
                maximumfincaps=5;
            }
            double actualfine=0;
            String appliedcap="";
            if(calculatedfine>maximumfincaps){
                appliedcap="Yes";
                actualfine=maximumfincaps;
            }else{
                appliedcap="No";
                actualfine=calculatedfine;
            }
            totalfines+=actualfine;
            if(dayslate>=1){
                bookoverdue++;

            }
            System.out.println("Book "+i+" : "+booktype);
            System.out.println("DaysLate : "+dayslate);
            System.out.println("Daily Fine : $"+dailyfinerate);
            System.out.println("Calculated Fine : $"+calculatedfine);
            System.out.println("Actual Fine : $"+actualfine);
            System.out.println("Cap Applied : "+appliedcap);

        }
        average=totalfines/n;
        System.out.println("Total Books : "+n);
        System.out.println("Total Fines Collected : $"+totalfines);
        System.out.println("Books Overdue : "+bookoverdue);
        System.out.println("Average Fine : $"+String.format("%.2f",average));


    }
    
}
