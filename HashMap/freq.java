import java.util.*;
public class freq{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int []arr=new int[num];
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],arr[i]+1);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        sc.close();
    }
}
