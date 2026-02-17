import java.util.Scanner;

public class dataCompression {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int filesize=sc.nextInt();
        int compression=sc.nextInt();
       
       int compressedsize=filesize>>compression;
       System.out.println("Compressed size : "+ compressedsize);
}
}
