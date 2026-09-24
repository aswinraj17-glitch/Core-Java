import java.util.*;
public  class DuplicateNum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        for(int num1 : map.keySet()){
            if(map.get(num1)>1){
                System.out.print(num1+" ");
            }
        }

        sc.close();
    }
}
// Sep 24 HashMap practice
