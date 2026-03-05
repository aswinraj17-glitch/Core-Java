import java.util.Scanner;

public class vowelcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Text : ");
        String s=sc.nextLine();
        int len=s.length();
        int count=0;
        int i=0;
        do{
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
                count++;
            }
            i++;

        }while(i<len);
        System.out.println("Vowel count : "+count);


    }
    
}
