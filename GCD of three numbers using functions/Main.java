import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = Math.min(a,Math.min(b,c));
      for(int i=d;i>=1;i++)
      {
        if(a%i==0 && b%i==0 && c%i==0)
        {
          System.out.println(i);
          break;
        }
      }
	}
}