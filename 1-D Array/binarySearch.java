import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int key=sc.nextInt();
        int high=n-1;
        int low=0;
        int found=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                found=mid;
                break;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        if(found!=-1){
            System.out.println("Element found at the index : "+found);

        }else{
            System.out.println("Element not Found");
        }
        sc.close();
    }
    
}
