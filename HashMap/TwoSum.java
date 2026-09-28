import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target =sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

            int required = target - arr[i];

            if (map.containsKey(required)) {

                System.out.println(required + " " + arr[i]);
                return;
            }

            map.put(arr[i], i);
        }

         sc.close();
    }
    
}
