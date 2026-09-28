import java.util.*;
public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char []arr=s.toCharArray();

        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }

        }
        sc.close();


    }
    
}
