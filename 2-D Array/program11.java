import java.util.Scanner;

public class program11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] seat=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                seat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Seating Layout:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(seat[i][j]+" ");
            }
            System.out.println();
        }
        int violations=0;
        System.out.println("\nViolations Found:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                if(seat[i][j]==1){

                    for(int r=i-1;r<=i+1;r++){
                        for(int c=j-1;c<=j+1;c++){

                            if(r>=0 && r<row && c>=0 && c<col){
                                if(!(r==i && c==j) && seat[r][c]==1){
                                    violations++;
                                    System.out.println("- Seat at ("+i+", "+j+") is too close to ("+r+", "+c+")");
                                }
                            }

                        }
                    }

                }

            }
        }

        System.out.println("\nTotal Violations: "+violations);

        if(violations==0){
            System.out.println("Status: Compliant");
        }
        else{
            System.out.println("Status: Non-Compliant");
        }
        

    }
}
