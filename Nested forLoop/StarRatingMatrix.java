import java.util.Scanner;

public class StarRatingMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String []product=new String[size];
        double []num=new double [size];

        for(int i=0;i<size;i++){
           product[i]=sc.next();
           num[i]=sc.nextDouble();

        }
        System.out.println("Star Rating Matrix :");
        System.out.println("Product Rating Stars");
        double sum=0;

        for(int i=0;i<size;i++){
            System.out.print(product[i]+" "+num[i]+" ");
            int fullstars=(int)num[i];

            for(int j=1;j<=5;j++){
                if(j<=fullstars){
                    System.out.print(" ★ ");
                }else{
                    System.out.print(" ☆ ");
                }
            }
            System.out.println();
            sum=sum+=num[i];
        }
        double avg=(double)sum/size;
        System.out.println();
        System.out.println("Average Rating : "+String.format("%.2f", avg));

    }
    
}
