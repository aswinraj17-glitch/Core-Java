import java.util.Scanner; 
class multiplicationTable{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int r=1;r<=b;r++){
            System.out.print(r+ " ");
        }
        System.out.println();
        for(int c=1;c<=a;c++){
            for(int d=0;d<1;d++){
                System.out.print(c+" ");
            }
            for(int  i=1;i<=b;i++){
                    System.out.print(i*c+ " ");

            }
            System.out.println();
        }
        sc.close();
    }
    
}