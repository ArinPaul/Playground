import java.util.Scanner;
class Main{
	
  static void sum(int n)
    {
    int s=0;
      for(int i=1;i<=n;i++)
        s=s+i;
    System.out.println(s);
    }
  public static void main (String[] args){
	     Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      sum(a);
	}
}