import java.util.Scanner;
public class example{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String []arr=new String[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j].length()>arr[j+1].length()){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
            System.out.println(arr[i]);
            
        }
        // for(int i=0;i<arr.length;i++){
        // }


      


        

    }
}
