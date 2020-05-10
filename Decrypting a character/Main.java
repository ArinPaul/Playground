import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      int key = sc.nextInt();
      int n =((int)ch) - key;
      if(n<65 || n>90 && n<97)
        n=n+26;
      System.out.println((char)n);
      
    }
}